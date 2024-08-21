class Employee {
    void quality() {
        System.out.println("This is a good employee");
    }
}

class Person extends Employee {
    void habit() {
        System.out.println("The person is also good");
    }
}

public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.quality();  
        obj.habit(); 
    }
}
