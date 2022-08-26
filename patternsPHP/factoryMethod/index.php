<?php
require_once ('FabricaCarro.php');
require_once ('FabricaMoto.php');


$fabricaCarro = new FabricaCarro();
$fabricaMoto = new FabricaMoto();

$polo = $fabricaCarro->criaVeiculo();
$ninja = $fabricaMoto->criaVeiculo();

$polo->locomover();
$ninja->locomover();