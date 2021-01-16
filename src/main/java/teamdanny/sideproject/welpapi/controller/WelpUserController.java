package teamdanny.sideproject.welpapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teamdanny.sideproject.welpapi.Service.WelpUserService;
import teamdanny.sideproject.welpapi.model.WelpUser;

import javax.validation.Valid;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/welp-user")
public class WelpUserController {
    private final WelpUserService welpUserService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody @Valid WelpUser user) {
        try {
            welpUserService.register(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        catch(IllegalArgumentException ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
