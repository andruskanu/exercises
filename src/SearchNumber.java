public class SearchNumber {

    public static void main(String[] args) {

        System.out.println(search(20, new Integer[]{3, 1, 3, 2, 6, 20, 7, 6}));
    }

    public static int search(Integer n, Integer[] list) {
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
