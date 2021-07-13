package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class HelloController {
    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping("/hello")
    String helloWorld() {
        return "hello";
    }


    @GetMapping("/capitalize/hello")
    String capitalize(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        System.out.println(name);
        return "HelloWord";
    }

    @GetMapping("/albums")
    public String albums(Model model) {
//        ArrayList<Album> albums= new ArrayList<>();
//        Album kolHyati = new Album("كل حياتي","Amr Diab",13, "https://amayei.nyc3.digitaloceanspaces.com/2021/03/Screen-Shot-2021-03-18-at-12.18.18-PM.png",55555555);
//        Album sahran = new Album("Sahran","AMR DIAB",16,"https://www.hbibi.net/images/covers/Amr_Diab_-_Sahran_album_2020_%D8%B9%D9%85%D8%B1%D9%88_%D8%AF%D9%8A%D8%A7%D8%A8_-_%D8%A3%D9%84%D8%A8%D9%88%D9%85_%D8%B3%D9%87%D8%B1%D8%A7%D9%86.jpg",13546887);
//        Album ahlaOahla =   new Album("Ahla O Ahla","AMR DIAB",14,"https://assets.audiomack.com/mockingme/3b338135ee423a78a03de2140f99ce82.jpeg?width=1000&height=1000&max=true",45123);
//        albums.add(kolHyati);
//        albums.add(sahran);
//        albums.add(ahlaOahla);
//        model.addAttribute("album", albums);
        model.addAttribute("albums", albumRepository.findAll());

        return "album";
    }

    @GetMapping("/addYourAlbum")
    public String addYourAlbum() {
        return "newAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam(value = "title") String title ,
                                 @RequestParam(value= "artist") String artist,
                                 @RequestParam(value="songCount") int songCount,
                                 @RequestParam(value="imageUrl") String imageUrl,
                                 @RequestParam(value="length") long length) {
        Album album = new Album(title,artist,songCount,imageUrl,length);
         albumRepository.save(album);
        return  new RedirectView("/albums");
    }
}