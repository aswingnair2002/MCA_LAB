<?php
include('connect.php');
if($_POST){
	$search=$_POST["search"];
	
	$selectqry="select * from student where title='$search'";
    $row=$conn->query($selectqry);
    if($data=$row->fetch_assoc())
	{
		$a_num = $data["a_num"]; 
		$title = $data["title"]; 
		$author = $data["author"]; 
		$edition = $data["edition"]; 
		$publisher = $data["publisher"];
	}
} 
?>
<html>
	<head>
		<title>Search</title>
	</head>
	<body>
		<form method="post">
			<label for="search">Search:</label>
			<input type="text" id="search" name="search"><br>
			<input type="submit" name="submit" value="Search"><br>
			
			<?php
				echo "$a_num";
				echo "$title";
				echo "$author";
				echo "$edition";
				echo "$publisher";
			?>
		</form>
	</body>
</html>
