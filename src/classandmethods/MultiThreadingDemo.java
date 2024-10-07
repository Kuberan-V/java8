package classandmethods;

public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable book=()-> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("updating");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }

            }
        };
        Runnable num =()->{
            for(int i=1;i<=5;i++)
                System.out.println(i);
        };
        Thread t1 =new Thread(book);
        Thread t2=new Thread(num);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("bye");
    }
}
