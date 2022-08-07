package com.decorator.demo;

public class NotifierImpl implements Notifier {
	
	private MailService sendMailService;
	private FacebookService facebookService;
	
	public NotifierImpl() {
		sendMailService = new MailService();
		facebookService = new FacebookService();
	}

	@Override
	public void send() {
		sendMailService.send();
	}

	@Override
	public void sendFacebook() {
		facebookService.send();
	}

	@Override
	public void sendMailAndFacebook() {
		send();
		sendFacebook();
	}

}
