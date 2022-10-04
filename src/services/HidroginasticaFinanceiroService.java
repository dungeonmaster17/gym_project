package services;

import entidades.Hidroginastica;
import services.interfaces.HidroginasticaGymService;

public class HidroginasticaFinanceiroService implements HidroginasticaGymService {
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_MANHA = 150.00;
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_TARDE = 150.00;
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_NOITE = 150.00;

    public HidroginasticaFinanceiroService() {
    }

    @Override
    public Double getValorTotalAulaHidroginasticaByQuartaManha(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosQuartaManhaList().size() * VALOR_HORA_AULA_HIDROGINASTICA_MANHA;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaByQuartaTarde(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosQuartaTardeList().size() * VALOR_HORA_AULA_HIDROGINASTICA_TARDE;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaByQuartaNoite(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosQuartaNoiteList().size() * VALOR_HORA_AULA_HIDROGINASTICA_NOITE;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySextaManha(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosSextaManhaList().size() * VALOR_HORA_AULA_HIDROGINASTICA_MANHA;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySextaTarde(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosSextaTardeList().size() * VALOR_HORA_AULA_HIDROGINASTICA_TARDE;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySextaNoite(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosSextaNoiteList().size() * VALOR_HORA_AULA_HIDROGINASTICA_NOITE;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySabadoManha(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosSabadoManhaList().size() * VALOR_HORA_AULA_HIDROGINASTICA_MANHA;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySabadoTarde(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosSabadoTardeList().size() * VALOR_HORA_AULA_HIDROGINASTICA_TARDE;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySabadoNoite(Hidroginastica hidroginastica) {
        return hidroginastica.getHorariosSabadoNoiteList().size() * VALOR_HORA_AULA_HIDROGINASTICA_NOITE;
    }

    @Override
    public Double getValorTotalAulaHidroginasticaByQuarta(Hidroginastica hidroginastica) {
        return getValorTotalAulaHidroginasticaByQuartaManha(hidroginastica) + getValorTotalAulaHidroginasticaByQuartaTarde(hidroginastica) + getValorTotalAulaHidroginasticaByQuartaNoite(hidroginastica);
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySexta(Hidroginastica hidroginastica) {
        return getValorTotalAulaHidroginasticaBySextaManha(hidroginastica) + getValorTotalAulaHidroginasticaBySextaTarde(hidroginastica) + getValorTotalAulaHidroginasticaBySextaNoite(hidroginastica);
    }

    @Override
    public Double getValorTotalAulaHidroginasticaBySabado(Hidroginastica hidroginastica) {
        return getValorTotalAulaHidroginasticaBySabadoManha(hidroginastica) + getValorTotalAulaHidroginasticaBySabadoTarde(hidroginastica) + getValorTotalAulaHidroginasticaBySabadoNoite(hidroginastica);
    }

    @Override
    public Double getValorTotalAulaHidroginasticaByWeek(Hidroginastica hidroginastica) {
        return getValorTotalAulaHidroginasticaByQuarta(hidroginastica) + getValorTotalAulaHidroginasticaBySexta(hidroginastica) + getValorTotalAulaHidroginasticaBySabado(hidroginastica);
    }
}
