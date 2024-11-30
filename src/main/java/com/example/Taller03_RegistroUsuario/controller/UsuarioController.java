package com.example.Taller03_RegistroUsuario.controller;

import com.example.Taller03_RegistroUsuario.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    @GetMapping("/formulario")    
    public String showForm(Model model){
        model.addAttribute("usuario", new Usuario());
        return "formulario";
    }
    
    @PostMapping("/guardar")
    public String submitForm(@ModelAttribute Usuario usuario, Model model){
        model.addAttribute("usuario", usuario);
        return "resultado";
    }
    
    
}
