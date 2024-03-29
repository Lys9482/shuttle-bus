
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dance
 */
public class Capacity extends javax.swing.JFrame {

    /**
     * Creates new form Capacity
     */
    public Capacity() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3ETAHome = new javax.swing.JLabel();
        jLabel4CapacityHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButtonBus1Capacity = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton2Bus2Capacity = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 150, 150));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 200, 150), 4));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dance\\Downloads\\logo.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("     Home");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 200, 150), 4, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3ETAHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3ETAHome.setText("   ETA");
        jLabel3ETAHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 200, 150), 4, true));
        jLabel3ETAHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3ETAHomeMouseClicked(evt);
            }
        });

        jLabel4CapacityHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4CapacityHome.setText("  Capacity");
        jLabel4CapacityHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 200, 150), 4, true));
        jLabel4CapacityHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4CapacityHomeMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Log Out");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel3ETAHome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel4CapacityHome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3ETAHome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4CapacityHome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        jToggleButtonBus1Capacity.setBackground(new java.awt.Color(30, 144, 255));
        jToggleButtonBus1Capacity.setText("Shuttle Bus 1 Capacity");
        jToggleButtonBus1Capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBus1CapacityActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dance\\Downloads\\Bus1 (1).png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\dance\\Downloads\\Bus2.png")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jToggleButton2Bus2Capacity.setBackground(new java.awt.Color(147, 112, 219));
        jToggleButton2Bus2Capacity.setText("Shuttle Bus 2 Capacity");
        jToggleButton2Bus2Capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2Bus2CapacityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jToggleButtonBus1Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton2Bus2Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButtonBus1Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2Bus2Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonBus1CapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBus1CapacityActionPerformed
        // TODO add your handling code here:
        //read the file
        //retrieve the number of stops
        //remove passengers
        //add passengers
        //if it equals to 4 remove passengers until 4
        //end of loop check if equals4 if it does return capacity is full 
        //if not return available seats
        
File f = new File("capacity.txt");

try{
   
   FileReader fr = new FileReader(f);
   BufferedReader buffReader = new BufferedReader(fr);
   String line;
   boolean isFull = false;
   while((line=buffReader.readLine())!=null){
     String stops = line.split(" ")[3].toLowerCase();
     System.err.println(stops);
     int numOfStops = Integer.parseInt(stops);
     Random rand = new Random();
     int passengers  = rand.nextInt(4);
     int initialPass = passengers;
      System.err.println("The passengers are "+ passengers);
     for(int i=0; i<numOfStops; i++){
       int arriving = rand.nextInt(4);
        System.err.println("The passengers arriving "+ arriving);
       int leaving = rand.nextInt(4);
        System.err.println("The passengers leaving "+ leaving);
       passengers += arriving;
       passengers -=leaving;	
       if(passengers < 0){
           passengers = 0;
       }
       if(passengers > 4){
           passengers = 4;
       }
}
      System.err.println("The passengers are "+ passengers);
      if (passengers >= 4){
       isFull = true;
       JOptionPane.showMessageDialog(null, "Shuttle Bus is Full");
      
        }
      else{
          int availableSeats = 4 - passengers;
          JOptionPane.showMessageDialog(null, "Shuttle Bus has " + availableSeats + " available seats" );
      }
      File capFile = new File("BusCapacity.txt");
     if(!capFile.exists()){
         capFile.createNewFile();
     }
      FileWriter Writer = new FileWriter(capFile,true);
      BufferedWriter bwrite = new BufferedWriter(Writer);
       bwrite.write("Initial Passengers" + initialPass +  " Available Seats " + passengers + '\n');
     bwrite.close();
    
 
 
}



}
 catch(Exception e){
  e.printStackTrace();

}
         
    }//GEN-LAST:event_jToggleButtonBus1CapacityActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        homepage homePage = new homepage();
        homePage.setVisible(true);
        homePage.pack();
        homePage.setLocationRelativeTo(null);
       // register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3ETAHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3ETAHomeMouseClicked
        // TODO add your handling code here:
        ETA eta = new ETA();
        eta.setVisible(true);
        eta.pack();
        eta.setLocationRelativeTo(null);
       // register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel3ETAHomeMouseClicked

    private void jLabel4CapacityHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4CapacityHomeMouseClicked
        // TODO add your handling code here:
          Capacity capacity = new Capacity();
        capacity.setVisible(true);
        capacity.pack();
        capacity.setLocationRelativeTo(null);
       // register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel4CapacityHomeMouseClicked

    private void jToggleButton2Bus2CapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2Bus2CapacityActionPerformed
        // TODO add your handling code here:
     File f = new File("capacity.txt");

try{
   
   FileReader fr = new FileReader(f);
   BufferedReader buffReader = new BufferedReader(fr);
   String line;
   boolean isFull = false;
   Random rand = new Random();
   while((line=buffReader.readLine())!=null){
     String stops = line.split(" ")[3].toLowerCase();
     System.err.println(stops);
     int numOfStops = Integer.parseInt(stops);
     
     
     int passengers  = rand.nextInt(4);
     int initialPass = passengers;
      System.err.println("The passengers are "+ passengers);
     for(int i=0; i<numOfStops; i++){
       int arriving = rand.nextInt(4);
        System.err.println("The passengers arriving "+ arriving);
       int leaving = rand.nextInt(4);
        System.err.println("The passengers leaving "+ leaving);
       passengers += arriving;
       passengers -=leaving;	
       if(passengers < 0){
           passengers = 0;
       }
       if(passengers > 4){
           passengers = 4;
       }
}
     
      //System.err.println("The passengers are "+ passengers);
      if (passengers >= 4){
       isFull = true;
         JOptionPane.showMessageDialog(null, "Shuttle Bus is Full");
      
        }
      else{
          int availableSeats = 4 - passengers;
          JOptionPane.showMessageDialog(null, "Shuttle Bus has " + availableSeats + " available seats" );
      }
    
     File capFile = new File("BusCapacity.txt");
     if(!capFile.exists()){
         capFile.createNewFile();
     }
     FileWriter Writer = new FileWriter(capFile,true);
      BufferedWriter bwrite = new BufferedWriter(Writer);
       bwrite.write("Initial Passengers" + initialPass +  " Available Seats " + passengers + '\n');
     bwrite.close();
 
}
 
}
 catch(Exception e){
  e.printStackTrace();

}
    }//GEN-LAST:event_jToggleButton2Bus2CapacityActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        homepage homePage = new homepage();
        homePage.setVisible(true);
        homePage.pack();
        homePage.setLocationRelativeTo(null);
       // register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        index index = new index();
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null);
       // index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Capacity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capacity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capacity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capacity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capacity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3ETAHome;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4CapacityHome;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton2Bus2Capacity;
    private javax.swing.JToggleButton jToggleButtonBus1Capacity;
    // End of variables declaration//GEN-END:variables
}
