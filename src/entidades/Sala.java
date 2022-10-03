package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Sala {

    protected SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    private String nomeAula;
    protected Gym gym;
    private Profissional profissional;
    protected List<Aluno> alunosList = new ArrayList<>();
    protected List<Aluno> horariosManhaList = new ArrayList<>();
    protected List<Aluno> horariosTardeList = new ArrayList<>();
    protected List<Aluno> horariosNoiteList = new ArrayList<>();

    protected List<Aluno> horariosQuartaList = new ArrayList<>();
    protected List<Aluno> horariosSextaList = new ArrayList<>();
    protected List<Aluno> horariosSabadoList = new ArrayList<>();


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

    public List<Aluno> getHorariosQuartaList() {
        return horariosQuartaList;
    }

    public List<Aluno> getHorariosSextaList() {
        return horariosSextaList;
    }

    public List<Aluno> getHorariosSabadoList() {
        return horariosSabadoList;
    }

    public void addAluno(Aluno aluno){
        alunosList.add(aluno);
    }
    public void addHorarioManha(Aluno aluno){
        horariosManhaList.add(aluno);
    }
    public void addHorarioTarde(Aluno aluno){
        horariosTardeList.add(aluno);
    }
    public void addHorarioNoite(Aluno aluno){
        horariosNoiteList.add(aluno);
    }

    public void addHorarioQuarta(Aluno aluno){
        horariosQuartaList.add(aluno);
    }
    public void addHorarioSexta(Aluno aluno){
        horariosSextaList.add(aluno);
    }
    public void addHorarioSabado(Aluno aluno){
        horariosSabadoList.add(aluno);
    }

    public abstract boolean isFull(Aluno aluno) throws Exception;
}
