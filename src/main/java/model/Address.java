package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address extends BasicEntity {

    @Column(name = "city", length = 30, nullable = false)
    private String city;

    @Column(name = "zip_code", length = 6, nullable = false)
    private String zipCode;

    @Column(name = "street", length = 30)
    private String street;

    @Column(name = "street_no", length = 6, nullable = false)
    private String streetNumber;

    @Column(name = "home_no", length = 4)
    private String homeNumber;

    @OneToMany(mappedBy = "address")
    private Set<Customer> customers = new HashSet<>();

    @OneToMany(mappedBy = "address")
    private Set<Publisher> publishers = new HashSet<>();

}
