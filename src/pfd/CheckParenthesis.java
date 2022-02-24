package pfd;

public class CheckParenthesis {
    public boolean checkbalanced(String exp){
        charstack stk=new charstack(5);
        String openbraces="[{(";
        String closingbraces="]})";
        for (int i=0 ; i<exp.length();i++){
            char braces=exp.charAt(i);
            if (braces=='['|| braces=='{' || braces=='('){
                stk.push(braces);

            }
            else {
                char popbracket=stk.pop();
                int closingbracketindex=closingbraces.indexOf(braces);
                char correspondingOpenbracket=openbraces.charAt(closingbracketindex);

                if (popbracket!=correspondingOpenbracket){
                    return false;
                }

            }

        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }


}
