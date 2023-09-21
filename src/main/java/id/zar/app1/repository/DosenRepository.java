package id.zar.app1.repository;

import id.zar.app1.DbModel.Dosen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DosenRepository extends JpaRepository<Dosen, String> {
    Optional<Dosen> findByNama(String name);
//    Optional<Dosen> findByNip(String nip_nrp);
}
