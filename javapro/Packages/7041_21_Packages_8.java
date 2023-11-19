MyPackage/MyClass.java
package MyPackage;

public class MyClass {
    protected int protectedField;

    protected void protectedMethod() {
        System.out.println("Protected method in MyClass");
    }
}
 MyPackage/MyExtendedClass.java
package MyPackage;

public class MyExtendedClass extends MyClass {
    public void accessProtectedMembers() {
        protectedField = 42;  // Access the protected field
        protectedMethod();   // Access the protected method
        System.out.println("Value of protectedField: " + protectedField);
    }
}
 MainApp.java
package MyPackage;

class Packages_8 {
    public static void main(String[] args) {
        MyExtendedClass extendedObj = new MyExtendedClass();
        extendedObj.accessProtectedMembers();
    }
}