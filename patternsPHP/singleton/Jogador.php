<?php
class Jogador{
    public $nome;
    public $numero;    
   
    public function __construct(string $nome, int $numero){
        $this->nome = $nome;
        $this->numero = $numero; 
    }    
}