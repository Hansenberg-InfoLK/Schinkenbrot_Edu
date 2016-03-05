import java.util.HashMap;

public class Girokonto extends Bankkonto implements Transaktionen
{
	String inhaber;
	int guthaben;
	
	HashMap<String[], Integer> transaktionen = new HashMap<String[], Integer>();
	
	public Girokonto(String inhaber, int guthaben, HashMap<String[], Integer> transaktionen)
	{
		this.inhaber = inhaber;
		this.guthaben = guthaben;
		this.transaktionen = transaktionen;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMoney(String[] dateTime, int amount)
	{
		// TODO Auto-generated method stub
		guthaben += amount;
		transaktionen.put(dateTime, amount);
	}

	@Override
	public void getMoney(String[] dateTime, int amount)
	{
		// TODO Auto-generated method stub
		guthaben -= amount;
		transaktionen.put(dateTime, amount);
	}

}
