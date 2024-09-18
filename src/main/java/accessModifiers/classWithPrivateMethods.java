package accessModifiers;

// The methods or data members declared as private are accessible only within the class in which they are declared.
class classWithPrivateMethods {
    //private void Display()
    public void Display() {
        System.out.println("Printing result of private access modifier");
    }
}

class classWithPrivateMethodsB {
    public static void main(String[] args) {
        classWithPrivateMethods obj = new classWithPrivateMethods();
        obj.Display();
        // error will come once we make classWithPrivateMethods.display as private
    }
}