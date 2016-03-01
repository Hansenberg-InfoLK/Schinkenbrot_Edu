import java.util.*;

public interface Transaktionen
{
	int guthaben = 0;
	HashMap<Integer, Integer> transaktionen = new HashMap<Integer, Integer>();
	
	public void addMoney(String[] dateTime, int amount);
	public void getMoney(String[] dateTime, int amount);
}
