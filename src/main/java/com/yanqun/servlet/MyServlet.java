package com.yanqun.servlet;
//注释。。6666


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do post");
        int a = 10 ;
        int b = 20 ;
        a = a + b ;
        System.out.println(a);
        System.out.println(b);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do post");
        int a = 10 ;
        int b = 20 ;
        a = a + b ;
        System.out.println(a);
        System.out.println(b);
    }
}
