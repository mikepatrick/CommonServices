package test.cds.groovy.config;

import static test.cds.groovy.test.strings.UrlResultTestStrings.*
import groovy.util.logging.Log4j2

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer

import test.cds.groovy.test.strings.UrlResultTestStrings

import com.cds.groovy.domain.global.customer.Customer
import com.cds.groovy.domain.global.customer.GlobalCustomer
import com.cds.groovy.domain.global.customer.GlobalCustomerResponse
import com.cds.groovy.domain.recreg.Address
import com.cds.groovy.domain.recreg.Assignment
import com.cds.groovy.domain.recreg.AssignmentDates
import com.cds.groovy.domain.recreg.Email
import com.cds.groovy.domain.recreg.Product
import com.cds.groovy.domain.recreg.RecRegResponse
import com.cds.groovy.domain.recreg.User
import com.cds.groovy.service.GlobalCustomerLookupService
import com.cds.groovy.service.RecRegLookupService
import com.cds.groovy.web.utils.GetUrl
import com.cds.groovy.web.utils.GetUrlIF
import com.cds.groovy.xstream.GlobalCustomerXstream
import com.cds.groovy.xstream.RecRegXstream
import com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.io.xml.StaxDriver

@Log4j2
@Configuration
@ComponentScan(basePackages="com.cds")
@PropertySource("classpath:properties/services.properties")
public class TestServicesConfig {
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropsConfig() {
		return new PropertySourcesPlaceholderConfigurer()
	}
	
	@Bean
	public GetUrlIF getUrl() {
		return { String url ->
			return UrlResultTestStrings.testStrings.get(url)
		} as GetUrl
	}
	
	@Bean
	public RecRegLookupService recRegLookupService() {
		return new RecRegLookupService()
	}
	
	@Bean
	public GlobalCustomerLookupService globalCustomerService() {
		return new GlobalCustomerLookupService()
	} 
	
	@Bean
	public GlobalCustomerXstream getGlobalCustomerXstream() {
		return new GlobalCustomerXstream()
	}
	
	@Bean
	public RecRegXstream getRecRegXstream() {
		return new RecRegXstream()
	}
	
	@Bean
	@Qualifier("globalCustomerXstream")
	public XStream globalCustomerXstream () {
		XStream xstream = new XStream(new StaxDriver())	
		
		xstream.alias("transaction", GlobalCustomerResponse.class)
		xstream.addImplicitCollection(GlobalCustomer.class, "customers", "customer", Customer.class);
		//TODO need more implicit collections? i.e. no <orderItems> tag surrounding <orderItem> tags.
		
		xstream.ignoreUnknownElements();
		return xstream
	}
	
	@Bean
	@Qualifier("recRegXstream")
	public XStream recRegXstream() {
		XStream recRegXstream = new XStream(new StaxDriver())
		
		// Don't use fully qualified class names (class aliasing)
		recRegXstream.alias("address", Address.class)
		recRegXstream.alias("assignment", Assignment.class)
		recRegXstream.alias("assignmentDates", AssignmentDates.class)
		recRegXstream.alias("email", Email.class)
		recRegXstream.alias("product", Product.class)
		recRegXstream.alias("response", RecRegResponse.class)
		recRegXstream.alias("user", User.class)
		
		recRegXstream.aliasField("products", User.class, "productList")
		recRegXstream.aliasField("addresses", User.class, "addressList")
		recRegXstream.aliasField("data", RecRegResponse.class, "userList")
		recRegXstream.aliasField("assignments", Address.class, "assignmentList")
		recRegXstream.aliasField("emails", User.class, "emailList")
		recRegXstream.aliasField("assignments", Email.class, "assignmentList")
		recRegXstream.aliasField("assignmentDates", Assignment.class, "dateList")
		
		recRegXstream.ignoreUnknownElements();
		return recRegXstream
	}	
}
