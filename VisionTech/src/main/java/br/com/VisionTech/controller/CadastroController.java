package br.com.VisionTech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {

	@GetMapping({"/cadastro"})
public String home(String username) {
         return "html/cadastro";



}
}