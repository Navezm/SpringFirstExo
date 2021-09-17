<#include '../layout.ftlh'>
<#include '../macro/card.ftlh'>
<#include '../macro/modal.ftlh'>

<#assign js >
    <script>
        M.AutoInit();
    </script>
</#assign>

<@layout js=js>
<#--    <h1>List users:</h1>-->
<#--    <#list persons as item >-->
<#--        <h2>${item.name} ${item.surname}</h2>-->
<#--        <h3>Date of birth: ${item.birthDate}</h3>-->
<#--    </#list>-->

<#--    <h1>Test</h1>-->

<#--    <h1>User by Name:</h1>-->
<#--    <h2>${person.id} ${person.name} ${person.surname}</h2>-->

    <h1>Mangas</h1>

    <div class="row">
        <#list mangas as item>
                <@card item>

                </@card>
        </#list>
    </div>
<#--    <div class="row">-->
<#--        <#list map as item, mangakanas>-->
<#--            <@card item.imgSrc>-->
<#--                <h5>Title: ${item.title}</h5>-->
<#--                <h5>Genre: ${item.genre}</h5>-->
<#--                <h5>Author: <#list mangakanas as mangakana>${mangakana.name}<#if mangakana_has_next>, </#if></#list></h5>-->
<#--            </@card>-->
<#--        </#list>-->
<#--    </div>-->

    <h1>Mangakana</h1>
    <#list mangakanas as item>
        <@modal item item_index>

        </@modal>
    </#list>
    <br>
    <br>

</@layout>
