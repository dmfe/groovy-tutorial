package xyz.dmfe

class DiffWithJava {
    static void main(String[] args) {
        Object o = "Object"
        int result = method(o)

        println result

        int[] array = [1, 2, 3]

        println array

        // For Groovy 3+, you can optionally use the Java array initializers long syntax:
        // def array2 = new int[] {1, 2, 3}
    }

    static int method(String arg) {
        return 1
    }

    static int method(Object arg) {
        return 2
    }
}
