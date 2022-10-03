package services.interfaces;

import entidades.Boxe;

public interface BoxeGymService {

    Double getValorTotalAulaBoxeByManha(Boxe boxe);

    Double getValorTotalAulaBoxeByTarde(Boxe boxe);

    Double getValorTotalAulaBoxeByNoite(Boxe boxe);

    Double getValorTotalAulaBoxeByDay(Boxe boxe);
}
