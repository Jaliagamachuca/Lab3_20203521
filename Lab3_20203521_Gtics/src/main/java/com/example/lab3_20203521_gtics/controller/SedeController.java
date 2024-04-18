package com.example.lab3_20203521_gtics.controller;

import com.example.lab3_20203521_gtics.entity.Sede;
import com.example.lab3_20203521_gtics.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sede")
public class SedeController{

    final
    SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    @GetMapping(value= {"/list",""})
    public String listarSedes(Model model){
        List<Sede> lista = sedeRepository.findAll();
        model.addAttribute("listTransportation",lista);
        return "sede/ListaSedes";
    }

}
