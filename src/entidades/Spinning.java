package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Spinning extends Sala {
    public static final int AULA_NOITE_SIZE = 25;
    public static final int AULA_TARDE_SIZE = 25;
    public static final int AULA_MANHA_SIZE = 25;
    public static final String HORARIO_MANHA_SPINNING = "09:00";
    public static final String HORARIO_TARDE_SPINNING = "15:00";
    public static final String HORARIO_NOITE_SPINNING = "19:00";
    public static final String SUCESSO_MSG_MANHA = "| Horário marcado com SUCESSO!\n| Turma manhã vagas Restantes: ";
    public static final String SUCESSO_MSG_TARDE = "| Horário marcado com SUCESSO!\n| Turma tarde vagas Restantes: ";
    public static final String SUCESSO_MSG_NOITE = "| Horário marcado com SUCESSO!\n| Turma noite vagas Restantes: ";
    public static final String ERRO_MSG_MANHA = "Turma manha cheia, escolha outro Horário!";
    public static final String ERRO_MSG_TARDE = "Turma tarde cheia, escolha outro Horário!";
    public static final String ERRO_MSG_NOITE = "Turma noite cheia, escolha outro Horário!";
    private SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    private Gym gym;
    private Profissional profissional;
    private List<Aluno> alunosList = new ArrayList<>();
    private List<Aluno> horariosManhaList = new ArrayList<>();
    private List<Aluno> horariosTardeList = new ArrayList<>();
    private List<Aluno> horariosNoiteList = new ArrayList<>();

    public Spinning() {
        super();
    }

    public Spinning(Gym gym) {
        super();
        this.gym = gym;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    @Override
    public List<Aluno> getAlunosList() {
        return alunosList;
    }
    @Override
    public List<Aluno> getHorariosManhaList() { return horariosManhaList; }
    @Override
    public List<Aluno> getHorariosTardeList() {
        return horariosTardeList;
    }
    @Override
    public List<Aluno> getHorariosNoiteList() {
        return horariosNoiteList;
    }
    @Override
    public void addAluno(Aluno aluno){
        alunosList.add(aluno);
    }
    @Override
    public void addHorarioManha(Aluno horarioManha){
        horariosManhaList.add(horarioManha);
    }
    @Override
    public void addHorarioTarde(Aluno horarioTarde){
        horariosTardeList.add(horarioTarde);
    }
    @Override
    public void addHorarioNoite(Aluno horarioNoite){
        horariosNoiteList.add(horarioNoite);
    }


    public void setAulaSpinning(Aluno aluno) throws Exception {
        if(aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_SPINNING))){
            if(horariosManhaList.size() < AULA_MANHA_SIZE){
                addHorarioManha(aluno);
                throw new Exception(String.format(SUCESSO_MSG_MANHA + horariosManhaList.size() + "/" + AULA_MANHA_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_MANHA));
            }
        }

        if(aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_SPINNING))){
            if(horariosTardeList.size() < AULA_TARDE_SIZE){
                addHorarioTarde(aluno);
                throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosTardeList.size() + "/" + AULA_TARDE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_TARDE));
            }
        }

        if(aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_SPINNING))){
            if(horariosNoiteList.size() < AULA_NOITE_SIZE){
                addHorarioNoite(aluno);
                throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosNoiteList.size() + "/" + AULA_NOITE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_NOITE));
            }
        }
    }

    public String findProfissionalSpinning(){
        return " *** Aula Spinning ***\n Professor(a): " + getProfissional().getNome();
    }
    public String findAllAlunoSpinning(){
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append(" *** Todos o(s) Aluno(os) Spinning ***\n");
            for(Aluno a : alunosList){
                sb.append(indiceAluno++ + ". ");
                sb.append(a.getNome());
                sb.append(" - " + sdfHora.format(a.getHorarioAula()) + "\n");
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoSpinningManha() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Spinning Manha ***\n");
            for(Aluno a : alunosList){
                if(a.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_SPINNING))){
                    sb.append(indiceAluno++ + ". ");
                    sb.append(a.getNome());
                    sb.append(" - " + sdfHora.format(a.getHorarioAula()) + "\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoSpinningTarde() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append("*** Aluno(os) Spinning Tarde ***\n");
            for(Aluno a : alunosList){
                if(a.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_SPINNING))){
                    sb.append(indiceAluno++ + ". ");
                    sb.append(a.getNome());
                    sb.append(" - " + sdfHora.format(a.getHorarioAula()) + "\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoSpinningNoite() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Spinning Noite ***\n");
            for(Aluno a : alunosList){
                if(a.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_SPINNING))){
                    sb.append(indiceAluno++ + ". ");
                    sb.append(a.getNome());
                    sb.append(" - " + sdfHora.format(a.getHorarioAula()) + "\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }
}
