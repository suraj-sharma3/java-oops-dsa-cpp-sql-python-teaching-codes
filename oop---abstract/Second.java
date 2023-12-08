

public class Second{
    int x = 45;
    
    public static void main(String[] args) {
    Plane myObj = new Plane();
//    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
// If you don't want the ability to override existing attribute values, declare attributes as final
// A static method means that it can be accessed without creating an object of the class, unlike public
class Plane {
  final int x = 10;
  final double PI = 3.14;
}

/*
class Third {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Flame class)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
*/