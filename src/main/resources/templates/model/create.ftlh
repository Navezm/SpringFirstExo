<#include '../layout.ftlh'>

<@layout>
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
        <button type="submit" class="btn">Submit</button>
    </form>
</@layout>