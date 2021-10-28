import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1");
		String str1=sc.nextLine();
		System.out.println("Enter string2");
		String str2=sc.nextLine();
		System.out.println("Upper case of str1 "+str1.toUpperCase());
		System.out.println("Lower case of str1 "+str1.toLowerCase());
		System.out.println("Original str1 "+str1);
		str1=str1.toUpperCase();
		System.out.println("New string str1 "+str1);
		String str3=str1.concat(str2);
		System.out.println("Concatenated string " +str3);
		int len1=str1.length();
		System.out.println("Length of the string "+len1);
		char result=str1.charAt(2);
		System.out.println("Character At particular index is "+result);
		char result1=str1.charAt(len1/2);
		System.out.println("Character At particular index is "+result1);
		char result2=str1.charAt(len1-1);
		System.out.println("Character At particular index is "+result2);
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<len1;i++)
		{
		    System.out.println(str1.charAt(i));
		    if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
		    {
		        count=count+1;
		    }
		    else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
		    {
		        count1=count1+1;
		    }
		    else if(str1.charAt(i)>='A'&& str1.charAt(i)<='Z')
		    {
		        count2=count2+1;
		    }
		    else
		    {
		      count3=count3+1;  
		    }
		}
		System.out.println("Count of the digits "+count);
		System.out.println("No of lower case letters "+count1);
		System.out.println("No of uppercase letters "+count2);
		System.out.println("No of Special characters "+count3);
		
		String str5="Level";
		int len5=str5.length();
		int icount=0;
		for(int i=0;i<len5/2;i++)
		{
			
			
			if(str5.charAt(i)!=str5.charAt((len5-1)-i)
			{
			    icount=icount+1;
				break;
				
			}
		}
		if (icount==1){
			System.out.println("Not Palindrome");
			
		}
		if (icount==0){
			System.out.println("Palindrome");
		}
		
	
	}
}
