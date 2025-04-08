package lt.mariaus.baigiamasis_darbas.repository;

import lt.mariaus.baigiamasis_darbas.entity.Detale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetaleRepository extends JpaRepository<Detale, Long> {
}
