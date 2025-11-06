package Day4;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        String res=" ";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        //System.out.println(res);
        if(str.equals(res))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }

}
