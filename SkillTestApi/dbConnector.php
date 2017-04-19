<?php

//$servername = "localhost";
//$username = "gitsbd_yeasinmahi";
//$password = "arafat7218";
//$dbname = "gitsbd_iqTest1";

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