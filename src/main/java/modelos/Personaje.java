package modelos;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Personaje {


    private int id;
    private  String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private Integer nivel;
    private Double vida;
    private Double ataque;
    private Double mana;
    private Double defensa;
    private Double vidaBase;
    private Double ataqueBase;
    private Double manaBase;
    private Double defensaBase;
    private Region region;
    private List<Habilidad> habilidad;
    private List<Item> equipamiento;
    private Escalabilidad escalabilidad;


    public Personaje() {
    }

    public Personaje(int id, String nombre, String descripcion, LocalDate fechaCreacion, Integer nivel, Double vida, Double ataque,
                     Double mana, Double defensa, Double vidaBase, Double ataqueBase, Double manaBase,
                     Double defensaBase, Region region, List<Habilidad> habilidad, List<Item> equipamiento, Escalabilidad escalabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.mana = mana;
        this.defensa = defensa;
        this.vidaBase = vidaBase;
        this.ataqueBase = ataqueBase;
        this.manaBase = manaBase;
        this.defensaBase = defensaBase;
        this.region = region;
        this.habilidad = habilidad;
        this.equipamiento = equipamiento;
        this.escalabilidad = escalabilidad;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Double getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(Double vidaBase) {
        this.vidaBase = vidaBase;
    }

    public Double getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(Double ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public Double getManaBase() {
        return manaBase;
    }

    public void setManaBase(Double manaBase) {
        this.manaBase = manaBase;
    }

    public Double getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(Double defensaBase) {
        this.defensaBase = defensaBase;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Habilidad> getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(List<Habilidad> habilidad) {
        this.habilidad = habilidad;
    }

    public List<Item> getEquipamiento() {
        return equipamiento;
    }


    public void setEquipamiento(List<Item> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public Escalabilidad getEscalabilidad() {
        return escalabilidad;
    }

    public void setEscalabilidad(Escalabilidad escalabilidad) {
        this.escalabilidad = escalabilidad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id && Objects.equals(nombre, personaje.nombre)
                && Objects.equals(descripcion, personaje.descripcion)
                && Objects.equals(fechaCreacion, personaje.fechaCreacion)
                && Objects.equals(nivel, personaje.nivel)
                && Objects.equals(vida, personaje.vida)
                && Objects.equals(ataque, personaje.ataque)
                && Objects.equals(mana, personaje.mana)
                && Objects.equals(defensa, personaje.defensa)
                && Objects.equals(vidaBase, personaje.vidaBase)
                && Objects.equals(ataqueBase, personaje.ataqueBase)
                && Objects.equals(manaBase, personaje.manaBase)
                && Objects.equals(defensaBase, personaje.defensaBase)
                && region == personaje.region
                && Objects.equals(habilidad, personaje.habilidad)
                && Objects.equals(equipamiento, personaje.equipamiento)
                && Objects.equals(escalabilidad, personaje.escalabilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, fechaCreacion,
                nivel, vida, ataque, mana, defensa, vidaBase, ataqueBase,
                manaBase, defensaBase, region, habilidad, equipamiento, escalabilidad);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", nivel=" + nivel +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", mana=" + mana +
                ", defensa=" + defensa +
                ", vidaBase=" + vidaBase +
                ", ataqueBase=" + ataqueBase +
                ", manaBase=" + manaBase +
                ", defensaBase=" + defensaBase +
                ", region=" + region +
                ", habilidad=" + habilidad +
                ", equipamiento=" + equipamiento +
                ", escalabilidad=" + escalabilidad +
                '}';
    }
}
