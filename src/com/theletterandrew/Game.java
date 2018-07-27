package com.theletterandrew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Game {
		private boolean playing;

		public Game(){
				this.playing = true;
				ArrayList deck = getDeck();
		}

		public boolean isPlaying() {
				return playing;
		}

		public ArrayList getDeck(){
				ArrayList deck = new ArrayList();

				for (Enums.Suit s: Enums.Suit.values()) {
						for (Enums.Face f: Enums.Face.values()) {
							deck.add(new Card(s.getId(), f.getId(), f.getValue()));
						}
				}

				Collections.shuffle(deck);

				return deck;
		}

		public void dealCards(){

		}

		public void hitOrStay(){
				Scanner scan = new Scanner(System.in);
				System.out.println("Would you like to hit or stay? (h/s)");
				String userInput = scan.next();

				if(userInput == "h"){
						// Do something;
				}
		}
}