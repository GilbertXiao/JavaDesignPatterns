package com.gilxyj.demeter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: principle
 * @description: 管理学院员工的管理类
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-06-07 19:37
 **/
public class CollegeManager {

    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id=" + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息（id）
    public void printAllEmp(){

        List<CollegeEmployee> allEmployee = getAllEmployee();
        for (CollegeEmployee e:allEmployee
        ) {
            System.out.println(e.getId());
        }
    }
}
