
function showRoom(checked) {

    const checkBox = document.getElementById("roomBox");
    const text = document.getElementById("hiddenField0");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}

function showChair(checked) {

    const checkBox = document.getElementById("chairBox");
    const text = document.getElementById("hiddenField");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}

function showStairs(checked) {

    const checkBox = document.getElementById("stairsBox");
    const text = document.getElementById("hiddenField2");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}

function showJugs(checked) {

    const checkBox = document.getElementById("jugsBox");
    const text = document.getElementById("hiddenField3");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}

function showPVC(checked){

    const checkBox = document.getElementById("pvcBox");
    const text = document.getElementById("hiddenField4");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}

function showPlates(checked){

    const checkBox = document.getElementById("platesBox");
    const text = document.getElementById("hiddenField5");

    if (checkBox.checked === true) {
        text.style.display = "block";
    } else {
        text.style.display = "none";
    }
}