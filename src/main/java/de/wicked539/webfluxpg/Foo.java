package de.wicked539.webfluxpg;


import org.springframework.data.annotation.Id;

public class Foo {
    @Id
    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
