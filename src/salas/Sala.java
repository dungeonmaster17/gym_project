package salas;

import entidades.Aluno;
import entidades.Gym;
import entidades.Profissional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Sala {

    protected SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    private String nomeAula;
    protected Gym gym;
    private Profissional profissional;
    private List<Aluno> alunosList = new ArrayList<>();
    private List<Date> horariosManhaList = new ArrayList<>();
    private List<Date> horariosTardeList = new ArrayList<>();
    private List<Date> horariosNoiteList = new ArrayList<>();

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) { this.gym = gym; }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }


    public List<Aluno> getAlunosList() { return alunosList; }
    public List<Date> getHorariosManhaList() {
        return horariosManhaList;
    }
    public List<Date> getHorariosTardeList() {
        return horariosTardeList;
    }
    public List<Date> getHorariosNoiteList() {
        return horariosNoiteList;
    }


    public void addAluno(Aluno aluno){
        alunosList.add(aluno);
    }
    public void addHorarioManha(Date horarioManha){
        horariosManhaList.add(horarioManha);
    }
    public void addHorarioTarde(Date horarioTarde){
        horariosTardeList.add(horarioTarde);
    }
    public void addHorarioNoite(Date horarioNoite){
        horariosNoiteList.add(horarioNoite);
    }
}
