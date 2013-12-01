package estrutura;

import node.Node;

public class Binaria {
	
	private Node raiz       = null;
	
	public Node getRaiz(){
		return raiz;
	}
	
	public void inserir(int valor){
		raiz = inserir(raiz,valor);
	}
	
	public Node inserir(Node node, int valor) {
		if(!isEmpty(node)){
	        if (valor < node.getValor()) {  
	            if (node.getEsquerda() != null) {  
	                inserir(node.getEsquerda(), valor);  
	            } else {  
	                System.out.println("  Inserindo " + valor + " a esqueda de " + node.getValor());  
	                node.setEsquerda(new Node(valor));  
	            }  
	        } else if (valor > node.getValor()) {  
	            if (node.getDireita() != null) {  
	                inserir(node.getDireita(), valor);  
	            } else {  
	                System.out.println("  Inserindo " + valor + " a direita de " + node.getValor());  
	                node.setDireita(new Node(valor));  
	            }  
	        }  
		}else{
			node = new Node(valor);
		} 
        
        return node;
    }  
	
	public  boolean isEmpty(Node a) { 
		 if (a == null) { 
			 return(true); 
		 }else { 
			 return(false); 
		 } 
	} 
		 
	 
	 public void emOrdem(Node no) {
	     if(no != null) {
	         emOrdem(no.getEsquerda());
	         System.out.print(no.getValor()+" ");
	         emOrdem(no.getDireita());
	     }
	 }
	
	 public void preOrdem(Node no) {
	     if(no != null){
	         System.out.print(no.getValor()+" ");
	         preOrdem(no.getEsquerda());
	         preOrdem(no.getDireita());
	     }
	 }
     
	 public void posOrdem(Node no) {
	     if(no != null){
	         posOrdem(no.getEsquerda());
	         posOrdem(no.getDireita());
	         System.out.print(no.getValor()+" ");
	     }
	 }
     
     public void exibirRaiz(){
         System.out.println("Raiz " + raiz.getValor());         
     }
     
     
     public Node remover(Node node, int valor) {  
         System.out.println("  Percorrendo No " + node.getValor());  
        
         if(node == null){  
             System.out.println("Arvore vazia ");
             
         }
         
         if (valor < node.getValor()) {  
             node.setEsquerda(remover(node.getEsquerda(), valor));  
               
         } else if (valor > node.getValor()) {  
             node.setDireita(remover(node.getDireita(), valor));  
   
         } else if (node.getEsquerda() != null && node.getDireita() != null)  // 2 filhos  
         {  
             System.out.println("  Removeu No " + node.getValor());  
             node.setValor(encontraMinimo(node.getDireita()).getValor());  
             node.setDireita(removeMinimo(node.getDireita()));  
         } else {  
             System.out.println("  Removeu No " + node.getValor());  
             node = (node.getEsquerda() == null) ? node.getEsquerda() : node.getDireita();  
         }  
         return node;  
     }  
   
     public Node removeMinimo(Node node) {  
         if (node == null) {  
             System.out.println("  ERRO ");  
         } else if (node.getEsquerda() != null) {  
             node.setEsquerda(removeMinimo(node.getEsquerda()));  
             return node;  
         } else {  
             return node.getDireita();  
         }  
         return null;  
     }  
   
     public Node encontraMinimo(Node node) {  
         if (node != null) {  
             while (node.getEsquerda() != null) {  
                 node = node.getEsquerda();  
             }  
         }  
         return node;  
     }  
     
     
     public  Node pesquisa(Node raiz,int chave) { 
    	 Node a1; 
    	 
    	 if (raiz == null) { 
    		 return(null); 
    	 }else { 
	    	 if (raiz.getValor() == chave) {                   // busca na raiz 
	    		 return(raiz); 
	    	 }else { 
		    	 a1 = pesquisa(raiz.getEsquerda(), chave);    // busca na sub-árvore esquerda 
		    	 if (a1 == null) { 
		    		 a1 = pesquisa(raiz.getDireita(), chave); // busca na sub-árvore direita 
		    	 } 
	    	 } 
	    	 return(a1); 
    	 } 
     } 

		 
	
}
