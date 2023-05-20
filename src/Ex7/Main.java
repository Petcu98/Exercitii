package Ex7;

public class Main {
    public static void main(String[] args) {
        /*
        Sa se construiasca clasa cu numele Car, cu proprietatile:brand,model,cai putere si combustibil;
        Sa se introduca 3 obiecte de tipul Car, unul pe benzina si doua pe motorina;
        Sa se afiseze doar masinile pe benzina, dupa parcurgerea unui for;
         */
        Car opel = new Car("Opel", "Vectra B", 101, 'B');
        Car mercedes = new Car("Mercedes", "C Class", 177, 'D');
        Car bmw = new Car("BMW", "750i", 523, 'B');

        Car carList[] = new Car[3];
        carList[0] = opel;
        carList[1] = mercedes;
        carList[2] = bmw;
        for (int i = 0; i < carList.length; i++) {
            if (carList[i].combustibil == 'B') {
                System.out.println(carList[i]);
            }
        }
    }
}
