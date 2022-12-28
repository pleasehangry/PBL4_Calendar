/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class DetailCell extends javax.swing.JLayeredPane {

    public String[] can = {"Canh","Tân","Nhâm","Quý","Giáp" , "Ất", "Bính","Đinh","Mậu", "Kỷ"};
    public String[] chi = {"Tý","Sửu","Dần","Mão", "Thìn", "Tỵ",
        "Ngọ","Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
    public final String[] TenThang = {"Dần","Mão", "Thìn", "Tỵ",
        "Ngọ","Mùi", "Thân", "Dậu", "Tuất", "Hợi","Tý","Sửu"};
    public Date date;
    public boolean isToDay;
    public boolean title;
    int LDay;
    int LMonth;
    int Lyear;
    int LLeapMonth;
    /**
     * Creates new form DetailCell
     */
    public DetailCell() {
        initComponents();
        LDateLabel.setText("");
    }
    
    public void asTitle() {
        title = true;
    }

    public boolean isTitle() {
        return title;
    }

    public void currentMonth(boolean act) {
        if (act) {
            setForeground(new Color(68, 68, 68));
        } else {
            setForeground(new Color(169, 169, 169));
            this.LDateLabel.setText("");
        }
    }

    public void setDate(Date date, int LDay, int LM, int LY, int LLY) {
        this.date = date;
        this.LDay = LDay;
        this.LMonth = LM;
        this.Lyear = LY;
        this.LLeapMonth = LLY;
    }
    public void setAsToDay() {
        isToDay = true;
        setForeground(Color.WHITE);
    }
    
    public String[] TinhCanChi(){
        // Can chi nam
        System.out.println(Lyear);
        System.out.println(LMonth);
        System.out.println(LDay);
        int canNam = Lyear%10;
        int chiNam = Lyear%12;
        String canChiNam;
        if(chiNam >=4){
            canChiNam = can[canNam] + " " + chi[chiNam -4];
        }
        else {
            canChiNam = can[canNam] + " " + chi[chiNam + 8];
        }
        
        // Can Chi thang
        String canChiThang = null;
        switch (canNam) {
            case 0:
            case 5:
                canChiThang = can[(LMonth+7)%10] + " " + TenThang[LMonth-1];
                break;
            case 4:
            case 9:
                canChiThang = can[(LMonth+5)%10] + " " +  TenThang[LMonth-1];
                break;
            case 1:
            case 6:
                canChiThang = can[(LMonth+9)%10] + " " + TenThang[LMonth-1];
                break;
            case 2:
            case 7:
                canChiThang = can[(LMonth+1)%10] + " " + TenThang[LMonth-1];
                break;
            case 3:
            case 8:
                canChiThang = can[(LMonth+3)%10] + " " + TenThang[LMonth-1];
                break;
            default:
                throw new AssertionError();
        }
        
        // Can chi ngay
        
        int maThang;
        int maNam;
        int ThangDuong = date.getMonth()+1;
        int NamDuong = date.getYear() + 1900;
        if(ThangDuong%2==0){
            maThang = ThangDuong/2 + 30;
        }
        else {
            if(ThangDuong == 9 || ThangDuong == 11){
                maThang = (ThangDuong +1)/2;
            } 
            else {
                maThang = ThangDuong /2;
            }
        }
        
        int temp = NamDuong%1000;
        maNam = (temp%12) * 5 + temp/4;
        int maTheKy = 18;
        int MaSaiSo = -2;
        
        if(ThangDuong <3){
            MaSaiSo = 0;
        }
        
        if(NamDuong % 4 == 0 || NamDuong %100 == 0){
            MaSaiSo = -1;
        }
        int TongMa = (date.getDate() + maThang + maNam + maTheKy + MaSaiSo)-60;
        String CanChiNgay = can[Math.abs(TongMa%10)] + " " + chi[Math.abs(TongMa%12)];
        
        System.out.println(maNam);
        System.out.println(maThang);
        System.out.println(TongMa);
        
        return new String[]{CanChiNgay, canChiThang, canChiNam};
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (isToDay) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(97, 49, 237));
            int x = getWidth() / 2 - 17;
            int y = getHeight() / 2 - 17;
            g2.fillRoundRect(x, y, 70, 70, 100, 100);
        }
        super.paintComponent(grphcs);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GDateLabel = new javax.swing.JLabel();
        LDateLabel = new javax.swing.JLabel();
        EventLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        GDateLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GDateLabel.setText("1");

        LDateLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LDateLabel.setText("12");

        setLayer(GDateLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(LDateLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(EventLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LDateLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EventLabel)
                    .addComponent(LDateLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setForeground(Color.red);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setForeground(null);
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel EventLabel;
    public javax.swing.JLabel GDateLabel;
    public javax.swing.JLabel LDateLabel;
    // End of variables declaration//GEN-END:variables
}
