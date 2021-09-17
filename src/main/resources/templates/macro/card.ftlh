<#macro card item>
    <div class="col s6">
        <div class="card horizontal">
            <div class="card-image">
                <img src="${item.imgSrc}">
            </div>
            <div class="card-stacked">
                <div class="card-content">
                    <h5>Title: ${item.title}</h5>
                    <h5>Genre: ${item.genre}</h5>
                </div>
            </div>
        </div>
    </div>
</#macro>


<#--<#macro card img>-->
<#--    <div class="col s6">-->
<#--        <div class="card horizontal">-->
<#--            <div class="card-image">-->
<#--                <img src="${img}">-->
<#--            </div>-->
<#--            <div class="card-stacked">-->
<#--                <div class="card-content">-->
<#--                    <#nested />-->
<#--                </div>-->
<#--            </div>-->
<#--        </div>-->
<#--    </div>-->
<#--</#macro>-->