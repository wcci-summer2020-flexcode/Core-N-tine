let name = document.getElementById('name');
const exercise = document.getElementById('exercise');

if (name.innerText === "") {
    exercise.style.display = "none";
}