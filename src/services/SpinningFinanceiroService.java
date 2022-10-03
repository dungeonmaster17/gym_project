package services;

import entidades.Spinning;
import services.interfaces.SpinningGymService;

public class SpinningFinanceiroService implements SpinningGymService {
    public static final double VALOR_HORA_AULA_SPINNING_MANHA = 70.00;
    public static final double VALOR_HORA_AULA_SPINNING_TARDE = 70.00;
    public static final double VALOR_HORA_AULA_SPINNING_NOITE = 70.00;

    public SpinningFinanceiroService() {
    }

    @Override
    public Double getValorTotalAulaSpinningByManha(Spinning spinning){
        return spinning.getHorariosManhaList().size() * VALOR_HORA_AULA_SPINNING_MANHA;
    }
    @Override
    public Double getValorTotalAulaSpinningByTarde(Spinning spinning){
        return spinning.getHorariosTardeList().size() * VALOR_HORA_AULA_SPINNING_TARDE;
    }
    @Override
    public Double getValorTotalAulaSpinningByNoite(Spinning spinning){
        return spinning.getHorariosNoiteList().size() * VALOR_HORA_AULA_SPINNING_NOITE;
    }
    @Override
    public Double getValorTotalAulaSpinningByDay(Spinning spinning) {
        return getValorTotalAulaSpinningByManha(spinning) + getValorTotalAulaSpinningByTarde(spinning) + getValorTotalAulaSpinningByNoite(spinning);
    }
}
