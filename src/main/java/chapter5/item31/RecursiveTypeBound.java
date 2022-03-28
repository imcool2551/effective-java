package chapter5.item31;

import java.util.List;
import java.util.Objects;

public class RecursiveTypeBound {

    public static <E extends Comparable<? super E>> E max(List<? extends E> c) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("collection is empty");
        }

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }
}
