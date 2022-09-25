import java.util.Scanner;

public class sortBubble {
    static void BubbleSort(int A[]) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int A[] = new int[n + 1];
        System.out.println("Enter the elements of array");
        for (int i = 1; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        BubbleSort(A);
        System.out.println("Sorted array is");
        for (int i = 1; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
