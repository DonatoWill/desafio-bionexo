package br.com.desafiobionexo.bionexo.dto;

public class Score {


    private int adaptaion_for_seniors;
    private int medical_equipment;
    private int medicine;

    private Score(int adaptaion_for_seniors, int medical_equipment, int medicine){

        this.adaptaion_for_seniors = adaptaion_for_seniors;
        this.medical_equipment = medical_equipment;
        this.medicine = medicine;

    }

    public Score of(int adaptaion_for_seniors, int medical_equipment, int medicine){
        return new Score(adaptaion_for_seniors, medical_equipment, medicine);
    }

    public int getAdaptaion_for_seniors() {
        return adaptaion_for_seniors;
    }

    public void setAdaptaion_for_seniors(int adaptaion_for_seniors) {
        this.adaptaion_for_seniors = adaptaion_for_seniors;
    }

    public int getMedical_equipment() {
        return medical_equipment;
    }

    public void setMedical_equipment(int medical_equipment) {
        this.medical_equipment = medical_equipment;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }
}
