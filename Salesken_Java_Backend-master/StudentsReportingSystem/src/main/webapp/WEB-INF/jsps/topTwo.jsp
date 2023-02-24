<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top two students</title>
</head>
<style>
    *{
        font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    }
    h1{
        text-align: center;
        color: brown;
        
    }
    
    form{
        display: flex;
        flex-direction: column;
        width: 20%;
        gap: 15px;
        border: 1px solid navy;
        padding: 25px 20px;
        margin: auto;
    }
    h2{
        text-align: center;
        color: rgb(27, 110, 88);
    }
    button{
        padding: 20px;
        border-radius: 5px;
        color: black;
        background-color: green;
        
    }
    button:hover{
        background-color: black;
        color: white;
    }
</style>

<body>

<h1>Top 2 Students</h1>
<form method="post">
    <h1>Click to get top 2 Students</h1>
    <button>Submit</button>
</form>

</body>
</html>