package pl.ohayer.motorcycle_dealear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.ohayer.motorcycle_dealear.service.PhotoService;

@Controller
@RequestMapping("/moto")
public class PhotoController {
    @Autowired
    PhotoService photoService;
    @GetMapping("/photo")
    public String photoPage(){
        return "photoadder";
    }
    @PostMapping("/photo")
    @ResponseBody
    public String addImages(@RequestParam("zdjecia") MultipartFile[] photos){
        for (MultipartFile photo : photos) {
            photoService.saveImage(photo);
        }
        return "added";
    }
}
