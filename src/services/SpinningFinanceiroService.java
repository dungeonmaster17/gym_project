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
        return spinning.getHorariosQuartaManhaList().size() * VALOR_HORA_AULA_SPINNING_MANHA;
    }

    @Override
    public Double getValorTotalAulaSpinningByQuartaTarde(Spinning spinning) {
        return spinning.getHorariosQuartaTardeList().size() * VALOR_HORA_AULA_SPINNING_TARDE;
    }

    @Override
    public Double getValorTotalAulaSpinningByQuartaNoite(Spinning spinning) {
        return spinning.getHorariosQuartaNoiteList().size() * VALOR_HORA_AULA_SPINNING_NOITE;
    }

    @Override
    public Double getValorTotalAulaSpinningBySextaManha(Spinning spinning) {
        return spinning.getHorariosSextaManhaList().size() * VALOR_HORA_AULA_SPINNING_MANHA;
    }

    @Override
    public Double getValorTotalAulaSpinningBySextaTarde(Spinning spinning) {
        return spinning.getHorariosSextaTardeList().size() * VALOR_HORA_AULA_SPINNING_TARDE;
    }

    @Override
    public Double getValorTotalAulaSpinningBySextaNoite(Spinning spinning) {
        return spinning.getHorariosSextaNoiteList().size() * VALOR_HORA_AULA_SPINNING_NOITE;
    }

    @Override
    public Double getValorTotalAulaSpinningBySabadoManha(Spinning spinning) {
        return spinning.getHorariosSabadoManhaList().size() * VALOR_HORA_AULA_SPINNING_MANHA;
    }

    @Override
    public Double getValorTotalAulaSpinningBySabadoTarde(Spinning spinning) {
        return spinning.getHorariosSabadoTardeList().size() * VALOR_HORA_AULA_SPINNING_TARDE;
    }

    @Override
    public Double getValorTotalAulaSpinningBySabadoNoite(Spinning spinning) {
        return spinning.getHorariosSabadoNoiteList().size() * VALOR_HORA_AULA_SPINNING_NOITE;
    }

    @Override
    public Double getValorTotalAulaSpinningByQuarta(Spinning spinning) {
        return getValorTotalAulaSpinningByQuartaManha(spinning) + getValorTotalAulaSpinningByQuartaTarde(spinning) + getValorTotalAulaSpinningByQuartaNoite(spinning);
    }

    @Override
    public Double getValorTotalAulaSpinningBySexta(Spinning spinning) {
        return getValorTotalAulaSpinningBySextaManha(spinning) + getValorTotalAulaSpinningBySextaTarde(spinning) + getValorTotalAulaSpinningBySextaNoite(spinning);
    }

    @Override
    public Double getValorTotalAulaSpinningBySabado(Spinning spinning) {
        return null;
    }

    @Override
    public Double getValorTotalAulaSpinningByWeek(Spinning spinning) {
        return getValorTotalAulaSpinningByQuarta(spinning) + getValorTotalAulaSpinningBySexta(spinning) + getValorTotalAulaSpinningBySabado(spinning);
    }
}
