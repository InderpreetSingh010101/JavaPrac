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

    public static int fibotabulation(int N , int dp[]){
        for(int n = 0 ; n <= N ; n++){
            if( n <= 1){
        dp[n] = n ;
        continue ;
       }

       if(dp[n] != 0 )
        continue;

       int ans = fibomemo(n-1 , dp) + fibomemo(n-2 , dp) ;
       dp[n] = ans ;
        // continue can be skipped as it at the end of loop
        }

        return dp[N] ;
    }

     public static void main(String[] args) {

        int  n = 8 ;
        int[] dp = new int[n] ;
		int ans =fibotabulation( n-1 , dp) ;
        display(dp) ;

        System.out.println() ;
        System.out.print(ans) ;
	}
}