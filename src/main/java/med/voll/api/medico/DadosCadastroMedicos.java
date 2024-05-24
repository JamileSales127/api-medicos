package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

import javax.sql.rowset.serial.SerialJavaObject;

public record DadosCadastroMedicos(

        @NotBlank // se não está nulo ou vazio
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")// estudar expressão regular
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
