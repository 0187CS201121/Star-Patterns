class starPatterns{
    /*Q1 
    *        *
    *        *
    *        *
    *        *
    *        *
     */ 
    public static void Q1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(j==1 || j== n) System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }
    /* Q2.
          *

          *

    *  *  *  *  *  

          *

          *
          
     */
    public static void Q2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(i== n/2+1 || j==n/2+1) System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }

    // Q3 Print Cross Star Pattern
    // In this pattern major diagonal have i==j and minor diagonal have i+j==n+1;
    public static void Q3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(i==j || i+j== n+1) System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }
    // Q4 print hollow square
    public static void Q4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if(i==1 || j==1 || i==n || j==n) System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }
     // Q5 print right sided increasing triangle
     public static void Q5(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // Q6 print right sided decreasing triangle
    public static void Q6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("  ");
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

     // Q7 print hill pattern
     public static void Q7(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++)
                System.out.print("  ");
            for(int j=1;j<i;j++)
                System.out.print("* ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // Q8 print reverse hill pattern
    public static void Q8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("  ");
            for(int j=i;j<n;j++)
                System.out.print("* ");
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    // Q9 print diamond pattern
    public static void Q9(int n){
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++)
                System.out.print("  ");
            for(int j=1;j<i;j++)
                System.out.print("* ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("  ");
            for(int j=i;j<n;j++)
                System.out.print("* ");
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    // Q10 print butterfly pattern
    public static void Q10(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j=i;j<n;j++)
                System.out.print("  ");
            for(int j=i;j<n;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            for(int j=1;j<i;j++)
                System.out.print("  ");
            for(int j=1;j<i;j++)
                System.out.print("  ");
            for(int j=i;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    //Q11 hollow increasing traingle
    public static void Q11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                if(i==n||j==1||j==i)
                System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }
     //Q11 hollow decreasing triangle
     public static void Q12(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++)
                if(i==1||j==i||j==n)
                System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }
// Q13 print hollow hill pattern
public static void Q13(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++)
            System.out.print("  ");
        for(int j=1;j<i;j++)
            if(i==n||j==1)
            System.out.print("* ");
            else System.out.print("  ");
        for(int j=1;j<=i;j++)
            if(i==n||j==i)
            System.out.print("* ");
            else System.out.print("  ");
        System.out.println();
    }
}
// Q14 print hollow diamond pattern
public static void Q14(int n){
    for(int i=1;i<n;i++){
        for(int j=i;j<=n;j++)
            System.out.print("  ");
        for(int j=1;j<i;j++)
            if(j==1)
            System.out.print("* ");
            else System.out.print("  ");
        for(int j=1;j<=i;j++)
            if(j==i)
            System.out.print("* ");
            else System.out.print("  ");
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
            System.out.print("  ");
        for(int j=i;j<n;j++)
            if(j==i)
            System.out.print("* ");
            else System.out.print("  ");
        for(int j=i;j<=n;j++)
            if(j==n)
            System.out.print("* ");
            else System.out.print("  ");
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n = 5;
        // Q1(n);
        // Q2(n);
        // Q3(n);
        // Q4(n);
        // Q5(n);
        // Q6(n);
        // Q7(n);
        // Q8(n);
        // Q9(n);
        // Q10(n);
        // Q11(n);
        // Q12(n);
        // Q13(n);
        Q14(n);
    }
}