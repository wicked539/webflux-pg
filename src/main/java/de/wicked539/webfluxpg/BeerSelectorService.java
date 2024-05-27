package de.wicked539.webfluxpg;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class BeerSelectorService {

    public List<Long> getIds() {
        return new Random().longs(5, 0, 192).boxed().collect(Collectors.toList());
    }
}
