package chain;

public abstract class Handler {
   private Handler urmatorulHandler;

public Handler getUrmatorulHandler() {
	return urmatorulHandler;
}

public void setUrmatorulHandler(Handler urmatorulHandler) {
	this.urmatorulHandler = urmatorulHandler;
}
   
   public abstract void handler(int km);
}
