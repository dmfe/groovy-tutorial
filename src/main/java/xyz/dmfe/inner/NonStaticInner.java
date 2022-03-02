package xyz.dmfe.inner;

public class NonStaticInner {
    public class Inner {
        public void introduceSelf() {
            System.out.println("Hi, I'm instance: " + this + " of Inner of NonStaticInner!");
        }
    }

    public Inner foo() {
        return new Inner();
    }

    public static Inner createInner(NonStaticInner nonStaticInner) {
        return nonStaticInner.new Inner();
    }
}
