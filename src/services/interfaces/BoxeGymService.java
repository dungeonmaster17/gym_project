package services.interfaces;

import entidades.Boxe;

public interface BoxeGymService {

    Double getValorTotalAulaBoxeByQuartaManha(Boxe boxe);

    Double getValorTotalAulaBoxeByQuartaTarde(Boxe boxe);

    Double getValorTotalAulaBoxeByQuartaNoite(Boxe boxe);

    Double getValorTotalAulaBoxeBySextaManha(Boxe boxe);

    Double getValorTotalAulaBoxeBySextaTarde(Boxe boxe);

    Double getValorTotalAulaBoxeBySextaNoite(Boxe boxe);

    Double getValorTotalAulaBoxeBySabadoManha(Boxe boxe);

    Double getValorTotalAulaBoxeBySabadoTarde(Boxe boxe);

    Double getValorTotalAulaBoxeBySabadoNoite(Boxe boxe);

    Double getValorTotalAulaBoxeByQuarta(Boxe boxe);

    Double getValorTotalAulaBoxeBySexta(Boxe boxe);

    Double getValorTotalAulaBoxeBySabado(Boxe boxe);

    Double getValorTotalAulaBoxeByWeek(Boxe boxe);
}
