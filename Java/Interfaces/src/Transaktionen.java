import java.util.*;

public interface Transaktionen
{
	public void addMoney(String[] dateTime, int amount);
	public void getMoney(String[] dateTime, int amount);
}
