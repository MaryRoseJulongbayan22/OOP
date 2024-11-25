public class InheritanceSample {
    public static void main(String[] args){

        
        Person person1 = new Person("Marose Julongbayan", "Salong");
        System.out.println(person1.Name);
        System.out.println(person1.Address);

        

        Student student1 = new Student("Maris De Lunas", "Brgy. Pob5", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());


        System.out.println();

     

        Staff staff1 = new Staff("Trisha Macalindong", "Bagong tubig", "BSU-Balayan", 2500.00);

        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff Program: " + staff1.getSchool());
        System.out.println("Staff Year: " + staff1.getSalary());


        System.out.println(person1.toString());
        System.out.println();

        System.out.println(student1.toString());
        System.out.println();

        System.out.println(staff1.toString());


    }

}





