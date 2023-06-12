import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainGUIWindow extends JFrame {
    private FirstPanel firstPanel;
    public static CardLayout cardLayout;
    public static WeatherAPI wAPI;
    public MainGUIWindow() {
        super("StyleSync");
        init();
    }
    private void init() {
        setTitle("StyleSync");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 670);
        firstPanel = new FirstPanel();
        wAPI = new WeatherAPI();
        add(firstPanel);
        setVisible(true);
    }
}
