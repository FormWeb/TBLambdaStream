// [1, 2, 3, 4]
// [4, 5, 6, 7]
// [2, 4, 6, 8]

// int[] tab = new int[] {1, 2, 3, 4}
// int[] tabModify = map(tab, e -> e * 3)

import java.util.ArrayList;
import java.util.List;



interface FonctionDeFiltre {
    boolean f(int x);
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Modif m = new Modif();

        FonctionDeModification myObject = x -> x * x;

        FonctionDeModification myObject2 = x -> x + 2;

        int[] tab = new int[] {1, 2, 3, 4};
        int[] tabModify = map(tab, myObject2);
        int[] tabModify2 = map(tab, m);

        for (int e : tabModify) {
            System.out.println(e);
        }

        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(1);
        tab2.add(2);
        tab2.add(4);

        tab2.forEach(e -> {
            System.out.println(e);
        });
    }

    public static int[] map(int[] tab, FonctionDeModification c) {
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = c.f(tab[i]);
        }
        return result;
    }

    // int[] tab = new int[] {1, 2, 3, 4}
    // int[] tabFilter = filter(tab, e -> e % 3 == 0) | [2, 4]

    public static int[] filter(int[] tab, FonctionDeFiltre c) {
        return new int[2];
    }
}