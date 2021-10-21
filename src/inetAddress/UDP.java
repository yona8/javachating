package inetAddress;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDP {
  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    byte[] bys ="hello,upd,i'm coming".getBytes(StandardCharsets.UTF_8) ;
    DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.178.26"),10086);

    ds.send(dp);
    ds.close();
  }
}
