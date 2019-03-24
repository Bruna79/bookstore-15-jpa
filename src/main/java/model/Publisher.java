package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "publishers")
public class Publisher extends BasicEntity {

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();


}
