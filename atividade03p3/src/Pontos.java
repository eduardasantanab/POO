public class Pontos {
    public double x;
    public double y;

    public Pontos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double calculaDistancia(Pontos pontos){

        double comprimento = pontos.x - x;
        double altura = pontos.y - y;
        double distancia;

        if(altura == 0){
            distancia = pontos.x - x;
        }else{
            distancia = Math.sqrt((comprimento*comprimento) + (altura*altura));
        }

        return distancia;
    }
}
