package jovisimons.dekeet.DrinkService;

import jovisimons.dekeet.DrinkService.model.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface DrinkRepo extends MongoRepository<Drink, String> {
    @Query("select d from Drankje d where d.datum = :datum and d.drankje = :drankje")
    Drink findByDatumAndDrankje(@Param("datum") LocalDate datum, @Param("drankje")String drankje);
}