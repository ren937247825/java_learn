package itheima_08;

public class MethodTest01 {
    public static void main(String[] args) {
//        System.out.print("hello");
//        System.out.print("world");

        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }

        }
        System.out.print("]");
    }
}
