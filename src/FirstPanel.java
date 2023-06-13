import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    private JButton gender;
    private JCheckBox male;
    private JCheckBox female;
    private JButton done;
    private boolean isCold;
    private JButton weatherResult;
    private boolean isFirstPanel = true;
    private String weather;
    private JPanel x;
    private int outfitsNeeded;
    private JButton[] outfitArr;
    private boolean isFem;
    private boolean works = false;
    private boolean schools = false;
    private boolean gyms = false;
    private boolean lounges = false;
    private boolean parties = false;
    private JButton workwomanwarm;
    private JButton workwomancold;
    private JButton workmanwarm;
    private JButton workmancold;
    private JButton schoolwomanwarm;
    private JButton schoolwomancold;
    private JButton schoolmanwarm;
    private JButton schoolmancold;
    private JButton gymwomanwarm;
    private JButton gymwomancold;
    private JButton gymmanwarm;
    private JButton gymmancold;
    private JButton loungewomanwarm;
    private JButton loungewomancold;
    private JButton loungemanwarm;
    private JButton loungemancold;
    private JButton partywomanwarm;
    private JButton partywomancold;
    private JButton partymanwarm;
    private JButton partymancold;
    private ArrayList<JButton> displayArr;
    private JButton display1;
    private JButton display2;
    private JButton display3;
    private JButton display4;
    private JButton display5;


    public FirstPanel(){
        setSize(700, 670);
        welcome = new JButton("HMMM.. WHAT SHOULD I WEAR TODAY?");
        fillOut = new JButton("Fill out the following to find out:");
        locationEntry = new JTextField();
        locationEntry.setText("ENTER ZIPCODE");
        locationEntry.setColumns(5);
        checkTheBox = new JButton("Check the box for ONE activity you'd like an outfit for:");
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
        gender = new JButton("Do you want feminine or masculine outfits?");
        female = new JCheckBox("FEMININE");
        female.addActionListener(this);
        male = new JCheckBox("MASCULINE");
        male.addActionListener(this);
        add(welcome);
        add(fillOut);
        add(checkTheBox);
        add(work);
        add(school);
        add(lounge);
        add(gym);
        add(party);
        add(gender);
        add(female);
        add(male);
        add(locationEntry);
        add(done);
        workwomanwarm = new JButton("");
        workwomanwarm.setVisible(false);

        workwomancold = new JButton("");
        workwomancold.setVisible(false);

        workmanwarm = new JButton("");
        workmanwarm.setVisible(false);

        workmancold = new JButton("");
        workmancold.setVisible(false);

        schoolwomanwarm = new JButton("");
        schoolwomanwarm.setVisible(false);

        schoolwomancold = new JButton("");
        schoolwomancold.setVisible(false);

        schoolmanwarm = new JButton("");
        schoolmanwarm.setVisible(false);

        schoolmancold = new JButton("");
        schoolmancold.setVisible(false);

        gymwomanwarm = new JButton("");
        gymwomanwarm.setVisible(false);

        gymwomancold = new JButton("");
        gymwomancold.setVisible(false);

        gymmanwarm = new JButton("");
        gymmanwarm.setVisible(false);

        gymmancold = new JButton("");
        gymmancold.setVisible(false);

        loungewomanwarm = new JButton("");
        loungewomanwarm.setVisible(false);

        loungewomancold = new JButton("");
        loungewomancold.setVisible(false);

        loungemanwarm = new JButton("");
        loungemanwarm.setVisible(false);

        loungemancold = new JButton("");
        loungemancold.setVisible(false);

        partywomanwarm = new JButton("");
        partywomanwarm.setVisible(false);

        partywomancold = new JButton("");
        partywomancold.setVisible(false);

        partymanwarm = new JButton("");
        partymanwarm.setVisible(false);

        partymancold = new JButton("");
        partymancold.setVisible(false);

        display1 = new JButton("");
        display1.setVisible(false);
        display2 = new JButton("");
        display2.setVisible(false);
        display3 = new JButton("");
        display3.setVisible(false);
        display4 = new JButton("");
        display4.setVisible(false);
        display5 = new JButton("");
        display5.setVisible(false);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon icon0 = new ImageIcon("src/fpbg.jpg");
        Image iconImg = icon0.getImage();
        g.drawImage(iconImg, 0, 0, null);
        welcome.setLocation(145, 70);
        welcome.setSize(450, 50);
        welcome.setFont(new Font("Helvetica", Font.BOLD, 20));
        fillOut.setLocation(180, 125);
        fillOut.setSize(375, 40);
        fillOut.setFont(new Font("Helvetica", Font.BOLD, 20));
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
        gender.setSize(375, 40);
        gender.setLocation(180,495);
        gender.setFont(new Font("Helvetica", Font.BOLD, 17));
        female.setLocation(310,545);
        female.setFont(new Font("Impact", Font.BOLD, 20));
        female.setForeground(Color.ORANGE);
        male.setLocation(310,595);
        male.setFont(new Font("Impact", Font.BOLD, 20));
        male.setForeground(Color.ORANGE);
        done.setSize(120, 50);
        done.setFont(new Font("Helvetica", Font.BOLD, 20));
        done.setLocation(300, 645);
        done.setForeground(Color.WHITE);
        done.setBackground(Color.RED);
        done.setOpaque(true);
        done.setBorderPainted(false);
        Icon warm1 = new ImageIcon("src/workwomanwarm.jpg");
        Icon warm2 = new ImageIcon("src/workwomancold.jpg");
        Icon warm3 = new ImageIcon("src/workmanwarm.jpg");
        Icon warm4 = new ImageIcon("src/workmancold.jpg");
        Icon school1 = new ImageIcon("src/schoolwomanwarm.jpg");
        Icon school2 = new ImageIcon("src/schoolwomancold.jpg");
        Icon school3 = new ImageIcon("src/schoolmanwarm.jpg");
        Icon school4 = new ImageIcon("src/schoolmancold.jpg");
        Icon gym1 = new ImageIcon("src/gymwomanwarm.jpg");
        Icon gym2 = new ImageIcon("src/gymwomancold.jpg");
        Icon gym3 = new ImageIcon("src/gymmanwarm.jpg");
        Icon gym4 = new ImageIcon("src/gymmancold.jpg");
        Icon lounge1 = new ImageIcon("src/loungewomanwarm.jpg");
        Icon lounge2 = new ImageIcon("src/loungewomancold.jpg");
        Icon lounge3 = new ImageIcon("src/loungemanwarm.jpg");
        Icon lounge4 = new ImageIcon("src/loungemancold.jpg");
        Icon party1 = new ImageIcon("src/partywomanwarm.jpg");
        Icon party2 = new ImageIcon("src/partywomancold.jpg");
        Icon party3 = new ImageIcon("src/partymanwarm.jpg");
        Icon party4 = new ImageIcon("src/partymancold.jpg");
        workwomanwarm.setIcon(warm1);
        workwomancold.setIcon(warm2);
        workmanwarm.setIcon(warm3);
        workmancold.setIcon(warm4);
        schoolwomanwarm.setIcon(school1);
        schoolwomancold.setIcon(school2);
        schoolmanwarm.setIcon(school3);
        schoolmancold.setIcon(school4);
        gymwomanwarm.setIcon(gym1);
        gymwomancold.setIcon(gym2);
        gymmanwarm.setIcon(gym3);
        gymmancold.setIcon(gym4);
        loungewomanwarm.setIcon(lounge1);
        loungewomancold.setIcon(lounge2);
        loungemanwarm.setIcon(lounge3);
        loungemancold.setIcon(lounge4);
        partywomanwarm.setIcon(party1);
        partywomancold.setIcon(party2);
        partymanwarm.setIcon(party3);
        partymancold.setIcon(party4);
        if(!isFirstPanel){
            weatherResult.setLocation(50, 70);
            weatherResult.setSize(550, 40);
            weatherResult.setFont(new Font("Helvetica", Font.BOLD, 14));
            display1.setLocation(250, 350);
            display1.setSize(200, 200);

            display2.setLocation(250, 320);
            display2.setSize(200, 200);
            display2.setVisible(false);
            display3.setLocation(250, 520);
            display3.setSize(200, 200);
            display3.setVisible(false);
            display4.setLocation(250, 720);
            display4.setSize(200, 200);
            display4.setVisible(false);
            display5.setLocation(250, 920);
            display5.setSize(200, 200);
            display5.setVisible(false);

            }
        }
    public void switchPanel(){
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
        gender.setVisible(false);
        female.setVisible(false);
        male.setVisible(false);
//        setSize(700, 670);
//        x = new JPanel();
//        x.setSize(550, 700);
//        x.setLayout(new GridLayout(5, 1));
//        add(x);
    }

