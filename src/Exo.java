import java.util.ArrayList;

@FunctionalInterface
interface FonctionDeFiltre {
    boolean f(int x);
}

public class Exo {
    public static void main(String[] args) {
        int[] tab = new int[] {4,8,6,1};
        int[] tabFilter = filter(tab, x -> x < 2);

        for (int elem : tabFilter) {
            System.out.println(elem);
        }
    }

    public static int[] filter(int[] tab, FonctionDeFiltre lambda) {
        ArrayList<Integer> filteredValue = new ArrayList<>();
        for (int element : tab) {
            if (lambda.f(element)) {
                filteredValue.add(element);
            }
        }

        int[] result = new int[filteredValue.size()];


        for (int i = 0; i < filteredValue.size(); i++) {
            result[i] = filteredValue.get(i);
        }

        return result;
    }
}
