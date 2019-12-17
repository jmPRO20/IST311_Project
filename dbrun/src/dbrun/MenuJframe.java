/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbrun;

import java.sql.*; 
import net.proteanit.sql.DbUtils;
        
public class MenuJframe extends javax.swing.JFrame {


    
    public Connection connectDatabase(){
        // SQLite connection string  
        String url = "jdbc:sqlite:updatemenu.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn; 
    
}
    
    public void datashow(){
        
         String sql = "SELECT * FROM Menu";  
          
        try {  
            Connection conn = this.connectDatabase();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql); 
            //Displays Database info in the created table
            menuData.setModel(DbUtils.resultSetToTableModel(rs)); 
            // loop through the result set to display everything
            // Reads in data from table and assigns it to variables
            while (rs.next()) {  
                System.out.println(rs.getInt("ItemNum") +  "\t" +   
                                   rs.getString("ItemName") + "\t" +  
                                   rs.getDouble("Price") + "\t" +
                                   rs.getString("Size")
               );  
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        
        
    }
    
    
    
    /**
     * Creates new form MenuJframe
     */
    public MenuJframe() {
        initComponents();
        connectDatabase(); 
        datashow(); 
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuData = new javax.swing.JTable();
        item1 = new javax.swing.JButton();
        item2 = new javax.swing.JButton();
        item3 = new javax.swing.JButton();
        item4 = new javax.swing.JButton();
        item5 = new javax.swing.JButton();
        item6 = new javax.swing.JButton();
        item7 = new javax.swing.JButton();
        item8 = new javax.swing.JButton();
        item9 = new javax.swing.JButton();
        item10 = new javax.swing.JButton();
        item11 = new javax.swing.JButton();
        item101 = new javax.swing.JButton();
        item102 = new javax.swing.JButton();
        item103 = new javax.swing.JButton();
        item201 = new javax.swing.JButton();
        item104 = new javax.swing.JButton();
        item202 = new javax.swing.JButton();
        item203 = new javax.swing.JButton();
        item204 = new javax.swing.JButton();
        item205 = new javax.swing.JButton();
        item206 = new javax.swing.JButton();
        item207 = new javax.swing.JButton();
        item208 = new javax.swing.JButton();
        item209 = new javax.swing.JButton();
        item210 = new javax.swing.JButton();
        item303 = new javax.swing.JButton();
        item301 = new javax.swing.JButton();
        item211 = new javax.swing.JButton();
        item304 = new javax.swing.JButton();
        item401 = new javax.swing.JButton();
        item302 = new javax.swing.JButton();
        item402 = new javax.swing.JButton();
        item405 = new javax.swing.JButton();
        item404 = new javax.swing.JButton();
        item403 = new javax.swing.JButton();
        item406 = new javax.swing.JButton();
        item407 = new javax.swing.JButton();
        item408 = new javax.swing.JButton();
        item409 = new javax.swing.JButton();
        item410 = new javax.swing.JButton();
        item411 = new javax.swing.JButton();
        item501 = new javax.swing.JButton();
        item502 = new javax.swing.JButton();
        item503 = new javax.swing.JButton();
        item504 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        addfundsButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ItemNum", "ItemName", "Price", "Size"
            }
        ));
        jScrollPane1.setViewportView(menuData);

        item1.setText("1");
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });

        item2.setText("2");
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });

        item3.setText("3");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });

        item4.setText("4");
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });

        item5.setText("5");
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });

        item6.setText("6");
        item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6ActionPerformed(evt);
            }
        });

        item7.setText("7");
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });

        item8.setText("8");
        item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ActionPerformed(evt);
            }
        });

        item9.setText("9");
        item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ActionPerformed(evt);
            }
        });

        item10.setText("10");
        item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ActionPerformed(evt);
            }
        });

        item11.setText("11");
        item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11ActionPerformed(evt);
            }
        });

        item101.setText("101");
        item101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item101ActionPerformed(evt);
            }
        });

        item102.setText("102");
        item102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item102ActionPerformed(evt);
            }
        });

        item103.setText("103");
        item103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item103ActionPerformed(evt);
            }
        });

        item201.setText("201");
        item201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item201ActionPerformed(evt);
            }
        });

        item104.setText("104");
        item104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item104ActionPerformed(evt);
            }
        });

        item202.setText("202");
        item202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item202ActionPerformed(evt);
            }
        });

        item203.setText("203");
        item203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item203ActionPerformed(evt);
            }
        });

        item204.setText("204");
        item204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item204ActionPerformed(evt);
            }
        });

        item205.setText("205");
        item205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item205ActionPerformed(evt);
            }
        });

        item206.setText("206");
        item206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item206ActionPerformed(evt);
            }
        });

        item207.setText("207");
        item207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item207ActionPerformed(evt);
            }
        });

        item208.setText("208");
        item208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item208ActionPerformed(evt);
            }
        });

        item209.setText("209");
        item209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item209ActionPerformed(evt);
            }
        });

        item210.setText("210");
        item210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item210ActionPerformed(evt);
            }
        });

        item303.setText("303");
        item303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item303ActionPerformed(evt);
            }
        });

        item301.setText("301");
        item301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item301ActionPerformed(evt);
            }
        });

        item211.setText("211");
        item211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item211ActionPerformed(evt);
            }
        });

        item304.setText("304");
        item304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item304ActionPerformed(evt);
            }
        });

        item401.setText("401");
        item401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item401ActionPerformed(evt);
            }
        });

        item302.setText("302");
        item302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item302ActionPerformed(evt);
            }
        });

        item402.setText("402");
        item402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item402ActionPerformed(evt);
            }
        });

        item405.setText("405");
        item405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item405ActionPerformed(evt);
            }
        });

        item404.setText("404");
        item404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item404ActionPerformed(evt);
            }
        });

        item403.setText("403");
        item403.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item403ActionPerformed(evt);
            }
        });

        item406.setText("406");
        item406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item406ActionPerformed(evt);
            }
        });

        item407.setText("407");
        item407.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item407ActionPerformed(evt);
            }
        });

        item408.setText("408");
        item408.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item408ActionPerformed(evt);
            }
        });

        item409.setText("409");
        item409.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item409ActionPerformed(evt);
            }
        });

        item410.setText("410");
        item410.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item410ActionPerformed(evt);
            }
        });

        item411.setText("411");
        item411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item411ActionPerformed(evt);
            }
        });

        item501.setText("501");
        item501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item501ActionPerformed(evt);
            }
        });

        item502.setText("502");
        item502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item502ActionPerformed(evt);
            }
        });

        item503.setText("503");
        item503.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item503ActionPerformed(evt);
            }
        });

        item504.setText("504");
        item504.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item504ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("Order");

        addfundsButton.setText("Add funds");

        checkoutButton.setText("Checkout");

        removeButton.setText("Remove Item");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(item204)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(item7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(item404))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(item9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(item406)
                                        .addComponent(item408)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(item407)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(112, 112, 112)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item405))
                            .addComponent(item10)
                            .addComponent(item11)
                            .addComponent(item205)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item403))
                            .addComponent(item208)
                            .addComponent(item209)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item303))
                            .addComponent(item210)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(item4)
                                    .addComponent(item3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item304)
                                    .addComponent(item401)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(item302))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item402))))
                            .addComponent(item1)
                            .addComponent(item206)
                            .addComponent(item207)
                            .addComponent(item211)
                            .addComponent(item301)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item201)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item502))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item202)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item503))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item203)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item504))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item104)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item501))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item102)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item410))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item103)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item411))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(item101)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(item409)))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkoutButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addfundsButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(removeButton)
                                        .addGap(12, 12, 12))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item1)
                    .addComponent(item302))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item2)
                    .addComponent(item303))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item3)
                    .addComponent(item304))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item4)
                    .addComponent(item401))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item5)
                    .addComponent(item402))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item6)
                    .addComponent(item403))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item7)
                    .addComponent(item404))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item8)
                    .addComponent(item405))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item9)
                    .addComponent(item406))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item10)
                    .addComponent(item407)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item11)
                            .addComponent(item408))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item101, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item409))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item102)
                            .addComponent(item410))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item103)
                            .addComponent(item411))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item104)
                            .addComponent(item501))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item201)
                            .addComponent(item502))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item202)
                            .addComponent(item503))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item203)
                            .addComponent(item504))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item204)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item205)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item206)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item207)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item208, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item209)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item210)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item211)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item301))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkoutButton)
                            .addComponent(removeButton)
                            .addComponent(addfundsButton))))
                .addGap(0, 27, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item1ActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item3ActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item4ActionPerformed

    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item5ActionPerformed

    private void item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item6ActionPerformed

    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item7ActionPerformed

    private void item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item8ActionPerformed

    private void item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item9ActionPerformed

    private void item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item10ActionPerformed

    private void item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item11ActionPerformed

    private void item101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item101ActionPerformed

    private void item102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item102ActionPerformed

    private void item103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item103ActionPerformed

    private void item201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item201ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item201ActionPerformed

    private void item104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item104ActionPerformed

    private void item202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item202ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item202ActionPerformed

    private void item203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item203ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item203ActionPerformed

    private void item204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item204ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item204ActionPerformed

    private void item205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item205ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item205ActionPerformed

    private void item206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item206ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item206ActionPerformed

    private void item207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item207ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item207ActionPerformed

    private void item208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item208ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item208ActionPerformed

    private void item209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item209ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item209ActionPerformed

    private void item210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item210ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item210ActionPerformed

    private void item303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item303ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item303ActionPerformed

    private void item301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item301ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item301ActionPerformed

    private void item211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item211ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item211ActionPerformed

    private void item304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item304ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item304ActionPerformed

    private void item401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item401ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item401ActionPerformed

    private void item302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item302ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item302ActionPerformed

    private void item402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item402ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item402ActionPerformed

    private void item405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item405ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item405ActionPerformed

    private void item404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item404ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item404ActionPerformed

    private void item403ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item403ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item403ActionPerformed

    private void item406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item406ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item406ActionPerformed

    private void item407ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item407ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item407ActionPerformed

    private void item408ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item408ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item408ActionPerformed

    private void item409ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item409ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item409ActionPerformed

    private void item410ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item410ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item410ActionPerformed

    private void item411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item411ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item411ActionPerformed

    private void item501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item501ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item501ActionPerformed

    private void item502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item502ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item502ActionPerformed

    private void item503ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item503ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item503ActionPerformed

    private void item504ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item504ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item504ActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addfundsButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton item1;
    private javax.swing.JButton item10;
    private javax.swing.JButton item101;
    private javax.swing.JButton item102;
    private javax.swing.JButton item103;
    private javax.swing.JButton item104;
    private javax.swing.JButton item11;
    private javax.swing.JButton item2;
    private javax.swing.JButton item201;
    private javax.swing.JButton item202;
    private javax.swing.JButton item203;
    private javax.swing.JButton item204;
    private javax.swing.JButton item205;
    private javax.swing.JButton item206;
    private javax.swing.JButton item207;
    private javax.swing.JButton item208;
    private javax.swing.JButton item209;
    private javax.swing.JButton item210;
    private javax.swing.JButton item211;
    private javax.swing.JButton item3;
    private javax.swing.JButton item301;
    private javax.swing.JButton item302;
    private javax.swing.JButton item303;
    private javax.swing.JButton item304;
    private javax.swing.JButton item4;
    private javax.swing.JButton item401;
    private javax.swing.JButton item402;
    private javax.swing.JButton item403;
    private javax.swing.JButton item404;
    private javax.swing.JButton item405;
    private javax.swing.JButton item406;
    private javax.swing.JButton item407;
    private javax.swing.JButton item408;
    private javax.swing.JButton item409;
    private javax.swing.JButton item410;
    private javax.swing.JButton item411;
    private javax.swing.JButton item5;
    private javax.swing.JButton item501;
    private javax.swing.JButton item502;
    private javax.swing.JButton item503;
    private javax.swing.JButton item504;
    private javax.swing.JButton item6;
    private javax.swing.JButton item7;
    private javax.swing.JButton item8;
    private javax.swing.JButton item9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable menuData;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
