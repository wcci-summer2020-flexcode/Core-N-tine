const oneElement = document.querySelector(".btn");
oneElement.addEventListener("click", doSomething, false);
function doSomething(e) {
    const clickedItem = e.target.class;
    alert(
        "Message has been sent"
    );
}
