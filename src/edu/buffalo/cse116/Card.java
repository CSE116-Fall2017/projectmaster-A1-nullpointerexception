package edu.buffalo.cse116;

public class Card {
	
	private int num;
	private String color;
	private char suite;
	
	public Card(int number, String colors, char suite){
		num = number;
		color = colors;
		suite = suite;
	}
	
	public void red(){
		color = "red";
	}
	
	public void black(){
		color = "black";
	}
	
	public void Ace(){
		num=1;
	}
	
	public void num2(){
		num=2;
	}
	public void num3(){
		num=3;
	}
	public void num4(){
		num=4;
	}
	public void num5(){
		num=5;
	}

	public void num6(){
		num=6;
	}
	public void num7(){
		num=7;
	}
	public void num8(){
		num=8;
	}
	public void num9(){
		num=9;
	}

	public void num10(){
		num=10;
	}
	
	
	public void Jack(){
		num=11;
	}
	
	public void Queen(){
		num=12;
	}
	
	public void king(){
		num=13;
	}
	
	public void Clover(){
		suite = 'C';
	}
	
	public void Diamond(){
		suite='D';
	}
	
	public void Heart(){
		suite = 'H'; 
	}
	
	public void Spade(){
		suite = 'S';
	}
	
	
	
//	package edu.buffalo.cse116;
//
//	public class Diamond extends Card{
//		private Card first;
//		public Diamond(int yurui, String jagat){
//			super(yurui, jagat);
//		}
//		
//		public void whatever(){
//			first.num10();
//			first.black();
//		}
//		
//		
//	}
}
