//  scrieti un algoritm care sa calculeze sumele elementelor a doua array-uri si sa printeze daca sumele
//  elementelor sunt egale.
//    - trebuie cel putin 3 exemple care sa arate ca algoritmul este corect.
//    - acest algormit trebuie sa fie scris intr-o clasa separata, cu metode unde este cazul
//
//    [1,3,5] | [9,0] -> OKAY
//    [1,1,1,1,1] | [1,1,1,1,1,1] -> NOT OKAY.

package arrays;

public class Runner {

    public static void main(String[] args) {

        Methods t1 = new Methods();

        t1.read();
        t1.display();
        t1.compare();

    }
}
