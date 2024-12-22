package L01_Lamda_Expression;

//class ThreadDemo implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("run Method called....");
//    }
//}

public class S05_Runnable_Lambda_Example {
    public static void main(String[] args) {
//        Thread thread = new Thread(new ThreadDemo());
//        thread.start();

//        Runnable r = () -> {
//            System.out.println("run method called using lambda.....");
//        };
//        Thread t1 = new Thread(r);
        Thread t1 = new Thread(() -> System.out.println("run method called using lambda"));
        t1.start();

    }
}
