<?php
require_once ('Fabrica.php');
require_once ('Moto.php');

class FabricaMoto extends Fabrica{
    function criaVeiculo() : Veiculo {
        return new Moto();
    }
}