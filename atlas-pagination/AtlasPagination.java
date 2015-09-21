/*
Problem sourced from the ACM-ICPC 2010 NA-Southern California Regional
Question set.

STATUS: Accepted
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AtlasPagination {

    public static void main(String[] args) {
        paginate();
    }

    public static void paginate() {
        Scanner sc = new Scanner(System.in);;
        while (sc.hasNextLine()) {
            ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            Integer count = 1;
            for (int i = 0; i < r; i++) {
                String row = sc.nextLine().trim();
                map.add(new ArrayList<Integer>());
                for (int j = 0; j < row.length(); ++j) {
                    if (row.charAt(j) == '.') {
                        map.get(i).add(count++);
                    } else {
                        map.get(i).add(0);
                    }
                }
            }
            for (int i = 0; i < map.size(); i++) {
                for (int j = 0; j < map.get(i).size(); j++) {
                    if (map.get(i).get(j) != 0) {
                        System.out.println(map.get(i).get(j) + " " +
                                ((i > 0) ? map.get(i - 1).get(j) : 0) + " "
                                + ((j < map.get(i).size() - 1) ? map.get(i)
                                .get(j + 1) : 0) + " " + ((i < map.size()
                                - 1) ? map.get(i + 1).get(j) : 0) + " " +
                                ((j > 0) ? map.get(i).get(j - 1) : 0));
                    }
                }
            }
            System.out.println();
        }
    }
    
    
}

