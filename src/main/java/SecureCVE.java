import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecureCVE {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String uri = "https://services.nvd.nist.gov/rest/json/cves/2.0";
		List<String> href = new ArrayList<String>();
		try {
			URL tokenUrl =  new URL(uri);
			HttpURLConnection http = (HttpURLConnection)tokenUrl.openConnection();
			http.setRequestMethod("GET");
			http.connect();
			
			int responseCode = http.getResponseCode();
			
			String inLine = "";
			Scanner scanner = new Scanner(tokenUrl.openStream());
			while(scanner.hasNext()) {
				inLine +=scanner.nextLine();
			}
			scanner.close();
			
			JSONParser parse = new JSONParser();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
