
package receipt;

import java.util.Scanner;

public class Paparon {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        salary sl = new salary();
        account ac = new account();
        receipt1 rc = new receipt1();
        
        String transaction;
        
        System.out.println("Product CRUD System\n");
        
        do{
                           
                            
                             System.out.println("1. Salary");
                             System.out.println("2. Account");  
                             System.out.println("3. Reciept");
                             System.out.println("Enter selection: ");
            int select = sc.nextInt();

            switch(select){
                case 1:
                    sl.getSalary();
                    break;
                case 2: 
                    ac.getaccounts();
                break;
                case 3:
                    rc.getrec();
                    break;
                default: System.out.println("Invalid choice.");
            }
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.contains("y"));
        
    }
}
    
    

