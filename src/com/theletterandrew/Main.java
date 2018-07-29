package com.theletterandrew;


public class Main {

    public static void main(String[] args) {
				Hand playerHand = new Hand();
				Hand dealerHand = new Hand();
				User user = new User();
				Computer dealer = new Computer();

				// BUG: While loop doesn't end- playing variable of user class may not be updating.
				while(user.isPlaying()){

						Deck deck = new Deck();

						for (int i = 0; i < 2 ; i++) {
								playerHand.getCard(deck.draw());
								dealerHand.getCard(deck.draw());
						}

						user.revealDeal(playerHand.getHand());
						user.tellDealersCard(dealerHand.getHand());

						while(user.getHit()){
								Card hit = deck.draw();
								playerHand.getCard(hit);
								user.revealHit(hit);
						}

						user.tellDealersHiddenCard(dealerHand.getHand());

						while(dealer.getHit(dealerHand.getHandValue())){
								Card hit = deck.draw();
								dealerHand.getCard(hit);
								user.revealDealerHit(hit);
						}

						if(playerHand.checkBust()){
								user.lose();
						}
						else if (dealerHand.checkBust()){
								user.win();
						}
						else if (playerHand.getHandValue()< dealerHand.getHandValue()){
								user.lose();
						}
						else{
								user.win();
						}
						playerHand.clearHand();
						dealerHand.clearHand();
				}
    }
}
