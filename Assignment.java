public class Assignment {
    int arr[] = { 15, 19, 6, 3, 74, 84, 62, 100, 20, 38, 415, 3, 74, 16, 15, 9, 650, 67 };
    int sum = 0;

    public void getRepeatedValues() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public short getSum() {
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum=" + sum);
        return 0;
    }

    public void getUniqueValue() {
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    a = true;
                    break;
                }
            }
            if (a) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}