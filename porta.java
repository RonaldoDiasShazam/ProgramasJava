class porta{
 boolean estado;
 String cor;
 double dimensãox,dimensãoy,dimensãoz;
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