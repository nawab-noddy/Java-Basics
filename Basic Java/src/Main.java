import java.lang.runtime.SwitchBootstraps;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AuthService authService = new AuthService();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Select an option");
            System.out.println("1 for Register");
            System.out.println("2 for LogIn");
            System.out.println("3 for Exit");

            option = sc.nextInt();

            try{
                switch (option){
                    case 1:
                        System.out.println("Enter email &  create a new password");
                        String email1 = sc.next();
                        String password1 = sc.next();
                        authService.registerUser(email1,password1);
                        System.out.println("User register successfully");

                    case 2:
                        System.out.println("enter email  and password for login");
                        String email2 = sc.next();
                        String password2 = sc.next();
                        authService.logInUser(email2,password2);
                        System.out.println("LogIn Successfully");
                }
            }
            catch (IllegalArgumentException e){
                System.out.println("Error" + e.getMessage());
            }
        }while (option != 3);
    }
}



//----------------------------------------Project 2 Completed-----------------------------------------------------------


//BankService bankService = new BankService();
//        Scanner sc = new Scanner(System.in);
//        int option;
//        do {
//            System.out.println("Select an option");
//            System.out.println("1 for Create Account");
//            System.out.println("2 for Deposit");
//            System.out.println("3 for Withdraw");
//            System.out.println("4 for Check Balance");
//            System.out.println("5 for Exit");
//
//            option = sc.nextInt();
//
//            switch (option){
//                case 1:
//                    try{
//                    System.out.println("Give Your Account Number");
//                    int accNumber = sc.nextInt();
//                    System.out.println("Give Name for the Account");
//                    String accName = sc.next();
//                    System.out.println("Give Initial Amount for Account");
//                    int balance = sc.nextInt();
//                    bankService.createAccount(accNumber, accName, balance);
//                    System.out.println("Your Bank Account is created with the Account Number - " + accName + " , with Holder Name - " + accName + " , and with Balance - " + balance);
//                    }
//                    catch (IllegalArgumentException e){
//                        System.out.println("error - " + e.getMessage());
//                    }
//                    break;
//                case 2:
//                    try{
//                    System.out.println("Enter the account number");
//                    int accnumber = sc.nextInt();
//                    System.out.println("Enter the amount u want to deposit");
//                    int amountToDeposit = sc.nextInt();
//                    bankService.depositToAccount(accnumber,amountToDeposit);
//                    System.out.println("ur amount is deposit");
//                    }
//                    catch (IllegalArgumentException e){
//                        System.out.println("Error - " + e.getMessage());
//                    }
//                    break;
//                case 3:
//                    try{
//                    System.out.println("Enter the account number");
//                    int accno = sc.nextInt();
//                    System.out.println("enter the amount u want to withdraw");
//                    int withdraw =  sc.nextInt();
//                    bankService.withdrawFromAccount(accno, withdraw);
//                    System.out.println("Amount is withdrawn");
//                    }
//                    catch (IllegalArgumentException e){
//                        System.out.println("Error - " + e.getMessage());
//                    }
//                    break;
//                case 4 :
//                    try{
//                    System.out.println("Enter the account number");
//                    int number = sc.nextInt();
//                    int amount = bankService.getBalance(number);
//                        System.out.println(amount);
//                    }
//                    catch (IllegalArgumentException e){
//                        System.out.println("Error - " + e.getMessage());
//                    }
//                    break;
//            }
//        }while (option != 5);









//   ------------------------------------ ManageStudent Operations -------------------------------------------//
//        ManageStudents manageStudents = new ManageStudents();
//        Collection<String> li;
//        String message;
//
//        int option;
//        do {
//            System.out.println("Select an option: ");
//            System.out.println("1 for AddingStudent");
//            System.out.println("2 for RemovingStudent");
//            System.out.println("3 for UpdatingStudent");
//            System.out.println("4 for ViewAllStudent");
//            System.out.println("5 for Exit");
//
//            Scanner sc = new Scanner(System.in);
//            option = sc.nextInt();
//            switch (option) {
//                case 1:
//                    System.out.println("Please Enter the name you want to add : ");
//                    String addName = sc.next();
//                    message = manageStudents.addStudent(addName);
//                    System.out.println(message);
//                    break;
//                case 2:
//                    System.out.println("Please Enter the name you want to remove : ");
//                    String removeName = sc.next();
//                    message = manageStudents.removeStudent(removeName);
//                    System.out.println(message);
//                    break;
//                case 3:
//                    System.out.println("Please Enter the old name : ");
//                    String oldName = sc.next();
//                    System.out.println("Please Enter the new name you : ");
//                    String newName = sc.next();
//                    message = manageStudents.updateStudent(oldName, newName);
//                    System.out.println(message);
//                    break;
//                case 4:
//                    li = manageStudents.viewAllStudent();
//                    for (String s : li) {
//                        System.out.println(s + " ");
//                    }
//                    break;
//                case 5:
//                    System.out.println("Existing the program goodbye");
//                    break;
//                default:
//                    System.out.println("please choose a valid option");
//            }
//        } while (option != 5);