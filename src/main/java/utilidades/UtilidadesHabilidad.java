package utilidades;

import modelos.Habilidad;
import modelos.Personaje;

public class UtilidadesHabilidad {

    public UtilidadesHabilidad() {
    }


    public void golpearConHabilidad(Personaje emisor, Personaje receptor, Habilidad habilidadEmisor){


        //SubirPersonajesAl18
        UtilidadesPersonaje.levelTo(emisor,18);
        UtilidadesPersonaje.levelTo(receptor,18);

        //SumarAtributosItems
        emisor.getEquipamiento().forEach(i-> UtilidadesItem.equiparItem(emisor,i));
        receptor.getEquipamiento().forEach(i-> UtilidadesItem.equiparItem(receptor,i));

        //PotenciadeHabilidad
        Double dañoHabilidad = habilidadEmisor.getDañoBase() + (0.2 * emisor.getAtaque()) - (0.1 * receptor.getDefensa());

        //RestamosmanaEmisor
        emisor.setMana(emisor.getMana() - habilidadEmisor.getCosteMana());

        //RestamosVidaReceptor
        receptor.setVida(receptor.getVida() - dañoHabilidad);

    }




}
