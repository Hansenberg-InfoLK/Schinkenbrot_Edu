import java.util.*;

public abstract class Bankkonto
{
	public String inhaber;
	public int guthaben;
	
	public HashMap<String[], Integer> transaktionen = new HashMap<String[], Integer>();
}
