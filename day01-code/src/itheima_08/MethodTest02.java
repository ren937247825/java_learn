package itheima_08;

public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr = {12, 43, 53, 33, 65, 77};
        int result = getMax(arr);

        System.out.println(result);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

}
