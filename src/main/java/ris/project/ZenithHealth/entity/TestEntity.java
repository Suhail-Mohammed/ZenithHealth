package ris.project.ZenithHealth.entity;

import jakarta.persistence.*;

@Entity
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public TestEntity() {}
    public TestEntity(String name) { this.name = name; }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

