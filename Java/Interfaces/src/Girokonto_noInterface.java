import java.util.*;

public class Girokonto_noInterface extends Bankkonto implements Transaktionen
{

	String inhaber;
	int guthaben;
	
	HashMap<Integer, Integer> transaktionen = new HashMap<Integer, Integer>();
	
	public Girokonto_noInterface(String inhaber, int guthaben, HashMap<Integer, Integer> transaktionen)
	{
		this.inhaber = inhaber;
		this.guthaben = guthaben;
		this.transaktionen = transaktionen;
		// TODO Auto-generated constructor stub
	}
	
}
