package Main;

import Classes.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Main extends javax.swing.JFrame {

    public Person p;
    public String log;
    public ArrayList<Person> leaderboards = new ArrayList();
    public ArrayList<Assets> Assets = new ArrayList();
    public DefaultListModel avAssets = new DefaultListModel();
    public DefaultListModel owAssets = new DefaultListModel();
    
    public Main() {
        initComponents();
        p = new Person(JOptionPane.showInputDialog("Enter your name: "), 0, 1000);
        loadBoardData();
        updateLeaderboard();
        updateStats();
        assetData();
        updateAssets();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mainscreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtlea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstav = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstown = new javax.swing.JList<>();
        btnpur = new javax.swing.JButton();
        btnsel = new javax.swing.JButton();
        statscreen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlog = new javax.swing.JTextArea();
        lbllog = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        lblpr = new javax.swing.JLabel();
        lblmoneyn = new javax.swing.JLabel();
        lblprn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuprog = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("0000");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("0000");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainscreen.setBackground(new java.awt.Color(255, 255, 255));
        mainscreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainscreen.setForeground(new java.awt.Color(255, 255, 255));

        txtlea.setColumns(20);
        txtlea.setRows(5);
        txtlea.setToolTipText("");
        txtlea.setFocusable(false);
        txtlea.setPreferredSize(new java.awt.Dimension(100, 80));
        txtlea.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtlea);

        lstav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstav.setMaximumSize(new java.awt.Dimension(260, 400));
        lstav.setMinimumSize(new java.awt.Dimension(260, 400));
        lstav.setName(""); // NOI18N
        lstav.setPreferredSize(new java.awt.Dimension(260, 400));
        jScrollPane3.setViewportView(lstav);

        lstown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstown.setMaximumSize(new java.awt.Dimension(260, 400));
        lstown.setMinimumSize(new java.awt.Dimension(260, 400));
        lstown.setPreferredSize(new java.awt.Dimension(260, 400));
        jScrollPane4.setViewportView(lstown);

        btnpur.setText("Purchase Asset");
        btnpur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpurActionPerformed(evt);
            }
        });

        btnsel.setText("Sell Asset");

        javax.swing.GroupLayout mainscreenLayout = new javax.swing.GroupLayout(mainscreen);
        mainscreen.setLayout(mainscreenLayout);
        mainscreenLayout.setHorizontalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnpur, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnsel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        mainscreenLayout.setVerticalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsel))
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpur)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statscreen.setBackground(new java.awt.Color(153, 153, 153));
        statscreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        statscreen.setForeground(new java.awt.Color(153, 153, 153));

        txtlog.setColumns(20);
        txtlog.setRows(5);
        txtlog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlog.setFocusable(false);
        txtlog.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane1.setViewportView(txtlog);

        lbllog.setForeground(new java.awt.Color(51, 51, 51));
        lbllog.setText("Log");

        lblname.setForeground(new java.awt.Color(51, 51, 51));
        lblname.setText("Name");

        lblmoney.setForeground(new java.awt.Color(51, 51, 51));
        lblmoney.setText("Money:");

        lblpr.setForeground(new java.awt.Color(51, 51, 51));
        lblpr.setText("Prestige:");

        lblmoneyn.setForeground(new java.awt.Color(102, 102, 102));
        lblmoneyn.setText("$0000000");
        lblmoneyn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblprn.setForeground(new java.awt.Color(102, 102, 102));
        lblprn.setText("0000");
        lblprn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout statscreenLayout = new javax.swing.GroupLayout(statscreen);
        statscreen.setLayout(statscreenLayout);
        statscreenLayout.setHorizontalGroup(
            statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addComponent(lblname)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(statscreenLayout.createSequentialGroup()
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblmoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmoneyn)
                        .addGap(41, 41, 41)
                        .addComponent(lblpr)
                        .addGap(18, 18, 18)
                        .addComponent(lblprn))
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbllog)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statscreenLayout.setVerticalGroup(
            statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblname)
                .addGap(18, 18, 18)
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmoney)
                    .addComponent(lblmoneyn)
                    .addComponent(lblpr)
                    .addComponent(lblprn))
                .addGap(18, 18, 18)
                .addComponent(lbllog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        mnuprog.setText("Program");
        jMenuBar1.add(mnuprog);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statscreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainscreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpurActionPerformed
        
    }//GEN-LAST:event_btnpurActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void updateStats() {
        lblmoneyn.setText("$" + p.getMon());
        lblprn.setText("" + p.getPr());
    }
    
    public void updateLeaderboard() {
        String tle = "";
        for (int x = 0; x < leaderboards.size(); x++) {
            tle += x + 1 + ". " + leaderboards.get(x) + "\n";
            tle += "\n";
        }
        txtlea.setText(tle);
    }
    
    public void loadBoardData() {
        try {
            leaderboards.add(p);
            FileReader fr = new FileReader("src/Data/competitorData.txt");
            BufferedReader br = new BufferedReader(fr);
            String name;
            int money, prestige;
            Person temp;
            while (true) {
                name = br.readLine();
                if (name == null) {
                    break;
                }
                money = Integer.parseInt(br.readLine());
                prestige = Integer.parseInt(br.readLine());
                temp = new Person(name, prestige, money);
                leaderboards.add(temp);
            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void assetData() {
        Assets.add(new Stock(100,"Joe's Lemonade", "JLM", 0.98, 1.04,40,15));
        Assets.add(new Stock(1000,"Hot N' Spicy Burgers", "HSB", 0.96, 1.05,40,90));
        Assets.add(new Stock(3500,"Big Gas Garage", "BGG", 0.97, 1.08,40,150));
        Assets.add(new Stock(7500,"BigBrain Computers", "BCO", 0.99, 1.11,40,400));
        Assets.add(new Stock(11000,"Green and Blue Foods", "JLM", 1.01, 1.08,40,1000));
        Assets.add(new Commodity(1000, "Gold", "GLD", 0.88, 1.12));
        Assets.add(new Commodity(200, "Silver", "SIL", 0.88, 1.12));
        Assets.add(new Commodity(50, "Oil", "OIL", 0.88, 1.12));
        Assets.add(new Commodity(25, "Energy", "NRG", 0.88, 1.12));
        Assets.add(new Commodity(10, "Produce", "PRD", 0.88, 1.12));
        Assets.add(new Bond(100, "City Infrastructure Bond", "MIB", 1.02));
        Assets.add(new Bond(500, "Province Infrastructure Bond", "PIB", 1.02));
        Assets.add(new Bond(1000, "Federal Infrastructure Bond", "FIB", 1.02));
        Assets.add(new Bond(2500, "Resource Extraction Bond", "REB", 1.02));
        Assets.add(new Bond(3000, "Domestic Factory Bond", "DFB", 1.02));
        Assets.add(new Luxury(5000, "Jewelery", "JLR", 0.95, 1));
        Assets.add(new Luxury(15000, "Automobile", "ATB", 0.80, 3));
        Assets.add(new Luxury(25000, "Collectable Art", "CAT", 0.99, 5));
        Assets.add(new Luxury(50000, "Yacht", "YCT", 0.80, 10));
        Assets.add(new Luxury(100000, "Mansion", "MSN", 0.99, 20));
    }
    
    public void updateAssets() {
        for (int i = 0; i < Assets.size(); i++) {
            avAssets.add(i, Assets.get(i));
        }
        lstav.setModel(avAssets);
        
        for (int i = 0; i < p.ase.size(); i++) {
            owAssets.add(i, p.ase.get(i));
        }
        lstown.setModel(owAssets);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpur;
    private javax.swing.JButton btnsel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbllog;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lblmoneyn;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpr;
    private javax.swing.JLabel lblprn;
    private javax.swing.JList<String> lstav;
    private javax.swing.JList<String> lstown;
    private javax.swing.JPanel mainscreen;
    private javax.swing.JMenu mnuprog;
    private javax.swing.JPanel statscreen;
    private javax.swing.JTextArea txtlea;
    private javax.swing.JTextArea txtlog;
    // End of variables declaration//GEN-END:variables
}
