/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connect.security;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Devanand
 */
public class ProcessQuestion extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     */
    String dbUrl = "jdbc:odbc:Online_Exam_Portal";
String dbClass = "com.mysql.jdbc.Driver";
String query = "";
    private String readTextarea(String textAreaName, HttpServletRequest request)
    {
        String textAreaContent = "";
        textAreaContent = request.getParameter(textAreaName);
        return textAreaContent;
    }

    
    
    Answer = request.getParameter("CorrectAnswerRadio");
            //out.print(txtOptionD); 
            UserSession.setAttribute("QuestionEnteredValue", txtQuestion);
                UserSession.setAttribute("OptionAEnteredValue", txtOptionA);
                UserSession.setAttribute("OptionBEnteredValue", txtOptionB);

    
    
    else
            {
                UserSession.setAttribute("QuestionEnteredValue", null);
                UserSession.setAttribute("OptionAEnteredValue", null);
                UserSession.setAttribute("OptionBEnteredValue", null);
                
                txtQuestion = convertTextareaContent(txtQuestion);
                txtOptionA = convertTextareaContent(txtOptionA);
                txtOptionB = convertTextareaContent(txtOptionB);
                
                Connection con = DriverManager.getConnection (dbUrl,"","");