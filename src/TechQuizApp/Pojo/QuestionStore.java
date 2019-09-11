/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.Pojo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class QuestionStore {
    ArrayList <QuestionPojo> questionList;
    
     @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }
    public QuestionStore()
    {
        questionList = new ArrayList <>();
    }
    
    public void addQuestion(QuestionPojo p)
    {
        questionList.add(p);
    }
    public QuestionPojo getQuestion(int pos)
    {
        return questionList.get(pos);
    }
    public void removeQuestion(int pos)
    {
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos,QuestionPojo q)
    {
        questionList.add(pos,q);
    }
    public ArrayList<QuestionPojo> getAllQuestions()
    {
        return questionList;
    }
    public int getCount()
    {
        return questionList.size();
    }
}
