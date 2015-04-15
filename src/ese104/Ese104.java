package ese104;

import agenziaviaggi.*;

public class Ese104 {

	public static void main(String[] args) throws Exception {
		
		Pacchetto Mosca= new Pacchetto("1","Mosca",40);
		Filiale filiale1= new Filiale(1);
		Cliente cliente1= new Cliente("Lorenzo","Carfagna");
		Cliente cliente2= new Cliente("Francesco","Rossi");
		Prenotazione miaPrenotazione[]= new Prenotazione[6];
		
		miaPrenotazione[0]=new Prenotazione("1",4,cliente1,filiale1);
		miaPrenotazione[1]=new Prenotazione("2",10,cliente1,filiale1);
		miaPrenotazione[2]=new Prenotazione("3",4,cliente1,filiale1);
		miaPrenotazione[3]=new Prenotazione("4",2,cliente1,filiale1);
		miaPrenotazione[4]=new Prenotazione("5",20,cliente2,filiale1);
		miaPrenotazione[5]=new Prenotazione("6",1,cliente1,filiale1);
		
		//TEST VERIFICA AGGIUNTA DI UNA PRENOTAZIONE
		
		Mosca.addPrenotazione(miaPrenotazione[0]);
		controllaValore(2,36,Mosca.getPostiDisponibili());
		controllaValore(3,1,Mosca.getPrenotazioni().size());
		
		Mosca.addPrenotazione(miaPrenotazione[1]);
		controllaValore(4,26,Mosca.getPostiDisponibili());
		controllaValore(5,2,Mosca.getPrenotazioni().size());
		
		Mosca.addPrenotazione(miaPrenotazione[2]);
		controllaValore(6,22,Mosca.getPostiDisponibili());
		controllaValore(7,3,Mosca.getPrenotazioni().size());
		
		Mosca.addPrenotazione(miaPrenotazione[3]);
		controllaValore(8,20,Mosca.getPostiDisponibili());
		controllaValore(9,4,Mosca.getPrenotazioni().size());
		
		Mosca.addPrenotazione(miaPrenotazione[4]);
		controllaValore(8,0,Mosca.getPostiDisponibili());
		controllaValore(9,5,Mosca.getPrenotazioni().size());
		
		try{
		Mosca.addPrenotazione(miaPrenotazione[5]);
		}
		catch(Exception e){
			System.out.println("Test numero 10 SUPERATO");
		}
		controllaValore(11,0,Mosca.getPostiDisponibili());
		controllaValore(12,5,Mosca.getPrenotazioni().size());
		
		//VERIFICARE LA STAMPA DEL PACCHETTO MANUALMENTE
		System.out.println();
		System.out.println(Mosca.toString());
		System.out.println();
		
		//VERIFICARE LA STAMPA DI TUTTE LE PRENOTAZIONI
		for(int i=0;i<Mosca.getPrenotazioni().size();i++) 
			System.out.println(Mosca.getPrenotazioni().elementAt(i).toString());
		

	}


	static void controllaValore(int numeroTest, int valoreAtteso, int valoreRicevuto) throws Exception{
		
		String Messaggio="Test numero "+numeroTest+" SUPERATO";
		
		if(valoreAtteso!=valoreRicevuto){
			throw new Exception("ERRORE! Test numero  "+numeroTest+"  Valore atteso:"+valoreAtteso+" Valore restituito:"+valoreRicevuto);
		}
		else System.out.println(Messaggio);
	}
}
