package jovisimons.dekeet.DrinkService.service;

import jovisimons.dekeet.DrinkService.DrinkRepo;
import jovisimons.dekeet.DrinkService.model.Drink;

public class DrinkService {
    final
    DrinkRepo repo;

    public DrinkService(DrinkRepo repo) {
        this.repo = repo;
    }

    public void SetDrankje(Drink drankje){
        Drink exDrankje = repo.findByDatumAndDrankje(drankje.getDate(), drankje.getDrankje());
        if(exDrankje == null){
            repo.save(drankje);
        }
        else {
            exDrankje.setAantal(exDrankje.getAantal()+1);
            repo.save(exDrankje);
        }
    }
}
