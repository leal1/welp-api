package teamdanny.sideproject.welpapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import teamdanny.sideproject.welpapi.model.WelpUser;
import teamdanny.sideproject.welpapi.repository.WelpUserRepository;


@RequiredArgsConstructor
@Service
public class WelpUserService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final WelpUserRepository welpUserRepository;


    public void register(WelpUser welpUser) {
        if (welpUserRepository.existsByUsername(welpUser.getUsername())) {
            throw new IllegalArgumentException("Username is already in use");
        }
        welpUser.setPassword(bCryptPasswordEncoder.encode(welpUser.getPassword()));
        welpUserRepository.save(welpUser);
    }

}
