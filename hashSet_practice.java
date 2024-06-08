import java.util.HashSet;

public class hashSet_practice {
    static class myHs {
        HashSet <Integer> hs = new HashSet<Integer>();

        public boolean addPossible(Integer x)
        {
            if(!hs.add(x))
            {
                return false;
            }
            return true;
        }

        public void mtMyHs()
        {
            hs.clear();
            System.out.println("clear success");
            System.out.println(hs);
        }
    }

    public static void main(String[] args) {
        myHs a = new myHs();
        System.out.println(a.addPossible(5));
        System.out.println(a.addPossible(6));
        System.out.println(a.addPossible(7));
        System.out.println(a.addPossible(8));
        System.out.println(a.addPossible(9));
        System.out.println(a.addPossible(5));
        System.out.println(a.hs);
        a.mtMyHs();

        HashSet<Integer> hs = new HashSet<>();

    }
}
