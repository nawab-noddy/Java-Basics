public class Main {
    public static void main(String[] args) {

    }
}










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