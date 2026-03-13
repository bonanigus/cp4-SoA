package br.com.fiap3espb.auto_escola_3espb.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosAlteracaoSenha(
        @NotBlank String senhaAtual,
        @NotBlank @Size(min = 6, message = "A nova senha deve ter pelo menos 6 caracteres") String novaSenha
) {}
