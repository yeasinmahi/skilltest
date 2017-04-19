<?php
    require 'dbHelper.php';
    require 'jsonParsar.php';
	$tableName;
	$result;
	if(isset($_REQUEST['tableName'])){
		$tableName=$_REQUEST['tableName'];
		$id = $_REQUEST['id'];
		if($tableName==='category'){
			$result = getCategory($id);
		}
		if($tableName==='subcategory'){
			$result = getSubCategory($id);
		}
		if($tableName==='question'){
			$result = getQuestion($id);
		}
		echo dataResultToJson($result);
		
	}else{
		echo 'error';
	}
	
	
?>