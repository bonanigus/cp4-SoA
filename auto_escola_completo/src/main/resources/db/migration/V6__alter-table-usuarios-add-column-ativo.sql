-- Adiciona coluna ativo para soft delete de usuários
ALTER TABLE usuarios ADD ativo tinyint(1) NOT NULL DEFAULT 1;
