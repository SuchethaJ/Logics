package Day4;

public class Reverse {
    public static void main(String[] args) {
        String str="suchetha";
        String res=" ";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        System.out.println(res);

    }

}
