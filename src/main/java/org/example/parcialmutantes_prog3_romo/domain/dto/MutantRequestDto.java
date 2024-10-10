package org.example.parcialmutantes_prog3_romo.domain.dto;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import org.example.parcialmutantes_prog3_romo.validators.ValidDna;

@Getter
@Setter
public class MutantRequestDto {
    @Valid
    @ValidDna
    private String[] dna;
}
