package services;

import entidades.Boxe;
import services.interfaces.BoxeGymService;

public class BoxeFinanceiroService implements BoxeGymService {
    public static final double VALOR_HORA_AULA_BOXE_MANHA = 120.00;
    public static final double VALOR_HORA_AULA_BOXE_TARDE = 120.00;
    public static final double VALOR_HORA_AULA_BOXE_NOITE = 120.00;

    public BoxeFinanceiroService() {
    }


    @Override
    public Double getValorTotalAulaBoxeByQuartaManha(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeByQuartaTarde(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeByQuartaNoite(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeBySextaManha(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeBySextaTarde(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeBySextaNoite(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeBySabadoManha(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeBySabadoTarde(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeBySabadoNoite(Boxe boxe) {
        return null;
    }

    @Override
    public Double getValorTotalAulaBoxeByDay(Boxe boxe) {
        return null;
    }
}
