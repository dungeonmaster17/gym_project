package interfaces;

import entidades.Spinning;

public interface SpinningGymService {

    Double getValorTotalAulaSpinningByManha(Spinning spinning);

    Double getValorTotalAulaSpinningByTarde(Spinning spinning);

    Double getValorTotalAulaSpinningByNoite(Spinning spinning);

    Double getValorTotalAulaSpinningByDay(Spinning spinning);
}
