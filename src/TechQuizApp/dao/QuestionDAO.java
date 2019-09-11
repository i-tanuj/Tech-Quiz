/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dao;

import TechQuizApp.Pojo.QuestionPojo;
import TechQuizApp.Pojo.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;

/**
 *
 * @author PC
 */
public class QuestionDAO {
    public static void addQuestions(QuestionStore qstore)throws SQLException
    {
        String  qry = "insert into questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList<QuestionPojo> questionList = qstore.getAllQuestions();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement(qry);
        for (QuestionPojo obj : questionList)
        {
            System.out.println(obj);
            ps.setString(1,obj.getExamId());
            ps.setInt(2, obj.getQno());
            ps.setString(3, obj.getQuestions());
            ps.setString(4, obj.getAnswer1());
            ps.setString(5, obj.getAnswer2());
            ps.setString(6, obj.getAnswer3());
            ps.setString(7, obj.getAnswer4());            
            ps.setString(8, obj.getCorrectAnswer());
            ps.setString(9, obj.getLanguage());
            ps.executeUpdate();
        }
    }
    
    public static ArrayList<QuestionPojo> getQuestionsByExamId(String examId) throws SQLException
    {
        String  qry = "select * from questions where examid = ? order by qno";
        ArrayList<QuestionPojo> questionList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement(qry);
        ps.setString(1,examId);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int qno = rs.getInt("QNO");
            String question = rs.getString("Question");
            String Option1 = rs.getString("Answer1");
            String Option2 = rs.getString("Answer2");
            String Option3 = rs.getString("Answer3");
            String Option4 = rs.getString("Answer4");
            String correctAnswer = rs.getString("Correct_answer");
            String Language = rs.getString("language");
            QuestionPojo obj = new QuestionPojo(examId,qno,Language,Option1,Option2,Option3,Option4,correctAnswer,question);
            System.out.println(obj);
            questionList.add(obj);
        }
        return questionList;
    }
    public static void updateQuestions(QuestionStore qstore)throws SQLException
    {
        String  qry = "update questions set question = ?, answer1 = ?, answer2 = ?, answer3 =?, answer4 = ?, correct_answer = ? where qno = ?";
        ArrayList<QuestionPojo> questionList = qstore.getAllQuestions();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement(qry);
        for (QuestionPojo obj : questionList)
        {
            ps.setString(1, obj.getQuestions());
            ps.setString(2, obj.getAnswer1());
            ps.setString(3, obj.getAnswer2());
            ps.setString(4, obj.getAnswer3());
            ps.setString(5, obj.getAnswer4());            
            ps.setString(6, obj.getCorrectAnswer());
            ps.setInt(7, obj.getQno());
            ps.executeUpdate();
        }
    }
    
}
