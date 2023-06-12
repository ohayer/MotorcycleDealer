package pl.ohayer.motorcycle_dealear.listing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private long mileage;
    private int produce_year;

    public Advert(String brand, String model, long mileage, int produce_year) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.produce_year = produce_year;
    }
}
