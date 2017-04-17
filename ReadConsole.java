// Create a branch and a pull request and merge

import java.io.*;


public class ReadConsole {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;
      FileOutputStream out = null;

      try {
         System.out.println("//// ReadConsole test with PR ////");
         cin = new InputStreamReader(System.in);
         out = new FileOutputStream("output.txt");
         System.out.println("Enter characters, 'q' to quit. Content is saved in output.txt");
         char c;
         do {
            c = (char) cin.read();
          //  System.out.print(c);
            out.write(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
         if (out != null) {
            out.close();
         }
      }
      int d;
      FileInputStream cin2;
      cin2 = new FileInputStream("output.txt");
      System.out.println("\n  The output.txt files content is following: ");
      while ((d = cin2.read()) != -1) {
            System.out.printf("%c", d);
         }
   }
}
