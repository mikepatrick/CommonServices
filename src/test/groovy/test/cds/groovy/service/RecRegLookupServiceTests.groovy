package test.cds.groovy.service

import static org.hamcrest.core.IsNull.*
import groovy.util.logging.Log4j2

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ErrorCollector
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration

import test.cds.groovy.config.TestServicesConfig

import com.cds.groovy.domain.recreg.Address
import com.cds.groovy.domain.recreg.Assignment
import com.cds.groovy.domain.recreg.AssignmentDates
import com.cds.groovy.domain.recreg.Email
import com.cds.groovy.domain.recreg.Product
import com.cds.groovy.domain.recreg.RecRegResponse
import com.cds.groovy.domain.recreg.User
import com.cds.groovy.service.RecRegLookupService
import com.thoughtworks.xstream.XStream

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TestServicesConfig.class)
@Log4j2
class RecRegLookupServiceTests {

	@Rule public ErrorCollector verifier = new ErrorCollector()

	@Autowired RecRegLookupService service
	
	@Test
	public void testRecRegLookup() {
		
		RecRegResponse serviceResponse = service.doLookupByAcct("AccountCode", "SERV", "68285352", "WNE");
		
		log.info(serviceResponse)
		verifier.checkThat(serviceResponse, notNullValue())
		
		List<User> users = serviceResponse.userList;
		
		for (User user: users) {
			for (Product prod: user.productList) {
				log.info prod
			}
			
			for (Address addr: user.addressList) {
				log.info addr
				for (Assignment assn: addr.assignmentList) {
					log.info assn
					for (AssignmentDates assnDate: assn.dateList) {
						log.info assnDate
					}
				}
			}
			
			for (Email email: user.emailList) {
				log.info email
				for (Assignment assn: email.assignmentList) {
					log.info assn
					for (AssignmentDates assnDate: assn.dateList) {
						log.info assnDate
					}
				}
			}
		}
		
	}
}
