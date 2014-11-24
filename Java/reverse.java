import java.util.*;
public class ReverseString
{
	String phrase;
	int size;

	ReverseString(String line)  //constructor
	{

		phrase = line;
		size = phrase.length();
	}

	public void reverse(String lines){
		for(int times = size-1; times >= 0; times--)
		{
			System.out.print(phrase.charAt(times));
		}
	}
}
