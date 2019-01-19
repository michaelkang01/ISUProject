//To Do
/*
    Events
    Examine Individiual Assets in Detail
    Multiple Ways to Apply filter to asset lists
    Rework Stocks, and make it so you buy a %share every time
 */
package Main;

import Classes.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

public final class Main extends javax.swing.JFrame {

    //The Player Class
    public Person p;
    //The Log will be used to display information to the player
    public String log = "";
    //The Leaderboards are just some random values to compare to
    public ArrayList<Person> leaderboards = new ArrayList();
    //Array list of Assets will be sorted by Alphabetical
    public ArrayList<Assets> AssetsList = new ArrayList();
    //These two lists are used to display the available/owned Assets 
    public DefaultListModel avAssets = new DefaultListModel();
    public DefaultListModel owAssets = new DefaultListModel();
    //Number format for money, because we are dealing with alot of money
    public NumberFormat nf = NumberFormat.getCurrencyInstance();
    //The day counter will tick up at every update
    public int day = 0;
    //Value used to store the value of the player's assets in the previous day, used for total gains calculation
    public double prevVal = 0;

    public Main() {
        //They made me use this, cause it makes everything
        initComponents();
        //Creats the Player Character
        p = new Person(JOptionPane.showInputDialog("Enter your name: "), 0, 1000);
        //Will set day to 1
        day++;
        //Gets the Format for the LOG Ready
        log += "\n=======================";
        log += "\nDay " + day;
        log += "\n=======================";
        //Initializes the program
        loadBoardData();
        updateLeaderboard();
        assetData();
        sort();
        updateAssets();
        updateStats();
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
        lbllog = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        lblpr = new javax.swing.JLabel();
        lblmoneyn = new javax.swing.JLabel();
        lblprn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlog = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuprog = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnusort = new javax.swing.JMenu();
        mnuCode = new javax.swing.JMenuItem();
        mnuName = new javax.swing.JMenuItem();
        mnuType = new javax.swing.JMenuItem();
        mnuVal = new javax.swing.JMenuItem();
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

        jScrollPane3.setPreferredSize(new java.awt.Dimension(0, 0));

        lstav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstav.setDragEnabled(true);
        lstav.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        lstav.setMinimumSize(new java.awt.Dimension(0, 16));
        lstav.setName(""); // NOI18N
        jScrollPane3.setViewportView(lstav);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(0, 0));

