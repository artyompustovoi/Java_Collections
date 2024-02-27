package Part1;
import java.util.Collection;
import java.util.HashSet;
public class Main {
    public static void main(String[] args){
        HashSet<Person> inputSet = new HashSet<>();
        inputSet.add(new Person("n1","f1", 1));
        inputSet.add(new Person("n2","f2",2));
        inputSet.add(new Person("n2","f2",2));
        inputSet.add(new Person("n3","f1",3)); // Добавляем повторяющийся элемент

        Collection<Person> uniqueValues = UniqueCollectionUtil.unique(inputSet);
        System.out.println("Уникальные значения: " + uniqueValues);
    }
}
