package org.DBD.DBDRandom.controllers;

import org.DBD.DBDRandom.models.Fetcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.json.*;

import java.io.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index () {
        return "index";
    }
   //TODO Finish killerAddons.json
    @GetMapping("/list")
    public String list (Model model) throws IOException {
        model.addAttribute("addons", Fetcher.fetchKillerAddons("Trapper"));
        return "list";
    }
}
