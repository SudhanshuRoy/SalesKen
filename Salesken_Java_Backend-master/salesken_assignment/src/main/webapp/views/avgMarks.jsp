<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average Marks</title>
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
    input{
        padding: 20px;
        border-radius: 5px;
        font-size: 15px;
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

<h1>Average in each Student by Subject</h1>
<form method="post">
    <input type="text" name="subject" placeholder="Enter Subject Name(Science/English/Mathematics)">
    <br>
   
    <button>Submit</button>
</form>

</body>
</html>