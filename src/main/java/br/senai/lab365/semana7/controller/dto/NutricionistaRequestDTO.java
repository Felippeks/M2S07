package br.senai.lab365.semana7.controller.dto;

public class NutricionistaRequestDTO {
    private String crn;
    private String especialidade;

    public NutricionistaRequestDTO() {
    }

    public NutricionistaRequestDTO(String crn, String especialidade) {
        this.crn = crn;
        this.especialidade = especialidade;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}