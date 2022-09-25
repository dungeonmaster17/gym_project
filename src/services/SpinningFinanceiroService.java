package services;

import entidades.Gym;
import interfaces.SpinningGymService;

public class SpinningFinanceiroService implements SpinningGymService {
    public static final double VALOR_HORA_AULA_SPINNING_MANHA = 70.00;
    public static final double VALOR_HORA_AULA_SPINNING_TARDE = 70.00;
    public static final double VALOR_HORA_AULA_SPINNING_NOITE = 70.00;
    private Gym gym;

    public SpinningFinanceiroService(Gym gym) {
        this.gym = gym;
    }

    public SpinningFinanceiroService() {
    }

    @Override
    public Double calcValorAulaSpinningManha(){
        return gym.getSpinningSala().getHorariosManhaList().size() * VALOR_HORA_AULA_SPINNING_MANHA;
    }
    @Override
    public Double calcValorAulaSpinningTarde(){
        return gym.getSpinningSala().getHorariosTardeList().size() * VALOR_HORA_AULA_SPINNING_TARDE;
    }
    @Override
    public Double calcValorAulaSpinningNoite(){
        return gym.getSpinningSala().getHorariosNoiteList().size() * VALOR_HORA_AULA_SPINNING_NOITE;
    }
    @Override
    public Double calcValorTotalAulaSpinning(){
        return calcValorAulaSpinningManha() + calcValorAulaSpinningTarde() + calcValorAulaSpinningNoite();
    }
    @Override
    public String getValorTotalAulaSpinningByManha(){
        return "Valor Total a Receber: R$ " + String.format("%.2f", calcValorAulaSpinningManha());
    }
    @Override
    public String getValorTotalAulaSpinningByTarde(){
        return "Valor Total a Receber: R$ " + String.format("%.2f", calcValorAulaSpinningTarde());
    }
    @Override
    public String getValorTotalAulaSpinningByNoite(){
        return "Valor Total a Receber: R$ " + String.format("%.2f", calcValorAulaSpinningNoite());
    }
    @Override
    public String getValorTotalAulaSpinningByDay(){
        return "Valor Total a Receber: R$ " + String.format("%.2f", calcValorTotalAulaSpinning());
    }
}
