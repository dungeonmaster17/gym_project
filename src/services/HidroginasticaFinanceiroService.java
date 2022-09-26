package services;

import entidades.Hidroginastica;
import interfaces.HidroginasticaGymService;

public class HidroginasticaFinanceiroService implements HidroginasticaGymService {
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_MANHA = 150.00;
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_TARDE = 150.00;
    public static final double VALOR_HORA_AULA_HIDROGINASTICA_NOITE = 150.00;
    

    public Double getValorTotalAulaHidroginasticaByManha(Hidroginastica hidroginastica){
        return hidroginastica.getHorariosManhaList().size() * VALOR_HORA_AULA_HIDROGINASTICA_MANHA;
    }

    public Double getValorTotalAulaHidroginasticaByTarde(Hidroginastica hidroginastica){
        return hidroginastica.getHorariosTardeList().size() * VALOR_HORA_AULA_HIDROGINASTICA_TARDE;
    }

    public Double getValorTotalAulaHidroginasticaByNoite(Hidroginastica hidroginastica){
        return hidroginastica.getHorariosNoiteList().size() * VALOR_HORA_AULA_HIDROGINASTICA_NOITE;
    }

    public Double getValorTotalAulaHidroginasticaByDay(Hidroginastica hidroginastica){
        return getValorTotalAulaHidroginasticaByManha(hidroginastica) + getValorTotalAulaHidroginasticaByTarde(hidroginastica) + getValorTotalAulaHidroginasticaByNoite(hidroginastica);
    }

}
