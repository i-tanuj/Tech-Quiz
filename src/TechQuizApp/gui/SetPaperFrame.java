/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.Pojo.ExamPojo;
import TechQuizApp.Pojo.UserProfile;
import TechQuizApp.dao.ExamDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class SetPaperFrame extends javax.swing.JFrame {

    /**
     * Creates new form SetPaperFrame
     */
    public SetPaperFrame() {
        initComponents();
        this.setTitle("The Quiz App");
        this.setLocationRelativeTo(null);
        lblUserName.setText("Hello "+UserProfile.getUsername());
         lblSetPaper.setOpaque(true);
        lblSetPaper.setBackground(new Color(0,0,51));
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
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblSetPaper = new javax.swing.JLabel();
        lblViewScore = new javax.swing.JLabel();
        lblEditPaper = new javax.swing.JLabel();
        lblRegisterStudent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcLanguage = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcQuestions = new javax.swing.JComboBox<>();
        btnSetQuestion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechQuizApp/images/questionpaper4.jpg"))); // NOI18N

        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Hello User");

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblSetPaper.setBackground(new java.awt.Color(0, 0, 0));
        lblSetPaper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSetPaper.setForeground(new java.awt.Color(255, 255, 255));
        lblSetPaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetPaper.setText("Set paper");
        lblSetPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSetPaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSetPaperMouseExited(evt);
            }
        });

        lblViewScore.setBackground(new java.awt.Color(0, 0, 0));
        lblViewScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblViewScore.setForeground(new java.awt.Color(255, 255, 255));
        lblViewScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewScore.setText("View Score");
        lblViewScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewScoreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViewScoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViewScoreMouseExited(evt);
            }
        });

        lblEditPaper.setBackground(new java.awt.Color(0, 0, 0));
        lblEditPaper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEditPaper.setForeground(new java.awt.Color(255, 255, 255));
        lblEditPaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditPaper.setText("Edit Paper");
        lblEditPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditPaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditPaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditPaperMouseExited(evt);
            }
        });

        lblRegisterStudent.setBackground(new java.awt.Color(0, 0, 0));
        lblRegisterStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegisterStudent.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegisterStudent.setText("Register Student");
        lblRegisterStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterStudentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(71, Short.MAX_VALUE))
            .addComponent(lblSetPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblViewScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEditPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRegisterStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblSetPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEditPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblRegisterStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Paper Setting Panel");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Set Paper Details");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Choose a Subject");

        jcLanguage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcLanguage.setForeground(new java.awt.Color(0, 0, 255));
        jcLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         ", "Java", "C++", "C", "Python" }));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Set Number of QUestions");

        jcQuestions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcQuestions.setForeground(new java.awt.Color(0, 0, 255));
        jcQuestions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     ", "2", "3", "4", "5", "6", "7", "8", "9", "9", "10", "11", "12", "13", "14", "15" }));

        btnSetQuestion.setBackground(new java.awt.Color(255, 255, 255));
        btnSetQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSetQuestion.setForeground(new java.awt.Color(0, 51, 102));
        btnSetQuestion.setText("Set Question");
        btnSetQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetQuestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSetQuestionMouseExited(evt);
            }
        });
        btnSetQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetQuestionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSetQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcQuestions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(84, 84, 84))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSetQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.white);
        Font f = new Font("Tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(new Color(255,255,255));
        Font f = new Font("Tahoma",Font.BOLD,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblSetPaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetPaperMouseEntered
       
    }//GEN-LAST:event_lblSetPaperMouseEntered

    private void lblSetPaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetPaperMouseExited
        
    }//GEN-LAST:event_lblSetPaperMouseExited

    private void lblEditPaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPaperMouseEntered
        lblEditPaper.setOpaque(true);
        lblEditPaper.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_lblEditPaperMouseEntered

    private void lblEditPaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPaperMouseExited
        lblEditPaper.setOpaque(true);
        lblEditPaper.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_lblEditPaperMouseExited

    private void lblRegisterStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterStudentMouseEntered
       lblRegisterStudent.setOpaque(true);
       lblRegisterStudent.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_lblRegisterStudentMouseEntered

    private void lblRegisterStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterStudentMouseExited
        lblRegisterStudent.setOpaque(true);
        lblRegisterStudent.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_lblRegisterStudentMouseExited

    private void lblViewScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewScoreMouseEntered
       lblViewScore.setOpaque(true);
       lblViewScore.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_lblViewScoreMouseEntered

    private void lblViewScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewScoreMouseExited
        lblViewScore.setOpaque(true);
        lblViewScore.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_lblViewScoreMouseExited

    private void btnSetQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetQuestionActionPerformed
        // TODO add your handling code here:
        String subject = jcLanguage.getSelectedItem().toString();
        int totalQuest = Integer.parseInt(jcQuestions.getSelectedItem().toString());
        int ans;
        ans = JOptionPane.showConfirmDialog(null,"You Have chosen \""+subject+"\" and \""+totalQuest+"\"questions!\n Is this OK? ","Conformation!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans == JOptionPane.YES_OPTION)
        {
            try
            {
                String examId = ExamDAO.getExamId();
                ExamPojo newExam = new ExamPojo(examId,subject,totalQuest);
                SetQuestionFrame questionsFrame = new SetQuestionFrame(newExam);
                questionsFrame.setVisible(true);
                this.dispose();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Error While connecting to DB!","Exception",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSetQuestionActionPerformed

    private void btnSetQuestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetQuestionMouseEntered
        btnSetQuestion.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnSetQuestionMouseEntered

    private void btnSetQuestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetQuestionMouseExited
        btnSetQuestion.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnSetQuestionMouseExited

    private void lblEditPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditPaperMouseClicked
       EditPaperFrame epf = new EditPaperFrame();
       this.dispose();
       epf.setVisible(true);
    }//GEN-LAST:event_lblEditPaperMouseClicked

    private void lblRegisterStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterStudentMouseClicked
        RegisterStudentFrame rsf = new RegisterStudentFrame();
        this.dispose();
        rsf.setVisible(true);
    }//GEN-LAST:event_lblRegisterStudentMouseClicked

    private void lblViewScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewScoreMouseClicked
        ViewScoresFrame vsf = new ViewScoresFrame();
        this.dispose();
        vsf.setVisible(true);
    }//GEN-LAST:event_lblViewScoreMouseClicked

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
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetPaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetPaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcLanguage;
    private javax.swing.JComboBox<String> jcQuestions;
    private javax.swing.JLabel lblEditPaper;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblRegisterStudent;
    private javax.swing.JLabel lblSetPaper;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblViewScore;
    // End of variables declaration//GEN-END:variables
}
