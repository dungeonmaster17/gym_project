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
        return boxe.getHorariosQuartaManhaList().size() * VALOR_HORA_AULA_BOXE_MANHA;
    }

    @Override
    public Double getValorTotalAulaBoxeByQuartaTarde(Boxe boxe) {
        return boxe.getHorariosQuartaTardeList().size() * VALOR_HORA_AULA_BOXE_TARDE;
    }

    @Override
    public Double getValorTotalAulaBoxeByQuartaNoite(Boxe boxe) {
        return boxe.getHorariosQuartaNoiteList().size() * VALOR_HORA_AULA_BOXE_NOITE;
    }

    @Override
    public Double getValorTotalAulaBoxeBySextaManha(Boxe boxe) {
        return boxe.getHorariosSextaManhaList().size() * VALOR_HORA_AULA_BOXE_MANHA;
    }

    @Override
    public Double getValorTotalAulaBoxeBySextaTarde(Boxe boxe) {
        return boxe.getHorariosSextaTardeList().size() * VALOR_HORA_AULA_BOXE_TARDE;
    }

    @Override
    public Double getValorTotalAulaBoxeBySextaNoite(Boxe boxe) {
        return boxe.getHorariosSextaNoiteList().size() * VALOR_HORA_AULA_BOXE_NOITE;
    }

    @Override
    public Double getValorTotalAulaBoxeBySabadoManha(Boxe boxe) {
        return boxe.getHorariosSabadoManhaList().size() * VALOR_HORA_AULA_BOXE_MANHA;
    }

    @Override
    public Double getValorTotalAulaBoxeBySabadoTarde(Boxe boxe) {
        return boxe.getHorariosSabadoTardeList().size() * VALOR_HORA_AULA_BOXE_TARDE;
    }

    @Override
    public Double getValorTotalAulaBoxeBySabadoNoite(Boxe boxe) {
        return boxe.getHorariosSabadoNoiteList().size() * VALOR_HORA_AULA_BOXE_NOITE;
    }

    @Override
    public Double getValorTotalAulaBoxeByQuarta(Boxe boxe) {
        return getValorTotalAulaBoxeByQuartaManha(boxe) + getValorTotalAulaBoxeByQuartaTarde(boxe) + getValorTotalAulaBoxeByQuartaNoite(boxe);
    }

    @Override
    public Double getValorTotalAulaBoxeBySexta(Boxe boxe) {
        return getValorTotalAulaBoxeBySextaManha(boxe) + getValorTotalAulaBoxeBySextaTarde(boxe) + getValorTotalAulaBoxeBySextaNoite(boxe);
    }

    @Override
    public Double getValorTotalAulaBoxeBySabado(Boxe boxe) {
        return getValorTotalAulaBoxeBySabadoManha(boxe) + getValorTotalAulaBoxeBySabadoTarde(boxe) + getValorTotalAulaBoxeBySabadoNoite(boxe);
    }
}
