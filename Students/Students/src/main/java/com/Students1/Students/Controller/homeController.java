package com.Students1.Students.Controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Students1.Students.model.students;
import com.Students1.Students.service.studentservice;


import jakarta.validation.Valid;

@Controller
public class homeController{
    @Autowired
    private studentservice service;

    @RequestMapping("/addStudent")
    public String addStudent(Model model) {
        model.addAttribute("student", new students());
        return "index";
    }
    @RequestMapping(value ="/saveStudent",method = RequestMethod.POST)
    public String saveStudent(@Valid
               @ModelAttribute("student")students student,
               BindingResult bindingResult)
               {
                if(bindingResult.hasErrors()){
                    return"index";
                }
                service.createStudent(student);
                return "redirect:/";
               }
    @RequestMapping("/")
    public String listAllStudents(Model model){
        model.addAttribute("students",service.getAllStudents());
        return "list";
    }
    @RequestMapping("/editStudent/{id}")
    public String editStudentForm(@PathVariable("id")Long id, Model model){
        Optional<students> studentOptional = service.getStudentById(id);
        if(studentOptional.isPresent()){
        	students student = studentOptional.get();
            model.addAttribute("student", student);
            return "edit";
        }else{
            return "redirect:/";
        }
    }
    @RequestMapping(value="/editStudent",method=RequestMethod.POST)
    public String editStudent(@Valid
               @ModelAttribute("student") students students,
               BindingResult bindingResult){

                if(bindingResult.hasErrors()){
                    return "edit";
                }
                service.updateStudent(students);
                return "redirect:/";
               }
    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id")Long id){
        service.deleteStudent(id);
        return "redirect:/";
    }
}