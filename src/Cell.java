//import org.json.JSONObject;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URL;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//// data model
//public class Weather {
//
//    private double tempC;
//    private double tempF;
//    private String condition;
//    private String iconURL;
//    private String location;
//
//    public Weather(double tempC, double tempF, String condition, String iconURL, String location) {
//        this.tempC = tempC;
//        this.tempF = tempF;
//        this.condition = condition;
//        this.iconURL = iconURL;
//        this.location = location;
//    }
//
//    public double getTempC() {
//        return tempC;
//
//    }
//    public double getTempF() {
//        return tempF;
//    }
//
//    public String getCondition() {
//        return condition;
//    }
//
//    public String getIconURL() {
//        return iconURL;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//}
//import java.net.URI;
//        import java.net.http.HttpClient;
//        import java.net.http.HttpRequest;
//        import java.net.http.HttpResponse;
//        import org.json.JSONObject;
//
//public class WeatherNetworking {
//    private static final String BASE_URL = "http://api.weatherapi.com/v1";
//    private static final String API_KEY = "06269c5efadc414c928155114230506 ";
//
//    public static Weather getWeatherForZip(String zipCode) {
//        String endPoint = "/current.json";
//        String url = BASE_URL + endPoint + "?q=" + zipCode + "&key=" + API_KEY;
//        String urlResponse = "";
//        try {
//            URI myUri = URI.create(url);
//            HttpRequest request = HttpRequest.newBuilder().uri(myUri).build();
//            HttpClient client = HttpClient.newHttpClient();
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            urlResponse = response.body();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        // create object of response
//        JSONObject jsonObj = new JSONObject(urlResponse);
//
//        // parse current weather info
//        JSONObject currentObj = jsonObj.getJSONObject("current");
//        double tempC = currentObj.getDouble("temp_c");
//        double tempF = currentObj.getDouble("temp_f");
//        JSONObject conditionObj = currentObj.getJSONObject("condition");
//        String condition = conditionObj.getString("text");
//        String iconURL = conditionObj.getString("icon");
//        iconURL = "https:" + iconURL;
//
//        // parse location info
//        JSONObject locationObj = jsonObj.getJSONObject("location");
//        String location = locationObj.getString("name");
//
//        // create and return Weather object
//        Weather weather = new Weather(tempC, tempF, condition, iconURL, location);
//        return weather;
//    }
//}
//import javax.imageio.ImageIO;
//        import javax.swing.*;
//        import java.awt.event.ActionEvent;
//        import java.awt.event.ActionListener;
//        import java.awt.event.ItemEvent;
//        import java.awt.event.ItemListener;
//        import java.awt.image.BufferedImage;
//        import java.io.IOException;
//        import java.net.URL;
//
//public class MyWeatherGUI extends JFrame implements ActionListener, ItemListener {
//    private JTextField zipcodeEntry;
//    private JButton submitButton;
//    private JButton clearButton;
//    private JCheckBox showCelsiusCheckBox;
//    private JLabel tempLabel;
//    private JLabel conditionLabel;
//    private JPanel mainPanel;
//    private JLabel locationLabel;
//    private JLabel conditionIcon;
//    private Weather weather;
//
//    public MyWeatherGUI() {
//        createUIComponents();
//    }
//
//    private void createUIComponents() {
//        setContentPane(mainPanel);
//        setTitle("Weather App");
//        setSize(550, 200);
//        setLocation(450, 100);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        submitButton.addActionListener(this);
//        clearButton.addActionListener(this);
//        showCelsiusCheckBox.addItemListener(this);
//        setVisible(true);
//    }
//
//    private void loadWeather(String zip) {
//        weather = WeatherNetworking.getWeatherForZip(zip);
//        locationLabel.setText("Location: " + weather.getLocation());
//        if (showCelsiusCheckBox.isSelected()) {
//            tempLabel.setText("Current temp: " + weather.getTempC() + "°C");
//        } else {
//            tempLabel.setText("Current temp: " + weather.getTempF() + "°F");
//        }
//        conditionLabel.setText("Current condition: " + weather.getCondition());
//        try {
//            URL imageURL = new URL(weather.getIconURL());
//            BufferedImage image = ImageIO.read(imageURL);
//            ImageIcon icon = new ImageIcon(image);
//            conditionIcon.setIcon(icon);
//        } catch (IOException e) { }
//    }
//
//    private void clear() {
//        zipcodeEntry.setText("");
//        locationLabel.setText("Location: ");
//        tempLabel.setText("Current temp: ");
//        conditionLabel.setText("Current condition: ");
//        conditionIcon.setIcon(new ImageIcon("src/placeholder.jpg"));
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object actionSource = e.getSource();
//        if (actionSource instanceof JButton) {
//            JButton button = (JButton) actionSource;
//            if (button.getText().equals("Submit")) {
//                String zipCode = zipcodeEntry.getText();
//                loadWeather(zipCode);
//            } else {
//                clear();
//            }
//        }
//    }
//
//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        JCheckBox box = (JCheckBox) (e.getSource());
//        if (box.isSelected() && weather != null) {
//            tempLabel.setText("Current temp: " + weather.getTempC() + "°C");
//        } else if (!box.isSelected() && weather != null) {
//            tempLabel.setText("Current temp: " + weather.getTempF() + "°F");
//        }
//    }
//}
