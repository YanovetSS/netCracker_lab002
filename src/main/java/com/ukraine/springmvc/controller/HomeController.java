package com.ukraine.springmvc.controller;

import com.ukraine.springmvc.dao.EmployeeDao;
import com.ukraine.springmvc.dao.ProjectDao;
import com.ukraine.springmvc.model.Employee;
import com.ukraine.springmvc.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/")
    public ModelAndView listContact(ModelAndView model) throws IOException {
        List<Employee> listContact = employeeDao.list();
        model.addObject("listContact", listContact);
        model.setViewName("employeeList");

        return model;
    }


    @RequestMapping(value = {"/delete-user-{objectId}"}, method = RequestMethod.GET)
    public String deleteUser(@PathVariable int objectId) {
        employeeDao.delete(objectId);
        return "redirect:/";
    }


    @RequestMapping(value = {"/newuser"}, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        Employee employee = new Employee();
        model.addAttribute("user", employee);
        model.addAttribute("edit", false);
        return "registration";
    }

    @RequestMapping(value = {"/newuser"}, method = RequestMethod.POST)
    public String saveUser(@Valid Employee employee, BindingResult result,
                           ModelMap model) {
        if (result.hasErrors()) {
            return "registration";
        }
        employeeDao.insertEmplyee(employee);
        model.addAttribute("success", "User " + employee.getObject() + " registered successfully");
        return "registrationsuccess";
    }

    @RequestMapping(value = {"/edit-user-{objectId}"}, method = RequestMethod.GET)
    public String editUser(@PathVariable int objectId, ModelMap model) {
        Employee employee = employeeDao.getEmployee(objectId);
        model.addAttribute("user", employee);
        model.addAttribute("edit", true);
        return "registration";
    }

    @RequestMapping(value = {"/edit-user-{objectId}"}, method = RequestMethod.POST)
    public String updateUser(@Valid @ModelAttribute("user") Employee user, BindingResult result,
                             ModelMap model) {
        if (result.hasErrors()) {
            return "registration";
        }
        employeeDao.Update(user);
        model.addAttribute("success", "User " + user.getObject() + " registered successfully");
        return "registrationsuccess";
    }

//    @ModelAttribute("objects")
//    public List<Employee> findNameToAllObjects() {
//        return employeeDao.findAllObject();
//    }

    @ModelAttribute("roles")
    public List<Employee> findAllRolesIntoProject() {
        return employeeDao.getAllRoles();
    }
}

