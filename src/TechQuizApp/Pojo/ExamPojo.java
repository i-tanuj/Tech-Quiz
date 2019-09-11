/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.Pojo;

/**
 *
 * @author PC
 */
public class ExamPojo {
    private String ExamId;
    private String Language;
    private int totalQuestions;

    public ExamPojo(String ExamId, String Language, int totalQuestions) {
        this.ExamId = ExamId;
        this.Language = Language;
        this.totalQuestions = totalQuestions;
    }

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
    
    
    
}
