import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ManageStudents {
    private List<String> list = new ArrayList<>();

    public String addStudent(String student){
        if(list.contains(student)){
            return "Already exists";
        }
        else {
            list.add(student);
            return "Student Added";
        }
    }
    public String removeStudent(String student){
        if(list.contains(student)){
            list.remove(student);
            return "Remove the student -" + student;
        }
        else{
            return "No Student name " + student + "exists";
        }
    }
    public String updateStudent(String oldStudent, String newStudent){
        if(list.contains(oldStudent)){
            list.add(newStudent);
            list.remove(oldStudent);
            return "Name updated";
        }
        else{
            return "Person with this name does not exists";
        }
    }
    public Collection<String> viewAllStudent(){
        List<String> allStudents = new ArrayList<>();
        allStudents.addAll(list);
        return allStudents;
    }
}
