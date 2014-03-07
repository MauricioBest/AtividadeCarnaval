package questao5;

public class Siglas {
	
	

		private String[] estados = {"Minas Gerais" , "Sao Paulo", "Rio Grande do Sul", "Bahia", "Parana", "Santa Catarina", "Goiás", "Piaui", "Paraiba", "Maranhao",
		"Pernambuco", "Ceara", "Rio Grande do Norte", "Pará", "Mato Grosso", "Tocantins", "Alagoas", "Rio de Janeiro", "Mato Grosso do Sul","Espirito Santo", "Sergipe", 
		"Amazonas", "Rondônia", "Amapá", "Roraima"};
		
		private String[] siglas = {"MG","SP","RS","BA","PR","SC","GO","PI","PB","MA","PE","CE","RN","PA","MG","TO","AL","RJ","MS","ES","SE","AM","RO","AP","RR"};

		public String recuperarNome(String sigla){
			for (int i = 0; i < siglas.length; i++) {
				if(sigla.equals(siglas[i]))
					return estados[i];
				}
			return null;
		}
	

}
