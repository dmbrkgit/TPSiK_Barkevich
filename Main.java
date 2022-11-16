import java.util.Arrays;

public class Main {
    static sumcl sumcl = new sumcl();
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum = sumcl.sumcll(sum, array[i]);
            }
        }
        System.out.println("Сума непарних індексів: " + sum);
        int sum1 = 0;
        int firstPositive = 0;
        int secondPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstPositive = i;
                break;
            }
        }
        for (int i = firstPositive + 1; i < array.length; i++) {
            if (array[i] > 0) {
                secondPositive = i;
                break;
            }
        }
        for (int i = firstPositive + 1; i < secondPositive; i++) {
            sum1 = sumcl.sumcll(sum1, array[i]);
        }
        System.out.println("Сума між першим та другим позитивними індексами: " + sum1);
    }
}

