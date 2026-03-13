package br.com.fiap3espb.auto_escola_3espb.domain.instrutor;

import br.com.fiap3espb.auto_escola_3espb.domain.endereco.Endereco;

public record DadosDetalhamentoInstrutor(
        Long id,
        String nome,
        String email,
        String telefone,
        String cnh,
        Especialidade especialidade,
        Endereco endereco) {
    public DadosDetalhamentoInstrutor(Instrutor instrutor) {
        this(instrutor.getId(), instrutor.getNome(), instrutor.getEmail(), instrutor.getTelefone(), instrutor.getCnh(), instrutor.getEspecialidade(), instrutor.getEndereco());
    }
}
