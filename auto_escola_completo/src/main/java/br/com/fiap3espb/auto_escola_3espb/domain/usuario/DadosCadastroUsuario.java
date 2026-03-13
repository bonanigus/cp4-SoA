package br.com.fiap3espb.auto_escola_3espb.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastroUsuario(
        @NotBlank String login,
        @NotBlank @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres") String senha,
        Role perfil
) {}
