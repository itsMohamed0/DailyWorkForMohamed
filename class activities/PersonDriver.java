package testingstuff;

public class PersonDriver {

    public static void main(String[] args) {
        Person person1 = new Person("Mohamed", 55, "UAE", "01/10/1968");

       
        person1.eat();
        person1.sleep();
        person1.walk();
        
        employee e = new employee("Ali", 42, "UAE", "01/01/1990", 3252, 2435435, 4322, "Entry level");
        
        e.work();
        e.email();
        e.report();
       
        students s = new students("saeed", 20, "UAE", "01/04/2000", 1070174, "Computer Science", 90);
        s.study();
        s.code();
        s.project();
    }
}
