package com.algaworks.gestaofesta.controller;

import com.algaworks.gestaofesta.model.Convidado;
import com.algaworks.gestaofesta.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListaConvidados");

        mv.addObject("convidados", convidados.findAll());
        mv.addObject(new Convidado());

        return mv;
    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
