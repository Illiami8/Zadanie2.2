package platform;

public class Platform {
    int massaTara;
    Avto[] avtos;

    Platform (int massaTara, Avto[] avtos ){
        this.massaTara = massaTara;
        this.avtos = avtos;
    }
    int brutto(){
        int sum = massaTara;
        for (int i = 0; i < avtos.length; i++) {
            sum = sum + avtos[i].massa;

        }
        return sum;
    }
}
