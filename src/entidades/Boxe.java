package entidades;

import java.util.Date;
import java.util.List;

public class Boxe extends Sala {
    public static final int AULA_MANHA_SIZE = 1;
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
    public List<Aluno> getHorariosQuartaList() {
        return horariosQuartaList;
    }

    @Override
    public List<Aluno> getHorariosSextaList() {
        return horariosSextaList;
    }

    @Override
    public List<Aluno> getHorariosSabadoList() {
        return horariosSabadoList;
    }

    @Override
    public void addAluno(Aluno aluno) {
        alunosList.add(aluno);
    }

    @Override
    public void addHorarioManha(Aluno aluno) {
        horariosManhaList.add(aluno);
    }

    @Override
    public void addHorarioTarde(Aluno aluno) {
        horariosTardeList.add(aluno);
    }

    @Override
    public void addHorarioNoite(Aluno aluno) {
        horariosNoiteList.add(aluno);
    }

    @Override
    public void addHorarioQuarta(Aluno aluno) {
        horariosQuartaList.add(aluno);
    }

    @Override
    public void addHorarioSexta(Aluno aluno) {
        horariosSextaList.add(aluno);
    }

    @Override
    public void addHorarioSabado(Aluno aluno) {
        horariosSabadoList.add(aluno);
    }

    @Override
    public boolean isFull(Aluno aluno) throws Exception {
        if (horariosManhaList.size() == AULA_MANHA_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
            return true;
        } else if (horariosTardeList.size() == AULA_TARDE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse((HORARIO_TARDE_BOXE)))) {
            return true;
        } else if (horariosNoiteList.size() == AULA_NOITE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
            return true;
        } else {
            return false;
        }
    }

    public void setHorarioAulaBoxe(Aluno aluno) throws Exception {
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

    public void setDiaAulaBoxe(Aluno aluno) {
        if (aluno.getDiaAula() == "qua") {
            addHorarioQuarta(aluno);
        }
        if (aluno.getDiaAula() == "sex") {
            addHorarioSexta(aluno);
        }
        if (aluno.getDiaAula() == "sab") {
            addHorarioSabado(aluno);
        }
    }

    public String findProfissionalBoxe() {
        if (getProfissional().getNome() == null) {
            return " *** Sem profissional cadastrado para aulas de Boxe. ***";
        }
        return " *** Aula Boxe ***\n Professor(a): " + getProfissional().getNome() + "\n Licença: " + getProfissional().getLicenca();
    }

    public String findAllAlunoBoxeByWeek() {
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
                sb.append("    " + a.getDiaAula() + "\n");
                sb.append("-----------------------------------------------------------------------------------------------------\n");
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }


    public String findAllAlunoBoxeByDayAndHour(String dia, Date hora) {
        StringBuilder sb = new StringBuilder();
        if (!alunosList.isEmpty()) {
            int indiceAluno = 1;
            sb.append(" *** Aluno(os) Boxe ***\n");
            for (Aluno a : alunosList) {
                if(a.getDiaAula().equals(dia) && a.getHorarioAula().equals((hora))){
                    sb.append("cod.: 00" + indiceAluno++ + "\n");
                    sb.append("Matricula: " + a.getMatricula() + " - ");
                    sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                    sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                    sb.append("Email: " + a.getEmail());
                    sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + " - ");
                    sb.append("" + a.getDiaAula() + "\n");
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        return "Sem alunos para a aula selecionada!";
    }
}
