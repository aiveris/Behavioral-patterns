package design.patterns.behavioral.chainofresp.implementation;

public abstract class Handler {

	protected Handler successor;
	
	public Handler setSuccessor(Handler successor) {
		this.successor = successor;
		return successor;
	}
	
	public abstract void handleRequest(Request request);
	
}
