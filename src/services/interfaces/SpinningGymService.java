package services.interfaces;

import entidades.Spinning;

public interface SpinningGymService {

    Double getValorTotalAulaSpinningByQuartaManha(Spinning spinning);

    Double getValorTotalAulaSpinningByQuartaTarde(Spinning spinning);

    Double getValorTotalAulaSpinningByQuartaNoite(Spinning spinning);

    Double getValorTotalAulaSpinningBySextaManha(Spinning spinning);

    Double getValorTotalAulaSpinningBySextaTarde(Spinning spinning);

    Double getValorTotalAulaSpinningBySextaNoite(Spinning spinning);

    Double getValorTotalAulaSpinningBySabadoManha(Spinning spinning);

    Double getValorTotalAulaSpinningBySabadoTarde(Spinning spinning);

    Double getValorTotalAulaSpinningBySabadoNoite(Spinning spinning);

    Double getValorTotalAulaSpinningByQuarta(Spinning spinning);

    Double getValorTotalAulaSpinningBySexta(Spinning spinning);

    Double getValorTotalAulaSpinningBySabado(Spinning spinning);

    Double getValorTotalAulaSpinningByWeek(Spinning spinning);
}
