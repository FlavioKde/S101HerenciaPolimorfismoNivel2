package S101HerenciaPolimorfismoNivel2;

public interface Wristwatch {
    //desde java 8 no tiene que ser abstracta, puedo definirle un cuerpo
    // y que no sea abstracta utilizando defoult
    default void alarm(){
        System.out.println("the alarm clock is ringing");
    }
}
