package com.student.controller;

import com.student.entity.Students;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudentData")
    @ResponseBody
    public List<Students> getStudentData(){
        List<Students> list=studentService.getAllStudents();
        return list;
    }

    @RequestMapping("/addstudent")
    public String addstudent(Model model,Students students){
        return "";
    }

    @RequestMapping("/deletestudent")
    public String deletestudent(Model model,Integer xh){
        return "";
    }

    @RequestMapping("/updataStudent")
    public String updataStudent(Model model,Integer xh){
        return "";
    }
}
