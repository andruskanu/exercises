import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Loto6din49 {

    public static void main(String[] args) {

        Set<Integer> set = new Random().ints(1,49)
                .distinct()
                .limit(6)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("Generare numere Loto 6/49");

        System.out.println(set);
    }
}
