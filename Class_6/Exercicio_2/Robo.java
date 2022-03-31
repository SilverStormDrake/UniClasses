package Class_6.Exercicio_2;

public class Robo {
    private char _facing='n';
    private int[] pos = {2,2};
    private int[][] _direcao= new int[2][2];
    private int[][] _mapa = new int[3][3];

    public Robo(char facing){
        this._facing = facing;
    }

    // getters e setters

    //direção
    public int[][] get_direcao() {
        return _direcao;
    }
    public void movimentar(char direct) {
        switch (direct) {
            case 'n':
                this._direcao[0][0] = 1;
                this.resetarDirecao();
                pos[0] --;
                this._mapa[pos[0]][pos[1]]= this._direcao[0][0] = 1;
                this._direcao[0][0] = 0;

                break;
            case 'l':
                this._direcao[0][1] = 1;
                pos[1]++;
                this.resetarDirecao();
                this._mapa[pos[0]][pos[1]]= this._direcao[0][1];
                this._direcao[0][1] = 0;
                
                break;
            case 's':
                this._direcao[1][1] = 1;
                pos[0]++;
                this.resetarDirecao();
                this._mapa[pos[0]][pos[1]]= this._direcao[1][1];
                this._direcao[1][1] = 0;
                
                break;
            case 'o':
                this._direcao[1][0] = 1;
                pos[1]--;
                this.resetarDirecao();
                this._mapa[pos[0]][pos[1]]= this._direcao[1][0] = 1;
                this._direcao[1][0] = 0;
                
                break;

            
            default:
                break;
        }
    }   

    //facing
    public char get_facing() {
        return _facing;
    }
    public void set_facing(char _facing) {
        this._facing = _facing;
    }

    

    // outros métodos
    public void resetarDirecao(){
        for (int i=0; i < this._mapa.length; i++){
            for (int j=0; j < this._mapa.length; j++){
                this._mapa[i][j] = 0;
                //System.out.print(asas[i][j]);
            }
            //System.out.println();
        }
    }

    public void definirMapa(){}

}
