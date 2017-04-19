<?php
function getCategory($id){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `category` where id>".$id;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getSubCategory($id){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `subcategory` where id>".$id;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getQuestion($id){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `question` where id>".$id;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
?>