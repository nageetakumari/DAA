import java.util.*;
public class AdditionPairs
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int A[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            A[i] = s.nextInt();

        }
        System.out.println("Enter the value of b");
        int b=s.nextInt();
        System.out.print("Given Array=[");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("value of b is: "+ b);

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int c=A[i];
            //c+d=b
            int d = b - c;
            set.add(c);
            if (set.contains(d) && d!=0) {
                System.out.println("("+ c + "," + d +") Addition of this pair is equal to "+c+"+"+d+"="+ b);
            }
        }
    }
}


