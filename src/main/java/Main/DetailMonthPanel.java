package Main;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;

public class DetailMonthPanel extends javax.swing.JLayeredPane {
    int year;
    int month;
    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setSize(500, 500);
        fr.add(new PanelYear(2022));
        fr.setVisible(true);
    }
    public DetailMonthPanel(int year, int month) {
        this.year = year;
        this.month = month;
        initComponents();
        init();
    }
    
    private void setEvent(){
        for(Component com : jPanel1.getComponents()){
            if(com instanceof DetailCell){
                DetailCell cell = (DetailCell) com;
                if(!cell.LDateLabel.getText().equals("")){
                    cell.addMouseListener(new MouseAdapter() {
                @Override
                    public void mouseClicked(MouseEvent e) {
                        String[] CanChi = cell.TinhCanChi();
                        GMonthYearLabel.setText("Tháng " + month + " Năm " + year);
                        GDayLabel.setText(Integer.toString(cell.date.getDate()));
                        LDateNameLabel.setText("Ngày "+CanChi[0]);
                        LMonthNameLabel.setText("Tháng " +CanChi[1]);
                        LYearNameLabel.setText("Năm "+CanChi[2]);
                        LYearLabel.setText("Năm " + cell.Lyear);
                        if(cell.LLeapMonth == 0){
                            LMonthLabel.setText("Tháng "+ cell.LMonth);
                        }
                        else {
                            LMonthLabel.setText("Tháng "+ cell.LMonth + " Nhuận");
                        }
                        LDateLabel.setText("" + cell.LDay);
                    }
                }); 
                }
            }
        }
    }
    
    private void init() {
        Mon.asTitle();
        Tue.asTitle();
        Wed.asTitle();
        Thu.asTitle();
        Fri.asTitle();
        Sat.asTitle();
        Sun.asTitle();
        setDate();
        setEvent();
        
        for(Component com : jPanel1.getComponents()){
            if(com instanceof DetailCell){
                DetailCell cell = (DetailCell) com;
                if(cell.GDateLabel.getText().equals("1")){
                        String[] CanChi = cell.TinhCanChi();
                        GMonthYearLabel.setText("Tháng " + month + " Năm " + year);
                        GDayLabel.setText(1+"");
//                        GDayLabel.setText(Integer.toString(cell.date.getDate()));
                        LDateNameLabel.setText("Ngày "+CanChi[0]);
                        LMonthNameLabel.setText("Tháng " +CanChi[1]);
                        LYearNameLabel.setText("Năm "+CanChi[2]);
                        LYearLabel.setText("Năm " + cell.Lyear);
                        if(cell.LLeapMonth == 0){
                            LMonthLabel.setText("Tháng "+ cell.LMonth);
                        }
                        else {
                            LMonthLabel.setText("Tháng "+ cell.LMonth + " Nhuận");
                        }
                        LDateLabel.setText("" + cell.LDay);
                        break;
                }
            }
        }
        
        
    }
    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : jPanel1.getComponents()) {
            if(com instanceof DetailCell){
                DetailCell cell = (DetailCell) com;
                if (!cell.isTitle()) {
                    int date = calendar.get(Calendar.DATE);
                    if(calendar.get(Calendar.MONTH) == month - 1){
                        int[] Gdate = VietCalendar.convertSolar2Lunar(date, this.month, this.year, 7.0);
                        cell.LDateLabel.setText(Gdate[0] + "/"+Gdate[1]);
                        cell.setDate(calendar.getTime(),Gdate[0],Gdate[1],Gdate[2],Gdate[3]);
                    }
                    cell.GDateLabel.setText(date + "");
                    cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                    if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                        cell.setAsToDay();
                    }
                    calendar.add(Calendar.DATE, 1); //  up 1 day
                }
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        GMonthYearLabel = new javax.swing.JLabel();
        GDayLabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        LMonthLabel = new javax.swing.JLabel();
        LDateLabel = new javax.swing.JLabel();
        LYearLabel = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        LMonthNameLabel = new javax.swing.JLabel();
        LDateNameLabel = new javax.swing.JLabel();
        LYearNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Sun = new Main.Cell();
        Mon = new Main.Cell();
        Tue = new Main.Cell();
        Wed = new Main.Cell();
        Thu = new Main.Cell();
        Fri = new Main.Cell();
        Sat = new Main.Cell();
        detailCell43 = new Main.DetailCell();
        detailCell44 = new Main.DetailCell();
        detailCell45 = new Main.DetailCell();
        detailCell46 = new Main.DetailCell();
        detailCell47 = new Main.DetailCell();
        detailCell48 = new Main.DetailCell();
        detailCell49 = new Main.DetailCell();
        detailCell50 = new Main.DetailCell();
        detailCell51 = new Main.DetailCell();
        detailCell52 = new Main.DetailCell();
        detailCell53 = new Main.DetailCell();
        detailCell54 = new Main.DetailCell();
        detailCell55 = new Main.DetailCell();
        detailCell56 = new Main.DetailCell();
        detailCell57 = new Main.DetailCell();
        detailCell58 = new Main.DetailCell();
        detailCell59 = new Main.DetailCell();
        detailCell60 = new Main.DetailCell();
        detailCell61 = new Main.DetailCell();
        detailCell62 = new Main.DetailCell();
        detailCell63 = new Main.DetailCell();
        detailCell64 = new Main.DetailCell();
        detailCell65 = new Main.DetailCell();
        detailCell66 = new Main.DetailCell();
        detailCell67 = new Main.DetailCell();
        detailCell68 = new Main.DetailCell();
        detailCell69 = new Main.DetailCell();
        detailCell70 = new Main.DetailCell();
        detailCell71 = new Main.DetailCell();
        detailCell72 = new Main.DetailCell();
        detailCell73 = new Main.DetailCell();
        detailCell74 = new Main.DetailCell();
        detailCell75 = new Main.DetailCell();
        detailCell76 = new Main.DetailCell();
        detailCell77 = new Main.DetailCell();
        detailCell78 = new Main.DetailCell();
        detailCell79 = new Main.DetailCell();
        detailCell80 = new Main.DetailCell();
        detailCell81 = new Main.DetailCell();
        detailCell82 = new Main.DetailCell();
        detailCell83 = new Main.DetailCell();
        detailCell84 = new Main.DetailCell();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 50));

        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        GMonthYearLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GMonthYearLabel.setForeground(new java.awt.Color(0, 51, 51));
        GMonthYearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GMonthYearLabel.setText("Tháng 11 năm 2022");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        jPanel2.add(GMonthYearLabel, gridBagConstraints);

        GDayLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        GDayLabel.setForeground(new java.awt.Color(0, 51, 51));
        GDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GDayLabel.setText("24");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel2.add(GDayLabel, gridBagConstraints);

        jLayeredPane1.setForeground(new java.awt.Color(0, 51, 51));
        jLayeredPane1.setLayout(new java.awt.GridLayout(3, 1));

        LMonthLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LMonthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LMonthLabel.setText("Tháng Một (T)");
        jLayeredPane1.add(LMonthLabel);

        LDateLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LDateLabel.setText("1");
        jLayeredPane1.add(LDateLabel);

        LYearLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LYearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LYearLabel.setText("Năm Nhâm Dần");
        LYearLabel.setToolTipText("");
        jLayeredPane1.add(LYearLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 0.4;
        jPanel2.add(jLayeredPane1, gridBagConstraints);

        jLayeredPane2.setForeground(new java.awt.Color(0, 51, 51));
        jLayeredPane2.setLayout(new java.awt.GridLayout(3, 1));

        LMonthNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LMonthNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LMonthNameLabel.setText("Năm Nhâm Dần");
        LMonthNameLabel.setToolTipText("");
        jLayeredPane2.add(LMonthNameLabel);

        LDateNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LDateNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LDateNameLabel.setText("Năm Nhâm Dần");
        LDateNameLabel.setToolTipText("");
        jLayeredPane2.add(LDateNameLabel);

        LYearNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LYearNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LYearNameLabel.setText("Năm Nhâm Dần");
        LYearNameLabel.setToolTipText("");
        jLayeredPane2.add(LYearNameLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        jPanel2.add(jLayeredPane2, gridBagConstraints);

        add(jPanel2);

        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(7, 7, 5, 5));

        Sun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Sun.setText("CN");
        Sun.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Sun);

        Mon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Mon.setText("T2");
        Mon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Mon);

        Tue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Tue.setText("T3");
        Tue.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Tue);

        Wed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Wed.setText("T4");
        Wed.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Wed);

        Thu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Thu.setText("T5");
        Thu.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Thu);

        Fri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Fri.setText("T6");
        Fri.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Fri);

        Sat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        Sat.setText("T7");
        Sat.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.add(Sat);
        jPanel1.add(detailCell43);
        jPanel1.add(detailCell44);
        jPanel1.add(detailCell45);
        jPanel1.add(detailCell46);
        jPanel1.add(detailCell47);
        jPanel1.add(detailCell48);
        jPanel1.add(detailCell49);
        jPanel1.add(detailCell50);
        jPanel1.add(detailCell51);
        jPanel1.add(detailCell52);
        jPanel1.add(detailCell53);
        jPanel1.add(detailCell54);
        jPanel1.add(detailCell55);
        jPanel1.add(detailCell56);
        jPanel1.add(detailCell57);
        jPanel1.add(detailCell58);
        jPanel1.add(detailCell59);
        jPanel1.add(detailCell60);
        jPanel1.add(detailCell61);
        jPanel1.add(detailCell62);
        jPanel1.add(detailCell63);
        jPanel1.add(detailCell64);
        jPanel1.add(detailCell65);
        jPanel1.add(detailCell66);
        jPanel1.add(detailCell67);
        jPanel1.add(detailCell68);
        jPanel1.add(detailCell69);
        jPanel1.add(detailCell70);
        jPanel1.add(detailCell71);
        jPanel1.add(detailCell72);
        jPanel1.add(detailCell73);
        jPanel1.add(detailCell74);
        jPanel1.add(detailCell75);
        jPanel1.add(detailCell76);
        jPanel1.add(detailCell77);
        jPanel1.add(detailCell78);
        jPanel1.add(detailCell79);
        jPanel1.add(detailCell80);
        jPanel1.add(detailCell81);
        jPanel1.add(detailCell82);
        jPanel1.add(detailCell83);
        jPanel1.add(detailCell84);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Main.Cell Fri;
    private javax.swing.JLabel GDayLabel;
    private javax.swing.JLabel GMonthYearLabel;
    private javax.swing.JLabel LDateLabel;
    private javax.swing.JLabel LDateNameLabel;
    private javax.swing.JLabel LMonthLabel;
    private javax.swing.JLabel LMonthNameLabel;
    private javax.swing.JLabel LYearLabel;
    private javax.swing.JLabel LYearNameLabel;
    private Main.Cell Mon;
    private Main.Cell Sat;
    private Main.Cell Sun;
    private Main.Cell Thu;
    private Main.Cell Tue;
    private Main.Cell Wed;
    private Main.DetailCell detailCell43;
    private Main.DetailCell detailCell44;
    private Main.DetailCell detailCell45;
    private Main.DetailCell detailCell46;
    private Main.DetailCell detailCell47;
    private Main.DetailCell detailCell48;
    private Main.DetailCell detailCell49;
    private Main.DetailCell detailCell50;
    private Main.DetailCell detailCell51;
    private Main.DetailCell detailCell52;
    private Main.DetailCell detailCell53;
    private Main.DetailCell detailCell54;
    private Main.DetailCell detailCell55;
    private Main.DetailCell detailCell56;
    private Main.DetailCell detailCell57;
    private Main.DetailCell detailCell58;
    private Main.DetailCell detailCell59;
    private Main.DetailCell detailCell60;
    private Main.DetailCell detailCell61;
    private Main.DetailCell detailCell62;
    private Main.DetailCell detailCell63;
    private Main.DetailCell detailCell64;
    private Main.DetailCell detailCell65;
    private Main.DetailCell detailCell66;
    private Main.DetailCell detailCell67;
    private Main.DetailCell detailCell68;
    private Main.DetailCell detailCell69;
    private Main.DetailCell detailCell70;
    private Main.DetailCell detailCell71;
    private Main.DetailCell detailCell72;
    private Main.DetailCell detailCell73;
    private Main.DetailCell detailCell74;
    private Main.DetailCell detailCell75;
    private Main.DetailCell detailCell76;
    private Main.DetailCell detailCell77;
    private Main.DetailCell detailCell78;
    private Main.DetailCell detailCell79;
    private Main.DetailCell detailCell80;
    private Main.DetailCell detailCell81;
    private Main.DetailCell detailCell82;
    private Main.DetailCell detailCell83;
    private Main.DetailCell detailCell84;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