        lstown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstown.setDragEnabled(true);
        lstown.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        lstown.setMinimumSize(new java.awt.Dimension(0, 16));
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
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainscreenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainscreenLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnpur, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainscreenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(mainscreenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnext)
                        .addGap(287, 287, 287))))
        );
        mainscreenLayout.setVerticalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainscreenLayout.createSequentialGroup()
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainscreenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnnext))
                            .addGroup(mainscreenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsel)
                                    .addComponent(btnpur))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        statscreen.setBackground(new java.awt.Color(153, 153, 153));
        statscreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        statscreen.setForeground(new java.awt.Color(153, 153, 153));

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

        jScrollPane1.setAutoscrolls(true);

        txtlog.setEditable(false);
        txtlog.setColumns(20);
        txtlog.setRows(5);
        txtlog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlog.setFocusable(false);
        jScrollPane1.setViewportView(txtlog);

        javax.swing.GroupLayout statscreenLayout = new javax.swing.GroupLayout(statscreen);
        statscreen.setLayout(statscreenLayout);
        statscreenLayout.setHorizontalGroup(
            statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statscreenLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblmoney)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblmoneyn)
                                .addGap(18, 18, 18)
                                .addComponent(lblpr)
                                .addGap(18, 18, 18)
                                .addComponent(lblprn))
                            .addComponent(lblname)
                            .addComponent(lbllog))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        mnusort.setText("Sort By...");

        mnuCode.setText("Default (Code)");
        mnuCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCodeActionPerformed(evt);
            }
        });
        mnusort.add(mnuCode);

        mnuName.setText("Name");
        mnuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNameActionPerformed(evt);
            }
        });
        mnusort.add(mnuName);

        mnuType.setText("Type");
        mnuType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTypeActionPerformed(evt);
            }
        });
        mnusort.add(mnuType);

        mnuVal.setText("Value");
        mnuVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuValActionPerformed(evt);
            }
        });
        mnusort.add(mnuVal);

        jMenuBar1.add(mnusort);

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
        //Gets the index of what Asset is selected in the list
        int index = lstav.getSelectedIndex();
        //Abuses the Boolean addAsset() command, that checks the value of the Asset vs. The Available Funds
        if (p.addAsset(AssetsList.get(index))) {
            //If True, send a simple notice through the log of what was purchased by the player
            log += "\n" + p.getName() + " has purchased - " + AssetsList.get(index).getName() + " || " + AssetsList.get(index).getCode();
            //If it isnt a commodity, delete it from available assets and remove from the market, because there can only be 1 of each
            if (!AssetsList.get(index).getType().equals("COMMODITY")) {
                AssetsList.remove(index);
                Assets.markettotal--;
            } //if it is a commodity, add a count to the number of specific commodies owned
            else {
                if (AssetsList.get(index).getCode().equals("GLD")) {
                    Commodity.gldcount++;
                }
                if (AssetsList.get(index).getCode().equals("SIL")) {
                    Commodity.silcount++;
                }
                if (AssetsList.get(index).getCode().equals("OIL")) {
                    Commodity.oilcount++;
                }
                if (AssetsList.get(index).getCode().equals("NRG")) {
                    Commodity.nrgcount++;
                }
                if (AssetsList.get(index).getCode().equals("PRD")) {
                    Commodity.prdcount++;
                }
            }
            //Since the player purchased the Asset, add one to the player owned number
            Assets.playertotal++;
            //Updates the two lists to make sure they are still sorted by alphabetically by Code
            sort();
            //Updates the displays
            updateStats();
            updateAssets();
        } else {
            //This code is run if the original addAsset call returned false, which means the player did not have the money
            JOptionPane.showMessageDialog(this, "Error - Not Enough Money");
        }

    }//GEN-LAST:event_btnpurActionPerformed

    private void btnselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselActionPerformed
        //Gets the Asset that is selected on the sales list
        int index = lstown.getSelectedIndex();
        //Sends a simple update through the log to document what the palyer sold
        log += "\n" + p.getName() + " has sold - " + p.ase.get(index).getName() + " || " + p.ase.get(index).getCode() + " || " + nf.format(p.ase.get(index).getValue());
        //Add to list of available stocks, unless its a commodity (already there)
        if (!p.ase.get(index).getType().equals("COMMODITY")) {
            //If it is a bond, remake the bond, BUT using the original value rather than the new value
            if (p.ase.get(index).getType().equals("BOND")) {
                Bond temp = new Bond((Bond) p.ase.get(index));
                AssetsList.add(new Bond(temp.getOg(), temp));
            } else {
                AssetsList.add(p.ase.get(index));
                //Since it was not a commodity, add the number of Assets back into the market
                Assets.markettotal++;
            }
        } //If you did sell a commodity, get rid of one from the count
        else {
            if (p.ase.get(index).getCode().equals("GLD")) {
                Commodity.gldcount--;
            }
            if (p.ase.get(index).getCode().equals("SIL")) {
                Commodity.silcount--;
            }
            if (p.ase.get(index).getCode().equals("OIL")) {
                Commodity.oilcount--;
            }
            if (p.ase.get(index).getCode().equals("NRG")) {
                Commodity.nrgcount--;
            }
            if (p.ase.get(index).getCode().equals("PRD")) {
                Commodity.prdcount--;
            }
        }
        //Runs the method in the player class to sell an asset
        p.sellAsset(index);
        //Updates displays
        updateStats();
        updateAssets();
    }//GEN-LAST:event_btnselActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        //This is the update, add one to days and get the display ready for a new day
        day++;
        log += "\n=======================";
        log += "\nDay " + day;
        log += "\n=======================";
        //Sets up the prevVal and totalVal values to prepare for calculation
        prevVal = Assets.getTVal();
        Assets.resetTVal();
        //Runs through the Assets unowned and updates their values
        for (int j = 0; j < AssetsList.size(); j++) {
            //Luxuries and bonds do not update in value, but every other type will get updated
            if (!AssetsList.get(j).getType().equals("LUXURY") && !AssetsList.get(j).getType().equals("BOND")) {
                AssetsList.get(j).updateVal();
            }
            //The bank will also add funds to the Asset if it was unowned
            if (AssetsList.get(j).getValue() <= 0) {
                log += "\nThe market for " + AssetsList.get(j).getName() + " has crashed!\n Value has been jumpstarted!";
                AssetsList.get(j).jumpStart();
            }
        }

        //Runs through list of owned assets and updates their values
        for (int i = 0; i < p.ase.size(); i++) {

            //Checks to see if the Asset is a commdity, If a commodity is found, set the price of the commodity in the player's assets equal to the price in the market
            if (p.ase.get(i).getType().equals("COMMODITY")) {
                if (p.ase.get(i).getCode().equals("GLD")) {
                    p.ase.get(i).setValue(AssetsList.get(search("GLD")).getValue());
                    //Updates the total value according to the market value of the commodity * the amount of that commodity owned
                    Assets.totalVal += p.ase.get(i).getValue() * Commodity.gldcount;
                }
                if (p.ase.get(i).getCode().equals("SIL")) {
                    p.ase.get(i).setValue(AssetsList.get(search("SIL")).getValue());
                    Assets.totalVal += p.ase.get(i).getValue() * Commodity.silcount;
                }
                if (p.ase.get(i).getCode().equals("OIL")) {
                    p.ase.get(i).setValue(AssetsList.get(search("OIL")).getValue());
                    Assets.totalVal += p.ase.get(i).getValue() * Commodity.oilcount;
                }
                if (p.ase.get(i).getCode().equals("NRG")) {
                    p.ase.get(i).setValue(AssetsList.get(search("NRG")).getValue());
                    Assets.totalVal += p.ase.get(i).getValue() * Commodity.nrgcount;
                }
                if (p.ase.get(i).getCode().equals("PRD")) {
                    p.ase.get(i).setValue(AssetsList.get(search("PRD")).getValue());
                    Assets.totalVal += p.ase.get(i).getValue() * Commodity.prdcount;
                }
            } else {
                //If it is a stock, total the dividends of the Stocks BEFORE updating value
                if (p.ase.get(i).getType().equals("STOCK")) {
                    p.dividends += ((Stock) p.ase.get(i)).getDividend();
                }
                //Updates value
                p.ase.get(i).updateVal();
                //Updates the new TotalValue with the updated value
                Assets.totalVal += p.ase.get(i).getValue();
                //If the value of the value of the Asset gets to $1 or lower, the bank funds the Asset (bonus for Stocks)
                if (p.ase.get(i).getValue() <= 1) {
                    log += "\nThe market for " + p.ase.get(i).getName() + " has crashed!\n Value has been jumpstarted!";
                    p.ase.get(i).jumpStart();
                }
            }
        }
        //Inform the player of the amount they earned from Stock dividends
        log += "\n" + nf.format(p.dividends) + " earned from Stock dividends";
        //Actually pay the player
        p.getPayout();
        //Reset the dividends
        p.dividends = 0;
        //Inform the player of the amount of assets they own/don't own and the amount of commodities they own
        log += "\nOwned Commodities:";
        log += "\n" + Commodity.gldcount + " GLD || " + Commodity.silcount + " SIL || " + Commodity.oilcount + " OIL || " + Commodity.nrgcount + " NRG || " + Commodity.prdcount + " PRD ";
        log += "\n" + "Player Assets: " + Assets.getOwnedtotal() + " || Market Assets: " + Assets.getTotal();
        //Informs the player of total gains/losses of the day
        log += "\n" + "Net Change of Assets : " + nf.format(Assets.getTVal() - prevVal);
        //Update displays
        updateAssets();
        updateStats();
    }//GEN-LAST:event_btnnextActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //If you click Exit, then exit
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Help Assets -> will display the differences in the children classes of Assets
        JOptionPane.showMessageDialog(this, "Stock\n=====\n Stocks are assets that have a moderate variance in gains/losses, they pay out a dividend to the owner every close");
        JOptionPane.showMessageDialog(this, "Bonds\n=====\n Bonds are assets that have a consistant growth, albeit low, and only grows when purchased, DO NOT BUILD COMPOUND INTEREST");
        JOptionPane.showMessageDialog(this, "Commodities\n=====\n Commodities are assets that have a large variance in gains/losses, and multiple may be purchased");
        JOptionPane.showMessageDialog(this, "Luxuries\n=====\n Luxuries are assets that only depreciate in value(other than mansion), but act as victory cards to build prestige");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCodeActionPerformed
        Assets.setSort(0);
        sort();
        updateAssets();
        updateStats();
    }//GEN-LAST:event_mnuCodeActionPerformed

    private void mnuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNameActionPerformed
        Assets.setSort(1);
        sort();
        updateAssets();
        updateStats();
    }//GEN-LAST:event_mnuNameActionPerformed

    private void mnuTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTypeActionPerformed
        Assets.setSort(2);
        sort();
        updateAssets();
        updateStats();
    }//GEN-LAST:event_mnuTypeActionPerformed

    private void mnuValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuValActionPerformed
        Assets.setSort(3);
        sort();
        updateAssets();
        updateStats();
    }//GEN-LAST:event_mnuValActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //Update the stats display and the log
    public void updateStats() {
        lblmoneyn.setText("" + nf.format(p.getMon()));
        lblprn.setText("" + p.getPr());
        txtlog.setText(log);
    }

    //Updates the leaderboard display
    public void updateLeaderboard() {
        String tle = "";
        for (int x = 0; x < leaderboards.size(); x++) {
            tle += x + 1 + ". " + leaderboards.get(x) + "\n";
            tle += "\n";
        }
        txtlea.setText(tle);
    }

    //Sets up the leaderboards
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

    //This method loads up the set of Assets available to the player
    public void assetData() {
        AssetsList.add(new Stock(100, "Joe's Lemonade", "JLM", 0.92, 1.10, 10));
        AssetsList.add(new Stock(1000, "Hot N' Spicy Burgers", "HSB", 0.94, 1.10, 10));
        AssetsList.add(new Stock(3500, "Big Gas Garage", "BGG", 0.94, 1.16, 10));
        AssetsList.add(new Stock(7500, "BigBrain Computers", "BCO", 0.98, 1.07, 10));
        AssetsList.add(new Stock(11000, "Green and Blue Foods", "GBF", 0.98, 1.08, 10));
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

    //Updates the display for the lsit of assets
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

    //Sorts the arrayLists so that they are in alphabetical order according to their Unique Code
    public void sort() {
        Collections.sort(AssetsList);
        Collections.sort(p.ase);
    }

    //Performs a linear search and Searches for location of an asset according to Code, used for keeping the price of commodities constant between player and market
    public int search(String c) {
        int index = -1;
        for (int i = 0; i < AssetsList.size(); i++) {
            index++;
            if (AssetsList.get(i).getCode().equals(c)) {
                return index;
            }
        }
        //returns -1 if it does not find anything
        return index;
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
    private javax.swing.JMenuItem mnuCode;
    private javax.swing.JMenuItem mnuName;
    private javax.swing.JMenuItem mnuType;
    private javax.swing.JMenuItem mnuVal;
    private javax.swing.JMenu mnuhelp;
    private javax.swing.JMenu mnuprog;
    private javax.swing.JMenu mnusort;
    private javax.swing.JPanel statscreen;
    private javax.swing.JTextArea txtlea;
    private javax.swing.JTextArea txtlog;
    // End of variables declaration//GEN-END:variables
}
