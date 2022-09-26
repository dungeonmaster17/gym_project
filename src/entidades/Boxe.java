package entidades;

import java.text.ParseException;
import java.util.List;

public class Boxe extends Sala {
    public static final int AULA_MANHA_SIZE = 2;
    public static final int AULA_TARDE_SIZE = 5;
    public static final int AULA_NOITE_SIZE = 5;
    public static final String HORARIO_MANHA_BOXE = "09:00";
    public static final String HORARIO_TARDE_BOXE = "15:00";
    public static final String HORARIO_NOITE_BOXE = "19:00";
    public static final String SUCESS0_MSG_MANHA = "| Horário marcado com SUCESSO!\n| Turma manhã vagas Restantes: ";
    public static final String SUCESSO_MSG_TARDE = "| Horário marcado com Sucesso!\n| Turma tarde vagas Restantes: ";
    public static final String SUCESSO_MSG_NOITE = "| Horário marcado com Sucesso!\n| Turma noite vagas Restantes: ";
    public static final String ERRO_MSG_MANHA = "| Turma manhã CHEIA, escolha outro Horário!";
    public static final String ERRO_MSG_TARDE = "| Turma tarde CHEIA, escolha outro Horário!";
    public static final String ERRO_MSG_NOITE = "| Turma noite CHEIA, escolha outro Horário!";

    public Boxe() {
        super();
    }

    public Boxe(Gym gym) {
        super();
        this.gym = gym;
    }

    @Override
    public List<Aluno> getAlunosList() {
        return alunosList;
    }

    @Override
    public List<Aluno> getHorariosManhaList() {
        return horariosManhaList;
    }

    @Override
    public List<Aluno> getHorariosTardeList() {
        return horariosTardeList;
    }

    @Override
    public List<Aluno> getHorariosNoiteList() {
        return horariosNoiteList;
    }

    @Override
    public void addAluno(Aluno aluno) {
        super.alunosList.add(aluno);
    }

    @Override
    public void addHorarioManha(Aluno horarioManha) {
        horariosManhaList.add(horarioManha);
    }

    @Override
    public void addHorarioTarde(Aluno horarioTarde) {
        horariosTardeList.add(horarioTarde);
    }

    @Override

    public void addHorarioNoite(Aluno horarioNoite) {
        horariosNoiteList.add(horarioNoite);
    }

    public void setAulaBoxe(Aluno aluno) throws Exception {
        if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
            if (horariosManhaList.size() < AULA_MANHA_SIZE) {
                addHorarioManha(aluno);
                throw new Exception(String.format(SUCESS0_MSG_MANHA + horariosManhaList.size() + "/" + AULA_MANHA_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_MANHA));
            }
        }

        if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_BOXE))) {
            if (horariosTardeList.size() < AULA_TARDE_SIZE) {
                addHorarioTarde(aluno);
                throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosTardeList.size() + "/" + AULA_TARDE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_TARDE));
            }
        }

        if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
            if (horariosNoiteList.size() < AULA_NOITE_SIZE) {
                addHorarioNoite(aluno);
                throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosNoiteList.size() + "/" + AULA_NOITE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_NOITE));
            }
        }
    }

    public String findProfissionalBoxe() {
        if(getProfissional().getNome() == null){
            return " *** Sem profissional cadastrado para aulas de Boxe. ***";
        }
        return " *** Aula Boxe ***\n Professor(a): " + getProfissional().getNome() + "\n Licença: " + getProfissional().getLicenca();
    }

    public String findAllAlunoBoxe() {
        StringBuilder sb = new StringBuilder();
        if (!alunosList.isEmpty()) {
            int indiceAluno = 1;
            sb.append("                              *** Todos o(s) Aluno(os) Boxe ***\n");
            sb.append("cod.:" + "  Matricula  " + "   Nome  " + "        Data Nascimento  " + "    CPF " + "           Email  " + "          Horario Marcado\n");
            for (Aluno a : alunosList) {
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
        if (!horariosManhaList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe Manha ***\n");
            for (Aluno a : horariosManhaList) {
                sb.append("cod.: 00" + indiceAluno++ + "\n");
                sb.append("Matricula: " + a.getMatricula() + " - ");
                sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                sb.append("Email: " + a.getEmail());
                sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + "\n");
                sb.append("\n");
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoBoxeTarde() {
        StringBuilder sb = new StringBuilder();
        if (!horariosTardeList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe Tarde ***\n");
            for (Aluno a : horariosTardeList) {
                sb.append("cod.: 00" + indiceAluno++ + "\n");
                sb.append("Matricula: " + a.getMatricula() + " - ");
                sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                sb.append("Email: " + a.getEmail());
                sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + "\n");
                sb.append("\n");
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public String findAllAlunoBoxeNoite() {
        StringBuilder sb = new StringBuilder();
        if (!horariosNoiteList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe Noite ***\n");
            for (Aluno a : horariosNoiteList) {
                sb.append("cod.: 00" + indiceAluno++ + "\n");
                sb.append("Matricula: " + a.getMatricula() + " - ");
                sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                sb.append("Email: " + a.getEmail());
                sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + "\n");
                sb.append("\n");
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }

    public boolean isFull(){
        if(horariosManhaList.size() == AULA_MANHA_SIZE ){
            return true;

        }
        return false;
    }
}
