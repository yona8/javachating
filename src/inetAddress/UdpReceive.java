package inetAddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceive {
  public static void main(String[] args) throws IOException {
    DatagramSocket ds =new DatagramSocket(10086);
    byte[] bys = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bys,bys.length);
    ds.receive(dp);
//    byte[] dates = dp.getData();
//    int len = dp.getLength();
//    String dataString = new String(dates,0,len);
//    System.out.println("接收到的数据是："+ dataString);
    System.out.println("接收到的数据是："+ new String(dp.getData(),0,dp.getLength()));
    ds.close();
  }
}
