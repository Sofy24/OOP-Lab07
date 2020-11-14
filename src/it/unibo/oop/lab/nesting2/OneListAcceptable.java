package it.unibo.oop.lab.nesting2;

import java.util.*;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> l;
	
	public OneListAcceptable(List<T> lista) {
		this.l = lista;
		
	}
	
	 public Acceptor<T> acceptor() {
	        final Iterator<T> iter = l.iterator();
	        return new Acceptor<T>() {

	
	            public void accept(final T element) throws Acceptor.ElementNotAcceptedException {
	                try {
	                    if (element.equals(iter.next())) {
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println("Non ci sono più elementi da essere valutati");
	                }
	                throw new Acceptor.ElementNotAcceptedException(element);
	            }


	            public void end() throws Acceptor.EndNotAcceptedException {
	                try {
	                    if (!iter.hasNext()) {
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println("messaggio dell'eccezione" + e.getMessage());
	                }
	                throw new Acceptor.EndNotAcceptedException();
	            }
	        };
	    }

		
		
		
		

	
}
