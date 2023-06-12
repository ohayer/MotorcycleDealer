package pl.ohayer.motorcycle_dealear.controller;

import org.springframework.web.bind.annotation.*;
import pl.ohayer.motorcycle_dealear.listing.Advert;
import pl.ohayer.motorcycle_dealear.repository.MotoRepository;

import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotoController {
    private final MotoRepository motoRepository;

    public MotoController(MotoRepository motoRepository) {
        this.motoRepository = motoRepository;
    }
    @GetMapping("/add")
    public void add(){
        Advert advert = new Advert("Suzuki","Sv650",16000,2008);
        motoRepository.save(advert);
    }

    @GetMapping("")
    public List<Advert> getAdvert() {
        return motoRepository.findAll();
    }
    @PostMapping("")
    public Advert addAdvert(@RequestBody Advert advert) {
       return motoRepository.save(advert);
    }

}
