import animal.Animal;
import animal.Cat;
import animal.Dog;
import bank.A;
import bank.B;
import bank.Bank;
import bank.C;
import shape.Cilcle;
import shape.Triangle;

public class Main {
    public static void main(String[] args) {
//        Animal cat =new Cat();
//        Animal dog =new Dog();
//        cat.cat();
//        dog.dog();
//        Bank a=new A();
//        Bank b=new B();
//        Bank c=new C();
//        a.getBalance();
//        b.getBalance();
//        c.getBalance();
        Triangle triangle =new Triangle();
        triangle.calculateArea();
        Cilcle cilcle =new Cilcle();
        cilcle.calculatePerimeter();
    }
}