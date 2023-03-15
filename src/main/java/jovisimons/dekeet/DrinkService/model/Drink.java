package jovisimons.dekeet.DrinkService.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jovisimons.dekeet.DrinkService.LocalDateDeserializer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Drink {
    //properties
    @Id
    private String id;
    private String eventId;
    private String userId;
    private Integer aantal;
    @JsonDeserialize(using= LocalDateDeserializer.class)
    private LocalDate datum;
    private String drankje;

    public Drink() {
    }

    public Drink( String userId, String eventId, Integer aantal, String drankje) {
        this.eventId = eventId;
        this.userId = userId;
        this.aantal = aantal;
        this.drankje = drankje;
    }

    public String getId(){return id;}
    public void setId(String id){this.id = id;}

    public String getUserId(){return userId;}
    public void setUserId(String userId){this.userId = userId;}

    public String getEventId(){return eventId;}
    public void setEventId(String eventId){this.eventId = eventId;}

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
