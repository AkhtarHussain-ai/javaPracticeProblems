package JAVA1_BASIC_PROGRAM;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My IP address is: " + myIP.getHostAddress());
        InetAddress MyIp = InetAddress.getLocalHost();


    }
}

