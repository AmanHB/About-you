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

      private static void waitForEnter() {
      System.out.println("Press enter to continue...");
      scanner.nextLine();
   }

   private static void family() {
      System.out.println("Here is photo of my lovely \"Family\"");
      System.out.println("\tTo the left is my grandma");
      System.out.println("\tTo the Right of my grandma, is my sister she is only 11 years old");
      System.out.println("\tTo the Right of my sister is my dad, he is a developer for starbucks");
      System.out.println("\tTo the right of my dad, is my mom, she is a AI prompt engineer as well as an employe in mincrosoft");
      JFrame var0 = showImage("Family.jpg");
      waitForEnter();
      var0.dispose();
   }

   private static void hobby() {
      System.out.println("My favorite hobby is playing valorant in my free time!");
      System.out.println("\tValorant is a stragetic game, 1 side plants a bomb and other defuse it");
      System.out.println("\tI peaked at immortal which is only 3% of 1Million+ players");
      System.out.println("\tI enjoy playing valorant");
      JFrame var0 = showImage("VALO.jpg");
      waitForEnter();
      var0.dispose();
   }

   private static void traveling() {
      System.out.println("My favorite thing to do during vacation is to travel and see the world");
      System.out.println("\tThis photo was taken in yosemite national park");
      System.out.println("\tThe photo showes a breath taking mountain");
      System.out.println("\tMajority of our traveling is done near a national park our just nature overall");
      JFrame var0 = showImage("Nature.jpg");
      waitForEnter();
      var0.dispose();
   }

   private static void culture() {
      System.out.println("I was born in Ethiopia, Africa so our culture varies quite a bit");
      System.out.println("The photo i am showing is our culture food called injera which is basically fermented bread in a sense");
      System.out.println("We eat this on a daily baisis and I can never get used to it");
      JFrame var0 = showImage("Injera.jpg");
      waitForEnter();
      var0.dispose();
   }

    
}
