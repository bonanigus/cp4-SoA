package br.com.fiap3espb.auto_escola_3espb.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull Long id,
        Role perfil
) {}
