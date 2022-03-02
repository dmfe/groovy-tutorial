package xyz.dmfe.inner

class NonStaticInnerGroovy {
    public class Inner {
        public void introduceSelf() {
            print "Hi, I'm instance ${this} of Inner!"
        }
    }

    public Inner foo() {
        new Inner()
    }

    public static Inner createInner(NonStaticInnerGroovy nonStaticInner) {
        new Inner(nonStaticInner)
    }
}
