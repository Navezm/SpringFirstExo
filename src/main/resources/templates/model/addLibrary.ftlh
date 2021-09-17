<#include '../layout.ftlh'>

<@layout>
    <h1>Add a Library</h1>
    <form method="post">
        <div class="input-field">
            <label>Name</label>
            <input type="text" name="name" id="name">
        </div>
        <#--     List of Mangas    -->
        <#list mangas as item>
            <p>
                <label>
                    <input name="mangas" type="checkbox" value="${item.id}"/>
                    <span>${item.title}</span>
                </label>
            </p>
        </#list>
        <button type="submit" class="btn">Submit</button>
    </form>

    <h1>Libraries List</h1>
    <#list libraries as item>
        <div class="row">
            <div class="col s12 m6">
                <div class="card blue-grey darken-1">
                    <div class="card-content white-text">
                        <span class="card-title">${item.name}</span>
                        <#list item.mangas as item>
                            <p>${item.title}</p>
                        </#list>
                    </div>
                </div>
            </div>
        </div>
    </#list>
</@layout>