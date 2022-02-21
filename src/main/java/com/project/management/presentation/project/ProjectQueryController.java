package com.project.management.presentation.project;

import com.project.management.application.service.ProjectService;
import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.ProjectList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("案件参照")
@RequestMapping("/projects")
public class ProjectQueryController {
    ProjectService projectService;

    public ProjectQueryController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @ModelAttribute("keyword")
    public Keyword keyword() {
        return new Keyword("");
    }

    @GetMapping()
    String top(@ModelAttribute("keyword") Keyword keyword,
               Model model) {
        ProjectList projectList = projectService.search(keyword);
        model.addAttribute("projectList", projectList);
        return "project/list";
    }
}
