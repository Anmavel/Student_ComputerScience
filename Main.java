public class Main {

    public static void main(String[] args) {

         Student hamideh = new Student("Hamideh", 1);
         Student ana = new Student("Ana", 2);
         Student daniel = new Student("Daniel", 3);
         Student valentin = new Student("Valentin", 4);


         System.out.println(ana.equals(ana));

         StudentDB database = new StudentDB(new Student[] {hamideh, ana, daniel, valentin});
         System.out.println(database.toString());
         System.out.println(database.getAllStudents());
         System.out.println(database.randomStudent());
         database.removeStudent(valentin);
         database.addStudent(valentin);
         System.out.println(database.toString());

         ComputerScienceStudent Guenther = new ComputerScienceStudent("Guenther", 5, true);
         System.out.println(Guenther);





    }
}
