package modelos;

import java.util.Objects;

public class Item {

    private int id;
    private  String nombre;
    private Double aumentoDaño;
    private Double aumentoMana;
    private Double aumentoSalud;
    private Double aumentoDefensa;

    public Item() {
    }

    public Item(int id, String nombre, Double aumentoDaño, Double aumentoMana, Double aumentoSalud, Double aumentoDefensa) {
        this.id = id;
        this.nombre = nombre;
        this.aumentoDaño = aumentoDaño;
        this.aumentoMana = aumentoMana;
        this.aumentoSalud = aumentoSalud;
        this.aumentoDefensa = aumentoDefensa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAumentoDaño() {
        return aumentoDaño;
    }

    public void setAumentoDaño(Double aumentoDaño) {
        this.aumentoDaño = aumentoDaño;
    }

    public Double getAumentoMana() {
        return aumentoMana;
    }

    public void setAumentoMana(Double aumentoMana) {
        this.aumentoMana = aumentoMana;
    }

    public Double getAumentoSalud() {
        return aumentoSalud;
    }

    public void setAumentoSalud(Double aumentoSalud) {
        this.aumentoSalud = aumentoSalud;
    }

    public Double getAumentoDefensa() {
        return aumentoDefensa;
    }

    public void setAumentoDefensa(Double aumentoDefensa) {
        this.aumentoDefensa = aumentoDefensa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(nombre, item.nombre) && Objects.equals(aumentoDaño, item.aumentoDaño) && Objects.equals(aumentoMana, item.aumentoMana) && Objects.equals(aumentoSalud, item.aumentoSalud) && Objects.equals(aumentoDefensa, item.aumentoDefensa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, aumentoDaño, aumentoMana, aumentoSalud, aumentoDefensa);
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aumentoDaño=" + aumentoDaño +
                ", aumentoMana=" + aumentoMana +
                ", aumentoSalud=" + aumentoSalud +
                ", aumentoDefensa=" + aumentoDefensa +
                '}';
    }
}
