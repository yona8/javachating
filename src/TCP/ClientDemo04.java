package TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo04 {
  public static void main(String[] args) throws IOException {
      Socket s = new Socket("192.168.178.26",10000);
      BufferedReader br= new BufferedReader(new FileReader("/Users/leah/IdeaProjects/MyNet/ss.txt"));
      BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
      String line ;
      while ((line=br.readLine())!=null){
          bw.write(line);
          bw.newLine();
          bw.flush();
      }
      s.close();
      br.close();
  }
}
