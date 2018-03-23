package com.custome;

import org.mule.api.MuleMessage;
import org.mule.api.routing.filter.Filter;
import org.mule.api.transport.PropertyScope;

public class ExampleCustome implements Filter {

	@Override
	public boolean accept(MuleMessage message) {
		// TODO Auto-generated method stub
		System.out.println(message.getProperty("test", PropertyScope.INVOCATION).toString());
		return true;
	}

}
