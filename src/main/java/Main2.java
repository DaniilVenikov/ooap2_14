import java.lang.reflect.Array;
import java.util.function.BinaryOperator;

//abstract class General {
//}
//
//class Vector<T> extends General {
//    private final T[] values;
//
//    public Vector(T[] values) {
//        this.values = values;
//    }
//
//    public T[] getValues() {
//        return values;
//    }
//
//    public T add(T x, T y, BinaryOperator<T> adder) {
//        return adder.apply(x, y);
//    }
//
//    public T[] sumVector(Vector<T> vector, BinaryOperator<T> adder, Class<T> clazz) {
//        if (vector.getValues().length != this.values.length) {
//            return null;
//        }
//
//        @SuppressWarnings("unchecked")
//        T[] result = (T[]) Array.newInstance(clazz, values.length);
//
//        for (int i = 0; i < values.length; i++) {
//            result[i] = add(values[i], vector.values[i], adder);
//        }
//
//        return result;
//    }
//}
//
//// Тестирование
//public class Main2 {
//    public static void main(String[] args) {
//        Integer[] arr1 = {1, 2, 3};
//        Integer[] arr2 = {4, 5, 6};
//
//        Vector<Integer> v1 = new Vector<>(arr1);
//        Vector<Integer> v2 = new Vector<>(arr2);
//
//        Integer[] sum = v1.sumVector(v2, Integer::sum, Integer.class);
//
//        if (sum != null) {
//            for (int val : sum) {
//                System.out.print(val + " ");
//            }
//        } else {
//            System.out.println("Векторы разной длины");
//        }
//    }
//}
