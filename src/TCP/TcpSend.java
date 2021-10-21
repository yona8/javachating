package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpSend {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("192.168.178.26",10000);
    OutputStream os = s.getOutputStream();
    os.write("hello,tio,我来了".getBytes(StandardCharsets.UTF_8));
    s.close();
  }
}
