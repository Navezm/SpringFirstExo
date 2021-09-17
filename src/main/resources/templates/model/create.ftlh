<#include '../layout.ftlh'>
    <#import '/spring.ftl' as spring>

<#assign js >
    <script>
        M.AutoInit();
    </script>
</#assign>

<@layout js=js>
    <h1>Add a Manga</h1>
    <form method="post">
        <div class="input-field">
            <label>Title</label>
            <input type="text" name="title" id="title">
        </div>
        <div class="input-field">
            <label>Genre</label>
            <input type="text" name="genre" id="genre">
        </div>
        <div class="input-field">
            <label>Image</label>
            <input type="text" name="imgSrc" id="imgSrc">
        </div>

        <#if libraries?? >
            <div class="input-field">
                <select name="library" class="">
                    <option value="" disabled selected>Add to a library</option>
                    <#list libraries as item>
                        <option value="${item.id}">${item.name}</option>
                    </#list>
                </select>
            </div>
        </#if>
        <button type="submit" class="btn">Submit</button>
    </form>
</@layout>