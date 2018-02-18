package com.ukraine.springmvc.controller;

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
public class ProjectController {
    @Autowired
    private ProjectDao projectDao;

    // для проектів
    @RequestMapping(value = "/listProjects")
    public ModelAndView listProjects(ModelAndView model) throws IOException {
        List<Project> listProjects = projectDao.projectList();
        model.addObject("listProjects", listProjects);
        model.setViewName("projectsList");

        return model;
    }

    @RequestMapping(value = {"/delete-project-{projectId}"}, method = RequestMethod.GET)
    public String deleteProject(@PathVariable int projectId) {
        projectDao.delete(projectId);
        return "redirect:/listProjects";
    }

    @RequestMapping(value = {"/newproject"}, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        Project project = new Project();
        model.addAttribute("project", project);
        model.addAttribute("edit", false);
        return "newproject";
    }

    @RequestMapping(value = {"/newproject"}, method = RequestMethod.POST)
    public String saveUser(@Valid Project project, BindingResult result,
                           ModelMap model) {
        if (result.hasErrors()) {
            return "newproject";
        }
        projectDao.insertProject(project);
        model.addAttribute("successproject", "Project " + project.getProjectName() + " registered successfully");
        return "projectsuccess";
    }


    @RequestMapping(value = {"/edit-project-{projectId}"}, method = RequestMethod.GET)
    public String editUser(@PathVariable int projectId, ModelMap model) {
        Project project = projectDao.getProject(projectId);
        model.addAttribute("project", project);
        model.addAttribute("edit", true);
        return "newproject";
    }

    @RequestMapping(value = {"/edit-project-{projectId}"}, method = RequestMethod.POST)
    public String updateUser(@Valid @ModelAttribute("project") Project project, BindingResult result,
                             ModelMap model) {
        if (result.hasErrors()) {
            return "newproject";
        }
        projectDao.update(project);
        model.addAttribute("successproject", "Project " + project.getProjectName() + " registered successfully");
        return "projectsuccess";
    }
///для додавання юзера в проект

    @RequestMapping(value = {"/add-user-{projectId}"}, method = RequestMethod.GET)
    public String newUserInProject(ModelMap model) {
        Employee employee = new Employee();
        model.addAttribute("newuserinproject", employee);
        model.addAttribute("edit", false);
        return "addusertoproject";
    }

    @RequestMapping(value = {"/add-user-{projectId}"}, method = RequestMethod.POST)
    public String newUserInProject(@Valid Employee employee, BindingResult result,
                                   ModelMap model) {
        if (result.hasErrors()) {
            return "addusertoproject";
        }
        projectDao.insertUser(employee);
        model.addAttribute("successwhenaddingusertoproject", "User adding successfully");
        return "successwhenaddingusertoproject";
    }

    @ModelAttribute("objects")
    public List<Employee> findNameToAllObjects() {
        return projectDao.findAllObject();
    }
}
