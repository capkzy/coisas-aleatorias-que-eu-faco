#include <NewPing.h>

#define echo 12
#define trig 11
#define max 40
int ledve = 7;
int ledv = 6;
int buz = 8;

NewPing sonar(trig, echo, max);

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(buz, OUTPUT);
  pinMode(ledv, OUTPUT);
  pinMode(ledve, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  int dis = sonar.ping_cm();
  delay(100);
  Serial.print(sonar.ping_cm());
  Serial.println("cm");
  if (dis > 0 && dis < 17) {
  analogWrite(buz, 213);
  digitalWrite(ledv, LOW);
  digitalWrite(ledve, HIGH);
  }
  else if (dis > 18) {
    analogWrite(buz, LOW);
  digitalWrite(ledve, LOW);
  analogWrite(buz, 123);
  digitalWrite(ledv, HIGH);
  }
  else {
  analogWrite(buz, LOW);
  digitalWrite(ledve, LOW);
  digitalWrite(ledv, LOW);
  }
  delay(100);
}
