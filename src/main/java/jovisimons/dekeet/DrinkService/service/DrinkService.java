package jovisimons.dekeet.DrinkService.service;

import jovisimons.dekeet.DrinkService.DrinkRepo;
import jovisimons.dekeet.DrinkService.model.Drink;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DrinkService {
    final
    DrinkRepo repo;

    public DrinkService(DrinkRepo repo) {
        this.repo = repo;
    }

    public void SetDrankje(Drink drankje){
        repo.insert(drankje);
    }

    public List<Drink> GetDrankjeByEventId(String eventId){
        return repo.findAllById(Collections.singleton(eventId));
    }
}
