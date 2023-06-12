import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstPanel extends JPanel implements ActionListener{
    private JTextField locationEntry;
    private JButton welcome;
    private JButton fillOut;
    private JButton checkTheBox;
    private JCheckBox work;
    private JCheckBox school;
    private JCheckBox lounge;
    private JCheckBox gym;
    private JCheckBox party;

    private JButton done;
    private boolean isCold;
    private JButton weatherResult;
    private boolean isFirstPanel = true;
    private String weather;
    public FirstPanel(){
        setSize(700, 670);
        welcome = new JButton("HMMM.. WHAT SHOULD I WEAR TODAY?");
        fillOut = new JButton("Fill out the following to find out:");
        locationEntry = new JTextField();
        locationEntry.setText("ENTER ZIPCODE");
        locationEntry.setColumns(5);
        checkTheBox = new JButton("Check the box for each activity you'd like an outfit for:");
        done = new JButton("DONE!");
        done.addActionListener(this);
        work = new JCheckBox();
        work.setText("WORK");
        work.addActionListener(this);
        school = new JCheckBox();
        school.setText("SCHOOL");
        school.addActionListener(this);
        lounge = new JCheckBox();
        lounge.setText("LOUNGE");
        lounge.addActionListener(this);
        gym = new JCheckBox();
        gym.setText("GYM");
        gym.addActionListener(this);
        party = new JCheckBox();
        party.setText("PARTY");
        party.addActionListener(this);
        add(welcome);
        add(fillOut);
        add(checkTheBox);
        add(work);
        add(school);
        add(lounge);
        add(gym);
        add(party);
        add(locationEntry);
        add(done);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon icon0 = new ImageIcon("src/fpbg.jpg");
        Image iconImg = icon0.getImage();
        g.drawImage(iconImg, 0, 0, null);
//        if(isFirstPanel) {
            welcome.setLocation(145, 70);
            welcome.setSize(450, 50);
            welcome.setFont(new Font("Helvetica", Font.BOLD, 20));
            fillOut.setLocation(180, 125);
            fillOut.setSize(375, 40);
            fillOut.setFont(new Font("Helvetica", Font.PLAIN, 20));
            locationEntry.setLocation(280, 170);
            locationEntry.setSize(200, 40);
            locationEntry.setFont(new Font("Baskerville", Font.BOLD, 16));
            checkTheBox.setLocation(90, 215);
            checkTheBox.setSize(550, 40);
            checkTheBox.setFont(new Font("Helvetica", Font.BOLD, 20));
            work.setLocation(310, 275);
            work.setFont(new Font("Impact", Font.BOLD, 20));
            work.setForeground(Color.ORANGE);
            school.setLocation(310, 315);
            school.setFont(new Font("Impact", Font.BOLD, 20));
            school.setForeground(Color.ORANGE);
            lounge.setLocation(310, 355);
            lounge.setFont(new Font("Impact", Font.BOLD, 20));
            lounge.setForeground(Color.ORANGE);
            gym.setLocation(310, 395);
            gym.setFont(new Font("Impact", Font.BOLD, 20));
            gym.setForeground(Color.ORANGE);
            party.setLocation(310, 435);
            party.setFont(new Font("Impact", Font.BOLD, 20));
            party.setForeground(Color.ORANGE);
            done.setSize(120, 50);
            done.setFont(new Font("Helvetica", Font.BOLD, 20));
            done.setLocation(300, 495);
            done.setForeground(Color.WHITE);
            done.setBackground(Color.RED);
            done.setOpaque(true);
            done.setBorderPainted(false);
//        }else{120,50
//            weatherResult.setLocation(145, 70);
//            weatherResult.setSize(450, 50);
//            weatherResult.setFont(new Font("Helvetica", Font.BOLD, 20));
//        }
    }

    public void clearScreen(){
        locationEntry.setVisible(false);
        welcome.setVisible(false);
        fillOut.setVisible(false);
        checkTheBox.setVisible(false);
        work.setVisible(false);
        school.setVisible(false);
        lounge.setVisible(false);
        gym.setVisible(false);
        party.setVisible(false);
        done.setVisible(false);
        isFirstPanel = false;


    }
//make a method that aims to fill the five button icons. takes count of how many boxes were checked and fills that many buttons, max is five
    //
    public void addWorkOutfit() {
        if(isCold){

        }else{

        }
    }
    public void addSchoolOutfit() {
        if(isCold){

        }else{

        }
    }
    public void addLoungeOutfit() {
        if(isCold){

        }else{

        }
    }
    public void addGymOutfit() {
        if(isCold){

        }else{

        }
    }
    public void addPartyOutfit() {
        if(isCold){

        }else{

        }
    }



    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if(text.equals("DONE!")){
                String location = locationEntry.getText();
                Weather w = MainGUIWindow.wAPI.getWeatherForZip(location);
                if(w.getTempF()>=65){
                    isCold = false;
                    weather = "colder";
                }else{
                    isCold = true;
                    weather = "warmer";
                }
                clearScreen();
                isFirstPanel = false;
                weatherResult = new JButton("The weather is on the " + weather + " side today. Your outfit(s) are below:");
                add(weatherResult);
                weatherResult.setLocation(145, 150);
                weatherResult.setSize(450, 55);
                weatherResult.setFont(new Font("Helvetica", Font.BOLD, 20));
            }
        }else{
            JCheckBox checkBox = (JCheckBox) source;
            String text = checkBox.getText();
            if(text.equals("WORK")){
                addWorkOutfit();
            }
            if(text.equals("SCHOOL")){
                addSchoolOutfit();
            }
            if(text.equals("LOUNGE")){
                addLoungeOutfit();
            }
            if(text.equals("GYM")){
                addGymOutfit();
            }
            if(text.equals("PARTY")){
                addPartyOutfit();
            }
        }
    }
}
