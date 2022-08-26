<?php
require_once ('Fabrica.php');
require_once ('Moto.php');

class FabricaMoto extends Fabrica{
    static function criaVeiculo() : Veiculo {
        return new Moto();
    }
}