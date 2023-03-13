public class Main {
    public static void main(String[] args) {

        Pontos p1 = new Pontos(1, 1);
        Pontos p2 = new Pontos(5, 4);

        System.out.println("A distância entre os pontos é " + p1.calculaDistancia(p2));


        Pontos ponto1 = new Pontos(1,1);
        Pontos ponto2 = new Pontos(5,4);
        Pontos ponto3 = new Pontos(5,1);
        Triangulo t1 = new Triangulo(ponto1, ponto2, ponto3);

        t1.area();

        Pontos po1 = new Pontos(1,1);
        Pontos po2 = new Pontos(2,2);
        Pontos po3 = new Pontos(3,3);
        Triangulo t2 = new Triangulo(po1, po2, po3);

        t2.area();

    }
}
