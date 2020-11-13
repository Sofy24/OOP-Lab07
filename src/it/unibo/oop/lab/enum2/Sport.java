/**
 * 
 */
package it.unibo.oop.lab.enum2;
import static it.unibo.oop.lab.enum2.Place.*;
/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
	//BASKET,VOLLEY,TENNIS,BIKE,F1,MOTOGP,SOCCER;
	BASKET(5,"BASKET",INDOOR),
	VOLLEY(5,"VOLLEY",INDOOR),
	TENNIS(2,"TENNIS",INDOOR),
	BIKE(1,"BIKE",OUTDOOR),
	F1(1,"F1",OUTDOOR),
	MOTOGP(1,"MOTOGP",OUTDOOR),
	SOCCER(11,"SOCCER",OUTDOOR);
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	
	private int nGiocatori;
	private String nomeSport;
	private Place luogo;
	
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	
	private Sport(int nGiocatori, String nomeSport, Place luogo) {
		this.nGiocatori = nGiocatori;
		this.nomeSport = nomeSport;
		this.luogo = luogo;
	}

	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	
	public boolean isIndividualSport() {
		return nGiocatori == 1;
	}
	
	public boolean isIndoorSport() {
		return luogo == INDOOR;
	}
	
	public Place getPlace() {
		return luogo;
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sport [nGiocatori=");
		builder.append(nGiocatori);
		builder.append(", nomeSport=");
		builder.append(nomeSport);
		builder.append(", luogo=");
		builder.append(luogo);
		builder.append("]");
		return builder.toString();
	}
	
	
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
}
