<?php
require_once ('Veiculo.php');
class Carro implements Veiculo{
    
    function __construct(){

        }

    function locomover(){
        echo "Carro: vruuuuummtxiiii \r\n";
    }
}