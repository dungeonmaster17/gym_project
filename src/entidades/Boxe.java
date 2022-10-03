package entidades;

import java.util.Date;
import java.util.List;

public class Boxe extends Sala {
    public static final int AULA_MANHA_SIZE = 5;
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
    public List<Aluno> getHorariosQuartaManhaList() {
        return horariosQuartaManhaList;
    }

    @Override
    public List<Aluno> getHorariosQuartaTardeList() {
        return horariosQuartaTardeList;
    }

    @Override
    public List<Aluno> getHorariosQuartaNoiteList() {
        return horariosQuartaNoiteList;
    }

    @Override
    public List<Aluno> getHorariosSextaManhaList() {
        return horariosSextaManhaList;
    }

    @Override
    public List<Aluno> getHorariosSextaTardeList() {
        return horariosSextaTardeList;
    }

    @Override
    public List<Aluno> getHorariosSextaNoiteList() {
        return horariosSextaNoiteList;
    }

    @Override
    public List<Aluno> getHorariosSabadoManhaList() {
        return horariosSabadoManhaList;
    }

    @Override
    public List<Aluno> getHorariosSabadoTardeList() {
        return horariosSabadoTardeList;
    }

    @Override
    public List<Aluno> getHorariosSabadoNoiteList() {
        return horariosSabadoNoiteList;
    }

    @Override
    public void addAluno(Aluno aluno) {
        alunosList.add(aluno);
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
    public void addHorarioQuartaManha(Aluno aluno){
        horariosQuartaManhaList.add(aluno);
    }
    @Override
    public void addHorarioQuartaTarde(Aluno aluno){
        horariosQuartaTardeList.add(aluno);
    }
    @Override
    public void addHorarioQuartaNoite(Aluno aluno){
        horariosQuartaNoiteList.add(aluno);
    }
    @Override
    public void addHorarioSextaManha(Aluno aluno){
        horariosSextaManhaList.add(aluno);
    }
    @Override
    public void addHorarioSextaTarde(Aluno aluno){
        horariosSextaTardeList.add(aluno);
    }
    @Override
    public void addHorarioSextaNoite(Aluno aluno){
        horariosSextaNoiteList.add(aluno);
    }
    @Override
    public void addHorarioSabadoManha(Aluno aluno){
        horariosSabadoManhaList.add(aluno);
    }
    @Override
    public void addHorarioSabadoTarde(Aluno aluno){
        horariosSabadoTardeList.add(aluno);
    }
    @Override
    public void addHorarioSabadoNoite(Aluno aluno){
        horariosSabadoNoiteList.add(aluno);
    }

    @Override
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

    @Override
    public boolean isFull(Aluno aluno) throws Exception {
        if (horariosQuartaManhaList.size() == AULA_MANHA_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
            return true;
        } else if (horariosQuartaTardeList.size() == AULA_TARDE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse((HORARIO_TARDE_BOXE)))) {
            return true;
        } else if (horariosQuartaNoiteList.size() == AULA_NOITE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
            return true;
        }

        if (horariosSextaManhaList.size() == AULA_MANHA_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
            return true;
        } else if (horariosSextaTardeList.size() == AULA_TARDE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse((HORARIO_TARDE_BOXE)))) {
            return true;
        } else if (horariosSextaNoiteList.size() == AULA_NOITE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
            return true;
        }

        if (horariosSabadoManhaList.size() == AULA_MANHA_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
            return true;
        } else if (horariosSabadoTardeList.size() == AULA_TARDE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse((HORARIO_TARDE_BOXE)))) {
            return true;
        } else if (horariosSabadoNoiteList.size() == AULA_NOITE_SIZE && aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
            return true;
        }

        return false;
    }

    public void setHorarioAulaBoxe(Aluno aluno) throws Exception {
        if(aluno.getDiaAula().equals("qua")){
            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
                if (horariosQuartaManhaList.size() < AULA_MANHA_SIZE) {
                    addHorarioQuartaManha(aluno);
                    throw new Exception(String.format(SUCESS0_MSG_MANHA + horariosQuartaManhaList.size() + "/" + AULA_MANHA_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_MANHA));
                }
            }

            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_BOXE))) {
                if (horariosQuartaTardeList.size() < AULA_TARDE_SIZE) {
                    addHorarioQuartaTarde(aluno);
                    throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosQuartaTardeList.size() + "/" + AULA_TARDE_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_TARDE));
                }
            }

            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
                if (horariosQuartaNoiteList.size() < AULA_NOITE_SIZE) {
                    addHorarioQuartaNoite(aluno);
                    throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosQuartaNoiteList.size() + "/" + AULA_NOITE_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_NOITE));
                }
            }
        }

        if(aluno.getDiaAula().equals("sex")){
            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
                if (horariosSextaManhaList.size() < AULA_MANHA_SIZE) {
                    addHorarioSextaManha(aluno);
                    throw new Exception(String.format(SUCESS0_MSG_MANHA + horariosSextaManhaList.size() + "/" + AULA_MANHA_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_MANHA));
                }
            }

            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_BOXE))) {
                if (horariosSextaTardeList.size() < AULA_TARDE_SIZE) {
                    addHorarioSextaTarde(aluno);
                    throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosSextaTardeList.size() + "/" + AULA_TARDE_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_TARDE));
                }
            }

            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
                if (horariosSextaNoiteList.size() < AULA_NOITE_SIZE) {
                    addHorarioSextaNoite(aluno);
                    throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosSextaNoiteList.size() + "/" + AULA_NOITE_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_NOITE));
                }
            }
        }

        if(aluno.getDiaAula().equals("sab")){
            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_MANHA_BOXE))) {
                if (horariosSabadoManhaList.size() < AULA_MANHA_SIZE) {
                    addHorarioSabadoManha(aluno);
                    throw new Exception(String.format(SUCESS0_MSG_MANHA + horariosSabadoManhaList.size() + "/" + AULA_MANHA_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_MANHA));
                }
            }

            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_TARDE_BOXE))) {
                if (horariosSabadoTardeList.size() < AULA_TARDE_SIZE) {
                    addHorarioSabadoTarde(aluno);
                    throw new Exception(String.format(SUCESSO_MSG_TARDE + horariosSabadoTardeList.size() + "/" + AULA_TARDE_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_TARDE));
                }
            }

            if (aluno.getHorarioAula().equals(sdfHora.parse(HORARIO_NOITE_BOXE))) {
                if (horariosSabadoNoiteList.size() < AULA_NOITE_SIZE) {
                    addHorarioSabadoNoite(aluno);
                    throw new Exception(String.format(SUCESSO_MSG_NOITE + horariosSabadoNoiteList.size() + "/" + AULA_NOITE_SIZE));
                } else {
                    throw new Exception(String.format(ERRO_MSG_NOITE));
                }
            }
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
            sb.append(" *** Todos o(s) Aluno(os) Boxe ***\n");
            for (Aluno a : alunosList) {
                sb.append("cod.: 00" + indiceAluno++ + "\n");
                sb.append("Matricula: " + a.getMatricula() + " - ");
                sb.append("Nome: " + a.getNome() + " " + a.getSobrenome() + " - ");
                sb.append("Data Nasc.: " + a.getDataNascimento() + " - CPF: " + a.getCpf() + " - ");
                sb.append("Email: " + a.getEmail());
                sb.append(" - Horário Marcado: " + sdfHora.format(a.getHorarioAula()) + " - ");
                sb.append("    " + a.getDiaAula() + "\n");
                sb.append("\n");
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
