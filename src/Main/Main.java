package Main;
import Classes.*;
import java.util.*;
import java.sql.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {
    static Player p = new Player("",0,0);
    static String log;
    static Queue<Person> leaderboards = new PriorityQueue();
    public Main() {
        initComponents();
        update();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mainscreen = new javax.swing.JPanel();
        statscreen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlog = new javax.swing.JTextArea();
        lbllog = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblen = new javax.swing.JLabel();
        lblhun = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        lblpr = new javax.swing.JLabel();
        lblstr = new javax.swing.JLabel();
        lblagi = new javax.swing.JLabel();
        lblint = new javax.swing.JLabel();
        lblenn = new javax.swing.JLabel();
        lblhunn = new javax.swing.JLabel();
        lblstrn = new javax.swing.JLabel();
        lblagin = new javax.swing.JLabel();
        lblintn = new javax.swing.JLabel();
        lblmoneyn = new javax.swing.JLabel();
        lblprn = new javax.swing.JLabel();
        lblwat = new javax.swing.JLabel();
        lblwatn = new javax.swing.JLabel();
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

        javax.swing.GroupLayout mainscreenLayout = new javax.swing.GroupLayout(mainscreen);
        mainscreen.setLayout(mainscreenLayout);
        mainscreenLayout.setHorizontalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        mainscreenLayout.setVerticalGroup(
            mainscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
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

        lblen.setForeground(new java.awt.Color(51, 51, 51));
        lblen.setText("Energy:");

        lblhun.setForeground(new java.awt.Color(51, 51, 51));
        lblhun.setText("Hunger:");

        lblmoney.setForeground(new java.awt.Color(51, 51, 51));
        lblmoney.setText("Money:");

        lblpr.setForeground(new java.awt.Color(51, 51, 51));
        lblpr.setText("Prestige:");

        lblstr.setForeground(new java.awt.Color(51, 51, 51));
        lblstr.setText("Strength:");

        lblagi.setForeground(new java.awt.Color(51, 51, 51));
        lblagi.setText("Agility:");

        lblint.setForeground(new java.awt.Color(51, 51, 51));
        lblint.setText("Intelligence:");

        lblenn.setForeground(new java.awt.Color(102, 102, 102));
        lblenn.setText("0000");
        lblenn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblhunn.setForeground(new java.awt.Color(102, 102, 102));
        lblhunn.setText("0000");
        lblhunn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblstrn.setForeground(new java.awt.Color(102, 102, 102));
        lblstrn.setText("000");
        lblstrn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblagin.setForeground(new java.awt.Color(102, 102, 102));
        lblagin.setText("000");
        lblagin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblintn.setForeground(new java.awt.Color(102, 102, 102));
        lblintn.setText("000");
        lblintn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblmoneyn.setForeground(new java.awt.Color(102, 102, 102));
        lblmoneyn.setText("$0000000");
        lblmoneyn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblprn.setForeground(new java.awt.Color(102, 102, 102));
        lblprn.setText("0000");
        lblprn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblwat.setForeground(new java.awt.Color(51, 51, 51));
        lblwat.setText("Water:");

        lblwatn.setForeground(new java.awt.Color(102, 102, 102));
        lblwatn.setText("0000");
        lblwatn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout statscreenLayout = new javax.swing.GroupLayout(statscreen);
        statscreen.setLayout(statscreenLayout);
        statscreenLayout.setHorizontalGroup(
            statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statscreenLayout.createSequentialGroup()
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblhun)
                            .addComponent(lblen)
                            .addComponent(lblwat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblenn)
                            .addComponent(lblhunn)
                            .addComponent(lblwatn)))
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblmoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmoneyn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statscreenLayout.createSequentialGroup()
                        .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblagi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblstr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblint, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblagin)
                            .addComponent(lblstrn)
                            .addComponent(lblintn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statscreenLayout.createSequentialGroup()
                        .addComponent(lblpr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblprn)))
                .addGap(31, 31, 31))
            .addGroup(statscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(statscreenLayout.createSequentialGroup()
                        .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbllog)
                            .addComponent(lblname))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        statscreenLayout.setVerticalGroup(
            statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statscreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblen)
                    .addComponent(lblstr)
                    .addComponent(lblenn)
                    .addComponent(lblstrn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhun)
                    .addComponent(lblagi)
                    .addComponent(lblhunn)
                    .addComponent(lblagin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblint)
                    .addComponent(lblintn)
                    .addComponent(lblwat)
                    .addComponent(lblwatn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(statscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpr)
                    .addComponent(lblmoney)
                    .addComponent(lblmoneyn)
                    .addComponent(lblprn))
                .addGap(18, 18, 18)
                .addComponent(lbllog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    public void update() {
        lblenn.setText(p.getEn() + "/" + p.getEnmax());
        lblhunn.setText(p.getHn() + "/" + p.getHnmax());
        lblwatn.setText(p.getWa() + "/" + p.getWamax());
        lblmoneyn.setText("$" + p.getMon());
        lblprn.setText(""+p.getPr());
        lblstrn.setText(""+p.getStr());
        lblagin.setText(""+p.getAgi());
        lblintn.setText(""+p.getInte());
    }
    
    public void fillData(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblagi;
    private javax.swing.JLabel lblagin;
    private javax.swing.JLabel lblen;
    private javax.swing.JLabel lblenn;
    private javax.swing.JLabel lblhun;
    private javax.swing.JLabel lblhunn;
    private javax.swing.JLabel lblint;
    private javax.swing.JLabel lblintn;
    private javax.swing.JLabel lbllog;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lblmoneyn;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpr;
    private javax.swing.JLabel lblprn;
    private javax.swing.JLabel lblstr;
    private javax.swing.JLabel lblstrn;
    private javax.swing.JLabel lblwat;
    private javax.swing.JLabel lblwatn;
    private javax.swing.JPanel mainscreen;
    private javax.swing.JMenu mnuprog;
    private javax.swing.JPanel statscreen;
    private javax.swing.JTextArea txtlog;
    // End of variables declaration//GEN-END:variables
}
