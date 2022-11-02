public class recDp{

    public static void display(int [] a){
        for(int i : a){
            System.out.print(i + " ") ;
        }
    }

    public static int fibomemo(int n , int[] dp){
       if( n <= 1){
        dp[n] = n ;
        return n ;
       }

       if(dp[n] != 0 )
        return dp[n] ;

       int ans = fibomemo(n-1 , dp) + fibomemo(n-2 , dp) ;
       dp[n] = ans ;
       return ans ;

    }

     public static void main(String[] args) {

        int  n = 6 ;
        int[] dp = new int[6] ;
		int ans =fibomemo( n-1 , dp) ;
        display(dp) ;
	}
}