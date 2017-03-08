<?php

// $servername = "103.203.95.42:3306";
// $username = "angan";
// $password = "1234";
// $dbname = "angandb";

$servername = "192.168.0.100";
$username = "yeasinmahi";
$password = "arafat7218";
$dbname = "iqTest";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

?>