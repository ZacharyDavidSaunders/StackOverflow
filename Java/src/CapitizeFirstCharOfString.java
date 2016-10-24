import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitizeFirstCharOfString 
{

	/*Stack Overflow Question: http://stackoverflow.com/questions/40055123/java-program-to-capitalize-the-first-letter-of-word-in-string/
	 * 
	 * 
	 * I need to create and implement this method to capitalize all first letters of the words in the given String. 
	 * All other symbols shall remain intact. 
	 * If a word starts not with a letter, it shall remain intact too.
	 * 
	 * Assume that the parameter String can only contain spaces and alphanumeric characters. 
	 * please keep in mind that the words can be divided by single or multiple spaces.
	 * The spaces also can be found at the beginning or the end of the parameter string,and you need to preserve them.
	 */
	
	 public static void main(String[] args) 
	 {

	        String source = " my name is saral";
	        System.out.println(capitalizeString(source));

	 }
	 
	 public static String capitalizeString(String stringToBeCapitalized)
	 {
		 Pattern pattern = Pattern.compile("^[0-9]"); //If the first char of the string is a number
		 Matcher matcher = pattern.matcher(stringToBeCapitalized);
		 
		 if(stringToBeCapitalized.startsWith(" ") || matcher.matches())
		 {
			 return stringToBeCapitalized; 
		 }
		 else
		 {
			 char firstCharInString = Character.toUpperCase(stringToBeCapitalized.charAt(0));
			 String restOfString = stringToBeCapitalized.substring(1);
			 
			 String correctedString = String.valueOf(firstCharInString).concat(restOfString);
			 return correctedString;
		 }
		 
	 }
}
