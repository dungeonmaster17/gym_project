package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Sala {

    protected SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    protected SimpleDateFormat sdfDia = new SimpleDateFormat("dd");
    private String nomeAula;
    protected Gym gym;
    private Profissional profissional;
    //lista total de Alunos
    protected List<Aluno> alunosList = new ArrayList<>();

    //lista dias de Aula
    protected List<Aluno> horariosQuartaList = new ArrayList<>();
    protected List<Aluno> horariosSextaList = new ArrayList<>();
    protected List<Aluno> horariosSabadoList = new ArrayList<>();

    //lista de horarios Quarta-Feira
    protected List<Aluno> horariosQuartaManhaList = new ArrayList<>();
    protected List<Aluno> horariosQuartaTardeList = new ArrayList<>();
    protected List<Aluno> horariosQuartaNoiteList = new ArrayList<>();

    //lista de horarios Sexta-Feira
    protected List<Aluno> horariosSextaManhaList = new ArrayList<>();
    protected List<Aluno> horariosSextaTardeList = new ArrayList<>();
    protected List<Aluno> horariosSextaNoiteList = new ArrayList<>();

    //lista de horarios Sabado
    protected List<Aluno> horariosSabadoManhaList = new ArrayList<>();
    protected List<Aluno> horariosSabadoTardeList = new ArrayList<>();
    protected List<Aluno> horariosSabadoNoiteList = new ArrayList<>();


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


    public abstract List<Aluno> getAlunosList();

    public abstract List<Aluno> getHorariosQuartaList();

    public abstract List<Aluno> getHorariosSextaList();

    public abstract List<Aluno> getHorariosSabadoList();

    public abstract List<Aluno> getHorariosQuartaManhaList();

    public abstract List<Aluno> getHorariosQuartaTardeList();

    public abstract List<Aluno> getHorariosQuartaNoiteList();

    public abstract List<Aluno> getHorariosSextaManhaList();

    public abstract List<Aluno> getHorariosSextaTardeList();

    public abstract List<Aluno> getHorariosSextaNoiteList();

    public abstract List<Aluno> getHorariosSabadoManhaList();

    public abstract List<Aluno> getHorariosSabadoTardeList();

    public abstract List<Aluno> getHorariosSabadoNoiteList();

    //add todos os Alunos
    public abstract void addAluno(Aluno aluno);

    //add dias de Aulas
    public abstract void addHorarioQuarta(Aluno aluno);
    public abstract void addHorarioSexta(Aluno aluno);
    public abstract void addHorarioSabado(Aluno aluno);

    //add horarios de Quarta-Feira
    public abstract void addHorarioQuartaManha(Aluno aluno);
    public abstract void addHorarioQuartaTarde(Aluno aluno);
    public abstract void addHorarioQuartaNoite(Aluno aluno);

    //add horarios de Sexta-Feira
    public abstract void addHorarioSextaManha(Aluno aluno);
    public abstract void addHorarioSextaTarde(Aluno aluno);
    public abstract void addHorarioSextaNoite(Aluno aluno);

    //add horarios de Sabado
    public abstract void addHorarioSabadoManha(Aluno aluno);
    public abstract void addHorarioSabadoTarde(Aluno aluno);
    public abstract void addHorarioSabadoNoite(Aluno aluno);

    //setando aula no dia
    public abstract void setDiaAula(Aluno aluno);

    //verificando se aula esta cheia
    public abstract boolean isFull(Aluno aluno) throws Exception;
}
