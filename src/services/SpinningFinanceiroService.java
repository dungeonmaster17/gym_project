package services;

import entidades.Gym;
import entidades.Hidroginastica;
import entidades.Spinning;
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
    public Double getValorTotalAulaSpinningByManha(Spinning spinning){
        return gym.getSpinningSala().getHorariosManhaList().size() * VALOR_HORA_AULA_SPINNING_MANHA;
    }
    @Override
    public Double getValorTotalAulaSpinningByTarde(Spinning spinning){
        return gym.getSpinningSala().getHorariosTardeList().size() * VALOR_HORA_AULA_SPINNING_TARDE;
    }
    @Override
    public Double getValorTotalAulaSpinningByNoite(Spinning spinning){
        return gym.getSpinningSala().getHorariosNoiteList().size() * VALOR_HORA_AULA_SPINNING_NOITE;
    }
    @Override
    public Double getValorTotalAulaSpinningByDay(Spinning spinning) {
        return getValorTotalAulaSpinningByManha(spinning) + getValorTotalAulaSpinningByTarde(spinning) + getValorTotalAulaSpinningByNoite(spinning);
    }
}
