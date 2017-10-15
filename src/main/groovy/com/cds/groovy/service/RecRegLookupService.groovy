package com.cds.groovy.service

import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2
import groovyx.net.http.URIBuilder

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment

import com.cds.groovy.domain.recreg.RecRegResponse
import com.cds.groovy.web.utils.GetUrlIF
import com.cds.groovy.xstream.RecRegXstream

@Log4j2
@CompileStatic
class RecRegLookupService {
	
	@Autowired
	private RecRegXstream recRegXstream;
	
	@Autowired
	GetUrlIF getUrl
	
	@Autowired
	Environment env
	
	public RecRegResponse doLookupByAcct(String filterType, String systemCode, String acctNbr, String mag) {
		
		String url = env.getProperty("recreg.url")
		
		String urlToCall = new URIBuilder(url).addQueryParams( ["filter_type":filterType, 
																"system_code": systemCode, 
																"product_code": mag, 
																"account_code": acctNbr] ).toString()
		String recRegGet = getUrl.get(urlToCall)
		
		RecRegResponse deserialized = recRegXstream.fromXML(recRegGet)
		
		log.debug deserialized
		
		return deserialized
		
	}
	public RecRegXstream getRecRegXstream() {
		return recRegXstream;
	}

	public void setRecRegXstream(RecRegXstream recRegXstream) {
		this.recRegXstream = recRegXstream;
	}
}
