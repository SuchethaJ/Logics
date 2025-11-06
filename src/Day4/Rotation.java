package Day4;

public class Rotation {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="CDAB";

        if(str1.length()==str2.length() && (str1+str1).contains(str2)){
            System.out.println(" rotation");
        }
        else{
            System.out.println(" not rotation");
        }
    }
}
