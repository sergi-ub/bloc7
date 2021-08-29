/*
Fase 1
Ens donen un codi parcialment desenvolupat. El codi pot no estar complet i que s’hagi de modificar.  

El podem descarregar d’aquest link: https://github.com/ITAcademyProjects/VehiclesProject 

Ens demanen crear una classe Main que realitzi els següents passos: 

Demanar a l’usuari la matrícula del cotxe, la marca i el seu color. 
Crear el cotxe amb les dades anteriors.  
Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre. 
Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.

 */

package com.vehicles.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String plate, marcaCoche, colorCoche;
		
		ArrayList<String> vehicle = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		Scanner matricula = new Scanner(System.in);
		System.out.println("Indique la matrícula del coche");
		plate = matricula.next();
		
		Scanner coche = new Scanner(System.in);
		System.out.println("Indique la marca del coche");
		marcaCoche = coche.next();
		
		Scanner color = new Scanner(System.in);
		System.out.println("Indique el color");
		colorCoche = color.next();
		
		vehicle.add(plate);
		vehicle.add(marcaCoche);
		vehicle.add(colorCoche);
		
		System.out.println("El coche tiene las siguientes características: "+ vehicle);
		
	}

}
