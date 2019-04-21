package entity;

public class Motor  {

    private String plat;
    private String nama;
    private String motor;
    private String keluhan;


    public boolean equals(Object obj) {
        Motor mtr = (Motor) obj;
        return plat.equals(mtr.getPlat());
    }
    public Motor(String plat, String nama, String motor) {
        this.plat    = plat;
        this.nama    = nama;
        this.motor   = motor;

    }


    public String getPlat() {

        return plat;
    }

    public void setPlat(String plat) {

        this.plat = plat;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getMotor() {

        return motor;
    }

    public void setmotor(String motor) {

        this.motor = motor;
    }
}