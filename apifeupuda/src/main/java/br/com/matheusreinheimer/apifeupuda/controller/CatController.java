package br.com.matheusreinheimer.apifeupuda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.matheusreinheimer.apifeupuda.model.dto.CatDTO;
import br.com.matheusreinheimer.apifeupuda.service.CatService;
import br.com.matheusreinheimer.apifeupuda.util.CatMapper;

@Controller
@RequestMapping("/feupudos")
public class CatController {
    @Autowired
    private CatService catService;
    @GetMapping
    public String formInsert(Model model) {
        CatDTO cat = new CatDTO();
        model.addAttribute("objCat", cat);
        return "pages/register";
    }

    @PostMapping
    public String insert(@ModelAttribute CatDTO catDTO) {
        var cat = catService.insertOrUpdate( CatMapper.toCat(catDTO));
            if (cat.getId() != 0) {
                return "pages/catOk";
            } else {
                return "pages/catError";
            }
    }
}
