package org.sang.security01;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegService {
    public int reg(String username, String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String encodePasswod = encoder.encode(password);
        return saveToDb(username, encodePasswod);
    }

    private int saveToDb(String username, String encodePasswod) {
        return 0;
    }
}
