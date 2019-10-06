import java.util.Arrays;

public class ArrangeArray {
    public void rearrange(int[] a) {
        sort(a, 0, a.length - 1);
    }

    void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;

        int mid = lo + (hi - lo) / 2;

        sort(a, lo, mid);
        sort(a, mid + 1, hi);

        merge(a, lo, mid, hi);
    }

    void merge(int[] a, int lo, int mid, int hi) {

        int i = lo, j = mid + 1;

        while (i <= mid && a[i] < 0) i++;
        while (j <=  hi && a[j] < 0) j++;

        reverse(a, i, mid); // reverse the positive part A in the left to A'
        reverse(a, mid + 1, j - 1); // reverse the negative part B in the right to B'
        reverse(a, i, j - 1); // reverse A'B' to B'A'
        System.out.println(Arrays.toString(a));

    }

    void reverse(int[] a, int lo, int hi) {
        int i = lo, j = hi;
        while (i < j) {
            int tmp = a[i];
            a[i++] = a[j];
            a[j--] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1,1,5,-9,4,-3};
        //System.out.println(Arrays.toString(a));

        new ArrangeArray().rearrange(a);
        //System.out.println(Arrays.toString(a));
    }
}
