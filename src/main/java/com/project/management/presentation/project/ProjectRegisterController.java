package com.project.management.presentation.project;

import com.project.management.application.service.ProjectService;
import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.Project;
import com.project.management.domain.model.project.ProjectList;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller("案件登録")
@RequestMapping("/projects/register")
public class ProjectRegisterController {
    ProjectService projectService;

    public ProjectRegisterController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @InitBinder("project")
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields(
                "projectName.value",
                "clientName.value",
                "picName.value",
                "schedule.from",
                "schedule.to"
        );
    }

    @ModelAttribute("project")
    public Project project() {
        return Project.newProject();
    }

    @GetMapping
    String input(Model model) {
        return "project/register/input";
    }

    @PostMapping
    String register(Model model,
                    @ModelAttribute("project") Project project) {
//        projectService.register(project);
        System.out.println(project);
        return "redirect:/projects/register/complete";
    }

    @GetMapping("/complete")
    String complete(Model model) {
        return "project/register/complete";
    }
}
