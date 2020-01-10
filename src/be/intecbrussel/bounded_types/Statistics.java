package be.intecbrussel.bounded_types;

public class Statistics<T extends Number> {

    private T[] array;

    public Statistics(T[] array) {
        this.array = array;
    }

    public double average() {
        double result = 0;
        for (T a : array) {

            result += a.doubleValue();
            result = result / array.length;
        }

        return result;
    }

    public boolean sameAvg(Statistics<?> statistics){
        if(average() ==statistics.average()){
            return true;
        } else{
            return  false;
        }

    }
}

