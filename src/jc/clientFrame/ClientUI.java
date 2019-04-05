/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.clientFrame;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.weatherserviceapplication.JavaMessage;
import org.tempuri.IWeatherServiceBasic;
import org.tempuri.WeatherServiceBasic;


/**
 *
 * @author Rahul
 */
public class ClientUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientUI
     */
    
    DefaultTableModel model;
    public ClientUI() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSplitPane2 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel4 = new javax.swing.JLabel();
        placeL = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jLabel6 = new javax.swing.JLabel();
        tempL = new javax.swing.JLabel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jLabel8 = new javax.swing.JLabel();
        humL = new javax.swing.JLabel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jLabel10 = new javax.swing.JLabel();
        winL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Time", "Place", "Temp.", "Humidity", "Wind Sped"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jSplitPane2.setDividerLocation(100);

        jLabel1.setText("Time :");
        jSplitPane2.setLeftComponent(jLabel1);

        timeL.setText("Time");
        jSplitPane2.setRightComponent(timeL);

        jSplitPane1.setDividerLocation(100);

        jLabel4.setText("Place :");
        jSplitPane1.setLeftComponent(jLabel4);

        placeL.setText("Place");
        jSplitPane1.setRightComponent(placeL);

        jSplitPane3.setDividerLocation(100);

        jLabel6.setText("Temperature : ");
        jSplitPane3.setLeftComponent(jLabel6);

        tempL.setText("Temperature");
        jSplitPane3.setRightComponent(tempL);

        jSplitPane4.setDividerLocation(100);

        jLabel8.setText("Humidity :");
        jSplitPane4.setLeftComponent(jLabel8);

        humL.setText("Humidity");
        jSplitPane4.setRightComponent(humL);

        jSplitPane5.setDividerLocation(100);

        jLabel10.setText("Wind Speed :");
        jSplitPane5.setLeftComponent(jLabel10);

        winL.setText("Wind Speed");
        jSplitPane5.setRightComponent(winL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSplitPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane4)
                    .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jSplitPane1)
                    .addComponent(jSplitPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        WeatherServiceBasic wsb = new WeatherServiceBasic();
        IWeatherServiceBasic iwsb = wsb.getBasicHttpBindingIWeatherServiceBasic();
        List<JavaMessage> list = iwsb.getData().getJavaMessage();
        int i = 0;
        for(JavaMessage jm : list){
            model.addRow(new Object[]{jm.getTime().getValue(),jm.getPlace().getValue(),jm.getTemp().getValue(),jm.getHumidity().getValue(),jm.getWindSpeed().getValue()});
            if(i == 0){
                timeL.setText(jm.getTime().getValue());
                placeL.setText(jm.getPlace().getValue());
                tempL.setText(jm.getTemp().getValue());
                humL.setText(jm.getHumidity().getValue());
                winL.setText(jm.getWindSpeed().getValue());
                i++;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel humL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel placeL;
    private javax.swing.JLabel tempL;
    private javax.swing.JLabel timeL;
    private javax.swing.JLabel winL;
    // End of variables declaration//GEN-END:variables
}
