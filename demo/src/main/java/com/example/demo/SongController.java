//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//public class SongController {
//
//    @Autowired
//    SongRepository songRepository;
//
//    @Autowired
//    AlbumRepository albumRepositry;
//
//    @GetMapping("/songs")
//    public String getAllSongs(Model m){
//        List<Song> songs = songRepository.findAll();
//        m.addAttribute("songs",songs);
//        return "Song.html";
//    }
//
//    @GetMapping("/addSong")
//    public String getAddSong(){
//        return "newSong";
//    }
//
//    @PostMapping("/songs")
//    public String addSong(@RequestParam(value = "title") String title ,
//                          @RequestParam(value= "trackNumber") int trackNumber,
//                          @RequestParam(value="length") int length,
//                          @RequestParam(value="albumID") long albumID, Model m){
//        Album album = albumRepositry.findById(albumID).get();
//        Song songs = new Song(title,length,trackNumber,album);
//        songRepository.save(songs);
//        Album newAlbum = albumRepositry.findById(album.getId()).get();
//        m.addAttribute("songs", newAlbum.getSongs());
//        return "/songs";
//    }
//}
