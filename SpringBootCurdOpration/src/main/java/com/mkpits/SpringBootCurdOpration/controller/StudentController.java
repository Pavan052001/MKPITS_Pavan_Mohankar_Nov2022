package com.mkpits.SpringBootCurdOpration.controller;

import com.mkpits.SpringBootCurdOpration.entity.Student;
import com.mkpits.SpringBootCurdOpration.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService)  {
        this.studentService = studentService;
    }
    @GetMapping("/Students")
    public String listStudent(Model model){
       model.addAttribute("Students",studentService.getAllStudents());
       return "students";

    }
    @GetMapping("/Students/new")
    public String CreatestudentForm(Model model){
        //create student object to hold student from data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";

    }
    @PostMapping("/Students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/Students";
    }
    @GetMapping("/Students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentbyId(id));
        return "edit_student";

    }
    @PostMapping("/Students/{id}")
    public String updateStudent(@PathVariable Long id ,
    @ModelAttribute("student") Student student, Model model) {
        Student existingStudent = studentService.getStudentbyId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.updateStudent(existingStudent);
        return "redirect:/Students";
    }
    @GetMapping("/Students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/Students";

    }
    @PostMapping("/Students/confirm-delete/{id}")
    public String confirmDeleteStudent(@PathVariable Long id) {
        // Delete the student from the HTML table (client-side only)
        return "redirect:/Students";
    }
}
