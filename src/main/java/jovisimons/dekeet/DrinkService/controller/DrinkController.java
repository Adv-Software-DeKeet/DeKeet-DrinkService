package jovisimons.dekeet.DrinkService.controller;

import jovisimons.dekeet.DrinkService.model.Drink;
import jovisimons.dekeet.DrinkService.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/drink")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DrinkController {

    @Autowired
    DrinkService service;
    @GetMapping("/{id}")
    public List<Drink> GetDrinkByEventId(@PathVariable String eventId){
        return service.GetDrankjeByEventId(eventId);
    }

    @PostMapping
    public void SetDrink(@RequestBody Drink drink){
        service.SetDrankje(drink);
    }
}
