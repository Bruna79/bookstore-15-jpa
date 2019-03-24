package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
public class PossibleType {

    @TableGenerator(
            name = "possibleTypePKGenerator",
            table = "possible_types_pk_generator",
            pkColumnName = "possible_type_pk",
            valueColumnName = "possible_type_id",
            pkColumnValue = "id",
            allocationSize = 1
    )
    @GeneratedValue(generator = "possibleTypePKGenerator")
    @Id
    private Long id;

    private  boolean isTrue;

    private Integer wrappedInteger;

    private BigInteger bigInteger;

    private String name;

    private Double aDouble;

    private LocalDate localDate;

    private Byte[] wrappedBytes;

    private Day day;

}
