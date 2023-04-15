// import java.util.Spliterators.AbstractLongSpliterator;

//dynamic method
class Apple
{
    void display()
    {
        System.out.println("inside apples'display method");
    }
}
class banana extends Apple{
    void display()
    {
      System.out.println("inside banan's display");
    }
}

class cherry extends Apple{
    void display()
    {
      System.out.print("inside cherry display");
    }
}

class Fruits_dispatch{
    public static void main(String[] args) {
        Apple a=new Apple();
        banana b=new banana();
        cherry c=new cherry();
        Apple ref;
        ref=a;
        ref.display();

        ref=b;
        ref.display();

        ref =c ;
        ref.display();
    }
}
