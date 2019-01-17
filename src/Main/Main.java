package Main;

import Classes.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

public class Main extends javax.swing.JFrame {

    public Person p;
    public String log = "";
    public int listIndex = 0;
    public ArrayList<Person> leaderboards = new ArrayList();
    public ArrayList<Assets> AssetsList = new ArrayList();
    public DefaultListModel avAssets = new DefaultListModel();
    public DefaultListModel owAssets = new DefaultListModel();
    public NumberFormat nf = NumberFormat.getCurrencyInstance();
    public int day = 0;

    public Main() {
        initComponents();
        p = new Person(JOptionPane.showInputDialog("Enter your name: "), 0, 1000);
               day ++;
        log += "\n===================";
        log += "\nDay " + day;
        log += "\n===================";
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mainscreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtlea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstav = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstown = new javax.swing.JList<>();
        btnpur = new javax.swing.JButton();
        btnsel = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuhelp = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("0000");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("0000");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

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
        btnsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselActionPerformed(evt);
            }
        });

        btnnext.setText("End Business Day (Update)");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainscreenLayout = new javax.swing.GroupLayout(mainscreen);
        mainscreen.setLayout(mainscreenLayout);
        mainscreenLayout.setHorizontalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnpur, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnext)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnsel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        mainscreenLayout.setVerticalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsel))
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpur)
                        .addGap(18, 18, 18)
                        .addComponent(btnnext)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statscreen.setBackground(new java.awt.Color(153, 153, 153));
        statscreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        statscreen.setForeground(new java.awt.Color(153, 153, 153));

        txtlog.setColumns(20);
        txtlog.setRows(5);
        txtlog.setAutoscrolls(false);
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

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuprog.add(jMenuItem1);

        jMenuBar1.add(mnuprog);

        mnuhelp.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem3.setText("Assets Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuhelp.add(jMenuItem3);

        jMenuBar1.add(mnuhelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        int index = lstav.getSelectedIndex();
        if (p.addAsset(AssetsList.get(index))) {
            log += "\n" + p.getName() + " has purchased - " + AssetsList.get(index).getName() + " || " + AssetsList.get(index).getCode();
            //If it isnt a commodity, delete it from available assets, because there can only be 1 of each
            if (!AssetsList.get(index).getType().equals("COMMODITY")) {
                AssetsList.remove(index);
            }
            //if it is a commodity, add a count to the number of specific commodies owned
            else {
                if (AssetsList.get(index).getCode().equals("GLD")) {
                    Commodity.gldcount ++;
                }
                if (AssetsList.get(index).getCode().equals("SIL")) {
                    Commodity.silcount ++;
                }
                if (AssetsList.get(index).getCode().equals("OIL")) {
                    Commodity.oilcount ++;
                }
                if (AssetsList.get(index).getCode().equals("NRG")) {
                    Commodity.nrgcount ++;
                }
                if (AssetsList.get(index).getCode().equals("PRD")) {
                    Commodity.prdcount ++;
                }
            }
            updateStats();
            updateAssets();
        } else {
            JOptionPane.showMessageDialog(this, "Error - Not Enough Money");
        }

    }//GEN-LAST:event_btnpurActionPerformed

    private void btnselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselActionPerformed
        int index = lstown.getSelectedIndex();
        log += "\n" + p.getName() + " has sold - " + p.ase.get(index).getName() + " || " + p.ase.get(index).getCode();
        //Add to list of available stocks, unless its a commodity (already there)
        if (!AssetsList.get(index).getType().equals("COMMODITY")) {
            AssetsList.add(p.ase.get(index));
        }
        //If you did sell a commodity, get rid of one from the count
        else {
                if (AssetsList.get(index).getCode().equals("GLD")) {
                    Commodity.gldcount --;
                }
                if (AssetsList.get(index).getCode().equals("SIL")) {
                    Commodity.silcount --;
                }
                if (AssetsList.get(index).getCode().equals("OIL")) {
                    Commodity.oilcount --;
                }
                if (AssetsList.get(index).getCode().equals("NRG")) {
                    Commodity.nrgcount --;
                }
                if (AssetsList.get(index).getCode().equals("PRD")) {
                    Commodity.prdcount --;
                }
            }
        p.sellAsset(index);
        updateStats();
        updateAssets();
    }//GEN-LAST:event_btnselActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        day ++;
        log += "\n===================";
        log += "\nDay " + day;
        log += "\n===================";
        for (int i = 0; i < p.ase.size(); i++) {
            p.ase.get(i).updateVal();
            if (p.ase.get(i).getType().equals("STOCK")) {
                p.dividends += ((Stock) p.ase.get(i)).getDividend();
            }
            if (p.ase.get(i).getValue() == 0) {
                log += "\nThe market for " + p.ase.get(i).getName() + " has crashed!\n Value has been jumpstarted!";
                p.ase.get(i).jumpStart();
            }
        }
        for (int j = 0; j < AssetsList.size(); j++) {
            if (!AssetsList.get(j).getType().equals("LUXURY") && !AssetsList.get(j).getType().equals("BOND")) {
                AssetsList.get(j).updateVal();
            }
            if (AssetsList.get(j).getValue() == 0) {
                log += "\nThe market for " + AssetsList.get(j).getName() + " has crashed!\n Value has been jumpstarted!";
                AssetsList.get(j).jumpStart();
            }
        }
        log += "\n" + nf.format(p.dividends) + " earned from Stock dividends";
        p.getPayout();
        p.dividends = 0;
        log += "\nOwned Commodities:";
        log += "\n" + Commodity.gldcount + " GLD || " + Commodity.silcount + " SIL || "+ Commodity.oilcount + " OIL || "+ Commodity.nrgcount + " NRG || "+ Commodity.prdcount + " PRD ";
        updateAssets();
        updateStats();
        log = "";
    }//GEN-LAST:event_btnnextActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(this, "Stock\n=====\n Stocks are assets that have a moderate variance in gains/losses, they pay out a dividend to the owner every close");
        JOptionPane.showMessageDialog(this, "Bonds\n=====\n Bonds are assets that have a consistant growth, albeit low, and only grows when purchased");
        JOptionPane.showMessageDialog(this, "Commodities\n=====\n Commodities are assets that have a large variance in gains/losses, and multiple may be purchased");
        JOptionPane.showMessageDialog(this, "Luxuries\n=====\n Luxuries are assets that only depreciate in value(other than mansion), but act as victory cards to build prestige");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void updateStats() {
        lblmoneyn.setText("" + nf.format(p.getMon()));
        lblprn.setText("" + p.getPr());
        txtlog.setText(log);
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
        AssetsList.add(new Stock(100, "Joe's Lemonade", "JLM", 0.92, 1.10, 10));
        AssetsList.add(new Stock(1000, "Hot N' Spicy Burgers", "HSB", 0.94, 1.10, 10));
        AssetsList.add(new Stock(3500, "Big Gas Garage", "BGG", 0.94, 1.16, 10));
        AssetsList.add(new Stock(7500, "BigBrain Computers", "BCO", 0.98, 1.07, 10));
        AssetsList.add(new Stock(11000, "Green and Blue Foods", "JLM", 0.98, 1.08, 10));
        AssetsList.add(new Commodity(1000, "Gold", "GLD", 0.88, 1.12));
        AssetsList.add(new Commodity(200, "Silver", "SIL", 0.88, 1.12));
        AssetsList.add(new Commodity(50, "Oil", "OIL", 0.92, 1.09));
        AssetsList.add(new Commodity(25, "Energy", "NRG", 0.95, 1.07));
        AssetsList.add(new Commodity(10, "Produce", "PRD", 0.99, 1.04));
        AssetsList.add(new Bond(100, "City Infrastructure Bond", "MIB", 1.02));
        AssetsList.add(new Bond(500, "Province Infrastructure Bond", "PIB", 1.02));
        AssetsList.add(new Bond(1000, "Federal Infrastructure Bond", "FIB", 1.02));
        AssetsList.add(new Bond(2500, "Resource Extraction Bond", "REB", 1.02));
        AssetsList.add(new Bond(3000, "Domestic Factory Bond", "DFB", 1.02));
        AssetsList.add(new Luxury(5000, "Jewelery", "JLR", 0.95, 1));
        AssetsList.add(new Luxury(15000, "Automobile", "ATB", 0.80, 3));
        AssetsList.add(new Luxury(25000, "Collectable Art", "CAT", 0.99, 5));
        AssetsList.add(new Luxury(50000, "Yacht", "YCT", 0.80, 10));
        AssetsList.add(new Luxury(100000, "Mansion", "MSN", 1.01, 20));
    }

    public void updateAssets() {
        avAssets.clear();
        owAssets.clear();
        for (int i = 0; i < AssetsList.size(); i++) {
            avAssets.add(i, AssetsList.get(i));
        }
        lstav.setModel(avAssets);

        for (int i = 0; i < p.ase.size(); i++) {
            owAssets.add(i, p.ase.get(i));
        }
        lstown.setModel(owAssets);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpur;
    private javax.swing.JButton btnsel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
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
    private javax.swing.JMenu mnuhelp;
    private javax.swing.JMenu mnuprog;
    private javax.swing.JPanel statscreen;
    private javax.swing.JTextArea txtlea;
    private javax.swing.JTextArea txtlog;
    // End of variables declaration//GEN-END:variables
}
