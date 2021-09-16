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
    <h1>Articles list</h1>
    <#list articles as item >
        <h3>${item.title}</h3>

        <h5>Author: ${item.author.name} ${item.author.surname}</h5>
    </#list>


    <h1>Articles by Author:</h1>
    <#list articlesAuthor as item >
        <h3>${item.title}</h3>

        <h5>Author: ${item.author.name} ${item.author.surname}</h5>
    </#list>

</body>
</html>