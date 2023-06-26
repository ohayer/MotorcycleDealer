package pl.ohayer.motorcycle_dealear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.ohayer.motorcycle_dealear.listing.Advert;
import pl.ohayer.motorcycle_dealear.repository.MotoRepository;
import pl.ohayer.motorcycle_dealear.service.PhotoService;

import java.io.IOException;

@Controller
public class ProductController {
    @Autowired
    MotoRepository motoRepository;
    @Autowired
    private PhotoService photoService;
    @GetMapping("/brand={brand}&model={model}&mileage={mileage}")
    public String getProduct(@PathVariable String brand,
                             @PathVariable String model,
                             @PathVariable long mileage,
                             Model models) throws IOException {
        Advert advert = motoRepository.getAdvertByBrandAndModelAndMileage(brand, model, mileage);
        models.addAttribute("advert",advert);
        models.addAttribute("file",photoService.returnImage());
        return "product";
    }
}
