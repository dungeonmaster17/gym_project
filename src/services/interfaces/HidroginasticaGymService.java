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
    Double getValorTotalAulaHidroginasticaByDay(Hidroginastica hidroginastica);
}
