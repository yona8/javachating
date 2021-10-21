package TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo02 {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("192.168.178.26",12345);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    String line;
    while ((line = br.readLine())!=null){
      if("886".equals(line)){
        break;
      }
      bw.write(line);
      bw.newLine();
      bw.flush();
    }
    s.close();
  }
}
