package br.com.fiapCP03.Checkpoint03.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AlunoUpdateRequest(
        @NotBlank String nome,
        @NotBlank String telefone,
        @Valid @NotNull EnderecoRequest endereco
) {
}

