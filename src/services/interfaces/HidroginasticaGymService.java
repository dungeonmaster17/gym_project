package services.interfaces;

import entidades.Hidroginastica;

public interface HidroginasticaGymService {

    Double getValorTotalAulaHidroginasticaByManha(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByTarde(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByNoite(Hidroginastica hidroginastica);

    Double getValorTotalAulaHidroginasticaByDay(Hidroginastica hidroginastica);
}
