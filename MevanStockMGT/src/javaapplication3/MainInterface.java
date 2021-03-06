/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.eclipse.persistence.internal.xr.Util;

/**
 *
 * @author Induwara Jayalath
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        showpanel("card2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mevanstock?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        peopleQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM People p");
        peopleList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : peopleQuery.getResultList();
        ordertempQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT o FROM Ordertemp o");
        ordertempList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ordertempQuery.getResultList();
        peopleQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM People p");
        peopleList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : peopleQuery1.getResultList();
        itemsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT i FROM Items i");
        itemsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : itemsQuery.getResultList();
        peopleQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM People p");
        peopleList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : peopleQuery2.getResultList();
        MainMenu_panel = new javax.swing.JPanel();
        Get_button = new javax.swing.JButton();
        Put_button = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Menu_Panel = new javax.swing.JPanel();
        get = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        itemId_textbox = new javax.swing.JTextField();
        itemQuantity_textbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Submit_button_get = new javax.swing.JButton();
        put = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        MyStock = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Check_ppl = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Welcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        MainMenu_panel.setBackground(new java.awt.Color(204, 204, 255));

        Get_button.setText("Get");
        Get_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_buttonActionPerformed(evt);
            }
        });

        Put_button.setText("Put");
        Put_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Put_buttonActionPerformed(evt);
            }
        });

        jButton3.setText("My Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Check People");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 51, 51));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Admin Panel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenu_panelLayout = new javax.swing.GroupLayout(MainMenu_panel);
        MainMenu_panel.setLayout(MainMenu_panelLayout);
        MainMenu_panelLayout.setHorizontalGroup(
            MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenu_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Get_button)
                .addGap(31, 31, 31)
                .addComponent(Put_button)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addGap(39, 39, 39)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(MainMenu_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitButton))
        );
        MainMenu_panelLayout.setVerticalGroup(
            MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenu_panelLayout.createSequentialGroup()
                .addComponent(ExitButton)
                .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenu_panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Get_button)
                            .addComponent(Put_button)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(MainMenu_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(MainMenu_panel, java.awt.BorderLayout.PAGE_START);

        Menu_Panel.setLayout(new java.awt.CardLayout());

        get.setBackground(new java.awt.Color(153, 255, 153));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, peopleList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        itemId_textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemId_textboxActionPerformed(evt);
            }
        });

        itemQuantity_textbox.setText("1");
        itemQuantity_textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuantity_textboxActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ordertempList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemId}"));
        columnBinding.setColumnName("Item Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemName}"));
        columnBinding.setColumnName("Item Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${itemQuantity}"));
        columnBinding.setColumnName("Item Quantity");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        Submit_button_get.setText("Submit");
        Submit_button_get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_button_getActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getLayout = new javax.swing.GroupLayout(get);
        get.setLayout(getLayout);
        getLayout.setHorizontalGroup(
            getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(getLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Submit_button_get))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(getLayout.createSequentialGroup()
                        .addComponent(itemId_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itemQuantity_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        getLayout.setVerticalGroup(
            getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemId_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemQuantity_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit_button_get))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Menu_Panel.add(get, "card3");

        put.setBackground(new java.awt.Color(255, 255, 204));

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, peopleList1, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);

        jToggleButton1.setText("Enter");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText("1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout putLayout = new javax.swing.GroupLayout(put);
        put.setLayout(putLayout);
        putLayout.setHorizontalGroup(
            putLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(putLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(putLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(putLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, putLayout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        putLayout.setVerticalGroup(
            putLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(putLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(putLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jToggleButton1)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        Menu_Panel.add(put, "card4");

        MyStock.setBackground(new java.awt.Color(153, 255, 153));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout MyStockLayout = new javax.swing.GroupLayout(MyStock);
        MyStock.setLayout(MyStockLayout);
        MyStockLayout.setHorizontalGroup(
            MyStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyStockLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        MyStockLayout.setVerticalGroup(
            MyStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyStockLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Panel.add(MyStock, "card5");

        Check_ppl.setBackground(new java.awt.Color(255, 204, 204));

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, peopleList2, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout Check_pplLayout = new javax.swing.GroupLayout(Check_ppl);
        Check_ppl.setLayout(Check_pplLayout);
        Check_pplLayout.setHorizontalGroup(
            Check_pplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_pplLayout.createSequentialGroup()
                .addGroup(Check_pplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Check_pplLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Check_pplLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Check_pplLayout.setVerticalGroup(
            Check_pplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_pplLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Panel.add(Check_ppl, "card6");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Induwara Jayalath\\Documents\\MevanStock\\54541.jpg")); // NOI18N

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomeLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Menu_Panel.add(Welcome, "card2");

        getContentPane().add(Menu_Panel, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Put_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Put_buttonActionPerformed
        showpanel("card4");        // TODO add your handling code here:
    }//GEN-LAST:event_Put_buttonActionPerformed

    private void Get_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_buttonActionPerformed
        showpanel("card3");
        itemId_textbox.requestFocus();
        try {
            String cquery = "TRUNCATE TABLE ordertemp";
            Statement cstatmnt = dataBaseConnection.dataBaseConnectionMethod().createStatement();
            cstatmnt.executeUpdate(cquery);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_Get_buttonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void itemId_textboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemId_textboxActionPerformed
        itemQuantity_textbox.requestFocus();
        itemQuantity_textbox.setText("1");
        itemQuantity_textbox.selectAll();        // TODO add your handling code here:
    }//GEN-LAST:event_itemId_textboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        try {
            int itemIDThis = Integer.parseInt(itemId_textbox.getText());
            int itemQuantityThis = Integer.parseInt(itemQuantity_textbox.getText());
            Connection con = dataBaseConnection.dataBaseConnectionMethod();
            PreparedStatement statement = con.prepareStatement("SELECT itemQuantity from items WHERE  itemID =" + itemIDThis);
            ResultSet rs;
            rs = statement.executeQuery();

            if (!rs.isBeforeFirst()) {
                System.out.println("No data");
                JOptionPane.showMessageDialog(this, "No such item");
            }

            while (rs.next()) {
                int x = rs.getInt(1);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
                if (x > itemQuantityThis) {
                    String query = " insert into orderTemp(`itemId`,`itemName`,`itemQuantity`) "
                            + "values (?, (select itemName from items where itemID = ?), ?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setInt(1, itemIDThis);
                    preparedStmt.setInt(2, itemIDThis);
                    preparedStmt.setInt(3, itemQuantityThis);
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
                    preparedStmt.execute();
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

                    itemId_textbox.setText(null);
                    itemQuantity_textbox.setText("1");
                } else {
                    JOptionPane.showMessageDialog(this, "Quantity not sufficiant");
                }
            }

//            if (!rs.next()) {
//                JOptionPane.showMessageDialog(this, "No such item");
//            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemQuantity_textboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuantity_textboxActionPerformed

        jButton1ActionPerformed(evt);
        clear_Fields();
        itemId_textbox.requestFocus();
    }//GEN-LAST:event_itemQuantity_textboxActionPerformed

    private void Submit_button_getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_button_getActionPerformed
        String updateQuery = "update items set quantity = ? where item id = ? ";
        try {
            Connection con = dataBaseConnection.dataBaseConnectionMethod();
            PreparedStatement statement = con.prepareStatement("SELECT * from ordertemp;");
            ResultSet rs;
            rs = statement.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No items to deduct");
            }

            while (rs.next()) {
                try {

                    PreparedStatement statement2 = con.prepareStatement("select quantity from items where itemid=" + rs.getInt(1));
                    ResultSet rs2;
                    rs2 = statement2.executeQuery();
                    while (rs2.next()) {
                        int quantityFromItems = rs2.getInt(3);
                        int quantityFromOrderTemp = rs.getInt(3);
                        int quantityCalculated = quantityFromItems - quantityFromOrderTemp;

                        PreparedStatement stmt = dataBaseConnection.dataBaseConnectionMethod().prepareStatement(updateQuery);
                        stmt.setInt(1, quantityCalculated);
                        stmt.setInt(2, rs2.getInt(1));
                        stmt.execute();
                        stmt.close();
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error while deducting");
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error on Temporary Order");
        }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    }//GEN-LAST:event_Submit_button_getActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showpanel("card5");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        showpanel("card6");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (admin_no == 1) {
            Admin_panel ms3 = new Admin_panel();
            ms3.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "You are not an Admin");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showpanel(String cname) {
        CardLayout cL = (CardLayout) Menu_Panel.getLayout();
        cL.show(Menu_Panel, cname);
    }
    public static int admin_no = 1;

    void clear_Fields() {
        itemId_textbox.setText(null);
    }

    void reduceQuantity() {

    }

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Check_ppl;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Get_button;
    private javax.swing.JPanel MainMenu_panel;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JPanel MyStock;
    private javax.swing.JButton Put_button;
    private javax.swing.JButton Submit_button_get;
    private javax.swing.JPanel Welcome;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel get;
    private javax.swing.JTextField itemId_textbox;
    private javax.swing.JTextField itemQuantity_textbox;
    private java.util.List<javaapplication3.Items> itemsList;
    private javax.persistence.Query itemsQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private java.util.List<javaapplication3.Ordertemp> ordertempList;
    private javax.persistence.Query ordertempQuery;
    private java.util.List<javaapplication3.People> peopleList;
    private java.util.List<javaapplication3.People> peopleList1;
    private java.util.List<javaapplication3.People> peopleList2;
    private javax.persistence.Query peopleQuery;
    private javax.persistence.Query peopleQuery1;
    private javax.persistence.Query peopleQuery2;
    private javax.swing.JPanel put;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
