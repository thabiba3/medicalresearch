package com.medicalresearch.medicalresearch.controllers;


import com.medicalresearch.medicalresearch.Models.Research;
import com.medicalresearch.medicalresearch.Models.ResearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    ResearchRepo researchRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("viruslist", researchRepo.findAll());
        return mv;
    }


  /*  @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("view");
        Optional<Research> person = researchRepo.findById(id);
        Research personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }*/
}
