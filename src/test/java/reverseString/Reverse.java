package reverseString;

import org.testng.annotations.Test;

public class Reverse {
  @Test
  public void reversevalue() {
	  String original="Greens Technology";
	  String reverse="";
	  for(int i=original.length()-1;i>=0;i--){
		  char c=original.charAt(i);
		  reverse=reverse+c;
	  }
		  System.out.println(reverse+" ");
		  
  }
}
