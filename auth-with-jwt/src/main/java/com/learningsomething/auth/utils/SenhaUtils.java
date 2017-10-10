package com.learningsomething.auth.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * Gera um hash utilizando BCrypt.
     *
     * @param senha
     * @return String
     */
    public String gerarBCrypt(String senha) {
        if(senha == null) {
            return senha;
        }

        return this.bCryptPasswordEncoder.encode(senha);
    }

    /**
     * Verifica se a senha é valida.
     *
     * @param senha
     * @param hash
     * @return boolean
     */
    public boolean senhaValida(String senha, String hash) {
        return this.bCryptPasswordEncoder.matches(senha, hash);
    }
}
