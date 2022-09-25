package entidades;

import interfaces.HidroginasticaGymService;
import interfaces.SpinningGymService;
import salas.BoxeAula;
import salas.HidroginasticaAula;
import salas.SpinningAula;
import interfaces.BoxeGymService;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private String nome;
    private String endereco;
    private List<Profissional> profissionaisList = new ArrayList<>();
    private BoxeGymService boxeGymService;
    private HidroginasticaGymService hidroginasticaGymService;
    private SpinningGymService spinningGymService;
    private BoxeAula boxeAula;
    private HidroginasticaAula hidroginasticaAula;
    private SpinningAula spinningAula;

    public Gym() {
    }

    public Gym(BoxeAula boxeAula, HidroginasticaAula hidroginasticaAula, SpinningAula spinningAula) {
        this.boxeAula = boxeAula;
        this.hidroginasticaAula = hidroginasticaAula;
        this.spinningAula = spinningAula;
    }

    public Gym(BoxeGymService boxeGymService, HidroginasticaGymService hidroginasticaGymService, SpinningGymService spinningGymService, BoxeAula boxeAula, HidroginasticaAula hidroginasticaAula, SpinningAula spinningAula) {
        this.boxeGymService = boxeGymService;
        this.hidroginasticaGymService = hidroginasticaGymService;
        this.spinningGymService = spinningGymService;
        this.boxeAula = boxeAula;
        this.hidroginasticaAula = hidroginasticaAula;
        this.spinningAula = spinningAula;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BoxeGymService getGymService() {
        return boxeGymService;
    }

    public void setGymService(BoxeGymService boxeGymService) {
        this.boxeGymService = boxeGymService;
    }
    public BoxeAula getBoxeSala() {
        return boxeAula;
    }

    public void setBoxeSala(BoxeAula boxeAula) {
        this.boxeAula = boxeAula;
    }
    public HidroginasticaAula getHidroginasticaSala() { return hidroginasticaAula; }

    public void setHidroginasticaSala(HidroginasticaAula hidroginasticaAula) { this.hidroginasticaAula = hidroginasticaAula; }
    public SpinningAula getSpinningSala() {
        return spinningAula;
    }

    public void setSpinningSala(SpinningAula spinningAula) {
        this.spinningAula = spinningAula;
    }

    public List<Profissional> getProfissionais() {
        return profissionaisList;
    }

    public void addProfissional(Profissional profissional){
        profissionaisList.add(profissional);
    }

    public void removeProfissional(Profissional profissional){
        profissionaisList.remove(profissional);
    }

    @Override
    public String toString(){
        return " *** Academia ***\n" + nome;
    }
}
