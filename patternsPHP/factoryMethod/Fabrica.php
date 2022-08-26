<?php
require_once ('Veiculo.php');

abstract class Fabrica {
    abstract function criaVeiculo() : Veiculo;
}