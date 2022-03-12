/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author umaga
 */
public class RegisterServlet extends HttpServlet{
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    res.setContentType("text/html"); 
    PrintWriter out=res.getWriter();
    out.println("<h2>welcome to servlet</h2><hr>");
    String name=req.getParameter("username");
    String password=req.getParameter("password");
    String address=req.getParameter("address");
    String mobile=req.getParameter("mobile");
    String gender=req.getParameter("gender");
    String course=req.getParameter("course");
    String condition=req.getParameter("condition");
    
  
    if(condition!=null){
    if(condition.equals("checked")){
        out.println("<h2> Name : "+name+"</h2>");
        out.println("<h2>  Password : "+password+"</h2>");
        out.println("<h2> Address : "+address+"</h2>");
        out.println("<h2> mobile no : "+mobile+"</h2>");
        out.println("<h2> Gender : "+gender+"</h2>");
        out.println("<h2> Course : "+course+"</h2>");
        //jdbc
        
        //
        //
        RequestDispatcher rd=req.getRequestDispatcher("success");
        rd.forward(req, res);
        
        
     
    }else{
        out.println("<h2>you have not accepted terms and condition</h2>");
    }
   }
    else{
        out.println("<h2>you have not accepted terms and condition</h2>");
        //i want to include
        
        //get object dispater
        RequestDispatcher rd=req.getRequestDispatcher("index.html");
        rd.include(req, res);
    }
   }
}
