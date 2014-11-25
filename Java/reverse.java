import java.util.*;
public class reverse
{
	public static void main (String[] args)
	{
		reverse("What is this?");
	}

	public static void reverse(String lines)
	{
		int size = lines.length();
		System.out.print("Your phrase backwards: ");
		for(int times = size-1; times >= 0; times--)
		{
			System.out.print(lines.charAt(times));
		}
		System.out.println();
	}
}
