// Completed on January 2nd, 2018

// Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"

public String startOz(String str) {
  String result = "";
  
  if (str.length() <= 2){
    return str;
  }
  
  if (str.substring(0,1).equals("o")){
    result = str.substring(0,1);
  }
  
  if (str.substring(1,2).equals("z")){
    result = result + str.substring(1,2);
  }
  return result;
}
