import java.util.Scanner;

public class Pair {
        public static int Countpairs(int[] arr, int s) {
            int size = arr.length;
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] + arr[j] == s) {
                        return 1;
                    }
                }
            }
            return 0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter Array size");
            int n = sc.nextInt();
            System.out.println("enter Array index");
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter value s");
            int s = sc.nextInt();
            int pair = Countpairs(arr, s);
            System.out.println(pair);
        }
    }


git