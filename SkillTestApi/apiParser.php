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
		if($method==='getQuestion'){
			$categoryId = $_REQUEST['categoryId'];
			$result = getQuestion($categoryId);
		}
		echo dataResultToJson($result);
		
	}else{
		echo 'error';
	}
	
	
?>