package com.ain.syl.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

// import org.springframework.hateoas.Identifiable;

/**
 * Base class for entity implementations. Uses a {@link Long} id.
 *
 * @author Young Gyu Park
 */
@MappedSuperclass
@Getter
@ToString
@EqualsAndHashCode
public class AbstractEntity { // implements Identifiable<Long> {

    protected AbstractEntity() {
        this.id = null;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private final Long id;

    @Version
    private Long version;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}