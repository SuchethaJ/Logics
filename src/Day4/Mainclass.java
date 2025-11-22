package Day4;

class X
{
    int m = 1111;

    {
        m = m++; //in rhs first executed so 1112 will be stored to the above m and now rhs to lhs
        // so its post increment so now assign 1111 to lhs

        //if ++m then out m also becomes m=1112

        System.out.println(m);
    }
}

class Y extends X
{
    {
        System.out.println(methodOfY());
    }

    int methodOfY()
    {
        return m-- + --m;
    }
}

public class Mainclass
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}
