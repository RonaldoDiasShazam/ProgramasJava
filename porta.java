class porta{
 boolean estado;
 String cor;
 double dimens�ox,dimens�oy,dimens�oz;
 void abre(){
 estado = true;
 }
 void fecha (){
 estado = false;
 }
 void pinta (){
 cor = "azul";
 }
 void etaAberta(){
 sytem.out.println (this.estado);
}
}