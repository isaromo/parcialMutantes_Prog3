package org.example.parcialmutantes_prog3_romo.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatsResponse {
    private Long countMutantDna;
    private Long countHumanDna;
    private Double ratio;
}
