package observerchain.chain;

import observer.Observer;

public abstract class Handler {

	private Handler next;
	
	

	public Handler(Handler next) {
		super();
		this.next = next;
	}



	public Handler() {
		super();
	}



	public Handler getNext() {
		return next;
	}



	public void setNext(Handler next) {
		this.next = next;
	}
	
	public abstract void notificaClient(Observer client,String mesaj) ;
		
	
	
}
