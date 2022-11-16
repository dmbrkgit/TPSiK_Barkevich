public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальний елемент масива: " + max);
        System.out.println("Мінімальний елемент масива: " + min);
        System.out.println("Сума максимального та мінімального елемента масива: " + (max + min));
    }
}
