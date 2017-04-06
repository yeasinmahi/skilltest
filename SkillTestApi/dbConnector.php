<?php

// $servername = "103.203.95.42:3306";
// $username = "angan";
// $password = "1234";
// $dbname = "angandb";

$servername = "192.168.1.4";
$username = "yeasinmahi";
$password = "arafat7218";
$dbname = "iqTest";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
/* change character set to utf8 */
  if (!$conn->set_charset("utf8")) {
  }
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

?>