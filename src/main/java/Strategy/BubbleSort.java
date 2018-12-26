package Strategy;

class BubbleSort implements SortInterface {
    public void sort(double[] list) {
        int n = list.length;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}