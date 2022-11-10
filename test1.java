import java.util.*;
public class test1{

	public static String lrotate(String str , int n){
        String ans = str.substring(n) + str.substring(0,n) ;
        return ans ;
    }

    public static String rrotate(String str , int n){
        return lrotate(str , str.length() - n);

    }
    
    public static void rs(String str , String r){
        String[] words = str.split("\\s") ;

        if(r.charAt(0) == 'L'){
            System.out.print(lrotate(words[0] , r.charAt(1) - 48) + " ") ;
            System.out.print(lrotate(words[1] , r.charAt(1) - 48) ) ;
        }else{
             System.out.print(rrotate(words[0] , r.charAt(1) - 48) + " " ) ;
             System.out.print(rrotate(words[1] , r.charAt(1) - 48) ) ;
        }
    }
 
  public static void main(String[] args) {

	    //  String s = "AbcD" ;
		//  char c = s.charAt(0) ;
		// System.out.println(Character.isUpperCase(s.charAt(2))); 

        String s = "Pandemic India";
        String r = "R1";
        rs(s , r) ;
	}
}