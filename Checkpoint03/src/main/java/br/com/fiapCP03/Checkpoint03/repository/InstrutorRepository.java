package br.com.fiapCP03.Checkpoint03.repository;

import br.com.fiapCP03.Checkpoint03.domain.Instrutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    Page<Instrutor> findByAtivoTrue(Pageable pageable);
}

