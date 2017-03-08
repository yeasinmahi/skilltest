<?php
function dataResultToJson($result){
	$return_arr = array();
    while ($row = mysqli_fetch_assoc($result)) {
		array_push($return_arr,$row);
	}
	return json_encode($return_arr);
}
?>