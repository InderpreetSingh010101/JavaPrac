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
   
    public static void main(String[] args) {

	   

        System.out.print("Hello") ;
	}
}