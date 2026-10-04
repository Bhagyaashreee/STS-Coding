import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum = totalSum + arr[i];
        }

        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            leftSum = leftSum + arr[i];

            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                maxSum = Math.max(maxSum, leftSum);
            }
        }

        System.out.println(maxSum);
    }
}