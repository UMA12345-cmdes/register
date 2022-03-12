/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author umaga
 */
public class successServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("success servlet");
        out.println("<h2> successfully registered</h2>");
    }
    
}
