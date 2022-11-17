public class leetD{


        public String reverseWords(String s) { // 13 nov 22  151. Reverse Words in a String  
        char[] arr = s.toCharArray() ;
        Stack<String> st = new Stack<>() ;
        String word = "" ;
   
         for(int i = 0 ; i < arr.length ; i++){
             while(i < arr.length && arr[i] == ' '){
                 i++;
             }
             while(i < arr.length && arr[i] != ' '){
                 word += arr[i] ;
                 i++ ;
             }
             st.push(word) ;
             word = "" ;
         }
        String ans = "";
        while(!st.isEmpty()){
            String top = st.pop() ;
            ans = ans + " " + top ;
        }
       return ans.trim() ;
        
    }

      //374. Guess Number Higher or Lower     16 Nov 22

    public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int beg = 1 ;
        int end = n ;
      
        
        while(beg < end ){
        
         int mid = beg + (end - beg)/2;  //int x = (int)((n + s) / 2);
           
        
            if(guess(mid) == 0){
                return mid ;
            }else if(guess(mid) == 1){
                beg = mid+1 ;
            }else{
                end = mid ; // remb
            }
        
        }
        return beg ; // remb for [1] test case
     }
    }

     // 17 Nov 22 223. Rectangle Area
     public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int recOne = (ax2 - ax1) * (ay2 - ay1) ;
        int recTwo = (bx2 - bx1) * (by2 - by1) ;
        
        int cx1 = Math.max(ax1 , bx1) ;
        int cy1 = Math.max(ay1 , by1) ;
        
        int cx2 = Math.min(ax2 , bx2) ;
        int cy2 = Math.min(ay2 , by2) ;
        int cl = cx2 - cx1 ;
        int cb = cy2 - cy1 ;
        int cArea = 0;
        if(cl > 0 && cb > 0){
            cArea = cl * cb ;
        }
        return recOne + recTwo - cArea ;
     }
   
    public static void main(String[] args) {

	   

        System.out.print("Hello") ;
	}
}