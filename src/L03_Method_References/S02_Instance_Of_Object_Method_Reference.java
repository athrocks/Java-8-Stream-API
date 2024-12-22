package L03_Method_References;

@FunctionalInterface
interface Printable{
    void print(String message);
}

public class S02_Instance_Of_Object_Method_Reference {

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        S02_Instance_Of_Object_Method_Reference obj = new S02_Instance_Of_Object_Method_Reference();

        // Note:- display method should have same (return) and (parameter) type as
        // abstract method of Functional Interface

        // lambda Expression
        Printable printableLambda = (msg) -> obj.display(msg);
        printableLambda.print("Hello World");

        // Method Reference
        Printable printableMethodReference = obj::display;
        printableMethodReference.print("Hello World");

    }
}
