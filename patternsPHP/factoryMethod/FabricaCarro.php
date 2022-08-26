<?php
require_once ('Fabrica.php');
require_once ('Carro.php');

class FabricaCarro extends Fabrica{    
    static function criaVeiculo() : Veiculo {
        return new Carro;
    }
}