package org.example.parcialmutantes_prog3_romo.service;

import org.example.parcialmutantes_prog3_romo.domain.dto.StatsResponse;
import org.example.parcialmutantes_prog3_romo.repository.MutantRepository;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    private final MutantRepository mutantRepository;

    // Inyección de dependencias por constructor
    public StatsService(MutantRepository mutantRepository) {
        this.mutantRepository = mutantRepository;
    }

    public StatsResponse getStats(){
        long humanCount = mutantRepository.countByIsMutant(false);
        long mutantCount = mutantRepository.countByIsMutant(true);
        // Si el dividendo es igual a 0, el ratio 0 (evita error por división por 0)
        double ratio = humanCount == 0 ? 0 : (double) mutantCount / humanCount;

        return new StatsResponse(humanCount, mutantCount, ratio);
    }
}
