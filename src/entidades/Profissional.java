package entidades;

import java.util.Date;

public class Profissional {
    private String licenca;
    private String nome;
    private Date horarioAula;
    private Date diaAula;
    private Gym gym;

    public Profissional() {
    }

    public Profissional(Gym gym) {
        this.gym = gym;
    }

    public Profissional(String licenca, String nome, Date horarioAula, Date diaAula, Gym gym) {
        this.licenca = licenca;
        this.nome = nome;
        this.horarioAula = horarioAula;
        this.diaAula = diaAula;
        this.gym = gym;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(Date horarioAula) {
        this.horarioAula = horarioAula;
    }

    public Date getDiaAula() {
        return diaAula;
    }

    public void setDiaAula(Date diaAula) {
        this.diaAula = diaAula;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
