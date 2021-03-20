package com.knishe.supplier;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Supplier {
    @Id
    private Long id;
    private String clientName;
}
