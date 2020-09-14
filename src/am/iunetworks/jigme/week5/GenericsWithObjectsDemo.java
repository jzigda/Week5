package am.iunetworks.jigme;

public class GenericsWithObjectsDemo {
    public static void main(String args[])
    {
        GenericsWithObjects<Integer> integerObject = new GenericsWithObjects<>(12);
        integerObject.print();
    }
}
class GenericsWithObjects<T>
{
    T obj;
    GenericsWithObjects(T obj)
    {
        this.obj = obj;
    }
    void print()
    {
        System.out.println(obj);
    }
}
