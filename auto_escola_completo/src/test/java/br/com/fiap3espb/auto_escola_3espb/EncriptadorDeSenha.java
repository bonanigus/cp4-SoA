package br.com.fiap3espb.auto_escola_3espb;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Utilitário para gerar hashes BCrypt de senhas.
 * Execute a main() para gerar o hash de uma senha e inserir diretamente no banco.
 *
 * Exemplo de INSERT para criar o primeiro admin:
 *   INSERT INTO usuarios (login, senha, perfil, ativo)
 *   VALUES ('admin', '<hash gerado aqui>', 'ADMIN', 1);
 */
public class EncriptadorDeSenha {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String[] senhas = {"admin123", "user123"};
        for (String senha : senhas) {
            System.out.printf("Senha: %-12s → Hash: %s%n", senha, encoder.encode(senha));
        }
    }
}
