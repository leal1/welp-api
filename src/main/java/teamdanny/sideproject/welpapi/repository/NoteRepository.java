package teamdanny.sideproject.welpapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamdanny.sideproject.welpapi.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
