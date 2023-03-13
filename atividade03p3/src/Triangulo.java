public class Triangulo {

    public Pontos p1;
    public Pontos p2;
    public Pontos p3;


    public Triangulo(Pontos p1, Pontos p2, Pontos p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    public void area() {
        double positivos, negativos, determinante, resposta;

        positivos = (p1.x * p2.y) + (p1.y * p3.x) + (p2.x * p3.y);
        negativos = (p2.y * p3.x) + (p1.x * p3.y) + (p1.y * p2.x);
        determinante = positivos - negativos;


        resposta = Math.abs(determinante) / 2;   //tira o módulo (valor absoluto)

        System.out.println("A área do triângulo é: " + resposta);
    }

//              x1  y1    1   x1   y1
//            [a00][a01][a02][a03][a04]
//             x2    y2   1    x2   y2
//            [a10][a11][a12][a13][a14]
//             x3    y3   1    x3  y3
//            [a20][a21][a22][a23][a24]


    public double perimetro(Pontos p1, Pontos p2, Pontos p3){
        double soma;

        soma = p1.calculaDistancia(p2) + p2.calculaDistancia(p3) + p3.calculaDistancia(p1);

        return soma;
    }



}
