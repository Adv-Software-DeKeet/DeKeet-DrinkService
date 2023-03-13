package jovisimons.dekeet.DrinkService.controller;

import jovisimons.dekeet.DrinkService.model.Drink;
import jovisimons.dekeet.DrinkService.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/drink")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DrinkController {

    @Autowired
    DrinkService service;
    @GetMapping("/{id}")
    public String GetBeers(@PathVariable Long id){
        return "bier";
    }

    @PostMapping
    public void SetBeers(@RequestBody Drink drink){
        service.SetDrankje(drink);
    }
}
