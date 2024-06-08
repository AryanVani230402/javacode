public class generate_palindromeNo {


    public static void main(String[] args) {
            String s = "123212";
            for(int i=0;i<(s.length()/2)+1;i++)
            {
                if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                    System.out.println(false);
                    return;
                }
            }
        System.out.println(true);

    }
}
