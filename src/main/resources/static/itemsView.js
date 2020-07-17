function showHide(checked) {

    const checkBox = document.getElementById("checkBox");
    const text = document.getElementById("hiddenField");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}