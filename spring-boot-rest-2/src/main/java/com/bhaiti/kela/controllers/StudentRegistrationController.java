package com.bhaiti.kela.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.*;

@Controller
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value="/register/student")

    @ResponseBody
    public List<StudentRegistrationReply> registerStudent(@RequestBody List<Student> studentList) {
        System.out.println("In registerStudent");
        List<StudentRegistrationReply> studentRegistrationReplyList = new ArrayList<>();
        for(int i=0; i<studentList.size(); i++)
        {
            StudentRegistrationReply stdregreply = new StudentRegistrationReply();
            Student stdn = studentList.get(i);
            StudentRegistration.getInstance().add(stdn);
            stdregreply.setName(stdn.getName());
            stdregreply.setAge(stdn.getAge());
            stdregreply.setRegistrationNumber(stdn.getRegistrationNumber());
            stdregreply.setRegistrationStatus("student added successfully");
            studentRegistrationReplyList.add(stdregreply);

        }
        return studentRegistrationReplyList;
    }

}