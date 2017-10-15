package test.cds.groovy.service

import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

import test.cds.groovy.config.TestServicesConfig

import com.cds.groovy.domain.global.customer.GlobalCustomerResponse
import com.cds.groovy.service.GlobalCustomerLookupService

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TestServicesConfig.class)
@Log4j2
@CompileStatic
class GlobalCustomerLookupServiceTests {

	@Autowired
	GlobalCustomerLookupService service
	
	@Test
	public void testLookup() {
		
		GlobalCustomerResponse response = service.doLookupByAcct("920219565", "GFT", "90210")
		log.info response	
	}
}
