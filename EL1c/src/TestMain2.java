import es.uah.matcomp.mp.e1.Staff;
import es.uah.matcomp.mp.e1.Person;
import es.uah.matcomp.mp.e1.Student;

public class TestMain2 {
        public static void main(String[] args) {
            // Probando la clase Person
            System.out.println("### Test Clase Person ###");
            Person person = new Person("Carlos", "Avenida Principal 123");
            System.out.println(person); // Salida esperada: Person[name=Carlos,address=Avenida Principal 123]
            person.setAddress("Calle Secundaria 456");
            System.out.println("Dirección actualizada: " + person.getAddress());

            // Probando la clase Student
            System.out.println("\n### Test Clase Student ###");
            // Constructor: Student(String name, String address, String program, int year, double fee)
            Student student = new Student("Ana", "Calle Universidad 789", "Ingeniería Informática", 2023, 2000.75);
            System.out.println(student); // Salida esperada: Student[Person[name=Ana,address=Calle Universidad 789],program=Ingeniería Informática,year=2023,fee=2000.750000]
            student.setProgram("Ingeniería de Datos");
            student.setYear(2024);
            student.setFee(2500.50);
            System.out.println("Nuevo programa: " + student.getProgram());
            System.out.println("Nuevo año: " + student.getYear());
            System.out.println("Nueva cuota: " + student.getFee());

            // Probando la clase Staff
            System.out.println("\n### Test Clase Staff ###");
            // Constructor: Staff(String name, String address, String school, double pay)
            Staff staff = new Staff("Laura", "Plaza Central 321", "Universidad Autónoma", 3000.00);
            System.out.println(staff); // Salida esperada: Staff[Person[name=Laura,address=Plaza Central 321],school=Universidad Autónoma,pay=3000.000000]
            staff.setSchool("Universidad de Alcalá");
            staff.setPay(3500.75);
            System.out.println("Nuevo centro de trabajo: " + staff.getSchool());
            System.out.println("Nuevo salario: " + staff.getPay());
        }
    }
