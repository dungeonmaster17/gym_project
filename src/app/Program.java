package app;

import entidades.*;
import services.BoxeFinanceiroService;
import services.HidroginasticaFinanceiroService;
import services.SpinningFinanceiroService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    static Date dateNow = new Date();
    static SimpleDateFormat sdfNow = new SimpleDateFormat("dd/MM HH:mm");
    static SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    static SimpleDateFormat sdfDia = new SimpleDateFormat("dd");
    static Scanner sc = new Scanner(System.in);
    static Boxe ba = new Boxe();
    static Hidroginastica ha = new Hidroginastica();
    static Spinning sa = new Spinning();
    static BoxeFinanceiroService bfs = new BoxeFinanceiroService();
    static HidroginasticaFinanceiroService hfs = new HidroginasticaFinanceiroService();
    static SpinningFinanceiroService sfs = new SpinningFinanceiroService();
    static Gym gym = new Gym(bfs, hfs, sfs, ba, ha, sa);

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("+----------------------------------------------+");
                System.out.println("|               Think Big Gym                  |");
                System.out.printf("|               '%s'                  |" , sdfNow.format(dateNow));
                System.out.println("\n+----------------------------------------------+");
                System.out.println("|           *** MENU PRINCIPAL ***             |");
                System.out.println("+----------------------------------------------+");
                System.out.println("| 01. Aulas e Horários                         |");
                System.out.println("| 02. Marcar Aula                              |");
                System.out.println("| 03. Relação Alunos por Aula/Turma            |");
                System.out.println("| 04. Relação Professores                      |");
                System.out.println("| 05. Cadastro Professores                     |");
                System.out.println("| 06. Financeiro                               |");
                System.out.println("| 07. <SAIR>                                   |");
                System.out.println("+----------------------------------------------+");
                System.out.print("| OPÇÃO: ");
                int menu = sc.nextInt();
                System.out.println("************************************************");
                switch (menu) {
                    case 1:
                        aulasHorarios();
                        break;
                    case 2:
                        Aluno aluno = new Aluno();
                        marcarAula(aluno);
                        cadastrarAluno(aluno);
                        break;
                    case 3:
                        relacaoAlunos();
                        break;
                    case 4:
                        relacaoProfissional();
                        break;
                    case 5:
                        Profissional profissional = new Profissional();
                        cadastrarProfissional(profissional);
                        break;
                    case 6:
                        financeiro();
                        break;
                    case 7:
                        System.out.println("+----------------------------------------------+");
                        System.out.println("|               Think Big Gym                  |");
                        System.out.println("|           *** VOLTE SEMPRE! ***              |");
                        System.out.println("+----------------------------------------------+");
                        loop = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (loop == false)
                    sc.close();
            }
        }
    }


    public static void aulasHorarios() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|   *** AULAS ***         *** HORÁRIOS ***     |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1.Boxe                 seg     qua     sex   |");
        System.out.println("|                       09:00 - 15:00 - 19:00  |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 2.Hidroginastica       seg     qua     sex   |");
        System.out.println("|                       09:00 - 15:00 - 19:00  |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 3.Spinning             seg     qua     sex   |");
        System.out.println("|                       09:00 - 15:00 - 19:00  |");
        System.out.println("+----------------------------------------------+");
    }

    public static void marcarAula(Aluno aluno) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|     *** ESCOLHA UMA OPÇÃO DE AULA ***        |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1. Boxe                                      |");
        System.out.println("| 2. Hidroginastica                            |");
        System.out.println("| 3. Spinning                                  |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| OPÇÃO: ");
        int op = sc.nextInt();
        System.out.println("************************************************");
        escolherHorario(op, aluno);
    }

    public static Aluno escolherHorario(int op, Aluno aluno) {
        try {
            switch (op) {
                case 1:
                    System.out.println("+----------------------------------------------+");
                    System.out.println("|         *** ESCOLHA UM HORÁRIO ***           |");
                    System.out.println("+----------------------------------------------+");
                    System.out.println("| 1.Boxe                 seg     qua     sex   |");
                    System.out.println("|    .Horários     ~    09:00 - 15:00 - 19:00  |");
                    System.out.println("+----------------------------------------------+");
                    System.out.print("| DIA (dd): ");
                    aluno.setDiaAula(sdfDia.parse(sc.next()));
                    System.out.print("| HORÁRIO (HH:mm): ");
                    aluno.setHorarioAula(sdfHora.parse(sc.next()));
                    if(ba.isFull(aluno)){
                        msgErroTurmaCheia(aluno);
                        escolherHorario(1, aluno);
                    } else {
                        ba.addAluno(aluno);
                        ba.setAulaBoxe(aluno);
                    }
                    break;
                case 2:
                    System.out.println("+----------------------------------------------+");
                    System.out.println("|         *** ESCOLHA UM HORÁRIO ***           |");
                    System.out.println("+----------------------------------------------+");
                    System.out.println("| 2.Hidroginastica       seg     qua     sex   |");
                    System.out.println("|    .Horários     ~    09:00 - 15:00 - 19:00  |");
                    System.out.println("+----------------------------------------------+");
                    System.out.print("| DIA (dd): ");
                    aluno.setDiaAula(sdfDia.parse(sc.next()));
                    System.out.print("| HORÁRIO (HH:mm): ");
                    aluno.setHorarioAula(sdfHora.parse(sc.next()));
                    if(ha.isFull(aluno)){
                        msgErroTurmaCheia(aluno);
                        escolherHorario(2, aluno);
                    }
                    ha.addAluno(aluno);
                    ha.setAulaHidroginastica(aluno);
                    break;
                case 3:
                    System.out.println("+----------------------------------------------+");
                    System.out.println("|         *** ESCOLHA UM HORÁRIO ***           |");
                    System.out.println("+----------------------------------------------+");
                    System.out.println("| 3.Spinning             seg     qua     sex   |");
                    System.out.println("|    .Horários     ~    09:00 - 15:00 - 19:00  |");
                    System.out.println("+----------------------------------------------+");
                    System.out.print("| DIA (dd): ");
                    aluno.setDiaAula(sdfDia.parse(sc.next()));
                    System.out.print("| HORÁRIO (HH:mm): ");
                    aluno.setHorarioAula(sdfHora.parse(sc.next()));
                    if(sa.isFull(aluno)){
                        msgErroTurmaCheia(aluno);
                        escolherHorario(3, aluno);
                    }
                    sa.addAluno(aluno);
                    sa.setAulaSpinning(aluno);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return aluno;
    }

    public static void cadastrarAluno(Aluno aluno) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|    *** INFORME OS DADOS DO ALUNO(A) ***      |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| Matricula: ");
        aluno.setMatricula(sc.nextInt());
        System.out.print("| Nome: ");
        aluno.setNome(sc.next());
        System.out.print("| Sobrenome: ");
        aluno.setSobrenome(sc.next());
        System.out.print("| Data Nascimento: ");
        aluno.setDataNascimento(sc.next());
        System.out.print("| Email: ");
        aluno.setEmail(sc.next());
        System.out.print("| CPF: ");
        aluno.setCpf(sc.next());
        msgSucessoCadastro();
    }

    public static void relacaoAlunos() throws ParseException {
        System.out.println("+----------------------------------------------+");
        System.out.println("|       *** RELAÇÃO ALUNOS POR AULA ***        |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1. Boxe                                      |");
        System.out.println("| 2. Hidroginastica                            |");
        System.out.println("| 3. Spinning                                  |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| OPÇÃO: ");
        int op = sc.nextInt();
        System.out.println("************************************************");
        switch (op) {
            case 1:
                System.out.println("+----------------------------------------------+");
                System.out.println("|       *** RELAÇÃO ALUNOS POR TURMA ***       |");
                System.out.println("+----------------------------------------------+");
                System.out.println("| .BOXE                                        |");
                System.out.println("| 1. Lista Manhã                               |");
                System.out.println("| 2. Lista Tarde                               |");
                System.out.println("| 3. Lista Noite                               |");
                System.out.println("| 4. Todos os Alunos                           |");
                System.out.println("+----------------------------------------------+");
                System.out.print("| OPÇÃO: ");
                int opBoxe = sc.nextInt();
                System.out.println("************************************************");
                switch (opBoxe) {
                    case 1:
                        System.out.println(ba.findAllAlunoBoxeManha());
                        break;
                    case 2:
                        System.out.println(ba.findAllAlunoBoxeTarde());
                        break;
                    case 3:
                        System.out.println(ba.findAllAlunoBoxeNoite());
                        break;
                    case 4:
                        System.out.println(ba.findAllAlunoBoxe());
                        break;
                }
                break;
            case 2:
                System.out.println("+----------------------------------------------+");
                System.out.println("|       *** RELAÇÃO ALUNOS POR TURMA ***       |");
                System.out.println("+----------------------------------------------+");
                System.out.println("| .HIDROGINASTICA                              |");
                System.out.println("| 1. Lista Manhã                               |");
                System.out.println("| 2. Lista Tarde                               |");
                System.out.println("| 3. Lista Noite                               |");
                System.out.println("| 4. Todos os Alunos                           |");
                System.out.println("+----------------------------------------------+");
                System.out.print("| OPÇÃO: ");
                int opHidro = sc.nextInt();
                System.out.println("************************************************");
                switch (opHidro) {
                    case 1:
                        System.out.println(ha.findAllAlunoHidroginasticaManha());
                        break;
                    case 2:
                        System.out.println(ha.findAllAlunoHidroginasticaTarde());
                        break;
                    case 3:
                        System.out.println(ha.findAllAlunoHidroginasticaNoite());
                        break;
                    case 4:
                        System.out.println(ha.findAllAlunoHidroginastica());
                        break;
                }
                break;
            case 3:
                System.out.println("+----------------------------------------------+");
                System.out.println("|       *** RELAÇÃO ALUNOS POR TURMA ***       |");
                System.out.println("+----------------------------------------------+");
                System.out.println("| .SPINNING                                    |");
                System.out.println("| 1. Lista Manhã                               |");
                System.out.println("| 2. Lista Tarde                               |");
                System.out.println("| 3. Lista Noite                               |");
                System.out.println("| 4. Todos os Alunos                           |");
                System.out.println("+----------------------------------------------+");
                System.out.print("| OPÇÃO: ");
                int opSpin = sc.nextInt();
                System.out.println("************************************************");
                switch (opSpin) {
                    case 1:
                        System.out.println(sa.findAllAlunoSpinningManha());
                        break;
                    case 2:
                        System.out.println(sa.findAllAlunoSpinningTarde());
                        break;
                    case 3:
                        System.out.println(sa.findAllAlunoSpinningNoite());
                        break;
                    case 4:
                        System.out.println(sa.findAllAlunoSpinning());
                        break;
                }
                break;
        }
    }

    public static void relacaoProfissional() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|    *** RELAÇÃO PROFISSIONAL POR AULA ***     |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1. Professor Boxe                            |");
        System.out.println("| 2. Professor Hidroginastica                  |");
        System.out.println("| 3. Professor Spinning                        |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| OPÇÃO: ");
        int opProf = sc.nextInt();
        System.out.println("************************************************");
        switch (opProf) {
            case 1:
                System.out.println(ba.findProfissionalBoxe());
                break;
            case 2:
                System.out.println(ha.findProfissionalHidroginastica());
                break;
            case 3:
                System.out.println(sa.findProfissionalSpinning());
                break;
        }
    }

    public static void cadastrarProfissional(Profissional profissional) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|        *** CADASTRO PROFISSIONAL ***         |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| Nome: ");
        profissional.setNome(sc.next());
        System.out.print("| Licença: ");
        profissional.setLicenca(sc.next());
        System.out.println("|           *** AULA MINISTRADA ***            |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1.Boxe  -   2.Hidroginastica   - 3.Spinning  |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| OPÇÃO: ");
        int opProf = sc.nextInt();
        System.out.println("************************************************");
        switch (opProf) {
            case 1:
                ba.setProfissional(profissional);
                msgSucessoCadastro();
                break;
            case 2:
                ha.setProfissional(profissional);
                msgSucessoCadastro();
                break;
            case 3:
                sa.setProfissional(profissional);
                msgSucessoCadastro();
                break;
        }
    }

    public static void financeiro() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|       *** RELATORIO DE PAGAMENTOS ***        |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1. Boxe                                      |");
        System.out.println("|   a. Manhã                                   |");
        System.out.println("|   b. Tarde                                   |");
        System.out.println("|   c. Noite                                   |");
        System.out.println("|   d. Total Dia                               |");
        System.out.println("+---------------------------------------------+");
        System.out.println("| 2.Hidroginastica                             |");
        System.out.println("|   a. Manhã                                   |");
        System.out.println("|   b. Tarde                                   |");
        System.out.println("|   c. Noite                                   |");
        System.out.println("|   d. Total Dia                               |");
        System.out.println("+---------------------------------------------+");
        System.out.println("| 3.Spinning                                   |");
        System.out.println("|   a. Manhã                                   |");
        System.out.println("|   b. Tarde                                   |");
        System.out.println("|   c. Noite                                   |");
        System.out.println("|   d. Total Dia                               |");
        System.out.println("+----------------------------------------------+");
        System.out.print("| AULA: ");
        int opFinN = sc.nextInt();
        System.out.print("| TURNO/DIA: ");
        char opFinL = sc.next().charAt(0);
        System.out.println("+----------------------------------------------+");
        switch (opFinN) {
            case 1:
                switch (opFinL) {
                    case 'a':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getBoxeGymService().getValorTotalAulaBoxeByManha(ba)));
                        break;
                    case 'b':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getBoxeGymService().getValorTotalAulaBoxeByTarde(ba)));
                        break;
                    case 'c':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getBoxeGymService().getValorTotalAulaBoxeByNoite(ba)));
                        break;
                    case 'd':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getBoxeGymService().getValorTotalAulaBoxeByDay(ba)));
                        break;
                }
                break;
            case 2:
                switch (opFinL) {
                    case 'a':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getHidroginasticaGymService().getValorTotalAulaHidroginasticaByManha(ha)));
                        break;
                    case 'b':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getHidroginasticaGymService().getValorTotalAulaHidroginasticaByTarde(ha)));
                        break;
                    case 'c':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getHidroginasticaGymService().getValorTotalAulaHidroginasticaByNoite(ha)));
                        break;
                    case 'd':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getHidroginasticaGymService().getValorTotalAulaHidroginasticaByDay(ha)));
                        break;
                }
                break;
            case 3:
                switch (opFinL) {
                    case 'a':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getSpinningGymService().getValorTotalAulaSpinningByManha(sa)));
                        break;
                    case 'b':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getSpinningGymService().getValorTotalAulaSpinningByTarde(sa)));
                        break;
                    case 'c':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getSpinningGymService().getValorTotalAulaSpinningByNoite(sa)));
                        break;
                    case 'd':
                        System.out.println("Valor a receber: R$ " + String.format("%.2f", gym.getSpinningGymService().getValorTotalAulaSpinningByDay(sa)));
                        break;
                }
                break;
        }
        System.out.println("************************************************");
    }

    public static void msgSucessoCadastro() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|  *** CADASTRO REALIZADO COM SUCESSO! ***     |");
        System.out.println("+----------------------------------------------+");
        System.out.println("************************************************");
    }

    public static void msgErroTurmaCheia(Aluno aluno) throws ParseException {
        System.out.printf("| Turma das '%s' horas CHEIA, escolha outro Horário!\n", sdfHora.format(aluno.getHorarioAula()));
    }
}
