package com.sqli.nespresso.gossips;

public class Mister extends Gossip
{
	
	private String message = "";
	
	public Mister(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void say(String message) {
		this.message = message;
	}

	@Override
	public String ask() {
		return message;
	}

	@Override
	public boolean spread() {
		if (super.spread() && !message.isEmpty())
		{
			getNext().say(message);
			message = "";
			return true;
		}
		
		return false;
	}
	
}
