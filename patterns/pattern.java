class pattern {

    // static voidn
    // *
    // **
    // ***
    static void halfpyramidright(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= (n + 1) - i) {
                    System.out.print(j);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=(n+1)-i){
                    System.out.print(j);
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void twoPyramid(int n){
        boolean  k;
        for(int i=1;i<=n;i++){
            k = true;
            for(int j=1;j<=n+4;j++){
                if(j>=(n+1)-i && j<=i +4 && k){
                    System.out.print("*");
                    k = false;
                }
                else{
                    System.out.print(" ");
                    k=true;
                } 
                    
            }
            System.out.println();
        }
    }

    static void pyramid1(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++) 
                System.out.print(" ");
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
        
            System.out.println();
        }
    }

     static void hollowPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+4;j++){
                if(j==(n+1)-i || j==i+4 || i==n){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
     
    public static void main(String args[]) {
        // Your code goes here
        int n = 5;
        // halfpyramidright(n);
        // pyramid(n);
        // twoPyramid(n);
        // hollowPyramid(n);
        pyramid1(n);



    }
}