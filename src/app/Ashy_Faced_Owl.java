package app;

import java.util.Random;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Ashy_Faced_Owl extends Owl{
	public Ashy_Faced_Owl(Vector2 pos, String thread_name, Board b, Group root) {
		super(pos,thread_name,b);//ces valeurs-l� sont set ind�pendemment du type d'oiseau.
		Random rand=new Random();
		this.speed= rand.nextInt((17 - 13) + 1) + 13;
		this.taille=30;
		//createCircle(pos, this.taille, Color.DARKGOLDENROD);
		t.start();// On d�marre le thread du piaf, �a lance Owl.run(). Je voulais le mettre dans le constructeur de Owl, mais je suis oblig� de l'apeller en permier... Alors que le d�marrage du thread c'est le truc a faire en dernier.
	}
}
