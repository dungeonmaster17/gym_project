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

    Double getValorTotalAulaSpinningByDay(Spinning spinning);
}
