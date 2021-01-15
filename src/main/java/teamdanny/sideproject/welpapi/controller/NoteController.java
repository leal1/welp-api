package teamdanny.sideproject.welpapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teamdanny.sideproject.welpapi.model.Note;
import teamdanny.sideproject.welpapi.repository.NoteRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class NoteController {
    private final NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

}
