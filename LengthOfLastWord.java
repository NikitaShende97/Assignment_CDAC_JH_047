class LengthOfLastWord
{
	static int findLength(String str)
	{
		String arr[]=str.split(" ");
		int len=arr.length;
		String last=arr[len-1];
		
		int count=0;
		for(int i=0;i<last.length();i++)
		{
			char c=last.charAt(i);
			count++;
		}
		return count;
	}
 public static void main(String args[])
 {
	 String str="Cdac mumbai juhu";
	int n= findLength(str);
	System.out.println("Length of last word is:"+n);
	 
 }
}