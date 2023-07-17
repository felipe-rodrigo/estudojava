package projeto2.escola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import projeto2.escola.domain.Turma;

@Controller
public class TurmaController {

  @GetMapping("/listar")
  public String listaTurma(Turma turma) {
    return "lista";
  }

  @PostMapping("/adicionar")
  public String addTurma(Turma turma) {
    return "add_turma";
  }
}
