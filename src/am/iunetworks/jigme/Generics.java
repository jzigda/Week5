package am.iunetworks.jigme;

public class Generics {
    public static void main(String[] args) {
        B b = new B(); /* LINE A */
        C c = (C) b.process(new C()); /* LINE B */    //this line
        B<C> b2 = new B<C>(); /* LINE C */
        C c2 = b2.process(new C()); /* LINE D */
    }
}
interface A {
    int count();
    void show();
}
class B<T extends A> {
    T process(T t) {
        t.count();
        t.show();
        return t;
    }
}
class C implements A {
    public int count() { return 25; }
    public void show() { System.out.print("Class C"); }
}

