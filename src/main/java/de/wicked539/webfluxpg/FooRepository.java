package de.wicked539.webfluxpg;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface FooRepository extends ReactiveCrudRepository<Foo, Long> {
}
