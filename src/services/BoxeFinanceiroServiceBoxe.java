package services;

import entidades.Boxe;
import interfaces.BoxeGymService;

public class BoxeFinanceiroServiceBoxe implements BoxeGymService {
    public static final double VALOR_HORA_AULA_BOXE_MANHA = 120.00;
    public static final double VALOR_HORA_AULA_BOXE_TARDE = 120.00;
    public static final double VALOR_HORA_AULA_BOXE_NOITE = 120.00;

    @Override
    public Double getValorTotalAulaBoxeByManha(Boxe boxe){
        return boxe.getHorariosManhaList().size() * VALOR_HORA_AULA_BOXE_MANHA;
    }
    @Override
    public Double getValorTotalAulaBoxeByTarde(Boxe boxe){
        return boxe.getHorariosTardeList().size() * VALOR_HORA_AULA_BOXE_TARDE;
    }
    @Override
    public Double getValorTotalAulaBoxeByNoite(Boxe boxe){
        return boxe.getHorariosNoiteList().size() * VALOR_HORA_AULA_BOXE_NOITE;
    }
    @Override
    public Double getValorTotalAulaBoxeByDay(Boxe boxe){
        return getValorTotalAulaBoxeByManha(boxe) + getValorTotalAulaBoxeByTarde(boxe) + getValorTotalAulaBoxeByNoite(boxe);
    }
}
