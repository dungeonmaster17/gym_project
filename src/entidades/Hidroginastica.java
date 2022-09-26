package entidades;

import java.text.ParseException;
import java.util.List;

public class Hidroginastica extends Sala {
    public static final int AULA_MANHA_SIZE = 35;
    public static final int AULA_TARDE_SIZE = 35;
    public static final int AULA_NOITE_SIZE = 35;
    public static final String HORARIO_MANHA_HIDROGINASTICA = "09:00";
    public static final String HORARIO_TARDE_HIDROGINASTICA = "15:00";
    public static final String HORARIO_NOITE_HIDROGINASTICA = "19:00";
    public static final String SUCESSO_MSG_MANHA = "| Horário marcado com SUCESSO!\n| Turma manhã vagas Restantes: ";
    public static final String SUCESSO_MSG_TARDE = "| Horário marcado com SUCESSO!\n| Turma tarde vagas Restantes: ";
    public static final String SUCESSO_MSG_NOITE = "| Horário marcado com SUCESSO!\n| Turma noite vagas Restantes: ";
    public static final String ERRO_MSG_MANHA = "| Turma manhã CHEIA, escolha outro Horário!";
    public static final String ERRO_MSG_TARDE = "| Turma tarde CHEIA, escolha outro Horário!";
    public static final String ERRO_MSG_NOITE = "| Turma noite CHEIA, escolha outro Horário!";

    public Hidroginastica() {
        super();
    }

    public Hidroginastica(Gym gym) {
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
        alunosList.add(aluno);
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

    @Override
    public boolean isFull(Aluno aluno) throws ParseException {
        if(horariosManhaList.size() == AULA_MANHA_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_HIDROGINASTICA))){
            return true;
        } else if(horariosTardeList.size() == AULA_TARDE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse((HORARIO_TARDE_HIDROGINASTICA)))){
            return true;
        } else if(horariosNoiteList.size() == AULA_NOITE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_HIDROGINASTICA))){
            return true;
        } else{
            return false;
        }
    }

    public void setAulaHidroginastica(Aluno aluno) throws Exception {
        if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_HIDROGINASTICA))) {
            if (horariosManhaList.size() < AULA_MANHA_SIZE) {
                addHorarioManha(aluno);
                throw new Exception(String.format(SUCESSO_MSG_MANHA + horariosManhaList.size() + "/" + AULA_MANHA_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_MANHA));
            }
        }

        if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_HIDROGINASTICA))) {
            if (horariosTardeList.size() < AULA_TARDE_SIZE) {
                addHorarioTarde(aluno);
                throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosTardeList.size() + "/" + AULA_TARDE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_TARDE));
            }
        }

        if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_HIDROGINASTICA))) {
            if (horariosNoiteList.size() < AULA_NOITE_SIZE) {
                addHorarioNoite(aluno);
                throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosNoiteList.size() + "/" + AULA_NOITE_SIZE));
            } else {
                throw new Exception(String.format(ERRO_MSG_NOITE));
            }
        }
    }

    public String findProfissionalHidroginastica() {
        if(getProfissional().getNome() == null){
            return " *** Sem profissional cadastrado para aulas de Hidroginastica. ***";
        }
        return " *** Aula Hidroginastica ***\n Professor(a): " + getProfissional().getNome();
    }

    public String findAllAlunoHidroginastica() {
        StringBuilder sb = new StringBuilder();
        if (!alunosList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" *** Todos o(s) Aluno(os) Hidroginastica ***\n");
            for (Aluno a : alunosList) {
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

    public String findAllAlunoHidroginasticaManha() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if (!alunosList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Hidroginastica Manha ***\n");
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

    public String findAllAlunoHidroginasticaTarde() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if (!alunosList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" ***Todos o(s) Aluno(os) Hidroginastica Tarde***\n");
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

    public String findAllAlunoHidroginasticaNoite() throws ParseException {
        StringBuilder sb = new StringBuilder();
        if (!alunosList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" ***Aluno(os) Hidroginastica Noite***\n");
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
}
