<?php
class ListaJogadoresSingleton{
    private static ListaJogadoresSingleton $instance;
    private $listaJogadores = [];

    private function __construct(){
        $listaJogadores = array();
    }

    public static function getInstance(){
        if (!isset(self::$instance)){
            self::$instance = new self();
        }
        return self::$instance;
    }

    public function setJogador(Jogador $jogador){
        $this->listaJogadores[] = $jogador; 
    }
}
