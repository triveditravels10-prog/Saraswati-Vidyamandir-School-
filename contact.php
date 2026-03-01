<?php
if($_SERVER["REQUEST_METHOD"]=="POST"){
    $name=$_POST['name']; $email=$_POST['email']; $msg=$_POST['message'];
    file_put_contents("messages.txt","$name | $email | $msg\n", FILE_APPEND);
    echo json_encode(["status"=>"success"]);
}
?>
