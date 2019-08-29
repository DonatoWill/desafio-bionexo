package br.com.desafiobionexo.bionexo.dto;

public class Score {


    private int adaptaion_for_seniors;
    private int medical_equipment;
    private int medicine;

    private Score(String adaptaion_for_seniors, String medical_equipment, String medicine){

        this.setAdaptaion_for_seniors(adaptaion_for_seniors);
        this.setMedical_equipment(medical_equipment);
        this.setMedicine(medicine);

    }

    public static Score of(String adaptaion_for_seniors, String medical_equipment, String medicine){
        return new Score(adaptaion_for_seniors, medical_equipment, medicine);
    }

    public int getAdaptaion_for_seniors() {
        return adaptaion_for_seniors;
    }

    public void setAdaptaion_for_seniors(String adaptaion_for_seniors) {
        this.adaptaion_for_seniors = this.checkScore(adaptaion_for_seniors);
    }

    public int getMedical_equipment() {
        return medical_equipment;
    }

    public void setMedical_equipment(String medical_equipment) {
        this.medical_equipment = this.checkScore(medical_equipment);
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
       this.medicine = this.checkScore(medicine);
    }

    private int checkScore(String score){

        switch (score){
            case "Desempenho muito acima da média":
                return 3;
            case "Desempenho acima da média":
                return 2;
            case "Desempenho mediano ou  um pouco abaixo da média":
                return 1;
            default: return 0;
        }
    }
}
