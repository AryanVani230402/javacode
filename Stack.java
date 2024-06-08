public class Stack {

    public static boolean isValid(String s) {
        java.util.Stack<Character> stk = new java.util.Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push('(');
            }
            else if(s.charAt(i)==')')
            {
                if(stk.peek()=='(')
                {stk.pop();}
                else
                {
                    return false;
                }
            }

            else if(s.charAt(i)=='[')
            {
                stk.push('[');
            }
            else if(s.charAt(i)==']')
            {
                if(stk.peek()=='[')
                {stk.pop();}
                else
                {
                    return false;
                }
            }


            else if(s.charAt(i)=='{')
            {
                stk.push('{');
            }
            else if(s.charAt(i)=='}')
            {
                if(stk.peek()=='{')
                {stk.pop();}
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[]{}({)}"));

    }
}
