package Level2_Lesson5;

import com.sun.xml.internal.ws.message.stream.StreamHeader12;

public class App {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    private static float[] a1=new float[HALF];
    public static float[] a2=new float[HALF];

    public static void main(String[] args) {

        metod1();
        metod2();
    }

    static public void metod1() {
        float[] arr1 = new float[SIZE];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }


    public static void metod2() {
        float[] arr2 = new float[SIZE];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1;
        }
        System.arraycopy(arr2, 0, a1, 0, HALF);
        System.arraycopy(arr2, HALF, a2, 0, HALF);
        long a = System.currentTimeMillis();
        calculate(a1);
        System.out.println(System.currentTimeMillis()-a);
        new RunableSum();

    }


    public static void calculate(float[] inarr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < inarr.length; i++) {
            inarr[i] = (float) (inarr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis()-a);
    }
}
