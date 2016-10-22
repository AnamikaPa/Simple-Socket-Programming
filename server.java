import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;
class server
{
	public static void main(String[] args)
	{  
		try{
			//Server require its own socket
			ServerSocket s1 = new ServerSocket(107);
			System.out.println("Waiting for client....");
			
			//normal socket is required to accept the incoming request to socket s1
			Socket ss = s1.accept();
			System.out.println("Connection established....");
			
			Scanner sc = new Scanner(ss.getInputStream());
			int num = sc.nextInt();
			System.out.println("Number send by Client: "+ num);
			
			int temp = num*2;
			System.out.println("Number send to Client after manipulation: "+temp);
			
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(temp);
		
		}
		catch(Exception e){
			System.out.println("Error in connection due to "+e);
		}
	}	
}
	
