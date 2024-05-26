package de.wicked539.webfluxpg;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class FooService {

    private final FooRepository fooRepository;
    private final FooSelectorService fooSelectorService;

    public FooService(FooRepository fooRepository, FooSelectorService fooSelectorService) {
        this.fooRepository = fooRepository;
        this.fooSelectorService = fooSelectorService;
    }

    public Flux<Foo> getFoo() {
        return fooRepository.findAllById(fooSelectorService.getIds());
    }
}
