public class BubbleSort01 {

    public static void sortDescending(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
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
