package ese104;

import agenziaviaggi.*;

public class Ese104 {

	public static void main(String[] args) throws Exception {
		
		Pacchetto Mosca= new Pacchetto("1","Assisi",40);
		Filiale filiale1= new Filiale(1);
		Cliente cliente1= new Cliente("Lorenzo","Carfagna");
		Prenotazione miaPrenotazione= new Prenotazione("1",4,cliente1,filiale1);
		
		Mosca.addPrenotazione(miaPrenotazione);
		controllaValore(2,36,Mosca.getPostiDisponibili());
		controllaValore(3,1,Mosca.getPrenotazioni().size());
		Mosca.addPrenotazione(miaPrenotazione);
		System.out.println(Mosca.toString());
		
		

	}


	static void controllaValore(int numeroTest, int valoreAtteso, int valoreRicevuto) throws Exception{
		
		String Messaggio="Test numero "+numeroTest+" SUPERATO";
		
		if(valoreAtteso!=valoreRicevuto){
			throw new Exception("ERRORE! Test numero  "+numeroTest+"  Valore atteso:"+valoreAtteso+" Valore restituito:"+valoreRicevuto);
		}
		else System.out.println(Messaggio);
	}
}