//make a method that aims to fill the five button icons. takes count of how many boxes were checked and fills that many buttons, max is five
    //
    public JButton[] makeList(){
        System.out.println(isFem);
        int i = 0;
        while(i<outfitsNeeded){
            if(works){
                if(isFem){
                    if(weather.equals("colder")){
                        outfitArr[i] = workwomancold;
                        i++;
                    }else{
                        outfitArr[i] = workwomanwarm;
                        i++;
                    }
                }else{
                    if(weather.equals("colder")){
                        outfitArr[i] = workmancold;
                        i++;
                    }else{
                        outfitArr[i] = workmanwarm;
                        i++;
                    }
                }
            }
            if(schools){
                if(isFem){
                    if(weather.equals("colder")){
                        outfitArr[i] = schoolwomancold;
                        i++;
                    }else{
                        outfitArr[i] = schoolwomanwarm;
                        i++;
                    }
                }else{
                    if(weather.equals("colder")){
                        outfitArr[i] = schoolmancold;
                        i++;
                    }else{
                        outfitArr[i] = schoolmanwarm;
                        i++;
                    }
                }
            }
            if(gyms){
                if(isFem){
                    if(weather.equals("colder")){
                        outfitArr[i] = gymwomancold;
                        i++;
                    }else{
                        outfitArr[i] = gymwomanwarm;
                        i++;
                    }
                }else{
                    if(weather.equals("colder")){
                        outfitArr[i] = gymmancold;
                        i++;
                    }else{
                        outfitArr[i] = gymmanwarm;
                        i++;
                    }
                }
            }
            if(lounges){
                if(isFem){
                    if(weather.equals("colder")){
                        outfitArr[i] = loungewomancold;
                        i++;
                    }else{
                        outfitArr[i] = loungewomanwarm;
                        i++;
                    }
                }else{
                    if(weather.equals("colder")){
                        outfitArr[i] = loungemancold;
                        i++;
                    }else{
                        outfitArr[i] = loungemanwarm;
                        i++;
                    }
                }
            }
            if(parties){
                if(isFem){
                    if(weather.equals("colder")){
                        outfitArr[i] = partywomancold;
                        i++;
                    }else{
                        outfitArr[i] = partywomanwarm;
                        i++;
                    }
                }else{
                    if(weather.equals("colder")){
                        outfitArr[i] = partymancold;
                        i++;
                    }else{
                        outfitArr[i] = partymanwarm;
                        i++;
                    }
                }
            }
        }
        for(int x = 0; x< outfitArr.length; x++){
            System.out.println(outfitArr[x]);
        }
        return outfitArr;
    }

    public void displayOutfits(){
        if(outfitsNeeded==1){
//            display1.setVisible(true);
            display1.setIcon(outfitArr[0].getIcon());
        }
        if(outfitsNeeded==2){
            display2.setVisible(true);
            display1.setIcon(outfitArr[0].getIcon());
            display2.setIcon(outfitArr[1].getIcon());
        }
        if(outfitsNeeded==3){
            display2.setVisible(true);
            display3.setVisible(true);
            display1.setIcon(outfitArr[0].getIcon());
            display2.setIcon(outfitArr[1].getIcon());
            display3.setIcon(outfitArr[2].getIcon());
        }
        if(outfitsNeeded==4){
            display2.setVisible(true);
            display3.setVisible(true);
            display4.setVisible(true);
            display1.setIcon(outfitArr[0].getIcon());
            display2.setIcon(outfitArr[1].getIcon());
            display3.setIcon(outfitArr[2].getIcon());
            display4.setIcon(outfitArr[3].getIcon());
        }
        if(outfitsNeeded==5){
            display2.setVisible(true);
            display3.setVisible(true);
            display4.setVisible(true);
            display5.setVisible(true);
            display1.setIcon(outfitArr[0].getIcon());
            display2.setIcon(outfitArr[1].getIcon());
            display3.setIcon(outfitArr[2].getIcon());
            display4.setIcon(outfitArr[3].getIcon());
            display5.setIcon(outfitArr[4].getIcon());
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
                    weather = "warmer";
                }else{
                    isCold = true;
                    weather = "colder";
                }
                switchPanel();
                isFirstPanel=false;
                outfitArr = new JButton[outfitsNeeded];
                makeList();
                weatherResult = new JButton("The weather is on the " + weather + " side today. Your outfit(s) are below:");
                weatherResult.setLocation(100, 70);
                weatherResult.setSize(475, 150);
                weatherResult.setFont(new Font("Helvetica", Font.BOLD, 17));
                add(weatherResult);
                display1 = new JButton("");
                display1.setLocation(250, 350);
                display1.setSize(200, 200);
                add(display1);
                display2 = new JButton("");
                display2.setLocation(250, 320);
                display2.setSize(200, 200);
                display2.setVisible(false);
                add(display2);
                display3 = new JButton("");
                display3.setLocation(350, 520);
                display3.setSize(200, 200);
                display3.setVisible(false);
                add(display3);
                display4 = new JButton("");
                display4.setLocation(350, 720);
                display4.setSize(200, 200);
                display4.setVisible(false);
                add(display4);
                displayOutfits();
            }
        }else{
            JCheckBox checkBox = (JCheckBox) source;
            String text = checkBox.getText();
            if(text.equals("WORK")){
//                addWorkOutfit();
                works = true;
                outfitsNeeded++;
            }
            if(text.equals("SCHOOL")){
//                addSchoolOutfit();
                schools = true;
                outfitsNeeded++;
            }
            if(text.equals("LOUNGE")){
//                addLoungeOutfit();
                lounges = true;
                outfitsNeeded++;
            }
            if(text.equals("GYM")){
//                addGymOutfit();
                gyms = true;
                outfitsNeeded++;
            }
            if(text.equals("PARTY")){
//                addPartyOutfit();
                parties = true;
                outfitsNeeded++;
            }
            if(text.equals("FEMININE")){
                System.out.println("hi");
                isFem = true;
            }
            if(text.equals("MASCULINE")){
                System.out.println("hi");
                isFem = false;
            }
        }
    }
}
