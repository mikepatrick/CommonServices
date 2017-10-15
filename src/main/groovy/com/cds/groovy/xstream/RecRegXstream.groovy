package com.cds.groovy.xstream

import groovy.transform.CompileStatic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

import com.cds.groovy.domain.recreg.RecRegResponse
import com.thoughtworks.xstream.XStream

@Component
@CompileStatic
class RecRegXstream implements XStreamIF<RecRegResponse> {
	
	@Autowired
	@Qualifier("recRegXstream")
	XStream xstream
	
	public RecRegResponse fromXML(String xml) {
		return xstream.fromXML(xml) as RecRegResponse
	}
	
}
