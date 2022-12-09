package Main;

import java.awt.GridLayout;
import java.io.Serializable;
import java.net.Socket;

public class PanelYear extends javax.swing.JLayeredPane{

    private int year;
    public PanelYear(int year) {  
        
        initComponents();
        this.year = year;
        setYear();
    }
    
    public int GetYear(){
        return this.year;
    }
    
    public void setYear(){
        this.setLayout(new GridLayout(2,6,5,5));
        for(int i = 1; i <= 12; i++){
            this.add(new PanelDate(year, i));
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
