package interfaces;

public interface BoxeGymService {

    Double calcValorAulaBoxeManha();

    Double calcValorAulaBoxeTarde();

    Double calcValorAulaBoxeNoite();

    Double calcValorTotalAulaBoxe();

    String getValorTotalAulaBoxeByManha();

    String getValorTotalAulaBoxeByTarde();

    String getValorTotalAulaBoxeByNoite();

    String getValorTotalAulaBoxeByDay();
}
