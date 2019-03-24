package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "customers")
public class Customer extends BasicEntity {


    @Column (name = "first_name", nullable = false, length = 40)
    private String firstName;

    @Column (name = "last_name", nullable = false, length = 40)
    private String lastName;

    @Column (name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column (name = "email", length = 30)
    private String eMail;

    @Column (name = "sex")
    @Enumerated (EnumType.STRING)
    private Sex sex;

    @Column (name = "date_of_birth")
    private LocalDate dateOfBirth;

    @ElementCollection
    @CollectionTable (name = "customers_phones",
            joinColumns = @JoinColumn(name = "customer_id"))
    @Column (name = "phone_number", length = 9)
    private Set<Integer> phoneNumber = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
