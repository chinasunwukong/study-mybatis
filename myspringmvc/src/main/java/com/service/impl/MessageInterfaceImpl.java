package com.service.impl;

import org.springframework.stereotype.Service;

import com.service.MessageInterface;


@Service
public class MessageInterfaceImpl implements MessageInterface{
	
	public MessageInterfaceImpl() {
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return "welcome to spring mvc";
	}
	

}
