import java.awt.Component;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutYou {
    //Went off based of your code
    static Scanner scanner;


   public static JFrame showImage(String var0) {
      JFrame var1 = new JFrame(var0);
      var1.setDefaultCloseOperation(3);
      ImageIcon var2 = new ImageIcon(var0);
      JLabel var3 = new JLabel(var2);
      var1.getContentPane().add(var3);
      var1.pack();
      var1.setLocationRelativeTo((Component)null);
      var1.setVisible(true);
      return var1;
   }
      public static void displayMenu() {
      System.out.println("What would you like to learn about Sandy?");
      System.out.println("\tAmans <F>amily");
      System.out.println("\tAman's <H>obby");
      System.out.println("\tAman's <C>ulture");
      System.out.println("\tAman's <T>raveling");
      System.out.println("\t<Q>uit program");
      System.out.print("\nEnter your choice --> ");
   }


    
}
