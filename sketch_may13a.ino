int b = 12; // buzzer pino 12
int bt = 13; // botão pino 13
int ledv = 11; // led vermelho pino 11
void setup() { // começo do setup
  pinMode(b, OUTPUT); // recebe
  pinMode(bt, INPUT); // manda
  pinMode(ledv, OUTPUT); // recebe
} // fim do setup

void loop() { // começo do loop
  int estb = digitalRead(bt); // estb faz o papel do botão 
  if(estb == LOW){ //  se botão for apertado
    tone(b, 90); // faz barulho
    digitalWrite(ledv, HIGH);// liga o led
  }// fim do if
  else {//  SE o botão não for
  noTone(b);// para de fazer barulho
  digitalWrite(ledv, LOW);// desliga o led
  }// fim do else
}// fim do loop
