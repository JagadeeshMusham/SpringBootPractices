package com.musham.practices.design_pattern.state;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("This is in Stop state");
		context.setState(this);
	}
	
	public String toString()
	{
		return "Stop State";
	}
}
