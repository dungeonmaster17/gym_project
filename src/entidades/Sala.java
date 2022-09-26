package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Sala {

    protected SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    private String nomeAula;
    protected Gym gym;
    private Profissional profissional;
    private List<Aluno> alunosList = new ArrayList<>();
    private List<Aluno> horariosManhaList = new ArrayList<>();
    private List<Aluno> horariosTardeList = new ArrayList<>();
    private List<Aluno> horariosNoiteList = new ArrayList<>();

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
    public List<Aluno> getHorariosManhaList() {
        return horariosManhaList;
    }
    public List<Aluno> getHorariosTardeList() {
        return horariosTardeList;
    }
    public List<Aluno> getHorariosNoiteList() {
        return horariosNoiteList;
    }


    public void addAluno(Aluno aluno){
        alunosList.add(aluno);
    }
    public void addHorarioManha(Aluno horarioManha){
        horariosManhaList.add(horarioManha);
    }
    public void addHorarioTarde(Aluno horarioTarde){
        horariosTardeList.add(horarioTarde);
    }
    public void addHorarioNoite(Aluno horarioNoite){
        horariosNoiteList.add(horarioNoite);
    }
}
