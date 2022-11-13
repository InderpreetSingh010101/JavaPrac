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
   
    public static void main(String[] args) {

	   

        System.out.print("Hello") ;
	}
}