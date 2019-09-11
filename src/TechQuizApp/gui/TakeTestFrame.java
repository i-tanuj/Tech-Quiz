/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.Pojo.AnswerPojo;
import TechQuizApp.Pojo.AnswerStore;
import TechQuizApp.Pojo.ExamPojo;
import TechQuizApp.Pojo.QuestionPojo;
import TechQuizApp.Pojo.QuestionStore;
import TechQuizApp.Pojo.UserProfile;
import TechQuizApp.Pojo.performancePojo;
import TechQuizApp.dao.PerformanceDAO;
import TechQuizApp.dao.QuestionDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class TakeTestFrame extends javax.swing.JFrame {

    private ExamPojo exam;
    private QuestionStore qstore;
    private AnswerStore astore;
    private int qno,pos=0;
    public TakeTestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tech Quiz App");
        lblUsername.setText("Hello "+UserProfile.getUsername());
        qstore = new QuestionStore();
        astore = new AnswerStore();
        qno = 1;
        lblQno.setText(lblQno.getText()+qno);
    }
     public TakeTestFrame(ExamPojo exam)
    {
        this();
        this.exam = exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+ " PAPER");
        loadQuestions();
        showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        btnDone = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechQuizApp/images/good luck2.jpg"))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Hello User");

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
            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Ques");

        lblQno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(0, 0, 153));
        lblQno.setText("Question No:");

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        buttonGroup1.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(0, 51, 204));

        buttonGroup1.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(0, 51, 204));

        buttonGroup1.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(0, 51, 204));

        buttonGroup1.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(0, 51, 204));

        btnDone.setBackground(new java.awt.Color(255, 255, 255));
        btnDone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(0, 0, 102));
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

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 102));
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
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

        btnPrevious.setBackground(new java.awt.Color(255, 255, 255));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(0, 0, 102));
        btnPrevious.setText("Previous");
        btnPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPreviousMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPreviousMouseExited(evt);
            }
        });
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 0, 102));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addComponent(lblQno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrOption3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                            .addComponent(jrOption1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrOption2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrOption4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrevious)
                        .addGap(14, 14, 14)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDone)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrOption2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrOption1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        String chosenAnswer = getUserAnswer();
        if(chosenAnswer != null)
        {
            QuestionPojo question = qstore.getQuestion(pos);
            String correctAnswer = question.getCorrectAnswer();
            AnswerPojo newanswer = new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            AnswerPojo answer = astore.getAnswerByQno(qno);
            if(answer == null)
            astore.addAnswer(newanswer);
            else
            {
                if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
                {
                    int apos = astore.removeAnswer(answer);
                    astore.setAnswerAt(apos, newanswer);
                }
            }
        }
        int right = 0,wrong = 0;
        for(QuestionPojo question : qstore.getAllQuestions())
        {
            int qno = question.getQno();
            AnswerPojo answer = astore.getAnswerByQno(qno);
            if(answer == null)
            continue;
            else
            {
                String chosenAnswer1 = answer.getChosenAnswer();
                String correctAnswer = answer.getCorrectAnswer();
                System.out.println(chosenAnswer1+"\t"+correctAnswer);
                if(chosenAnswer1.equals(correctAnswer))
                ++right;
                else
                ++wrong;
            }
        }
        String reportCard = "Total Question: "+qstore.getCount();
        reportCard+="\nRight Answers: "+right;
        reportCard+="\nWrong Answers: "+wrong;
        reportCard+="\nUnAttempted: "+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null,reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            performancePojo performance = new performancePojo(exam.getExamId(),exam.getLanguage(),UserProfile.getUsername(),right,wrong,(qstore.getCount()-(right+wrong)),(double)right/qstore.getCount()*100);
            PerformanceDAO.addPerformance(performance);
            JOptionPane.showMessageDialog(null, "Your Performance has been Successfully addede to the database","Performance Added!",JOptionPane.INFORMATION_MESSAGE);
            PaperSelectionFrame paperFrame = new PaperSelectionFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error While connecting to DB!","Exception",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to Cancel the exam","Quitting!!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans == JOptionPane.YES_OPTION)
        {
            StudentOptionFrame stdOp = new StudentOptionFrame();
            stdOp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer = getUserAnswer();
        if(chosenAnswer != null)
        {
            QuestionPojo question = qstore.getQuestion(pos);
            String correctAnswer = question.getCorrectAnswer();
            AnswerPojo newanswer = new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            AnswerPojo answer = astore.getAnswerByQno(qno);
            if(answer == null)
            astore.addAnswer(newanswer);
            else
            {
                if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
                {
                    int apos = astore.removeAnswer(answer);
                    astore.setAnswerAt(apos, newanswer);
                }
            }
        }
        pos--;
        if(pos<0)
        {
            pos = qstore.getCount()-1;
        }
        qno--;
        if(qno<=0)
        qno = qstore.getCount();
        lblQno.setText("Question no: "+qno);
        showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String chosenAnswer = getUserAnswer();
        if(chosenAnswer != null)
        {
            QuestionPojo question = qstore.getQuestion(pos);
            String correctAnswer = question.getCorrectAnswer();
            AnswerPojo newanswer = new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            AnswerPojo answer = astore.getAnswerByQno(qno);
            if(answer == null)
            astore.addAnswer(newanswer);
            else
            {
                if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
                {
                    int apos = astore.removeAnswer(answer);
                    astore.setAnswerAt(apos, newanswer);

                }
            }
        }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos = 0;
        }
        qno++;
        if(qno>qstore.getCount())
        qno = 1;
        lblQno.setText("Question no: "+qno);
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        btnNext.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnPreviousMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviousMouseEntered
        btnPrevious.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnPreviousMouseEntered

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnDoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoneMouseEntered
        btnDone.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_btnDoneMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        btnNext.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnNextMouseExited

    private void btnPreviousMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviousMouseExited
        btnPrevious.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnPreviousMouseExited

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here
        btnCancel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnCancelMouseExited

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
 public void loadQuestions()
    {
        try{
            ArrayList<QuestionPojo> questionList = QuestionDAO.getQuestionsByExamId(exam.getExamId());
            System.out.println(questionList);
            for(QuestionPojo obj : questionList)
            {
                qstore.addQuestion(obj);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error While connecting to DB!","Exception",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
 public void showQuestion()
    {
        QuestionPojo question= qstore.getQuestion(pos);
        buttonGroup1.clearSelection();
        txtQuestion.setText(question.getQuestions());
        jrOption1.setText(question.getAnswer1());
        jrOption2.setText(question.getAnswer2());
        jrOption3.setText(question.getAnswer3());
        jrOption4.setText(question.getAnswer4());
        AnswerPojo answer = astore.getAnswerByQno(qno);
        if (answer == null)
            return;
        String chosenAnswer = answer.getChosenAnswer();
        switch (chosenAnswer)
        {
            case "Answer 1":
                jrOption1.setSelected(true);
                break;
            case "Answer 2":
                jrOption2.setSelected(true);
                break;
            case "Answer 3":
                jrOption3.setSelected(true);
                break;
            case "Answer 4":
                jrOption4.setSelected(true);
                break;               
        }
    }
    
    public String getUserAnswer()
    {
        if(jrOption1.isSelected())
            return "Answer 1";
        else if(jrOption2.isSelected())
            return "Answer 2";
        else if(jrOption3.isSelected())
            return "Answer 3";
        else if(jrOption4.isSelected())
            return "Answer 4";
        else
            return null;
    }    

}