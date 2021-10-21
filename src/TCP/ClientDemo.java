package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
      Socket s = new Socket("192.168.178.26",10004);
      OutputStream os = s.getOutputStream();
      os.write("hello,我来了".getBytes(StandardCharsets.UTF_8));

      InputStream is =s.getInputStream();
      byte[] bys = new byte[1024];
      int len = is.read(bys);
      String data = new String(bys,0,len);
      System.out.println("客户端：" + data);
      s.close();

  }
  }

