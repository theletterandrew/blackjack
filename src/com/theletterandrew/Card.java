package com.theletterandrew;

public class Card {

		private String suit;
		private String face;
		private int value;

		public Card(String suit, String face, int value){
				this.suit = suit;
				this.face = face;
				this.value = value;
		}

		public String getSuit() {
				return suit;
		}

		public String getFace() {
				return face;
		}

		public int getValue() {
				return value;
		}

}