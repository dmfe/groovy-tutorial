package xyz.dmfe;

public class DiffWithGroovy {
    public static void main(String[] args) {
        Object o = "String";
        int result = method(o);

        System.out.println(result);

        int[] array = {1, 2, 3};
        int[] array2 = new int[] {4, 5, 6};

        System.out.println("Array one:");
        for (int a : array) {
            System.out.print(a + " ");
        }

        System.out.println("\nArray two:");
        for (int a : array2) {
            System.out.print(a + " ");
        }
    }

    static int method(String arg) {
        return 1;
    }

    static int method(Object arg) {
        return 2;
    }
}
