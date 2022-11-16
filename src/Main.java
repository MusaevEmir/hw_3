public class Main {
    public static void main(String[] args) {
        double[] arr = {0.2, 99.3, 4.3, 22.1, 5.5, 6.3, 7.7, -2.5, -93.9, 88.8,
                12.2, -55.3, 1003.25, -1.9, 13.4};
        int firstNegativeNumber = 0;
        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                firstNegativeNumber = i;
                break;
            }
        }

        System.out.println(firstNegativeNumber);

        for (int i = firstNegativeNumber; i < arr.length; i++) {
            count += arr[i];
        }

        count = count / (args.length - firstNegativeNumber);
        System.out.println(count);
    }
}