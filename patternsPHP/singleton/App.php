
<?php
require_once('./Jogador.php');
require_once('./ListaJogadoresSingleton.php');

$jogador01 = new Jogador("Cafú",2);
$jogador02 = new Jogador("Lucio",3);
$jogador03 = new Jogador("Roque Junior",4);
$jogador04 = new Jogador("Roberto Carlos",6);

$plantel = ListaJogadoresSingleton::getInstance();
$plantel->setJogador($jogador01);
$plantel->setJogador($jogador03);

var_dump(ListaJogadoresSingleton::getInstance());

$plantelSub20 = ListaJogadoresSingleton::getInstance();
$plantelSub20->setJogador($jogador02);
$plantelSub20->setJogador($jogador04);

var_dump(ListaJogadoresSingleton::getInstance());

echo ($plantel === $plantelSub20) ? "Singleton funcionando" : "Singleton não está funcionando";
