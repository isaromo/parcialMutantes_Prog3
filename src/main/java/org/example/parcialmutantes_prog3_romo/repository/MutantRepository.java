package org.example.parcialmutantes_prog3_romo.repository;

import org.example.parcialmutantes_prog3_romo.domain.entities.Mutant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MutantRepository extends JpaRepository<Mutant, Long> {

    Optional<Mutant> findByDna(String dna);

    Long countByIsMutant(boolean isMutant);
}
