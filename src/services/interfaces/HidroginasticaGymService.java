package services.interfaces;

import entidades.Hidroginastica;

public interface HidroginasticaGymService {

    Double getValorTotalAulaHidroginasticaByQuartaManha(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByQuartaTarde(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByQuartaNoite(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySextaManha(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySextaTarde(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySextaNoite(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySabadoManha(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySabadoTarde(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySabadoNoite(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByQuarta(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySexta(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaBySabado(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByWeek(Hidroginastica hidroginastica);
}
