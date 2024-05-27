package de.wicked539.webfluxpg;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BeerService {

    private final BeerRepository beerRepository;
    private final BeerSelectorService beerSelectorService;

    public BeerService(BeerRepository beerRepository, BeerSelectorService beerSelectorService) {
        this.beerRepository = beerRepository;
        this.beerSelectorService = beerSelectorService;
    }

    public Flux<Beer> getBeer() {
        return beerRepository.findAllById(beerSelectorService.getIds());
    }
}
