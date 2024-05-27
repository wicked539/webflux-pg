package de.wicked539.webfluxpg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/beer")
    public Flux<String> beer() {
        return beerService.getBeer().map(Beer::getName);
    }
}
