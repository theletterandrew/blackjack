package com.theletterandrew;

import java.util.List;
import java.util.Scanner;

public class User {
		private boolean playing;
		private Scanner scan = new Scanner(System.in);
		private int wins;
		private int losses;

		public User(){
				this.playing = true;
				this.wins = 0;
				this.losses = 0;
		}

		public boolean isPlaying() {
				return playing;
		}

		public boolean getHit(){
				System.out.print("Would you like to hit or stay? (h/s): ");
				String response = scan.next();

				if(response.equals("h")){
						return true;
				}
				return false;
		}

		private void playAgain(){
				System.out.print("Wanna play again? (y/n): ");
				String response = scan.next();
				if (response.equals("n")){
						this.playing = false;
				}
		}

		private void reportScore(){
				System.out.println("You've won " + wins + " times and lost " + losses + " times.");
		}

		public void lose(){
				System.out.println("Sorry, you lose!");
				losses += 1;
				reportScore();
				playAgain();
		}

		public void win(){
				System.out.println("You win!");
				wins += 1;
				reportScore();
				playAgain();
		}

		public void revealDeal(List<Card> hand){
				for (Card c: hand) {
						System.out.println("You receive the " + c.getFace() + " of " + c.getSuit() + ".");
				}
		}

		public void tellDealersCard(List<Card> dealerHand){
				System.out.println("Dealer receives the " + dealerHand.get(1).getFace() + " of " + dealerHand.get(1).getSuit() + " as his face card.");
		}

		public void tellDealersHiddenCard(List<Card> dealerHand){
				System.out.println("Dealer reveals his first card to be the " + dealerHand.get(0).getFace() + " of " + dealerHand.get(0).getSuit() + ".");
		}

		public void revealHit(Card hit){
				System.out.println("You receive the " + hit.getFace() + " of " + hit.getSuit() + ".");
		}

		public void revealDealerHit(Card hit){
				System.out.println("Dealer receives the " + hit.getFace() + " of " + hit.getSuit() + ".");
		}
}
