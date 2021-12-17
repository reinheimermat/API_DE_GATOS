package br.com.matheusreinheimer.projectn2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.matheusreinheimer.projectn2.model.dto.CatDTO;

@Controller
@RequestMapping("/cats")
public class CatController {
    @GetMapping
    public String formInsert(Model model) {
        CatDTO cat = new CatDTO();
        model.addAttribute("objCat", cat);
        return "pages/register";
    }
}
