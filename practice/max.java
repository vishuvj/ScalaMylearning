package MyLearning.practice;

public class max {
    public static void main(String[] args) {
        int a[] = {2, 45, 65, 98, 67, 90, 32, 54, 82, 12, 5};
        int li = 0;
        int hi = a.length - 1;
        int temp = 0;
        int min;

        for (int i = 0; i <= hi; i++) {
            min = i;
            for (int j = i + 1; j <= hi; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i <= hi; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        int m = a[0];
        int max = a[a.length - 1];
        System.out.println("minimum " + m);
        System.out.println("maximum " + max);

    }
}
