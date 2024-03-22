public class SelectionSort01 {

    public static void sortDescending(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = { 23, 35, 7, 14, 67 };
        sortDescending(data);

        System.out.print("Data Terurut Secara Descending : ");
        for (int number : data) {
            System.out.print(number + " ");
        }
    }
}
