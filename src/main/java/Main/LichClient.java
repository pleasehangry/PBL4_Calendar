
package Main;

import java.awt.FlowLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LichClient extends javax.swing.JFrame implements Runnable{
    public Socket soc;
    public DataInputStream dis;
    public DataOutputStream dos;
    PanelYear panelYear;
    public LichClient() {
        
        try {
            soc = new Socket("localhost", 3333);
            this.dis = new DataInputStream(soc.getInputStream());
            this.dos = new DataOutputStream(soc.getOutputStream());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        new Thread(this).start();
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        init();
    }
    public void init(){
        this.setLayout(new FlowLayout(1,20,20));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OKBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        YearLabel = new javax.swing.JLabel();
        previousYearBtn = new javax.swing.JButton();
        nextYearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        OKBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        OKBtn.setText("OK");
        OKBtn.setBorder(null);
        OKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Enter Year:");

        yearTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        yearTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearTextField.setBorder(null);

        YearLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        YearLabel.setForeground(new java.awt.Color(51, 51, 255));
        YearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YearLabel.setText("2022");

        previousYearBtn.setBackground(new java.awt.Color(0, 51, 255));
        previousYearBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        previousYearBtn.setForeground(new java.awt.Color(255, 255, 255));
        previousYearBtn.setText("<");
        previousYearBtn.setBorder(null);
        previousYearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousYearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousYearBtnActionPerformed(evt);
            }
        });

        nextYearBtn.setBackground(new java.awt.Color(0, 51, 255));
        nextYearBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nextYearBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextYearBtn.setText(">");
        nextYearBtn.setBorder(null);
        nextYearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextYearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextYearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousYearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextYearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yearTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(YearLabel)
                            .addComponent(previousYearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextYearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextYearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextYearBtnActionPerformed

        try {
            this.dos.writeUTF("GetYear," + panelYear.GetYear() + ",addOne");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_nextYearBtnActionPerformed

    private void previousYearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousYearBtnActionPerformed

        try {
            this.dos.writeUTF("GetYear," + panelYear.GetYear() + ",minusOne");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_previousYearBtnActionPerformed

    private void OKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBtnActionPerformed

        System.out.println("Main.main.OKBtnActionPerformed()");
        try {
            String inputYear = yearTextField.getText();
            if( inputYear == null || inputYear.equals("")) {
                JOptionPane.showMessageDialog(this,"String is null or empty.","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int iYear;
            try {
                iYear = Integer.parseInt(inputYear);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"Input String cannot be parsed to Integer.","ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                String SentData = "GetYear," +iYear+",fromInput";
                dos.writeUTF(SentData);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_OKBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Calendar cal = Calendar.getInstance();
            this.dos.writeUTF("GetYear," + cal.get(Calendar.YEAR) + ",fromInput");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(LichClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKBtn;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextYearBtn;
    private javax.swing.JButton previousYearBtn;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
            try {
                
                    String ServerSent = dis.readUTF();
                    System.out.println(ServerSent);

                    if(ServerSent.split(",")[0].equals("ReturnYear")){
                        if(panelYear!=null){
                            this.remove(panelYear);
                        }
                        panelYear = new PanelYear(Integer.parseInt(ServerSent.split(",")[1]));
                        this.add(panelYear);
                        this.revalidate();
                        this.repaint();
                        YearLabel.setText(Integer.toString(panelYear.GetYear()));

                    }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
