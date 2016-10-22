import java.io.*;
import java.net.*;
import java.util.Scanner;  
class cclient
{
	public static void main(String[] args)
	{ 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter IP address: ");
		String ip = s.next();
		try{
			// in brackets ip address of server to connect and port number
			Socket soc = new Socket(ip,107);
			
			// to except data from server
			Scanner sc1 = new Scanner(soc.getInputStream());
			
			System.out.print("Enter a number: ");
			int num = s.nextInt();
			
			//print stream to send data to server
			PrintStream p = new PrintStream(soc.getOutputStream());
			
			//we want to print num to server 
			p.println(num);
			
			//accept the data from server
			int temp = sc1.nextInt();
			System.out.println("Server: "+temp);
		}
		catch(Exception e){
			System.out.println("Error in connection due to "+e);
		}
	}
}