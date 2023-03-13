package jovisimons.dekeet.DrinkService.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jovisimons.dekeet.DrinkService.LocalDateDeserializer;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Drink {
    //properties
    @Id
    private String id;
    private Integer aantal;
    @JsonDeserialize(using= LocalDateDeserializer.class)
    private LocalDate datum;
    private String drankje;

    public Drink() {
    }

    public Drink(Integer aantal, LocalDate datum, String drankje) {
        this.aantal = aantal;
        this.datum = datum;
        this.drankje = drankje;
    }

    public String getId(){return id;}
    public void setId(String id){this.id = id;}

    public Integer getAantal() {
        return aantal;
    }

    public void setAantal(Integer aantal) {
        this.aantal = aantal;
    }

    public LocalDate getDate() {
        return datum;
    }

    public void SetDate(LocalDate datum) {
        this.datum = datum;
    }

    public String getDrankje() {
        return drankje;
    }

    public void SetDrankje(String drankje) {
        this.drankje = drankje;
    }
}
