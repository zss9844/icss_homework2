package com.icss.day_04.dao;

import com.icss.day_04.pojo.Employee;
import com.icss.day_04.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
   /* static List<Employee> employees;
    static{
        employees = new ArrayList<>();
        employees.add(new Employee("AA","123"));
        employees.add(new Employee("BB","456"));
        employees.add(new Employee("CC","789"));
        employees.add(new Employee("DD","666"));
        employees.add(new Employee("EE","999"));
    }*/
    static List<Employee> solo;
    static{
    solo=new ArrayList<>();
    }
    public List<Employee>getSolo(){
        return solo;
    }
    public List<Employee> getAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<Employee> emps = new ArrayList<>();
        try{
            // 1.连接数据库
            conn = JDBCUtils.getConn();
            stmt = conn.createStatement();

            // 2.准备sql语句
            String sql = "select * from examstudent";

            // 3.执行sql语句
            rs = stmt.executeQuery(sql);

            // 4.将执行的结果封装为一个集合
            while(rs.next()){
                // 1）先创建一个空对象
                Employee emp = new Employee();
                // 2）将第n行的数据封装到空对象中
                emp.setFlowid(rs.getInt(1));
                emp.setType(rs.getInt(2));
                emp.setIdcard(rs.getInt(3));
                emp.setExamcard(rs.getString(4));
                emp.setStudentname(rs.getString(5));
                emp.setLocation(rs.getString(6));
                emp.setGrade(rs.getInt(7));

                // 3）将的到的数据整个的存入到集合中
                emps.add(emp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return emps;
    }
    public void newadd(Employee employee){
        solo.add(employee);
    }
    public void add(Employee employee){

        int type = employee.getType();
        int idcard = employee.getIdcard();
        String examcard = employee.getExamcard();
        String studentname = employee.getStudentname();
        String location = employee.getLocation();
        int grade = employee.getGrade();
        String sql = "insert into examstudent(flowid,type,idcard,examcard,studentname,location,grade) values(flowid.nextval,'"+type+"','"+idcard+"','"+examcard+"','"+studentname+"','"+location+"','"+grade+"')";


        JDBCUtils.update(sql);
//        employee.add(employee);
    }
//
    public void delete(Employee e){
        String sql = "delete from examstudent where examcard = '"+e.getExamcard()+"'";
        JDBCUtils.update(sql);
        //employees.remove(employee);
    }
//
//    public void update(Employee employee){
//        String sql = "update employee set password = '"+employee.getPassword()+"' where username = '"+employee.getUsername()+"'";
//        JDBCUtils.update(sql);
//        //employees.set(index,employee);
//    }
}
