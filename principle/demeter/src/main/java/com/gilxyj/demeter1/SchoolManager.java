package com.gilxyj.demeter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: principle
 * @description: 学校管理类
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-06-07 19:47
 **/
public class SchoolManager {


    public List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部iD="+i);
            employees.add(employee);
        }
        return employees;
    }

    //该方法完成输出学校总部和学院员工信息（id）
    public void printAllEmp(CollegeManager sub){

        //1.这里的CollegeEmployee 不是SchoolManager的直接朋友
        //1.CollegeEmployee 是以局部变量的方式出现在SchoolManager中，不符合迪米特法则
        //获取学院的员工
        List<CollegeEmployee> allEmployee = sub.getAllEmployee();
        for (CollegeEmployee e:allEmployee
             ) {
            System.out.println(e.getId());
        }

        //获取学校的员工
        List<Employee> allEmployee1 = this.getAllEmployee();
        for (Employee e :
            allEmployee1) {
            System.out.println(e.getId());
        }

    }
}
