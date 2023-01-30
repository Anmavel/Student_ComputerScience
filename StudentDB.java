import java.util.Arrays;
public class StudentDB {

    private Student[] studentList;

    public StudentDB(Student[] studentList) {
        this.studentList = studentList;
    }

    public Student[] getAllStudents(){
        return studentList;
    }

    public String toString(){
        return Arrays.toString(studentList);
    }

    public Student randomStudent(){
        int randomIndex = (int) (Math.random()*studentList.length);
        return studentList[randomIndex];
    }

    public void addStudent(Student newStudent){
        studentList = Arrays.copyOf(studentList, studentList.length + 1);
        studentList[studentList.length - 1] = newStudent;
    }

    public void removeStudent(Student exStudent){
        Student[] newStudentList = new Student[studentList.length -1];
        int difference = 0;
        for(int i=0; i<studentList.length;i++){
            if(!studentList[i].equals(exStudent)){
                newStudentList[i-difference] = studentList[i];
            } else {
                difference++;
            }
        }
        studentList = newStudentList;


    }

}
