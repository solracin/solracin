class Data {
	// atributos da classe
	private int dia;
	private int mes;
	private int ano; 
	
	// metodo construtor valida a data na hora de criacao, permitindo apenas valores validos
	public Data (int dia, int mes, int ano){
		
		// condicao de ano valido
		if (ano >= 1){
			this.ano = ano;
		} else {
			System.out.println("Insira um ANO valido para essa data\n");
		}
		
		setMes(mes);
		setDia(dia);	
	}
	
	// método para testar se um ano é bissexto
	public boolean ehBissexto() {
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
		
	// criacao dos métodos sets
	
	public void setMes(int m) {
		// condicao de mes valido
		if (m >= 1 && m <= 12) {
			this.mes = m;
		} else {
			this.mes = 1; // inicializando o mes com valor default
			System.out.println("Insira um MES valido para essa data\n");
		}
	}
	
	public void setDia(int d){
		// validacao do dia usando um array
		// array armezana a quantidade de dias de cada mes
		int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (ehBissexto() == true) {
			diasMes[2] = 29;
			System.out.printf("\n%d é um ano bissexto\n", ano);
		} else {
			diasMes[2] = 28;
			System.out.printf("\n%d NAO é um ano bissexto\n", ano);
		}
		
		// para o dia ser valido, precisa ser >= E <= a quantidade de dias do mes 
		if (d >= 1 && d <= diasMes[this.mes]){
			this.dia = d;
		} else {
			System.out.println("Insira um DIA valido para essa data\n");
			this.dia = 1;
		}
	}
	
	/* Criar o método setAno, ajustar o método construtor da 
	 classe Data e alterar a data de nascimento (classe Pessoa) */
	 
	 // criação dos métodos getters da classe
	 
	 public int getDia(){
		 return dia;
	 }
	 
	 public int getMes(){
		 return mes;
	 }
	 
	 public int getAno(){
		 return ano;
	 }
	
	// transformando em um método com retorno
	public String escreverData(){
				
		// criando um array contendo os meses do ano, para nao precisar usar if/switch
		String meses[] = {"", "janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		// criando uma variavel para armazenar a mensagem que sera exibida na tela
		// nao e necessario usar o this, pois agora nao ha problema de ambiguidade nos nomes dos parametros e atributos
		String texto = dia + " de " + meses[mes] + " de " + ano;
		
		return texto;
		
	}
	
	public static void main (String args[]){
		Data teste = new Data(29, 2, 2020);
		teste.escreverData();
				
		// para fazer
		// crie um objeto da classe Data para representar a sua data de nascimento
	}
	
}
