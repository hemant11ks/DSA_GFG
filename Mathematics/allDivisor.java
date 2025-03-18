/*package whatever //do not write package name here */
import java.util.*;
class allDivisor {
    static void printFactors(int n)
    {
        int i;
        for(i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }
        }
        for(;i>1;)
        {
            i--;
            if(i!=n/i && n%i==0)
            System.out.print(n/i+" ");
        }
        
    }
    
    
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        int n = sc.nextInt();
        printFactors(n);
    } finally {
        sc.close();
    }
}
}