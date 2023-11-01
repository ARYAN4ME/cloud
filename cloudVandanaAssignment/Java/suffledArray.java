import java.util.*;

public class suffledArray {
    public static int[] shuffleArray(int arr[]) {
        int shuffledArray[] = new int[arr.length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int j = random.nextInt(i + 1);
            if (j != i) {
                shuffledArray[i] = shuffledArray[j];
            }
            shuffledArray[j] = arr[i];
        }

        return shuffledArray;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        suffledArray s = new suffledArray();
        int shuffledArray[] = suffledArray.shuffleArray(arr);

        System.out.print(Arrays.toString(shuffledArray));
    }
}