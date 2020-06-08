package prototype;

public class ProgramMain {

	public static void main(String[] args) {
    IClient client=new Client("Diana",25);
    IClient clientCopie=client.copiaza();
    System.out.println(client.toString());
    System.out.println(clientCopie.toString());;
	}

}
