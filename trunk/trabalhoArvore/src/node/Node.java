package node;

public class Node{
	
	Node   direita;
	Node   esquerda;
	int   valor;
	
	
	// INICIA O NÓ
	public Node(int _valor){
		valor    = _valor;
		direita  = null;
		esquerda = null;
	}
	
	// INICIA O NÓ
	public Node(Node _esquerda,int _valor,Node _direita){
		valor    = _valor;
		direita  = _direita;
		esquerda = _esquerda;
	}
	
	public void setNull(){
		valor    =    0;
		direita  = null;
		esquerda = null;
	}
	
	public int getValor(){
		return this.valor;
	}
	
	public Node getEsquerda(){
		return this.esquerda;
	}
	
	public Node getDireita(){
		return this.direita;
	}
	
	public void setValor(int _valor){
		valor = _valor;
	}
	
	public void setEsquerda(Node _esquerda){
		esquerda = _esquerda;
	}
	
	public void setDireita(Node _direita){
		direita = _direita;
	}
	
}
