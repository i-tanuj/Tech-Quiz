/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.Pojo.ExamPojo;
import TechQuizApp.Pojo.QuestionPojo;
import TechQuizApp.Pojo.QuestionStore;
import TechQuizApp.Pojo.UserProfile;
import TechQuizApp.dao.ExamDAO;
import TechQuizApp.dao.QuestionDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class SetQuestionFrame extends javax.swing.JFrame {

    private ExamPojo newExam;
    private QuestionStore qstore;
    private HashMap<String,String> options;
    private int qno;
    private String question,option1,option2,option3,option4,correctOption;
    public SetQuestionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tech Quiz App");
        lblUserName.setText("Hello "+UserProfile.getUsername());
        qstore = new QuestionStore();
        options = new HashMap<>();
        options.put("Option 1", "Answer 1");
        options.put("Option 2", "Answer 2");
        options.put("Option 3", "Answer 3");
        options.put("Option 4", "Answer 4");
        qno = 1;
        lblQno.setText(lblQno.getText()+qno);
       
        
    }
    public SetQuestionFrame (ExamPojo newExam)
    {
        this();
        this.newExam = newExam;
        lblTitle.setText(this.newExam.getTotalQuestions()+"Questions Remaining");
        
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
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOption2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOption4 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcCorrectOption = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechQuizApp/images/questionpaper3.jpg"))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblQno.setBackground(new java.awt.Color(0, 0, 0));
        lblQno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(0, 0, 153));
        lblQno.setText("Question No: ");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Option 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Option 2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Option 4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Option 3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Correct Answer");

        jcCorrectOption.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcCorrectOption.setForeground(new java.awt.Color(0, 0, 153));
        jcCorrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 51, 102));
        btnNext.setText("Next");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 51, 102));
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(255, 255, 255));
        btnDone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(0, 51, 102));
        btnDone.setText("Done");
        btnDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDoneMouseExited(evt);
            }
        });
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(lblQno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(txtOption1)
                                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOption4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcCorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcCorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Font f = new Font("Tahoma",Font.ITALIC,18);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(new Color(255,255,255));
        Font f = new Font("Tahoma",Font.BOLD,18);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (validateInput()==false)
        {
            JOptionPane.showMessageDialog(null, "Please fill all the input fields","Cannot Add Question!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String optionName = options.get(correctOption);
        QuestionPojo obj = new QuestionPojo(newExam.getExamId(),qno,newExam.getLanguage(),option1,option2,option3,option4,optionName,question);
        System.out.println(obj);
        qstore.addQuestion(obj);
        clearAll();
        lblTitle.setText((newExam.getTotalQuestions()-qno)+" Questions Remaining");
        qno++;
        if(qno>newExam.getTotalQuestions())
        {
            disableAll();
            JOptionPane.showMessageDialog(null, "Your question set has been successfully created.\nPress the DONE button to add it to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        lblQno.setText("Question no:"+qno);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        SetPaperFrame paperFrame=new SetPaperFrame();
        paperFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        if(qno <= newExam.getTotalQuestions())
        {
            int remainingQuestions = newExam.getTotalQuestions()-qno+1;
            JOptionPane.showMessageDialog(null, "You still have "+remainingQuestions+" left","Cannot Add Exam!",JOptionPane.ERROR_MESSAGE);
            return;

        }
        try{
            ExamDAO.addExam(newExam);
            QuestionDAO.addQuestions(qstore);
            JOptionPane.showMessageDialog(null, "Your question set has been successfully added to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
            AdminOptionsFrame adminFrame=new AdminOptionsFrame();
            adminFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
       btnNext.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        btnNext.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnNextMouseExited

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        btnCancel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnDoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoneMouseEntered
        btnDone.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnDoneMouseEntered

    private void btnDoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoneMouseExited
        btnDone.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnDoneMouseExited

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
            java.util.logging.Logger.getLogger(SetQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetQuestionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCorrectOption;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
public boolean validateInput()
{
    question = txtQuestion.getText().trim();
    option1 = txtOption1.getText().trim();
    option2 = txtOption2.getText().trim();
    option3 = txtOption3.getText().trim();
    option4 = txtOption4.getText().trim();
    correctOption = jcCorrectOption.getSelectedItem().toString();
    if(question.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty())
    {
        return false;
    }
    else
    {
        return true;
    }
}
public void clearAll()
{
    txtQuestion.setText("");
    txtOption1.setText("");
    txtOption2.setText("");
    txtOption3.setText("");
    txtOption4.setText("");
    jcCorrectOption.setSelectedIndex(0);
}
public void disableAll()
{
    txtQuestion.setEnabled(false);
    txtOption1.setEnabled(false);
    txtOption2.setEnabled(false);
    txtOption3.setEnabled(false);
    txtOption4.setEnabled(false);
    jcCorrectOption.setEnabled(false);
    btnNext.setEnabled(false);
}

}
