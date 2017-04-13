<?php
function getCategory($id){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `categoryId` where id>".$id;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getSubCategory($categoryId,$id){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `subCategory` where categoryId =".$categoryId." and id>".$id;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
function getQuestion($categoryId,$subCategoryId){
    require 'dbConnector.php';
    $sql = "SELECT * FROM `question` where categoryId=".$categoryId." and subCategoryId=".$subCategoryId." and id>".$id;
    $result = $conn->query($sql);
    $conn->close();
    return $result;
}
?>