// Java Program to Replace Lower-Case Characters with Upper-Case and Vice-Versa
package Day4;

public class ReplaceUpandLow {
    public static void main(String[] args) {

        String str="Suche1thaJ";
        String res="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='A' && ch<='Z'){
                res=res+ (char) (ch+32);

            } else if (ch>='a' && ch<='z') {
                res= res+(char) (ch-32);
            }
            else {
                res=res+ch;
            }
        }
        System.out.println(res);

    }
}
