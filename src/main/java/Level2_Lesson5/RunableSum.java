package Level2_Lesson5;

public class RunableSum implements Runnable {
    Thread t;

    RunableSum() {
        t = new Thread(this, "Поток");
        System.out.println("Создан поток" + t);
        t.start();
    }

    @Override
    public void run() {
        App.calculate(App.a2);
    }


}
