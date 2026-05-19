package DeutscheBankAG;
import java.util.Arrays;

public class RotateAnArrayRightByKtimes {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 8;
        k=k%a.length;
        reverseArray(a, 0, a.length - 1);
        reverseArray(a, 0, k - 1);
        reverseArray(a, k, a.length - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }
        //System.out.println(Arrays.toString(a));
    }
    private static int[] reverseArray(int[] a, int left, int right) {
        int temp;
        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }
}
