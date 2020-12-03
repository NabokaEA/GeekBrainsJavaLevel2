package Level2_Lesson5;

public class App {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

        public static void main(String[] args) {
            metod1();
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

    }
}
