import java.util.Scanner;
public class EvenNumberInARange {
    static int[] findEvenNumber(int[] A,int[][] B)
    {
        int result[]=new int[B.length];
        for(int i=0;i<B.length;i++)
        {
            int count=0;
            int l=B[i][0];
            int r=B[i][1];
            for(int j=l;j<=r;j++)
            {
                if(A[j]%2==0)
                    count++;
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int[][] B=new int[m][2];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<2;j++)
            {
                B[i][j]=scanner.nextInt();
            }
        }
        int even[]=findEvenNumber(A,B);
        for(int i=0;i<even.length;i++)
        {
            System.out.print(even[i]+" ");
        }
    }
}
