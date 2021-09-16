<#macro modal data modalId>
    <!-- Modal Trigger -->
    <a class="waves-effect waves-light btn modal-trigger" href="#${modalId}">${data.name}</a>

    <!-- Modal Structure -->
    <div id="${modalId}" class="modal">
        <div class="modal-content">
            <h4>Name: ${data.name}</h4>
            <h6>Birth Date: ${data.birthDate}</h6>
            <h6>Manga list:</h6>
            <ul style="margin-left: 2%;">
                <#list data.mangas as item>
                    <li>Title: ${item.title} / Genre: ${item.genre}</li>
                </#list>
            </ul>
        </div>
        <div class="modal-footer">
            <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
        </div>
    </div>
</#macro>