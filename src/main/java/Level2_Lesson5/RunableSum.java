package Level2_Lesson5;

public class RunableSum implements Runnable {
    @Override
    public void run() {
        public static float metod2 ( float[] inarr){
            float[] arr2 = new float[App.SIZE];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = 1;
            }

            float[] arr2Part1 = new float[0];
            float[] arr2Part2 = new float[0];
            System.arraycopy(arr2, 0, arr2Part1, 0, App.HALF);
            System.arraycopy(arr2, App.HALF, arr2Part2, 0, App.HALF);

            long a = System.currentTimeMillis();
        }
    }
}
