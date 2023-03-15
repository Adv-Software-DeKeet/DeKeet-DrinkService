package jovisimons.dekeet.DrinkService;

import jovisimons.dekeet.DrinkService.model.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DrinkRepo extends MongoRepository<Drink, String> {

}