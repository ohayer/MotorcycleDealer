package pl.ohayer.motorcycle_dealear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.ohayer.motorcycle_dealear.listing.Advert;
import pl.ohayer.motorcycle_dealear.repository.MotoRepository;
import pl.ohayer.motorcycle_dealear.service.PhotoService;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private MotoRepository motoRepository;
    @Autowired
    private PhotoService photoService;
    @GetMapping("/")
    public String getHome(Model model) throws IOException {
        List<Advert> adverts = motoRepository.findAll();
        model.addAttribute("adverts",adverts);
        model.addAttribute("file", photoService);
        return "home";
    }
}
