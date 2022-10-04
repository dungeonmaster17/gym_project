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
    public Double getValorTotalAulaSpinningByQuartaManha(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningByQuartaTarde(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningByQuartaNoite(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningBySextaManha(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningBySextaTarde(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningBySextaNoite(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningBySabadoManha(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningBySabadoTarde(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningBySabadoNoite(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningByDay(Spinning spinning) {
        return null;
    }
}
