import java.util.Iterator;

public class Comparative {
    public static void main(String[] args) {
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");

        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("\n");
        java.util.List<Integer> num = new java.util.ArrayList<Integer>();
        num.add(3);
        num.add(4);
        num.add(5);
        for (Iterator<Integer> i = num.iterator();
             i.hasNext(); ) {
            int value = i.next();
            System.out.print(value);
            if (i.hasNext()) {
                System.out.print(", ");
            }

        }
        System.out.println("\n");
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }

        int[] no = new int[3];
        no[0] = 10;
        no[1] = new Integer(5);
        no[2] = 15;
        for (int i = 1; i < no.length; i++) {
            System.out.print(no[i] - no[i - 1]);
        }


        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            int i1 = (i < 2) ? (i > 4 ? 10 : 8) : 7;
            System.out.println(i1);
        }


        System.out.println("\n");
        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
                System.out.print(x+" \t");
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }


        byte m = 5;
        byte n = 6;
        double o = m + n;

    }
}
