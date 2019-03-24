package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Getter
@Setter
@Table(name = "books")
@Entity

public class Book extends BasicEntity{


    @Column(name = "title", length = 40, nullable = false)
    private String title;

    @Column(name = "pages_number", length = 11, nullable = false)
    private Integer pagesNumber;

    @Column(name = "isbn", length = 13)
    private BigInteger isbn;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
