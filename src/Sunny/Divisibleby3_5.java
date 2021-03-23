package Sunny;

public class Divisibleby3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
		 for ( i = 1; i <= 30; i++) {
			 
			 if(i%3==0) {
			  System.out.println(+i+"=no fizz");}
			  else if (i%5==0) {
				 System.out.println(+i+"= no. Buzz");} 
			 
		     else if( (i%5==0) || (i%3==0)) {
			 System.out.println(+i+"=  no. FizzBuzz\r\n");} 
		 
		 
		     else if( (i%5!=0) || (i%3!=0)) {
			 System.out.println(+i+"=  no. FizzBuzz\r\n");} }}}
		 
				 
				 
			 
			
			
	


