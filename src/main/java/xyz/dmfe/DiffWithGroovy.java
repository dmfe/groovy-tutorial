package xyz.dmfe;

import xyz.dmfe.arm.ArmBlockJava;
import xyz.dmfe.inner.NonStaticInner;

public class DiffWithGroovy {
    public static void main(String[] args) throws Exception {
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

        System.out.println();

        ArmBlockJava armBlockJava = new ArmBlockJava("arm_test.txt", "UTF-8");
        armBlockJava.printFile();

        NonStaticInner nsi = new NonStaticInner();

        NonStaticInner.Inner innerOne = nsi.foo();
        innerOne.introduceSelf();

        NonStaticInner.Inner innerTwo = NonStaticInner.createInner(nsi);
        innerTwo.introduceSelf();
    }

    static int method(String arg) {
        return 1;
    }

    static int method(Object arg) {
        return 2;
    }
}
