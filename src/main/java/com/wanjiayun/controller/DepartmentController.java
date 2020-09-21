package com.wanjiayun.controller;

import com.wanjiayun.bean.Department;
import com.wanjiayun.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/all")
    public String selectAll(){
        List<Department> departmentList = deptService.selectAll();
        //mv.addObject("departmentList",departmentList);
        ModelAndView view = new ModelAndView();
        departmentList.forEach(System.out::println);
        view.addObject("haha","万佳云,你好");
        return "dept";
    }
}
