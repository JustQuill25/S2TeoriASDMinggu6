public class InsertionSort01 {

    public static void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = { 23, 35, 7, 14, 67 };
        sort(data);

        System.out.print("Data Terurut Secara Descending : ");
        for (int number : data) {
            System.out.print(number + " ");
        }
    }
}
