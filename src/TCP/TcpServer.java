package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
  public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(10000);

      Socket s= ss.accept();
      InputStream is = s.getInputStream();
      byte[] byts=new byte[1024];
      int len = is.read(byts);
      String data = new String(byts,0,len);
    System.out.println("数据是："+ data);

    s.close();
    ss.close();
  }
}
