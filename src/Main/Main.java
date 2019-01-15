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
    public Main() {
        initComponents();
        p = new Person(JOptionPane.showInputDialog("Enter your name: "), 0, 1000);
        loadBoardData();
        updateLeaderboard();
        updateStats();
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
        txtlea.setFocusable(false);
        txtlea.setPreferredSize(new java.awt.Dimension(100, 80));
        txtlea.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtlea);

        javax.swing.GroupLayout mainscreenLayout = new javax.swing.GroupLayout(mainscreen);
        mainscreen.setLayout(mainscreenLayout);
        mainscreenLayout.setHorizontalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );
        mainscreenLayout.setVerticalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statscreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void updateStats() {
        lblmoneyn.setText("$" + p.getMon());
        lblprn.setText(""+p.getPr());
    }
    
    public void updateLeaderboard() {
        String tle = "";
        for (int x = 0; x < leaderboards.size(); x++) {
            tle += x+1 + ". " + leaderboards.get(x) + "\n";
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
            while(true) {
                name= br.readLine();
                if(name==null) break;
                money = Integer.parseInt(br.readLine());
                prestige = Integer.parseInt(br.readLine());
                temp = new Person(name, prestige,money);
                leaderboards.add(temp);
            }
            br.close();
        }
        catch (Exception e) {}
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbllog;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lblmoneyn;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpr;
    private javax.swing.JLabel lblprn;
    private javax.swing.JPanel mainscreen;
    private javax.swing.JMenu mnuprog;
    private javax.swing.JPanel statscreen;
    private javax.swing.JTextArea txtlea;
    private javax.swing.JTextArea txtlog;
    // End of variables declaration//GEN-END:variables
}
