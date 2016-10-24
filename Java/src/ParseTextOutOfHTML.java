public class ParseTextOutOfHTML 
{
	private static String sampleHTML = "<html>This <b>is</b> some <strong>sample</strong> html!</html>";
	
	public static void main(String[] args)
	{
		System.out.println(parseHTML(sampleHTML));
	}
	
	private static String parseHTML(String HTMLtoBeParsed)
	{
		String[] htmlTags = {"strong", "b", "head", "html"};
		
		String remainingText = HTMLtoBeParsed;
		
		for(String htmlTag : htmlTags)
		{
			remainingText = remainingText.replaceAll("(<"+ htmlTag + ">)", ""); 
			//This replaces all HTML opening tags <example> with nothing, therefore removing them.
			
			remainingText = remainingText.replaceAll("(</"+ htmlTag + ">)", "");
			//This replaces all HTML closing tags </example> with nothing, therefore removing them.
			
		}
		return remainingText;
	}
}
