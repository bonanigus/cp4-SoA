package br.com.fiap3espb.auto_escola_3espb.domain.usuario;

public record DadosDetalhamentoUsuario(Long id, String login, Role perfil) {
    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.getPerfil());
    }
}
