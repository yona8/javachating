package TCP;

import java.io.File;
import java.io.IOException;

public class newFile {
  public static void main(String[] args) throws IOException {
    File f = new File("/Users/leah/IdeaProjects/MyNet/ss.txt");
    System.out.println( f.createNewFile());
  }
}
