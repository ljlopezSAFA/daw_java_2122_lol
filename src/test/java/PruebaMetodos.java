import modelos.*;
import org.junit.Before;
import org.junit.Test;
import utilidades.UtilidadesPersonaje;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class PruebaMetodos {


    List<Personaje> personajes = new ArrayList<>();
    List<Jugador> jugadores = new ArrayList<>();
    List<Item>  items = new ArrayList<>();
    Partida partida = new Partida();


    @Before
    public void inicializadoDeDatos() throws Exception {

        //----------------------- PERSONAJES -------------------------------------
        Personaje p = new Personaje(1,"Lux", "Campeona de luz", LocalDate.now(), 0, 0D, 0D,
                0D, 0D, 100D, 100D, 100D, 100D, Region.DEMACIA, new ArrayList<>(), new ArrayList<>(), null);
        Personaje p2 = new Personaje(2,"Ezreal", "El Explorador", LocalDate.now(), 0, 0D, 0D,
                0D, 0D, 105D, 105D, 105D, 105D, Region.PILTOVER, new ArrayList<>(), new ArrayList<>(), null);
        Personaje p3 = new Personaje(3,"Sion", "Titán", LocalDate.now(), 0, 0D, 0D,
                0D, 0D, 140D, 140D, 140D, 140D, Region.NOXUS, new ArrayList<>(), new ArrayList<>(), null);
        Personaje p4 = new Personaje(4,"Miss Fortune", "Pistolas", LocalDate.now(), 0, 0D, 0D,
                0D, 0D, 130D, 130D, 130D, 130D, Region.AGUAS_ESTANCADAS, new ArrayList<>(), new ArrayList<>(), null);
        Personaje p5 = new Personaje(5,"Gankplank", "Pirata", LocalDate.now(), 0, 0D, 0D,
                0D, 0D, 120D, 120D, 120D, 120D, Region.AGUAS_ESTANCADAS, new ArrayList<>(), new ArrayList<>(), null);


        //---------------------- JUGADORES -----------------------------------------
        Jugador j = new Jugador(1,"Ibai", new HashSet<>(), new HashMap<>());
        Jugador j1 = new Jugador(2,"Reven", new HashSet<>(), new HashMap<>());
        Jugador j2 = new Jugador(3,"Barbe", new HashSet<>(), new HashMap<>());
        Jugador j3 = new Jugador(4,"Knekro", new HashSet<>(), new HashMap<>());



        //---------------------- ITEMS -----------------------------------------
        Item i = new Item(1,"Filo Infinito", 100D,0D,0D, 0D);
        Item i2 = new Item(2,"Hidra Titánica", 50D,0D,100D, 0D);


        //---------------------- ESCALABILIDAD -----------------------------------------
        Escalabilidad e = new Escalabilidad(1, 5D, 5D, 5D, 5D);
        Escalabilidad e2 = new Escalabilidad(2, 1D, 1D, 1D, 1D);

        //---------------------- HABILIDADES -----------------------------------------
        Habilidad h = new Habilidad(1, "Disparo Arcano", 20D, 0D, 10D, TipoHabilidad.DAÑO);
        Habilidad h1 = new Habilidad(2, "Singularidad Brillante", 30D, 0D, 20D, TipoHabilidad.DAÑO);


        p2.getHabilidad().add(h);
        p.getHabilidad().add(h1);

        p.setEscalabilidad(e);
        p2.setEscalabilidad(e);
        p3.setEscalabilidad(e);
        p4.setEscalabilidad(e2);
        p5.setEscalabilidad(e2);


        personajes.add(p);
        personajes.add(p2);
        personajes.add(p3);
        personajes.add(p4);
        personajes.add(p5);

        jugadores.add(j);
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);

        items.add(i);
        items.add(i2);


    }



    @Test
    public void testLevelUp() {
        Personaje lux = personajes.get(0);
        UtilidadesPersonaje.levelUp(lux);
        Integer nivel = 1;
        Double statEsperada = 105D;
        assertEquals(lux.getNivel(), nivel);
        assertEquals(lux.getAtaque(), statEsperada);
        assertEquals(lux.getVida(), statEsperada);
    }

    @Test
    public void testPersonajesPorRegion() {

        Map<Region, List<Personaje>> personajesPorRegion =  UtilidadesPersonaje.getPersonajesPorRegion(personajes);
        Integer regionesDelMapa = personajesPorRegion.keySet().size();
        Integer regionesEsperadas = 4;
        Integer personajesEnAguasEstancadas = personajesPorRegion.get(Region.AGUAS_ESTANCADAS).size();
        Integer personajesEnAguasEstancadasEsperados = 2;

        assertEquals(regionesDelMapa, regionesEsperadas);
        assertEquals(personajesEnAguasEstancadas,personajesEnAguasEstancadasEsperados);
    }


    @Test
    public void testMasPoderoso() {

        Personaje masPoderosoEsperado = personajes.stream().filter(p-> p.getNombre().equals("Sion")).findFirst().get();
        Personaje masPoderosoObtenido = UtilidadesPersonaje.getMasPoderoso(personajes);
        assertEquals(masPoderosoEsperado, masPoderosoObtenido);

    }


    @Test
    public void testPersonajesMasPoderosoPorRegion() {

        Map<Region,Personaje> personajesPoderososPorRegion =  UtilidadesPersonaje.getMasPoderosoPorRegion(personajes);
        Integer regionesDelMapa = personajesPoderososPorRegion.keySet().size();
        Integer regionesEsperadas = 4;
        Personaje masPoderosoEsperado = personajes.stream().filter(p-> p.getNombre().equals("Miss Fortune")).findFirst().get();
        Personaje masPoderosoObtenido = personajesPoderososPorRegion.get(Region.AGUAS_ESTANCADAS);

        assertEquals(regionesDelMapa, regionesEsperadas);
        assertEquals(masPoderosoEsperado,masPoderosoObtenido);
    }







}
