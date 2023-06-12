import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
public class WeatherAPI {
    private static final String BASE_URL = "http://api.weatherapi.com/v1";
    private static final String API_KEY = "06269c5efadc414c928155114230506";
    public WeatherAPI(){};
    public static Weather getWeatherForZip(String zipCode) {
        String endPoint = "/current.json";
        String url = BASE_URL + endPoint + "?key=" + API_KEY + "&q=" + zipCode;
        String urlResponse = "";
        try {
            URI myUri = URI.create(url);
            HttpRequest request = HttpRequest.newBuilder().uri(myUri).header("Content-Type", "application/json").GET().build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            urlResponse = response.body();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // create object of response
        JSONObject jsonObj = new JSONObject(urlResponse);

        // parse current weather info
        JSONObject currentObj = jsonObj.getJSONObject("current");
        double tempC = currentObj.getDouble("temp_c");
        double tempF = currentObj.getDouble("temp_f");
        JSONObject conditionObj = currentObj.getJSONObject("condition");
        String condition = conditionObj.getString("text");
        String iconURL = conditionObj.getString("icon");
        iconURL = "https:" + iconURL;

        // parse location info
        JSONObject locationObj = jsonObj.getJSONObject("location");
        String location = locationObj.getString("name");

        // create and return Weather object
        Weather weather = new Weather(tempC, tempF, condition, iconURL, location);
        return weather;
    }
}
