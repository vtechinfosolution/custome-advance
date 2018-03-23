package com.custome;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.processor.MessageProcessor;

public class ExampleProcessor implements MessageProcessor {

	@Override
	public MuleEvent process(MuleEvent event) throws MuleException {
		// TODO Auto-generated method stub
		System.out.println("Call From ExampleProcessor..."+event.getFlowVariable("code"));
		event.setFlowVariable("name", "Vikash");;
		
		return event;
	}
	
	
	public void myMethod(String taskToComplete, String startDate, int taskIdNumber) {
	     // code here
	  }

}
