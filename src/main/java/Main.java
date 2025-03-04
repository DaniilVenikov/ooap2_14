import java.lang.reflect.Array;
import java.util.Arrays;

abstract class General<T extends General<T>> {

    public abstract T add(T other);
}

class Vector<T extends General<T>> {
    private final T[] values;

    public Vector(T[] values) {
        this.values = values;
    }

    public Vector<T> add(Vector<T> other, Class clazz) {
        if (this.values.length != other.values.length) {
            return null;
        }

        T[] result = (T[]) Array.newInstance(clazz, values.length);

        for (int i = 0; i < values.length; i++) {
            result[i] = (values[i].add(other.values[i]));
        }
        return new Vector<>(result);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}


class IntValue extends General<IntValue> {
    private final int value;

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public IntValue add(IntValue other) {
        return new IntValue(this.value + other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

public class Main {
    public static void main(String[] args) {
        Vector<IntValue> v1 = new Vector<>(new IntValue[]{new IntValue(1), new IntValue(2), new IntValue(3)});
        Vector<IntValue> v2 = new Vector<>(new IntValue[]{new IntValue(4), new IntValue(5), new IntValue(6)});
        System.out.println(v1.add(v2, IntValue.class));

    }
}
