package salas;

import entidades.Aluno;
import entidades.Gym;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoxeAula extends Sala {
    public static final int AULA_MANHA_SIZE = 2;
    public static final int AULA_TARDE_SIZE = 2;
    public static final int AULA_NOITE_SIZE = 5;
    public static final String HORARIO_MANHA_BOXE = "09:00";
    public static final String HORARIO_TARDE_BOXE = "15:00";
    public static final String HORARIO_NOITE_BOXE = "19:00";
    public static final String SUCESS0_MSG_MANHA = "| Horário marcado com SUCESSO!\n| Turma manhã vagas Restantes: ";
    public static final String SUCESSO_MSG_TARDE = "| Horário marcado com Sucesso!\n| Turma tarde vagas Restantes: ";
    public static final String SUCESSO_MSG_NOITE = "| Horário marcado com Sucesso!\n| Turma noite vagas Restantes: ";
    public static final String ERRO_MSG_MANHA = "Turma manhã cheia, escolha outro Horário!";
    public static final String ERRO_MSG_TARDE = "Turma tarde cheia, escolha outro Horário!";
    public static final String ERRO_MSG_NOITE = "Turma noite cheia, escolha outro Horário!";

    private List<Aluno> alunosList = new ArrayList<>();
    private List<Date> horariosManhaList = new ArrayList<>();
    private List<Date> horariosTardeList = new ArrayList<>();
    private List<Date> horariosNoiteList = new ArrayList<>();

    public BoxeAula() {
        super();
    }


    public BoxeAula(Gym gym) {
        super();
        this.gym = gym;
    }



    @Override
    public List<Aluno> getAlunosList() {
        return alunosList;
    }

    @Override
    public List<Date> getHorariosManhaList() {
        return horariosManhaList;
    }

    @Override
    public List<Date> getHorariosTardeList() {
        return horariosTardeList;
    }

    @Override
    public List<Date> getHorariosNoiteList() {
        return horariosNoiteList;
    }

    @Override
    public void addAluno(Aluno aluno){
        alunosList.add(aluno);
    }
    @Override
    public void addHorarioManha(Date horarioManha){
        horariosManhaList.add(horarioManha);
    }
    @Override
    public void addHorarioTarde(Date horarioTarde){
        horariosTardeList.add(horarioTarde);
    }
    @Override

    public void addHorarioNoite(Date horarioNoite){
        horariosNoiteList.add(horarioNoite);
    }


    public void setAulaBoxe(Aluno aluno) throws Exception {
            if(aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))){
                if(horariosManhaList.size() < AULA_MANHA_SIZE){
                    addHorarioManha(aluno.getHorarioAula());
                    throw new Exception(String.format(SUCESS0_MSG_MANHA + horariosManhaList.size() + "/" + AULA_MANHA_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_MANHA));
                }
            }

        if(aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_BOXE))){
            if(horariosTardeList.size() < AULA_TARDE_SIZE){
                addHorarioTarde(aluno.getHorarioAula());
                throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosTardeList.size() + "/" + AULA_TARDE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_TARDE));
            }
        }

        if(aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))){
            if(horariosNoiteList.size() < AULA_NOITE_SIZE){
                addHorarioNoite(aluno.getHorarioAula());
                throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosNoiteList.size() + "/" + AULA_NOITE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_NOITE));
            }
        }
    }

    public String findProfissionalBoxe(){
        return " *** Aula Boxe ***\n Professor(a): " + getProfissional().getNome() + "\n Licença: " + getProfissional().getLicenca();
    }

    public String findAllAlunoBoxe(){
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append("                              *** Todos o(s) Aluno(os) Boxe ***\n");
            sb.append("cod.:" + "  Matricula  " + "   Nome  " + "        Data Nascimento  " + "    CPF " + "           Email  " + "          Horario Marcado\n");
            for(Aluno a : alunosList){
                sb.append(" " + indiceAluno++ + "        ");
                sb.append(a.getMatricula() + "      ");
                sb.append(a.getNome() + " " + a.getSobrenome() + "      ");
                sb.append("  " + a.getDataNascimento() + "      " + a.getCpf() + "      ");
                sb.append(a.getEmail() + "     ");
                sb.append("    " + sdfHora.format(a.getHorarioAula()) + "\n");
                sb.append("-----------------------------------------------------------------------------------------------------\n");
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoBoxeManha() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe Manha ***\n");
            for(Aluno a : alunosList){
                if(a.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))){
                    sb.append("cod.: 00" + indiceAluno++ + "\n");
                    sb.append("Matricula: " + a.getMatricula() + " - ");
                    sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                    sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                    sb.append("Email: " + a.getEmail());
                    sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + "\n");
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoBoxeTarde() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe Tarde ***\n");
            for(Aluno a : alunosList){
                if(a.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_BOXE))){
                    sb.append("cod.: 00" + indiceAluno++ + "\n");
                    sb.append("Matricula: " + a.getMatricula() + " - ");
                    sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                    sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                    sb.append("Email: " + a.getEmail());
                    sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + "\n");
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoBoxeNoite() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(!alunosList.isEmpty()){
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe Noite ***\n");
            for(Aluno a : alunosList){
                if(a.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))){
                    sb.append("cod.: 00" + indiceAluno++ + "\n");
                    sb.append("Matricula: " + a.getMatricula() + " - ");
                    sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                    sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                    sb.append("Email: " + a.getEmail());
                    sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + "\n");
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }
}
