package de.wicked539.webfluxpg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class FooController {

    @GetMapping("/foo")
    public Flux<String> foo() {
        return null;
    }
}
