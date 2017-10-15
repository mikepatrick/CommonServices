package com.cds.groovy.xstream

import groovy.transform.CompileStatic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

import com.cds.groovy.domain.global.customer.GlobalCustomerResponse
import com.thoughtworks.xstream.XStream

@CompileStatic
class GlobalCustomerXstream implements XStreamIF<GlobalCustomerResponse> {

	@Autowired
	@Qualifier("globalCustomerXstream")
	XStream xstream
	
	public GlobalCustomerResponse fromXML(String xml) {
		return xstream.fromXML(xml) as GlobalCustomerResponse
	}
}
