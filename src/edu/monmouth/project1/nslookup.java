package edu.monmouth.project1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class nslookup {

    public static void main(String[] args) throws UnknownHostException {
	final int REQUIREDPARAMETERS=5;

	byte[] address1 = { 127,0,0,1 };  // use for question 3
	byte[] address2 = { 8,8,8,8 };  // use for question 3
	byte[] address3 = { 75,75,75,75 };  // use for question 3
	
	InetAddress address_1 = InetAddress.getByAddress(address1);
	InetAddress address_2 = InetAddress.getByAddress(address2);
	InetAddress address_3 = InetAddress.getByAddress(address3);
	
	if (args.length != REQUIREDPARAMETERS) {
	    System.err.println("Supply the domain names");
	    System.exit(-1);
	}

	InetAddress localhost1 = InetAddress.getLocalHost();
    System.out.println("Local IP Address : " +
                  (localhost1.getHostAddress()).trim());
    System.out.println("Local Host Name : " +
            (localhost1.getHostName()).trim());
    System.out.println("Local Fully Qualified Domain Name : " +
            (localhost1.getCanonicalHostName()).trim());
    
    System.out.println();
    
    System.out.println("Address 1's Host Name:" + (address_1.getHostName()) );
    System.out.println("Address 2's Host Name:" + (address_2.getHostName()) );
    System.out.println("Address 3's Host Name:" + (address_3.getHostName()) );
		
		for(int i=0;i<args.length;i++)  {
			
			 System.out.println();
		 
			InetAddress address_input = InetAddress.getByName(args[i]);
			System.out.println("Host Name : " +
		            (address_input.getHostName()).trim());
			 System.out.println("Host's Fully Qualified Domain Name : " +
			            (address_input.getCanonicalHostName()).trim());
			
    	InetAddress[] addressesinput = InetAddress.getAllByName(args[i]);
        for (int a = 0; a < addressesinput.length; a++) {
            System.out.println(addressesinput[a]);

        }
	}
    }
    
}

