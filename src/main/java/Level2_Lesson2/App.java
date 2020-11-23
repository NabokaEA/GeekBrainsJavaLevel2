package Level2_Lesson2;

public class App {
    public static void main(String[] args) {

        String[][] stringArr = new String[4][4];
        stringArr[0] = new String[]{"0", "1", "2", "3"};
        stringArr[1] = new String[]{"4", "5", "5", "7"};
        stringArr[2] = new String[]{"8", "9", "10", "11"};
        stringArr[3] = new String[]{"8", "9", "10", "w"};
        int SumArr = 0;

        try {
            SumArr = convertToIntAndSum(stringArr);
        } catch (MyArrayDataException |  MyArraySizeException e) {
            e.printStackTrace();
            System.exit(-1);

        }
        System.out.println("\nCумма элементов массива = "+SumArr);
    }

    public static int convertToIntAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int SumArrElements = 0;
        int tmp=0;
        if (arr.length * arr[0].length != 16) {
            System.out.println("это не массив 4х4");
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    try {
                        tmp = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        System.out.println("\n Значение в ячейке ["+i+"]["+j+"] ="+arr[i][j]+" не является числом\n");
                        throw new MyArrayDataException();
                    }
                    SumArrElements +=tmp;
                }

            }
            return SumArrElements;
        }

    }

}
