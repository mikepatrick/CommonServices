package com.cds.groovy.service

import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment

import com.cds.groovy.domain.global.customer.GlobalCustomerResponse
import com.cds.groovy.web.utils.GetUrlIF
import com.cds.groovy.xstream.GlobalCustomerXstream

@Log4j2
@CompileStatic
class GlobalCustomerLookupService {

	@Autowired
	private GlobalCustomerXstream globalCustomerXstream;
	
	@Autowired
	GetUrlIF getUrl
	
	@Autowired Environment env
	
	public GlobalCustomerResponse doLookupByAcct(String acctNbr, String mag, String zip) {
		
		String globalUrl = env.getProperty("global.lookup.url")
		String globalAppId = env.getProperty("global.lookup.appId")
		String globalPw = env.getProperty("global.lookup.pw")
		
		//String urlToCall = "${globalUrl}/${mag}/${acctNbr}"
		String urlToCall = buildQueryString(globalUrl, globalAppId, globalPw, mag, acctNbr, zip)
		log.debug(urlToCall)
		
		String globalCustomerGet = getUrl.get(urlToCall)
		log.debug(globalCustomerGet)
		
		//GlobalCustomerResponse deserialized = globalCustomerXstream.fromXML(globalCustomerGet) as GlobalCustomerResponse
		def deserialized = globalCustomerXstream.fromXML(globalCustomerGet) //as GlobalCustomerResponse
		log.debug deserialized
		
		return deserialized as GlobalCustomerResponse
		
	}
	
	private String buildQueryString(url, appId, pw, mag, acct, zip) {
		return "${url}/${mag}?appId=${appId}&pwd=${pw}&systemCode=SERV&filterType=AccountCodeAndPostalCode&accountCode=${acct}&postalCode=${zip}"
	}
}
