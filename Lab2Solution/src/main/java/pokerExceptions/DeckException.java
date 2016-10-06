/**
 * 
 */
/**
 * @author Bert.Gibbons
 *
 */
package pokerExceptions;

import pokerBase.Deck;

public class DeckException extends Exception {
	private Deck deck;
	
	public DeckException (Deck deck) {
		this.deck = deck;
	}
	
	public Deck getdeck(){
		return deck;
	}
}