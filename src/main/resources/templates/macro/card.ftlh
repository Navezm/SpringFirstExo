<#macro card data>
    <div class="col s6">
        <div class="card horizontal">
            <div class="card-image">
                <img src="${data.imgSrc}">
            </div>
            <div class="card-stacked">
                <div class="card-content">
                    <h5>Title: ${data.title}</h5>
                    <h5>Genre: ${data.genre}</h5>
                </div>
            </div>
        </div>
    </div>
</#macro>