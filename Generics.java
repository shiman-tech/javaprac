class Animal{
    public void eat()
    {
        System.out.println("animal eats");
    }
}

class Dog extends Animal{
    public void bark()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    public void meow()
    {
        System.out.println("cat meows");
    }
}

class TestGenerics1<T extends Animal>                //BOUNDED GENERICS
{

    T thing;

    TestGenerics1(T thing)
    {
        this.thing=thing;
    }

    public T printT(T thing)                        /*CANNOT USE STATIC AS THE CLASS TYPE IS GENERIC WE MUST SPECIFY  THE TYPE WHILE 
                                                       CREATING THE OBJECT  */
    {
        thing.eat();
        return thing;
    }
    public <U> void printU(U otherThing)
    {
        System.out.println(otherThing);

    }
}    

class TestGenerics2
{

    public static <T> void genericMethod(T thing)
    {
        System.out.println(thing);
    }

    public static <T extends Animal> void boundedGenericMethod(T thing)
    {
        System.out.println(thing);
    }



}


public class Generics{
    public static void main(String[] args) {

        //  TestGenerics1<Integer> gint=new TestGenerics1<>(23);                          REFERS TO INTEGER

        //  TestGenerics1<String> gstr=new  TestGenerics1<>("Shiman");                    REFERS TO STRING

        //  gint.printU(69);

        // System.out.println(gint.thing);
        // System.out.println(gstr.thing);

        // Integer i=gint.printT(10);
        // System.out.println(i);

        // String s=gstr.printT("hello");
        // System.out.println(s);

        TestGenerics1<Cat> gcat=new TestGenerics1 <>(new Cat());                          // REFERS TO CAT
        Cat c= gcat.printT(new Cat());
        c.meow();

        TestGenerics2 test=new TestGenerics2();
        test.genericMethod(45);
        test.genericMethod("puppy");

        test.boundedGenericMethod(new Cat());



       

        


        


    }
}