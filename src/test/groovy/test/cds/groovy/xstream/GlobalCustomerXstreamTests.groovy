package test.cds.groovy.xstream

import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

import test.cds.groovy.config.TestServicesConfig
import test.cds.groovy.test.strings.UrlResultTestStrings

import com.cds.groovy.domain.global.customer.GlobalCustomerResponse
import com.cds.groovy.xstream.GlobalCustomerXstream

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TestServicesConfig.class)
@Log4j2
@CompileStatic	
class GlobalCustomerXstreamTests {
	
	@Autowired
	private GlobalCustomerXstream globalCustomerXstream
	
	@Test
	public void testFromXml() {
		def deserialized = globalCustomerXstream.fromXML(UrlResultTestStrings.anotherGC)
		
		GlobalCustomerResponse response = deserialized as GlobalCustomerResponse
		
		log.info(response)
	}
	
	
}
