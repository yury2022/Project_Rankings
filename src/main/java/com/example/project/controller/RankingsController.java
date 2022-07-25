package com.example.project.controller;

import com.example.project.model.Rankings;
import com.example.project.repository.RankingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RankingsController {
    @Autowired
    RankingsRepository repository;

    @GetMapping("/ranking")
    public String findAll(Model model) {
        List<Rankings> ranks = repository.findAll();
        model.addAttribute("ranking", ranks);
        return "ranking";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        repository.deleteById(id);
        return "redirect:ranking";
    }

    @GetMapping("/addRankings")
    public String add() {
        return "addRankings";
    }

    @PostMapping("/addRankings")
    public String add(@ModelAttribute Rankings rankings) {
        repository.save(rankings);
        return "redirect:ranking";
    }

    @GetMapping("/updateRankings")
    public String update(@RequestParam int id, Model model) {
        Rankings rankings = repository.findById(id).get();
        model.addAttribute("rankings", rankings);
        return "updateRankings";
    }

    @PostMapping("/updateRankings")
    public String update(@ModelAttribute Rankings rankings) {
        repository.save(rankings);
        return "redirect:ranking";
    }

}