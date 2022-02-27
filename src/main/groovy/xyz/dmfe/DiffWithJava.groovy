package xyz.dmfe

class DiffWithJava {
    public static void main(String[] args) {
        Object o = "Object"
        int result = method(o)

        println result
    }

    static int method(String arg) {
        return 1
    }

    static int method(Object arg) {
        return 2
    }
}
