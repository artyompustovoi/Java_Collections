
package Part1;
import java.util.Collection;
import java.util.HashSet;

public class UniqueCollectionUtil {

    public static <T> Collection<T> unique(Collection<T> inputCollection) {
        // Создаем множество для хранения уникальных значений
        HashSet<T> uniqueSet = new HashSet<>();

        // Проходим по всем элементам входной коллекции
        for (T element : inputCollection) {
            // Добавляем элемент в множество, метод add вернет true, если элемент был уникален и добавлен,
            // и false, если элемент уже был в множестве
            uniqueSet.add(element);
        }

        // Возвращаем уникальные значения в виде коллекции
        return uniqueSet;
    }
}
