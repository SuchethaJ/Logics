package Day4;

interface A{
    void eat();
    void code();
}
interface B extends A
{
    @Override
    default void code() { //this is not a access specifier(we think visibilty decreasing from public to default).....here default is a keyword.
        System.out.println("Code");
    }
    @Override
    default  void eat()
    {
        System.out.println("Eat");
    }
}

public class Interfacedefaultss implements B {

    public static void main(String[] args) {
        B b=new B() {};
        b.code();
        b.eat();

    }
}

