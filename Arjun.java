import java.util.ArrayList;

class  Arjun{
    public static String preprocess(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isSpaceChar(s.charAt(i)))
            {
                sb.append(s.charAt(i));

            }
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//        ArrayList <Integer> arr = new ArrayList<>();
//        arr.add(7);
//        System.out.println(arr.);
//        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(preprocess("A man, a plan, a canal: Panama"));

    }
}