package com.custome;

import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class ExampleComponent implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		//Get Message object
		MuleMessage muleMessage = eventContext.getMessage();
		//muleMessage.getPayload();
		//String uniqueID = muleMessage.getUniqueId();
		
		//Get any kind of property like inbound, outbound, invocation or session
		String code = muleMessage.getProperty("code", PropertyScope.INVOCATION);
		//String name = muleMessage.getProperty("name", PropertyScope.);
		Map<String, String> queryParams = muleMessage.getInboundProperty("http.query.params");
		return "Hello World From ExampleComponent Hi, "+code+" your name is "+queryParams.get("name");
	}

}
