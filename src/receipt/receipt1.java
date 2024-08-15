
package receipt;

import java.util.Scanner;


public class receipt1 {
    
    public void getrec() {
        
    
     Scanner input = new Scanner (System.in);
       String fname,pname;
       int quan,pr,c,ch,td;
       
        System.out.print("Customer name: ");
        fname = input.nextLine();
        System.out.print("Product name: ");
        pname = input.nextLine();
        System.out.print("Quantity: ");
        quan = input.nextInt();
        System.out.print("Price: ");
        pr = input.nextInt();
        System.out.print("Cash: ");
        c = input.nextInt();
       
        System.out.println("------------------------------");
        System.out.println("    Receipt   ");
         System.out.println("------------------------------");
        System.out.println("Name: "+fname);
        System.out.println("Item: "+pname);
        System.out.println("Quantity: "+quan);
        System.out.println("-------------------------------");
        System.out.print("Total Due: ");
        td = input.nextInt();
        System.out.println("Cash: "+ c);
         System.out.println("-------------------------------");
         ch = c - td;
         System.out.println("Change: "+ch);
          System.out.println("-------------------------------");
}
}