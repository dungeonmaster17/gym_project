package interfaces;

public interface SpinningGymService {
    public Double calcValorAulaSpinningManha();

    public Double calcValorAulaSpinningTarde();

    public Double calcValorAulaSpinningNoite();

    public Double calcValorTotalAulaSpinning();

    public String getValorTotalAulaSpinningByManha();

    public String getValorTotalAulaSpinningByTarde();

    public String getValorTotalAulaSpinningByNoite();

    public String getValorTotalAulaSpinningByDay();
}
