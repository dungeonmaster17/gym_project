package services;

import entidades.Gym;
import interfaces.HidroginasticaGymService;

public class HidroginasticaFinanceiroService implements HidroginasticaGymService {
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_MANHA = 150.00;
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_TARDE = 150.00;
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_NOITE = 150.00;
    private Gym gym;

    public HidroginasticaFinanceiroService(Gym gym) {
        this.gym = gym;
    }


    public Double calcValorAulaHidroginasticaManha(){
        return gym.getHidroginasticaSala().getHorariosManhaList().size() * VALOR_HORA_AULA_HIDROGINASTICA_MANHA;
    }

    public Double calcValorAulaHidroginasticaTarde(){
        return gym.getHidroginasticaSala().getHorariosTardeList().size() * VALOR_HORA_AULA_HIDROGINASTICA_TARDE;
    }

    public Double calcValorAulaHidroginasticaNoite(){
        return gym.getHidroginasticaSala().getHorariosNoiteList().size() * VALOR_HORA_AULA_HIDROGINASTICA_NOITE;
    }

    public Double calcValorTotalAulaHidroginastica(){
        return calcValorAulaHidroginasticaManha() + calcValorAulaHidroginasticaTarde() + calcValorAulaHidroginasticaNoite();
    }

    public String getValorTotalAulaHidroginasticaByManha(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorAulaHidroginasticaManha());
    }

    public String getValorTotalAulaHidroginasticaByTarde(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorAulaHidroginasticaTarde());
    }

    public String getValorTotalAulaHidroginasticaByNoite(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorAulaHidroginasticaNoite());
    }

    public String getValorTotalAulaHidroginasticaByDay(){
        return "Valor Total a Receber: R$ " + String.format("%.2f" , calcValorTotalAulaHidroginastica());
    }
}
