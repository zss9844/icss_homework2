package com.icss.day_04.controller;

import com.icss.day_04.pojo.Employee;
import com.icss.day_04.service.EmployeeService;
import com.icss.day_04.dao.EmployeeDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 提取请求中的数据
        String examcard = request.getParameter("examcard");
        //取对应数据删除
        EmployeeService es = new EmployeeService();
        List<Employee> emps = es.getAllEmployees();
        for(Employee e:emps){
            int flowid,type,idcard,grade;
            String examcard1,studentname,location;
            if (examcard.equals(e.getExamcard())){
                flowid=e.getFlowid();
                type=e.getType();
                idcard=e.getIdcard();
                examcard1=e.getExamcard();
                studentname=e.getStudentname();
                location=e.getLocation();
                grade=e.getGrade();
                //执行删除操作
                es.deleteEmployee(new Employee(flowid,type,idcard,examcard1,studentname,location,grade));
            }
        }
////        // 执行删除操作
//        EmployeeService es = new EmployeeService();
//        es.deleteEmployee(new Employee(examcard));

        // 回到展示页面
        response.sendRedirect("ShowServlet");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
