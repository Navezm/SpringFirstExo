<#include '../layout.ftlh'>
<#include '../macro/card.ftlh'>

<@layout>
    <h1>List users:</h1>
    <#list persons as item >
        <h2>${item.name} ${item.surname}</h2>
        <h3>Date of birth: ${item.birthDate}</h3>
    </#list>

    <h1>Test</h1>

    <h1>User by Name:</h1>
    <h2>${person.id} ${person.name} ${person.surname}</h2>

    <h1>Mangas</h1>

    <#list mangas as item>
        <div class="row">
            <@card item>

            </@card>
        </div>
    </#list>
    
</@layout>
