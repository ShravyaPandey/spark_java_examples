package accessModifiersPackage;
import accessModifiers.*;

class defaultClassTest
{
    public static void main(String[] args)
    {
        // We will get error because once we make defaultClass as default
        defaultClass obj = new defaultClass();
        obj.display();

    }
}
