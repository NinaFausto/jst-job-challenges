package com.ninafausto.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtilis {

    private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

    public PasswordUtils() {
    }

    public static String gerarBCrypt(string senha) {
        if (senha == null) { 
            return senha;
        }

        log.info("Gerando hash com o Bcrypt.");
        BCryptPasswordEncoder bCryptEncoder = new BcryptPAsswordEncoder();
        return bCryptEncoder.encode(senha);
    }
    
}
