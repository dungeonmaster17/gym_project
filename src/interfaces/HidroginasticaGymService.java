package interfaces;

public interface HidroginasticaGymService {
    public Double calcValorAulaHidroginasticaManha();

    public Double calcValorAulaHidroginasticaTarde();


    public Double calcValorAulaHidroginasticaNoite();

    public Double calcValorTotalAulaHidroginastica();

    public String getValorTotalAulaHidroginasticaByManha();

    public String getValorTotalAulaHidroginasticaByTarde();

    public String getValorTotalAulaHidroginasticaByNoite();

    public String getValorTotalAulaHidroginasticaByDay();
}
