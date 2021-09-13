package q1;

import java.io.File;

class q1 {
  public static void main(String[] args) {

    File file = new File("C:\\Users\\kanna\\OneDrive\\Desktop\\Java Sample");


    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}