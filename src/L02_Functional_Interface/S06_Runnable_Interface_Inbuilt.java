package L02_Functional_Interface;

public class S06_Runnable_Interface_Inbuilt {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("run method called");
        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}
