package edu.buffalo.cse116;

import java.util.ArrayList;

public class Deck extends Card{
	private Card card;
	
	
	public Deck(int stuff, String stuffs, char suites){
		super(stuff,stuffs, suites);
	}
	
	public void Diamonds(){
		ArrayList<Card> Diamonds = new ArrayList<Card>();

		for(int i=1;i<14;i++){
			card = new Card(i, "red", 'D');
			Diamonds.add(card);
		}
		  
	}
	
	public void Clover(){
		ArrayList<Card> Clover = new ArrayList<Card>();
		for(int i=1;i<14;i++){
			card = new Card(i, "black", 'C');
			Clover.add(card);
		}

	}
	
	public void Heart(){
		ArrayList<Card> Heart = new ArrayList<Card>();
		for(int i=1; i<14; i++){
			card = new Card(i, "red", 'H');
			Heart.add(card);
		}
		
	}
	
	public void Spade(){
		ArrayList<Card> spades = new ArrayList<Card>();
		for(int i=1; i<14; i++){
			card = new Card(i, "black", 'S');
			spades.add(card);
		}
		
	}
	
	
}
