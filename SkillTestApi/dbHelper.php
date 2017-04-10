<?php
function getCategory(){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `categoryId`";
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getSubCategory($categoryId){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `subCategory` where categoryId =".$categoryId;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getQuestion($categoryId,$subCategoryId){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `question` where categoryId=".$categoryId." and subCategoryId=".$subCategoryId;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
?>