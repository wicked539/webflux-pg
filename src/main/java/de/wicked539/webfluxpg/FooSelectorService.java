package de.wicked539.webfluxpg;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class FooSelectorService {

    public List<Long> getIds() {
        return new Random(42).longs(5, 0, 50).boxed().collect(Collectors.toList());
    }
}
