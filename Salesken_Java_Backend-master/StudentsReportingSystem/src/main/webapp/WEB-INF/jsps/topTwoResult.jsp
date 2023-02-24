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
    h2{
        text-align: center;
        border: 1px solid rgb(149, 75, 67);
        color: rgb(166, 87, 87);
        width: 40%;
        padding: 20px;
        margin: auto;
        
    }
</style>

<body>

<h1>Welcome to Result .jsp</h1>


<h2>Top 2 students are : ${top2}</h2>

</body>
</html>