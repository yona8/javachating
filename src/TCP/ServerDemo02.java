package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
  public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(12345);
      Socket s = ss.accept();
      BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
      String line;
      while((line=br.readLine())!=null){
      System.out.println(line);
      }
      ss.close();
  }
}
