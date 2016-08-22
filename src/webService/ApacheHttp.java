package webService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class ApacheHttp {
public static void main(String[] args) throws ClientProtocolException, IOException {
	String url = "http://www.google.com/search?q=httpClient";

	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet(url);

	// add request header
	request.addHeader("User-Agent", "Chrome");
	HttpResponse response = client.execute(request);

	System.out.println("Response Code : "
	                + response.getStatusLine().getStatusCode());

	BufferedReader rd = new BufferedReader(
		new InputStreamReader(response.getEntity().getContent()));

	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = rd.readLine()) != null) {
		result.append(line);
	}
	System.out.println(result.toString());
}
}







public class JsonParseTest {
14
 
15
    private static final String filePath = "C:\\Users\\katerina\\Desktop\\jsonTestFile.json";
16
     
17
    public static void main(String[] args) {
18
 
19
        try {
20
            // read the json file
21
            FileReader reader = new FileReader(filePath);
22
 
23
            JSONParser jsonParser = new JSONParser();
24
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
25
 
26
            // get a String from the JSON object
27
            String firstName = (String) jsonObject.get("firstname");
28
            System.out.println("The first name is: " + firstName);
29
 
30
            // get a number from the JSON object
31
            long id =  (long) jsonObject.get("id");
32
            System.out.println("The id is: " + id);
33
 
34
            // get an array from the JSON object
35
            JSONArray lang= (JSONArray) jsonObject.get("languages");
36
             
37
            // take the elements of the json array
38
            for(int i=0; i<lang.size(); i++){
39
                System.out.println("The " + i + " element of the array: "+lang.get(i));
40
            }
41
            Iterator i = lang.iterator();
42
 
43
            // take each value from the json array separately
44
            while (i.hasNext()) {
45
                JSONObject innerObj = (JSONObject) i.next();
46
                System.out.println("language "+ innerObj.get("lang") +
47
                        " with level " + innerObj.get("knowledge"));
48
            }
49
            // handle a structure into the json object
50
            JSONObject structure = (JSONObject) jsonObject.get("job");
51
            System.out.println("Into job structure, name: " + structure.get("name"));
52
 
53
        } catch (FileNotFoundException ex) {
54
            ex.printStackTrace();
55
        } catch (IOException ex) {
56
            ex.printStackTrace();
57
        } catch (ParseException ex) {
58
            ex.printStackTrace();
59
        } catch (NullPointerException ex) {
60
            ex.printStackTrace();
61
        }
62
 
63
    }
64
 
65
}

