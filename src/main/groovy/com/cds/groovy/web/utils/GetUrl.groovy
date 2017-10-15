
package com.cds.groovy.web.utils

import groovy.transform.CompileStatic

@CompileStatic
class GetUrl implements GetUrlIF {

	String get(String url) {
		return url.toURL().text;
	}
	
//	String post(String url, String postBody) {
//		HTTPBuilder builder =  new HTTPBuilder(url);
//		String postResponse = ""
//		
//		builder.request(Method.POST, ContentType.JSON) {
//			body = postBody
//		
//			response.success = { resp, json ->
//				postResponse = json
//			}
//		}
//		
//		return postResponse
//	}
}
