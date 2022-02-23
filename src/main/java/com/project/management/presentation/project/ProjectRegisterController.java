package com.project.management.presentation.project;

import com.project.management.application.service.ProjectService;
import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.Project;
import com.project.management.domain.model.project.ProjectList;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
                    @Validated @ModelAttribute("project") Project project,
                    BindingResult result) {
        if (result.hasErrors()) return "project/register/input";

//        projectService.register(project);
        System.out.println(project);
        return "redirect:/projects";
    }

}
