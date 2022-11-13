


let str = "12ASCD"

let c = 0
for (let i = 0; i < str.length; i++) {
  
    if( checkCase(str[i]) == true )
      {
        c++
    } 
  }

console.log(c) ;

function checkCase (ch) {
    if (!isNaN(ch * 1)){
       return false;
    }
     else {
       if (ch == ch.toUpperCase()) {
          return true;
       }
       if (ch == ch.toLowerCase()){
          return false;
       }
       return false ;
    }
    return false ;
 }
  