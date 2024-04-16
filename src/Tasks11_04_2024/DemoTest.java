package Tasks11_04_2024;

/*
Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам
принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode().
Реализуйте статический фабричный метод of(). Конструктор должен быть закрытым (private).
Реализуйте метод ifPresent, аналогичный одноименному методу класса Optional и принимающий java.util.function.BiConsumer
Реализуйте метод empty(), который возвращает экземпляр с нулевыми полями {null,null} (см. реализацию в классе Optional).
 */

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.function.BiConsumer;

public class DemoTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = Pair.of("valueOne", 0);
        Pair<Integer, String> pair2 = Pair.of(0, "valueOne");

        System.out.println(pair2.getFirst());

//        System.out.println(pair.equals(pair2));

        System.out.println(pair.hashCode());
        System.out.println(pair2.hashCode());

        BiConsumer<String, Integer> addTwo = (x, y) -> System.out.println(x + " " + y);
        pair.ifPresent(addTwo);

        System.out.println(Pair.empty());

    }
}

class Pair<T, S> {

    private T first;
    private S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <T, S> Pair<T, S> of(T valueOne, S valueTwo) {
        return new Pair<T, S>(valueOne, valueTwo);
    }

    public Optional<T> getFirst() {
        return Optional.ofNullable(this.first);
    }

    public Optional<S> getSecond() {
        return Optional.ofNullable(this.second);
    }

    public boolean equals(Pair<T, S> otherObject) {
        if (this.getFirst().equals(otherObject.getFirst()) && this.getSecond().equals(otherObject.getSecond())) {
            System.out.println("Pairs are equal.");
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.getFirst().hashCode() - this.getSecond().hashCode();
    }

    public void ifPresent(BiConsumer<T, S> consumer) {
        if (first != null && second != null) {
            consumer.accept(first, second);
        }
    }

    public static <T, S> Pair<T, S> empty() {
        return new Pair<T, S>(null, null);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
