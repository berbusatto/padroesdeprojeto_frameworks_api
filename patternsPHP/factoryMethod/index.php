<?php
require_once ('FabricaCarro.php');
require_once ('FabricaMoto.php');

$polo = fabricaCarro::criaVeiculo();
$ninja = fabricaMoto::criaVeiculo();

$polo->locomover();
$ninja->locomover();