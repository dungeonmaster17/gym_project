package services;

import entidades.Gym;
import interfaces.BoxeGymService;

public class BoxeFinanceiroServiceBoxe implements BoxeGymService {
    public static final double VALOR_HORA_AULA_BOXE_MANHA = 120.00;
    public static final double VALOR_HORA_AULA_BOXE_TARDE = 120.00;
    public static final double VALOR_HORA_AULA_BOXE_NOITE = 120.00;
    private Gym gym;

    public BoxeFinanceiroServiceBoxe(Gym gym) {
        this.gym = gym;
    }

    @Override
    public Double calcValorAulaBoxeManha(){
        return gym.getBoxeSala().getHorariosManhaList().size() * VALOR_HORA_AULA_BOXE_MANHA;
    }
    @Override
    public Double calcValorAulaBoxeTarde(){
        return gym.getBoxeSala().getHorariosTardeList().size() * VALOR_HORA_AULA_BOXE_TARDE;
    }
    @Override
    public Double calcValorAulaBoxeNoite(){
        return gym.getBoxeSala().getHorariosNoiteList().size() * VALOR_HORA_AULA_BOXE_NOITE;
    }
    @Override
    public Double calcValorTotalAulaBoxe(){
        return calcValorAulaBoxeManha() + calcValorAulaBoxeTarde() + calcValorAulaBoxeNoite();
    }
    @Override
    public String getValorTotalAulaBoxeByManha(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorAulaBoxeManha());
    }
    @Override
    public String getValorTotalAulaBoxeByTarde(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorAulaBoxeTarde());
    }
    @Override
    public String getValorTotalAulaBoxeByNoite(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorAulaBoxeNoite());
    }
    @Override
    public String getValorTotalAulaBoxeByDay(){
        return "Valor Total a Receber: R$ " + String.format("%.2f", calcValorTotalAulaBoxe());
    }

}
