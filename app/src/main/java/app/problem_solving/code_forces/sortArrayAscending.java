package app.problem_solving.code_forces;

public class sortArrayAscending {


    public static void main(String[] args) {
        int [] arr = new int[]{9,8,7,6,5};
        sortArray(arr);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    private static void sortArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                for (int a = 0; a < 5; a++) {
                    System.out.print(arr[a] + "\t");
                }
                System.out.println();
            }
        }
    }

}
