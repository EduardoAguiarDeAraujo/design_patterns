package Decorator;

public abstract class Decorator implements Component {

	protected Component component;

	public Decorator(){
	}

	public Decorator(Component component){
	}

	public abstract void Operation();

}