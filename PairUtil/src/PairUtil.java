

public class PairUtil<E , T> {

    private Measurable object;
    private Measurable object2;

    public PairUtil() {
        this.object = this.object2 = null;
    }

    public PairUtil(Measurable object, Measurable object2) {
        this.object = object;
        this.object2 = object2;
    }

    public Measurable getObj1() {
        return object;
    }

    public Measurable getObj2() {
        return object2;
    }

    public static <E, T> PairUtil<E, T> minmax(Element[] element) {
        double min = (Double) element[0].getMeasure();
        int minIndex = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i] != null && element[i].getMeasure() < min) {
                min = element[i].getMeasure();
                minIndex = i;
            }
        }


        Element<E> minEl = element[minIndex];

        double max = (Double) element[0].getMeasure();
        int maxIndex = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i] != null && element[i].getMeasure() > max) {
                max = element[i].getMeasure();
                maxIndex = i;
            }
        }


        Element<T> maxEl = element[maxIndex];

        PairUtil<E, T> pair = new PairUtil<>(minEl, maxEl);
        return pair;
    }

    @Override
    public String toString() {
        return ("(" + object.getMeasure() + ", " + object2.getMeasure() + ")");
    }
}
