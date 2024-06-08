import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtrack {

    public static int f(List<List<Integer>> triangle, int row, int idx)
    {
        if(row == triangle.size()-1 && idx == triangle.size()-1)
        {
            return triangle.get(row).get(idx);
        }
        if(row == triangle.size()-1)
        {
            return Math.min(triangle.get(row).get(idx),triangle.get(row).get(idx+1));
        }
        int down = triangle.get(row).get(idx) + f(triangle,row+1,idx);
        int dia = triangle.get(row).get(idx) + f(triangle,row+1,idx+1);

        return Math.min(down,dia);
    }
    public static void main(String[] args) {
//
        List<List<Integer>> triangle = new ArrayList<>();

        // First sublist
        List<Integer> sublist1 = new ArrayList<>();
        sublist1.add(-1);
        triangle.add(sublist1);

        // Second sublist
        List<Integer> sublist2 = new ArrayList<>();
        sublist2.add(2);
        sublist2.add(3);
        triangle.add(sublist2);

        // Third sublist
        List<Integer> sublist3 = new ArrayList<>();
        sublist3.add(1);
        sublist3.add(-1);
        sublist3.add(-3);
        triangle.add(sublist3);
        if(triangle.size() == 1)
        {
            System.out.println(triangle.get(0).get(0));
        }
        System.out.println(f(triangle,0,0));
    }
}
