<?php
require_once ('Veiculo.php');

abstract class Fabrica {
    abstract static function criaVeiculo() : Veiculo;
}