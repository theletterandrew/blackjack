package com.theletterandrew;

import java.util.ArrayList;
import java.util.List;

public class Hand {
		private List<Card> hand;
		private int handValue;

		public Hand(){
				this.hand = new ArrayList<>();
				this.handValue = 0;
		}

		public List<Card> getHand() {
				return hand;
		}

		public void getCard(Card card) {
				this.hand.add(card);
		}

		public int getHandValue() {
				for (Card c: hand) {
						handValue += c.getValue();
				}
				return handValue;
		}

		public boolean checkBust(){
				if (this.handValue > 21){
						return true;
				}

				return false;
		}

		public void clearHand(){
				this.hand.clear();
		}
}
