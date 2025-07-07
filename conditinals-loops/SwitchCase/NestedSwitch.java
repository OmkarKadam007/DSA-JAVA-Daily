// package conditinals-loops.SwitchCase;

import java.util.Scanner;

public class NestedSwitch {
            public static void main(String[] args) {
                Scanner in= new Scanner(System.in);
                 int empId=in.nextInt();
                String Department=in.next();
        
               
                switch (empId) {
                                                                 

                    

                      case 1:
                        System.out.println("Omskr kadam ");
                        break;
                    case 2:
                        System.out.println("ravi teja ");
                        break;
                    case 3:
                        System.out.println("Enter a Department ");
                        switch (Department) {
                            
                            case "IT":
                                System.out.println("IT DEPARTMENT");
                                break;
                            case "BANK":
                                System.out.println("BANK DEpartment ");
                            case "HR":
                                System.out.println("HR DEPARTMENT");
                                
                                break;
                        
                            default:
                                break;
                        }
                        
                        break;
                
                    default:
                        System.out.println("DEfault mno t match ");
                        break;
                }
            }
}
