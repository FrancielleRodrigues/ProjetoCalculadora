import java.awt.TextField;

import javax.swing.JOptionPane;

public class CalculadoraOp {
	private static StringBuffer operando = new StringBuffer();
	private static StringBuffer expressao = new StringBuffer();
	private static StringBuffer expressao2 = new StringBuffer();
	private static String operacao;
	private static String digito;
	private static Double resultado;
	private static Double s1;
	private static Double s2;
	private static String mostrar;
	
	CalculadoraGui gui = new CalculadoraGui();
	
	public static void coletaOperando(){
		operando.append(digito);
		expressao.append(digito);
		expressao2.append(digito);
	}
	
	public static void montaExpressao(){
		expressao.append(operacao);
		expressao2.append(operacao);
		operando = new StringBuffer(" ");
	}
	
	public static void efetuaCalculo(){
		Double v1 = null;
		Double v2 = null;
		
		if(resultado == null){
			v1 = Double.valueOf(expressao.substring(0,expressao.indexOf(operacao)));
			v1 = Double.valueOf(expressao2.substring(0,expressao2.indexOf(operacao)));
		
		}
		
		v2 = Double.valueOf(expressao.substring(expressao.indexOf(operacao)+1,expressao.length()));
		v2 = Double.valueOf(expressao2.substring(expressao2.indexOf(operacao)+1,expressao2.length()));
		s1 = v1;
		s2 = v2;
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
		
		

		switch (operacao) {
		case "+":
			if(resultado == null){
				resultado = v1 + v2;
			}else{
				resultado = resultado + v2;
				
			}
			
			break;
		case "-":
			if(resultado == null){
				resultado = v1 - v2;
				
			}else{
				resultado = resultado - v2;
				
			}
			break;
		case "*":
			if(resultado == null){
				resultado = v1 * v2;
			}else{
				resultado = resultado * v2;
			}
			break;
		case "/":
			if(v2 == 0){
				JOptionPane.showMessageDialog(null, "NÃO EXISTE RESULTADO NA DIVISÃO POR ZERO");
			}
			if(resultado == null){
				resultado = v1 / v2;
			}else{
				resultado = resultado / v2;
			}
			break;
		case "^":
			if(resultado == null){
				resultado = Math.pow(v1,v2);
			}else{
				resultado = Math.pow(resultado,v2);
			}
			break;
		case "¬":
			if(resultado == null){
			resultado = Math.log(v1)/Math.log(v2);
			
			}else{
				resultado = Math.log(resultado)/Math.log(v2);
			}
			break;
		case ".":
			
			break;
		case "=":
			getResultado();
			break;
       
		default:
			break;
			
			
		}
		
		System.out.println("EX:"+expressao2);
		System.out.println("resultado: "+resultado);
		operando = new StringBuffer(String.valueOf(resultado));
		expressao2 = new StringBuffer();
		expressao = new StringBuffer(String.valueOf(resultado));
	}
	
	
	
	public static String getMostrar() {
		return mostrar;
	}

	public static void setMostrar(String mostrar) {
		CalculadoraOp.mostrar = mostrar;
	}

	// getters & setters	
	public static StringBuffer getOperando() {
		return operando;
	}
	public static void setOperando(StringBuffer operando) {
		CalculadoraOp.operando = operando;
	}
	public static StringBuffer getExpressao() {
		return expressao;
	}
	public static void setExpressao(StringBuffer expressao) {
		CalculadoraOp.expressao = expressao;
	}
	public static String getOperacao() {
		return operacao;
	}
	public static void setOperacao(String operacao) {
		CalculadoraOp.operacao = operacao;
	}
	public static String getDigito() {
		return digito;
	}
	public static void setDigito(String digito) {
		CalculadoraOp.digito = digito;
	}
	public static Double getResultado() {
		return resultado;
	}
	public static void setResultado(Double resultado) {
		CalculadoraOp.resultado = resultado;
	}

	public static Double getS1() {
		return s1;
	}

	public static void setS1(Double s1) {
		CalculadoraOp.s1 = s1;
	}

	public static Double getS2() {
		return s2;
	}

	public static void setS2(Double s2) {
		CalculadoraOp.s2 = s2;
	}

	public static StringBuffer getExpressao2() {
		return expressao2;
	}

	public static void setExpressao2(StringBuffer expressao2) {
		CalculadoraOp.expressao2 = expressao2;
	}
	
	

	
	
}
