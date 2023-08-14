package org.com;

public class PrintReverseOrder {
	

	public static void main(String[] args) {
		
	
		
		String s = "Hai i am karthik how are you";
		String r = " ";
		
	//	String[] split = str.split("");
		
	//	for (String s : split) {
	//		String r = "";
			
			for (int i = s.length()-1; i>=0; i--) {
				
				char ch = s.charAt(i);
				
				r=r+ch;
			}
			 System.out.println("After Reverse : "+ r);
			
		}
		
		}

	

	
	
	


