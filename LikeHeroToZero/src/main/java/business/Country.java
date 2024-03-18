package business;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country implements Comparable<Country> {

    @Id
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public Country() {
    }

    public boolean equals(String s) {
        return this.name.toLowerCase().equals(s.toLowerCase());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Country other) {
        return this.name.compareTo(other.name);
    }
}
