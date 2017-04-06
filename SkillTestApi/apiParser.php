<?php
    require 'dbHelper.php';
    require 'jsonParsar.php';
	$method;
	$result;
	if(isset($_REQUEST['method'])){
		$method=$_REQUEST['method'];
		if($method==='getCategory'){
			$result = getCategory();
		}
		if($method==='getSubCategory'){
			$categoryId = $_REQUEST['categoryId'];
			$result = getSubCategory($categoryId);
		}
		if($method==='getQuestion'){
			$categoryId = $_REQUEST['categoryId'];
			$subCategoryId = $_REQUEST['subCategoryId'];
			$result = getQuestion($categoryId,$subCategoryId);
		}
		echo dataResultToJson($result);
		
	}else{
		echo 'error';
	}
	
	
?>