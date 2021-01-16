package teamdanny.sideproject.welpapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamdanny.sideproject.welpapi.model.WelpUser;

public interface WelpUserRepository extends JpaRepository<WelpUser,Long> {
    WelpUser findByUsername(String username);
    Boolean existsByUsername(String username);
   // Boolean existsByEmail(String email);
}
