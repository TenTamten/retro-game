package com.github.retro_game.retro_game.controller;

import com.github.retro_game.retro_game.service.PrangerService;
import com.github.retro_game.retro_game.service.dto.PrangerEntryDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PrangerController {
  private final PrangerService prangerService;

  public PrangerController(PrangerService prangerService) {
    this.prangerService = prangerService;
  }

  @GetMapping("/pranger")
  public String messages(@RequestParam(name = "body") long bodyId, Model model) {
    List<PrangerEntryDto> pranger = prangerService.get(bodyId);
    model.addAttribute("bodyId", bodyId);
    model.addAttribute("pranger", pranger);
    return "pranger";
  }
}
