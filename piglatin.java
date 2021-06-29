package pigLatin;
/*
 * Author: David R
 * PigIt program
 * Translates a string to pig latin 
 * V:0.0.1
 */
public class piglatin {
	public static Boolean isPunctuation(char c)
    {
      return(c == '.' || c == ',' ||c == '?' ||c == '!') ;
    }
	
	public static String pigIt(String str)
	{
		// Splits the array
	      String [] words = str.split(" ");
	          int size = words.length;
	          //builds a new array same size as original 
	          String[] convertLatin = new String [size];
	          
	          for(int i = 0; i < words.length; i ++)
	          {
	            //checks for punctuation 
	            if(isPunctuation(words[i].charAt(0)))
	            {
	              convertLatin[i] = words[i];
	              break;
	            } 
	            //first letter of word
	              String firstLetter = words[i].substring(0,1); 
	            //appends the remainder of word to complete piglatin
	              String newWord = words[i].substring(1,words[i].length()) + firstLetter +"ay";
	            //appends new word to convertLatin array
	              convertLatin[i] = newWord;
	            //Converts to string
	              convertLatin.toString();
	       
	          }
	          return String.join(" ", convertLatin);
	}
	public static void main(String[] args) {

		  //String str = "An example of pig latin";
		  String str = "What does it do with a period on the end.";
		  //End of string to check for punctuation
		  String eos = str.substring(str.length()-1, str.length());
		  if(eos.equals(".")|| eos.equals(",") || eos.equals("?") || eos.equals("!"))
	      {
	        String newStr = str.replace(str.substring(str.length()-1, str.length()), "");
	        System.out.println("punctuation present");
	        System.out.println(pigIt(newStr) + eos);
	      }else
	      {
	    	System.out.println(pigIt(str) );
	      }

	}

}
