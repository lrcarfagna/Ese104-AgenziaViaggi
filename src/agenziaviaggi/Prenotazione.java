package agenziaviaggi;

public class Prenotazione {
	

		private String codice;
		private int postiRichiesti;
		private Cliente cliente;
		private Pacchetto pacchetto;
		private Filiale filiale;

		public Prenotazione(String codice, int postiRichiesti, Cliente c, Filiale f) {
			if (codice.length() == 0)
				throw new IllegalArgumentException(
						"l'ID deve avere più di 0 caratteri");
			this.codice = codice;
			if (postiRichiesti <= 0)
				throw new IllegalArgumentException(
						"il numero dei posti totali deve essere positivo");
			this.postiRichiesti = postiRichiesti;
			
			
			this.cliente=c;
			this.filiale=f;

		}

		public String getCodice() {
			return this.codice;
		}

		public int getPostiRichiesti() {
			return this.postiRichiesti;
		}

		public Cliente getCliente() {
			return this.cliente;
		}
		
		public Filiale getFiliale(){
			return this.filiale;
		}
		
		public Pacchetto getPacchetto(){
			return this.pacchetto;
		}
		
		public void setPacchetto(Pacchetto p){
			this.pacchetto=p;
		}

		@Override
		public String toString() {
			return "codice prenotazione: " + codice + ", posti richiesti: " + postiRichiesti + ", cliente: "
					+ cliente + "  filiale: " +filiale+ ","+"Codice del pacchetto: "
					+pacchetto.getCodice()+", Descrizione del pacchetto: "+pacchetto.getDescrizione()+"]";
			//Non uso direttamente il toString() di pacchetto perchè stamperebbe tutto il vettore di prenotazioni
		}
		


}
