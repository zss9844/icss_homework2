package com.icss.day_04.controller;

import com.icss.day_04.pojo.Employee;
import com.icss.day_04.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取添加的用户名和密码
         int flowid = 0;
         int type = Integer.parseInt(request.getParameter("type"));
         int idcard = Integer.parseInt(request.getParameter("idcard"));
         String examcard = request.getParameter("examcard");
         String studentname = request.getParameter("studentname");
         String location = request.getParameter("location");
         int grade = Integer.parseInt(request.getParameter("grade"));
        //2.实现添加操作
        EmployeeService es = new EmployeeService();
//        //
        es.addEmployee(new Employee(flowid,type,idcard,examcard,studentname,location,grade));

        //3.回到show页面来展示信息
        request.getRequestDispatcher("ShowServlet").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
