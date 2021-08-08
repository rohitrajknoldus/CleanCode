public class ValueFinder {
    private ValueFinder() {

    }
    static class Limit {

        /**
         *
         */
        private int minvalue;
        /**
         *
         */
        private int maxvalue;
    }
    static Limit getMinAndMaxValueOfArray(final int[] arr, final int size) {
        Limit c = new Limit();
        int i;
        if (size == 1) {
            c.maxvalue = arr[0];
            c.minvalue = arr[0];
            return c;
        }
        if (arr[0] > arr[1]) {
            c.maxvalue = arr[0];
            c.minvalue = arr[1];
        } else {
            c.maxvalue = arr[1];
            c.minvalue = arr[0];
        }
        for (i = 2; i < size; i++) {
            if (arr[i] > c.maxvalue) {
                c.maxvalue = arr[i];
            } else if (arr[i] < c.minvalue) {
                c.minvalue = arr[i];
            }
        }
        return c;
    }
    /**
     * @param args This is the main method array
     */
    public static void main(final String[] args) {
        final int[] arr = {1000, 11, 445, 1, 330, 3000};
        final  int maxsize = 6;
        Limit c = getMinAndMaxValueOfArray(arr, maxsize);

        System.out.printf(" min number is %d", c.minvalue);
        System.out.println();
        System.out.printf(" max number is %d", c.maxvalue);
        System.out.println();
    }
}