import java.io.*;
import java.net.Socket;

public class Connection extends Thread{
	
	Server server;
	Socket socket;
	
	ObjectOutputStream out;
	ObjectInputStream in;
	boolean alive=true;
	int id;
	Reader rdr;
	
	public void setId(int id) {this.id=id; rdr.setId(id);}
	
	public Connection(Server serv, Socket sock) 
	{
		server=serv;
		socket=sock;
		
		try {
			System.out.println("[SERVER]: Client connecting...");
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
			rdr = new Reader(in,this, server);
			rdr.start();
			System.out.println("[SERVER]: Client connected!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run() 
	{	
		while (alive) {
			try {
				out.writeObject(server.getnumber());
				out.flush();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("[SERVER]: Client "+ id +" disconnected!");
				server.removeConn(id);
				alive=false;
				return;
			}
		}
	}
		
}
