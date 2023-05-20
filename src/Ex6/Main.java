package Ex6;

public class Main {
    public static void main(String[] args) {
        Dog Rex = new Dog("Rex", 2);
        Dog Pufi = new Dog("Pufi", 10);
        Dog Piki = new Dog("Piki", 5);


        Dog dogList[] = new Dog[3];
        dogList[0] = Rex;
        dogList[1] = Pufi;
        dogList[2] = Piki;
        for (int i = 0; i < dogList.length; i++) {
            System.out.println(dogList[i].toString());
        }

    }
}
