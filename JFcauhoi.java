package tracnghiem;

import java.awt.Color;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JFcauhoi extends javax.swing.JFrame {

    ArrayList<Cauhoi> list = new ArrayList<>();
    Cauhoi c;
    private static int pos = 0;

    public JFcauhoi() {
        initComponents();

        list.add(new Cauhoi("CPU là viết tắt của cụm từ nào?",
                "Central Processing Unit",
                "Computer Personal Unit",
                "Central Power Unit",
                "Control Processing Unit",
                1, 0)); // Đáp án đúng là A

        list.add(new Cauhoi("Ngôn ngữ lập trình nào phổ biến nhất hiện nay?",
                "Python",
                "C#",
                "Ruby",
                "Java",
                1, 0)); // Đáp án đúng là A

        list.add(new Cauhoi("RAM là gì?",
                "Random Access Memory",
                "Read Access Memory",
                "Run Access Memory",
                "Remote Access Memory",
                1, 0)); // Đáp án đúng là A

        list.add(new Cauhoi("Hệ điều hành nào phổ biến trên máy tính cá nhân?",
                "Windows",
                "Linux",
                "macOS",
                "DOS",
                1, 0)); // Đáp án đúng là A

        list.add(new Cauhoi("HTML là ngôn ngữ dùng để làm gì?",
                "Thiết kế giao diện web",
                "Phân tích dữ liệu",
                "Lập trình game",
                "Xử lý ảnh",
                1, 0)); // Đáp án đúng là A
        view();
        Viewlist();
    }

    public void view() {
        c = list.get(pos);
        this.lblQuesion.setText("Câu hỏi số " + (pos + 1) + ": " + c.getCauhoi());
        this.rba.setText("A: " + c.getAnswerA());
        this.rbb.setText("A: " + c.getAnswerB());
        this.rbac.setText("A: " + c.getAnswerC());
        this.rbd.setText("A: " + c.getAnswerD());
        switch (c.getStatus()) {
            case 1:
                onOff(true, false, false, false);
                break;
            case 2:
                onOff(true, false, false, false);
                break;
            case 3:
                onOff(true, false, false, false);
                break;
            case 4:
                onOff(true, false, false, false);
                break;
            default:
                this.buttonGroup1.clearSelection();
                break;
        }
        setColor();
    }

    public void Viewlist() {
        DefaultListModel md = new DefaultListModel();
        this.listQuesion.setModel(md);
        int n = 1;
        for (Cauhoi hoi : list) {
            md.addElement("Câu số " + n++);
        }
    }

    public int choice() {
        int i = 0;
        if (this.rba.isSelected()) {
            i = 1;
        } else if (this.rbb.isSelected()) {
            i = 2;
        } else if (this.rbac.isSelected()) {
            i = 3;
        } else if (this.rbd.isSelected()) {
            i = 4;
        }
        return i;
    }

    public void setColor() {
        this.rba.setBackground(Color.lightGray);
        this.rbb.setBackground(Color.lightGray);
        this.rbac.setBackground(Color.lightGray);
        this.rbd.setBackground(Color.lightGray);

    }

    public void onOff(boolean a, boolean b, boolean c, boolean d) {
        this.rba.setSelected(a);
        this.rbb.setSelected(b);
        this.rbac.setSelected(c);
        this.rbd.setSelected(d);
    }

    public void onAswer(int n) {
        switch (n) {
            case 1:
                this.rba.setBackground(Color.red);
                break;
            case 2:
                this.rbb.setBackground(Color.blue);
                break;
            case 3:
                this.rbac.setBackground(Color.ORANGE);
                break;
            case 4:
                this.rbd.setBackground(Color.PINK);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblQuesion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listQuesion = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        rba = new javax.swing.JRadioButton();
        rbac = new javax.swing.JRadioButton();
        rbb = new javax.swing.JRadioButton();
        rbd = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jbSumbit = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trắc nghiệm");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Trả Lời Trắc Nghiệm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(267, 267, 267))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        lblQuesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuesion.setText("Câu hỏi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblQuesion, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblQuesion)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        listQuesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listQuesion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listQuesion.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listQuesionValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listQuesion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        buttonGroup1.add(rba);
        rba.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rba.setText("A");

        buttonGroup1.add(rbac);
        rbac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbac.setText("C");
        rbac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbacActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbb);
        rbb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbb.setText("B");
        rbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbd);
        rbd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbd.setText("D");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbd)
                    .addComponent(rbac)
                    .addComponent(rbb)
                    .addComponent(rba))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(rba)
                .addGap(18, 18, 18)
                .addComponent(rbb)
                .addGap(18, 18, 18)
                .addComponent(rbac)
                .addGap(18, 18, 18)
                .addComponent(rbd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbSumbit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSumbit.setText("Nộp bài");
        jbSumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumbitActionPerformed(evt);
            }
        });

        jbExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbExit.setText("Thoát");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbSumbit)
                .addGap(46, 46, 46)
                .addComponent(jbExit)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSumbit)
                    .addComponent(jbExit))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn thoát?", "Xác nhận thoát", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbExitActionPerformed

    private void rbacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbacActionPerformed

    private void rbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbbActionPerformed

    private void listQuesionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listQuesionValueChanged
        // TODO add your handling code here:

        int n = choice();
        c.setStatus(n);

        list.set(pos, c);
        pos = this.listQuesion.getSelectedIndex();
        view();

    }//GEN-LAST:event_listQuesionValueChanged

    private void jbSumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSumbitActionPerformed
        // TODO add your handling code here:
        int score = 0;
        for (Cauhoi question : list) {
            if (question.getStatus() == question.getAnswer()) {
                score++;
            }
        }

        // Display the result
        JOptionPane.showMessageDialog(this, "Bạn đã trả lời đúng " + score + " câu.", "Kết quả", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbSumbitActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JFcauhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFcauhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFcauhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFcauhoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFcauhoi().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbSumbit;
    private javax.swing.JLabel lblQuesion;
    private javax.swing.JList<String> listQuesion;
    private javax.swing.JRadioButton rba;
    private javax.swing.JRadioButton rbac;
    private javax.swing.JRadioButton rbb;
    private javax.swing.JRadioButton rbd;
    // End of variables declaration//GEN-END:variables
}
