<?php
function getCategory(){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `category`";
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getQuestion($categoryId){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `question` where categoryId=".$categoryId;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
?>