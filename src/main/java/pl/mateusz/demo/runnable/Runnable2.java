package pl.mateusz.demo.runnable;

public class Runnable2 implements Runnable{
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println("Test thread 3");
        }

    }
}
