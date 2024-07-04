package be.jeffcheasey88.refractor;

public class Refractor<E>{
	
	private ElementFinder<E> finder;
	private E replacer;
	
	public Refractor(ElementFinder<E> finder, E replacer){
		this.finder = finder;
		this.replacer = replacer;
	}
	
	

}