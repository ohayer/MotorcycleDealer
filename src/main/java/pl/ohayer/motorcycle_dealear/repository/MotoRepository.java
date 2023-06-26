package pl.ohayer.motorcycle_dealear.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ohayer.motorcycle_dealear.listing.Advert;

public interface MotoRepository extends JpaRepository<Advert,Long> {
    Advert getAdvertByBrandAndModelAndMileage(String brand, String model, long mileage);
}
