public class Element<T> implements Measurable<T> {

    private T myobj;

    public Element(T obj) {
        this.myobj = obj;

    }

    @Override
    public double getMeasure() {
        if (myobj instanceof Integer)
            return ((Integer) ((Object) myobj));
        else
            return (((double) ((Object) myobj)));
    }
}
