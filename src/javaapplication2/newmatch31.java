/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author katy
 */

public class newmatch31 extends javax.swing.JFrame {  
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Playerstatistics.class.getName());
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(newmatch31.class.getName());

    /**
     * Creates new form newmatch31
     */
    public newmatch31() {
        initComponents();
        
        // not sure if this is the best place to initialise the variables
        // resultset sql types for multiple value data
        ResultSet vHometeam1;
        ResultSet vAwayteam1;
        ResultSet vBatter1;
        ResultSet vBatter2;
        ResultSet vBowler1;
        //Statement vStatement;
        // mysql db variables for connection
        String url = "jdbc:mysql://185.156.138.148/4-klambert";
        String user = "4-klambert";
        String password = "Duty3-Palace-Area";
        // our mysql query text for teams and players
        String vQueryteams = "SELECT team_name FROM Teams";
        String vQueryplayers = "SELECT players_name FROM Players";
        
        try {
        // create connection to mysql db    
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection connect = DriverManager.getConnection(url, user, password);
        // prepare our statement objects with the sql query text
        PreparedStatement ps1 = connect.prepareStatement(vQueryteams);
        PreparedStatement ps2 = connect.prepareStatement(vQueryteams);
        PreparedStatement ps3 = connect.prepareStatement(vQueryplayers);
        PreparedStatement ps4 = connect.prepareStatement(vQueryplayers);
        PreparedStatement ps5 = connect.prepareStatement(vQueryplayers);
        
        //vStatement = connect.createStatement();  
        // execute queries and store the results in the resultset variables
        vHometeam1 = ps1.executeQuery();
        vAwayteam1 = ps2.executeQuery();
        vBatter1 = ps3.executeQuery();
        vBatter2 = ps4.executeQuery();
        vBowler1 = ps5.executeQuery();
        // while there are rows returned, add them to the combobox
        // 5 comboboxes means 5 sql statments run
        while(vHometeam1.next()) {
            HomeTeamComboBox1.addItem(vHometeam1.getString("team_name"));
        }
        while(vAwayteam1.next()) {
            AwayTeamComboBox2.addItem(vAwayteam1.getString("team_name"));
        }
        while(vBatter1.next()) {
            Batter1.addItem(vBatter1.getString("players_name"));
        }
        while(vBatter2.next()) {
            Batter2.addItem(vBatter2.getString("players_name"));
        }
        while(vBowler1.next()) {
            Bowler.addItem(vBowler1.getString("players_name"));
        }
        } catch (Exception e) {
        }
       //B11 + B12 + B13 + B14 + B15 + B16 = batter1total;
       //brrr
       //private void Updatetotal(){
           String total = 
                   B11.getText()+
                   B12.getText()+
                   B13.getText()+
                   B14.getText()+
                   B15.getText()+
                   B16.getText();
           batter1total.setText(total);     
       }



    

    private int overcounter = 1;
    private int paircounter = 1;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Batter1 = new javax.swing.JComboBox<>();
        Bowler = new javax.swing.JComboBox<>();
        Batter2 = new javax.swing.JComboBox<>();
        B12 = new javax.swing.JTextField();
        B13 = new javax.swing.JTextField();
        jbtn2 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnbye = new javax.swing.JButton();
        jbtnnoball = new javax.swing.JButton();
        jbtnwide = new javax.swing.JButton();
        jbtnlegbye = new javax.swing.JButton();
        jbtncaught = new javax.swing.JButton();
        jbtnbowled = new javax.swing.JButton();
        jbtnrunout = new javax.swing.JButton();
        jbtnstumped = new javax.swing.JButton();
        ctotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jbtnnext = new javax.swing.JButton();
        B11 = new javax.swing.JTextField();
        B14 = new javax.swing.JTextField();
        B15 = new javax.swing.JTextField();
        B16 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B24 = new javax.swing.JTextField();
        B25 = new javax.swing.JTextField();
        B26 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        B23 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Overlabel = new javax.swing.JLabel();
        overnumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        roundnumber = new javax.swing.JTextField();
        Pairlabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        batter1total = new javax.swing.JTextField();
        batter2total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        HomeTeamComboBox1 = new javax.swing.JComboBox<>();
        AwayTeamComboBox2 = new javax.swing.JComboBox<>();
        BackButton1 = new javax.swing.JButton();
        NMSubmitDB = new javax.swing.JButton();
        jbtndotball = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Batter1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batter1" }));
        Batter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batter1ActionPerformed(evt);
            }
        });

        Bowler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bowler" }));

        Batter2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batter2" }));

        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnbye.setText("^");
        jbtnbye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbyeActionPerformed(evt);
            }
        });

        jbtnnoball.setText("O");
        jbtnnoball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnoballActionPerformed(evt);
            }
        });

        jbtnwide.setText("+");
        jbtnwide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnwideActionPerformed(evt);
            }
        });

        jbtnlegbye.setText("v");
        jbtnlegbye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlegbyeActionPerformed(evt);
            }
        });

        jbtncaught.setText("C");
        jbtncaught.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncaughtActionPerformed(evt);
            }
        });

        jbtnbowled.setText("B");
        jbtnbowled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbowledActionPerformed(evt);
            }
        });

        jbtnrunout.setText("R");
        jbtnrunout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrunoutActionPerformed(evt);
            }
        });

        jbtnstumped.setText("S");
        jbtnstumped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnstumpedActionPerformed(evt);
            }
        });

        ctotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctotalActionPerformed(evt);
            }
        });

        jLabel1.setText("cumulative total");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Notes");

        jbtnnext.setText("Next over");
        jbtnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnextActionPerformed(evt);
            }
        });

        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B25ActionPerformed(evt);
            }
        });

        B26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B26ActionPerformed(evt);
            }
        });

        jLabel3.setText("Batter 2");

        jLabel4.setText("Batter 1");

        jLabel5.setText("Bowler");

        Overlabel.setText("Over");

        overnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overnumberActionPerformed(evt);
            }
        });

        jLabel7.setText("of 4");

        roundnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundnumberActionPerformed(evt);
            }
        });

        Pairlabel.setText("Pair");

        jLabel9.setText("of 4");

        jLabel10.setText("Total");

        jLabel11.setText("Total");

        jLabel12.setText("Key: + - wide, ^ - bye, V - leg bye, O - no ball");

        jLabel13.setText("C - Caught, B - Bowled, S - Stumped, R - run out");

        HomeTeamComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HomeTeam" }));
        HomeTeamComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeTeamComboBox1ActionPerformed(evt);
            }
        });

        AwayTeamComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AwayTeam" }));
        AwayTeamComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AwayTeamComboBox2ActionPerformed(evt);
            }
        });

        BackButton1.setText("Back");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        NMSubmitDB.setText("Submit");
        NMSubmitDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NMSubmitDBActionPerformed(evt);
            }
        });

        jbtndotball.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtndotball.setText(".");
        jbtndotball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotballActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(85, 85, 85))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(3, 3, 3)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jbtn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jbtn4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jbtnwide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(layout.createSequentialGroup()
                                                .add(jbtn3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(jbtn6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(layout.createSequentialGroup()
                                                .add(jbtn2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(jbtn5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jbtnbye, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jbtnnoball, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(jbtnlegbye, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jbtndotball)
                                        .add(22, 22, 22)))
                                .add(3, 3, 3))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(jLabel1)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(ctotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(Batter2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(Batter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                .add(16, 16, 16)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Overlabel)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Pairlabel))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(layout.createSequentialGroup()
                                                .add(overnumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(jLabel7))
                                            .add(layout.createSequentialGroup()
                                                .add(roundnumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(jLabel9))))
                                    .add(layout.createSequentialGroup()
                                        .add(B11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(B12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(B13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(B14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(B15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(B16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(12, 12, 12)
                                        .add(jLabel10)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(batter1total, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(18, 18, 18)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(BackButton1)
                                            .add(jbtnnext)))))
                            .add(layout.createSequentialGroup()
                                .add(2, 2, 2)
                                .add(B21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(4, 4, 4)
                                .add(B22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(B23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(B24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(AwayTeamComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(B25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(B26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jLabel11)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(batter2total, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(31, 31, 31)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jbtncaught, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jbtnbowled, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jbtnstumped, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jbtnrunout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(NMSubmitDB))
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(HomeTeamComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(61, 61, 61)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(Bowler, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel13))
                    .add(BackButton1))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(Bowler, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel5))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(Overlabel)
                                    .add(overnumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel7))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(roundnumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(Pairlabel)
                                    .add(jLabel9))))
                        .add(18, 18, 18))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(jbtnnext)
                        .add(31, 31, 31)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(B12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(Batter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10)
                            .add(batter1total, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Batter2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(B26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)
                            .add(jLabel11)
                            .add(batter2total, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel4))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(18, 18, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(ctotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(HomeTeamComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(AwayTeamComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jbtncaught, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jbtnrunout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jbtnbowled, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jbtnstumped, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(NMSubmitDB)
                                .add(28, 28, 28)))
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtn4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnwide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtn2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtn5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnnoball, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtn6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtn3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnbye, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jbtnlegbye, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(13, 13, 13)
                                .add(jbtndotball, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(30, 30, 30))))
        );

        pack();
    }// </editor-fold>


    private void EnterScore (String q)
    {
        String Nums = B11.getText() + q;
        B11.setText(Nums);
        String Nums1 = B12.getText() + q;
        B12.setText(Nums1);
        String Nums2 = B13.getText() + q;
        B13.setText(Nums2);
        String Nums3 = B14.getText() + q;
        B14.setText(Nums3);
        String Nums4 = B15.getText() + q;
        B15.setText(Nums4);
        String Nums5 = B16.getText() + q;
        B16.setText(Nums5);
        String Nums6 = B21.getText() + q;
        B21.setText(Nums6);
        String Nums7 = B22.getText() + q;
        B22.setText(Nums7);
        String Nums8 = B23.getText() + q;
        B23.setText(Nums8);
        String Nums9 = B24.getText() + q;
        B24.setText(Nums9);
        String Nums10 = B25.getText() + q;
        B25.setText(Nums10);
        String Nums11 = B26.getText() + q;
        B26.setText(Nums11);
        

    }
    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        EnterScore("6");
        
    }                                     

    private void jbtnnoballActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        EnterScore("O");
    }                                          

    private void jbtnlegbyeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        EnterScore("v");
    }                                          

    private void jbtnbowledActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        EnterScore("B");
    }                                          

    private void jbtnrunoutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        EnterScore("R");
    }                                          

    private void jbtnstumpedActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        EnterScore("S");
    }                                           

    private void overnumberActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void roundnumberActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void ctotalActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void B25ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void B26ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void HomeTeamComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void AwayTeamComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        // the back button will take us to a new homescreen object
        homescreen hs = new homescreen();
        hs.setVisible(true);
        // close/dispose of the current class
        this.dispose();
    }                                           

    private void NMSubmitDBActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        // assign text input to string variables for the insert query
        String sbatter1 = String.valueOf(Batter1.getSelectedItem());
        String sbatter2 = String.valueOf(Batter2.getSelectedItem());
        String sbowler = String.valueOf(Bowler.getSelectedItem());
        String sb11 = B11.getText();
        String sb12 = B12.getText();
        String sb13 = B13.getText();
        String sb14 = B14.getText();
        String sb15 = B15.getText();
        String sb16 = B16.getText();
        String sb21 = B21.getText();
        String sb22 = B22.getText();
        String sb23 = B23.getText();
        String sb24 = B24.getText();
        String sb25 = B25.getText();
        String sb26 = B26.getText();
        String sovernumber = overnumber.getText();
        String spairnumber = roundnumber.getText();
        String sb1total = batter1total.getText();
        String sb2total = batter2total.getText();
        String spairtotal = ctotal.getText();
        String shometeam = String.valueOf(HomeTeamComboBox1.getSelectedItem());
        String sawayteam = String.valueOf(AwayTeamComboBox2.getSelectedItem());
        
        // mysql database connection variables
        String url = "jdbc:mysql://185.156.138.148/4-klambert";
        String user = "4-klambert";
        String password = "Duty3-Palace-Area";
        
        // make the connection to the mysql db to run the insert query
        try {
            // connect to the db with the variables above
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = DriverManager.getConnection(url, user, password);
            // build the insert sql query with the values from the string variables
            String query = "INSERT INTO scratch (batter1,batter2,bowler,b11,b12,b13,b14,b15,b16,b21,b22,b23,b24,b25,b26,overnumber,pairnumber,b1total,b2total,pairtotal,hometeam,awayteam) values('" 
                    + sbatter1 + "','" + sbatter2 + "','" + sbowler + "','" + sb11 + "','" + sb12 +
                    "','" + sb13 + "','" + sb14 + "','" + sb15 + "','" + sb16 + "','" + sb21 +
                    "','" + sb22 + "','" + sb23 + "','" + sb24 + "','" + sb25 + "','" + sb26 +
                    "','" + sovernumber + "','" + spairnumber + "','" + sb1total + "','" + sb2total +
                    "','" + spairtotal + "','" + shometeam + "','" + sawayteam + "')";
            // prepare a sql statement object to handle our query
            Statement sta = connection.createStatement();
            // run the query on the mysql db
            int x = sta.executeUpdate(query);
            // did it execute ok ?
            if (x == 0) {
                // something broke if we are here
                JOptionPane.showMessageDialog(NMSubmitDB, "This pair round already exists");
            } else {
                // it ran ok, tell the user
                JOptionPane.showMessageDialog(NMSubmitDB, "Pair round is sucessfully stored");
                    }
                    // close the database connection, will commit the data - important
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
    }                                          

    private void Batter1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jbtndotballActionPerformed(java.awt.event.ActionEvent evt) {                                            
        EnterScore(".");
    }                                           

    private void jbtnnextActionPerformed(java.awt.event.ActionEvent evt) {                                         
        overnumber.setText(String.valueOf(overcounter));
        roundnumber.setText(String.valueOf(paircounter));  
        overcounter++;//increases the over counter
        if (overcounter > 4){//limits it at 4
            overcounter = 1;//resets the over counter to one
            paircounter++;//increases the pair counter when excuting the if
        }
        //stop pair count going further than 4:4
        if (paircounter > 4){
            paircounter = 1;
            overcounter = 1;
        }
        //reset boxes for new over keep players change bowler 
    }                                        

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        EnterScore("1");
    }                                     

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        EnterScore("4");
    }                                     

    private void jbtnwideActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        EnterScore("+");
    }                                        

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        EnterScore("2");
    }                                     

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        EnterScore("5");
    }                                     

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        EnterScore("3");
    }                                     

    private void jbtnbyeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        EnterScore("^");
    }                                       

    private void jbtncaughtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        EnterScore("C");
    }                                          

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    
// Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> AwayTeamComboBox2;
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B13;
    private javax.swing.JTextField B14;
    private javax.swing.JTextField B15;
    private javax.swing.JTextField B16;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField B23;
    private javax.swing.JTextField B24;
    private javax.swing.JTextField B25;
    private javax.swing.JTextField B26;
    private javax.swing.JButton BackButton1;
    private javax.swing.JComboBox<String> Batter1;
    private javax.swing.JComboBox<String> Batter2;
    private javax.swing.JComboBox<String> Bowler;
    private javax.swing.JComboBox<String> HomeTeamComboBox1;
    private javax.swing.JButton NMSubmitDB;
    private javax.swing.JLabel Overlabel;
    private javax.swing.JLabel Pairlabel;
    private javax.swing.JTextField batter1total;
    private javax.swing.JTextField batter2total;
    private javax.swing.JTextField ctotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtnbowled;
    private javax.swing.JButton jbtnbye;
    private javax.swing.JButton jbtncaught;
    private javax.swing.JButton jbtndotball;
    private javax.swing.JButton jbtnlegbye;
    private javax.swing.JButton jbtnnext;
    private javax.swing.JButton jbtnnoball;
    private javax.swing.JButton jbtnrunout;
    private javax.swing.JButton jbtnstumped;
    private javax.swing.JButton jbtnwide;
    private javax.swing.JTextField overnumber;
    private javax.swing.JTextField roundnumber;
    // End of variables declaration
}