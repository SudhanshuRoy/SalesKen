<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>

<style>
    *{
        font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    }
    h1{
        text-align: center;
        color: brown;
        
    }

    #container{
        border: 5px solid rebeccapurple;
        width: 25%;
        margin: auto;
        padding: 35px 10px;

    }
    a{
        display: block;
        text-decoration: none;
        font-size: large;
        padding:20px 20px;
        text-align: center;
        border: 1px solid royalblue;
    }
    a:hover{
        background-color: black;
        color: aliceblue;
        cursor: pointer;
    }


</style>

<body>

<h1> Welcome to Student Repository </h1>
<div id="container">
    <a href="/saveStudent">Add Student</a>
    <br>
    <a href="/getPercentage">Average Percentage of whole class in recent semester</a>
    <br>
    <a href="/avgMarks">Average marks of Students in a subject</a>
    <br>
    <a href="/topTwo">Top 2 Consistent Students across all semesters</a>
</div>


</body>
</html>