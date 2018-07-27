package com.theletterandrew;

public class Enums {
		public enum Suit {
				HEARTS("h"), DIAMONDS("d"), CLUBS("c"), SPADES("s");

				private final String id;

				Suit(String id){
						this.id = id;
				}

				public String getId() {
						return id;
				}
		}

		public enum Face {
				TWO("2", 2),
				THREE("3", 3),
				FOUR("4", 4),
				FIVE("5", 5),
				SIX("6", 6),
				SEVEN("7", 7),
				EIGHT("8", 8),
				NINE("9", 9),
				TEN("T", 10),
				JACK("J", 10),
				QUEEN("Q", 10),
				KING("K", 10),
				ACE("A", 11);

				private final String id;
				private int value;

				Face(String id, int value){
						this.id = id;
						this.value = value;
				}

				public String getId(){
						return id;
				}

				public int getValue() {
						return value;
				}
		}

}
