package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HelloController {
    @GetMapping("/hello")
    String helloWorld(){
        return "hello";
    }


    @GetMapping("/capitalize/{id}")
    String hello(Model model, @PathVariable("id") String id) {
        id.toUpperCase();
        model.addAttribute("name",id.toUpperCase());
        return "HelloWord";
}
    @GetMapping("/albums")
    public String albums( Model model) {
        ArrayList<Album> albums= new ArrayList<>();
        Album kolHyati = new Album("كل حياتي","Amr Diab",13, "https://amayei.nyc3.digitaloceanspaces.com/2021/03/Screen-Shot-2021-03-18-at-12.18.18-PM.png",55555555);
        Album sahran = new Album("Sahran","AMR DIAB",16,"https://www.hbibi.net/images/covers/Amr_Diab_-_Sahran_album_2020_%D8%B9%D9%85%D8%B1%D9%88_%D8%AF%D9%8A%D8%A7%D8%A8_-_%D8%A3%D9%84%D8%A8%D9%88%D9%85_%D8%B3%D9%87%D8%B1%D8%A7%D9%86.jpg",13546887);
        Album ahlaOahla =   new Album("Ahla O Ahla","AMR DIAB",14,"https://assets.audiomack.com/mockingme/3b338135ee423a78a03de2140f99ce82.jpeg?width=1000&height=1000&max=true",45123);
        albums.add(kolHyati);
        albums.add(sahran);
        albums.add(ahlaOahla);
        model.addAttribute("album", albums);
        return "album";
    }

}
