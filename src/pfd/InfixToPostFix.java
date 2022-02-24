package pfd;

public class InfixToPostFix {
    static int precedence(char c){
        switch(c){
            case'+':
            case'-':
                return 1;
            case'*':
            case'/':
                return 2;
            case'^':
                return 3;

        }
        return -1;
    }
    static String infixtopostfix(String exp){
        String result="";
        charstack stk=new charstack(10);
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(precedence(c)>0){
                while(stk.isEmpty()==false && precedence(c)> stk.peek()){
                    result=result+stk.pop();
                }
                stk.push(c);
            }
            else if(c=='('){
                stk.push(c);
            }
            else if (c==')'){
                char x= stk.pop();
                while(x!='('){
                    result=result+x;
                    x=stk.pop();

                }
            }
            else{
                result=result+c;

            }
        }
        while(!stk.isEmpty()){
            result=result+stk.pop();
        }
        return result;

    }
    public static void main(String [] args){
        System.out.println(infixtopostfix("3*4+3"));
    }
}
