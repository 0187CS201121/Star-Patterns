public class numberAndStar {

    // Q1. Program for half diamond pattern printing using numbers and stars

    static void halfDiamond(int n){

        for(int i=1;i<=n;i++){

            int k=1;
            
            for(int j=1;j<=i;j++){
                System.out.print(i);
            

                if(k++ < i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            int k = 1;

            for(int j=1;j<=i;j++){
                System.out.print(i);

                if(k++ < i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        halfDiamond(n);
    }

}
