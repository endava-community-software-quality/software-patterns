package Strategy;

public class QuickSort implements SortInterface {

    public void sort(double[] u) {
        sort(u, 0, u.length - 1);
    }

    private static void sort(double[] a, int left, int right) {
        if (right <= left) {
            return;
        }
        int i = part(a, left, right);
        sort(a, left, i - 1);
        sort(a, i + 1, right);
    }

    private static int part(double[] a, int left, int right) {
        int i = left;
        int j = right;
        while (true) {
            while (a[i] < a[right]) {
                i++;
            }
            while (smaller(a[right], a[--j])) {
                if (j == left) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, right);
        return i;
    }

    private static boolean smaller(double x, double y) {
        return x < y;
    }

    private static void swap(double[] a, int i, int j) {
        double swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}