<?php
require_once ('Veiculo.php');
class Moto implements Veiculo{
    
    function __construct(){
        
    }

    function locomover(){
        echo "Moto: randandandandan \r\n";
    }
}