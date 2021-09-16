<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>List users:</h1>
    <#list persons as item >
        <h2>${item.name} ${item.surname}</h2>
        <h3>Date of birth: ${item.birthDate}</h3>
    </#list>


    <h1>User by Name:</h1>
    <h2>${person.id} ${person.name} ${person.surname}</h2>
</body>
</html>