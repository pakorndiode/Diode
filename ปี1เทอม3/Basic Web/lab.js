function onClick(n) {
  alert(n);
}
output = document.getElementById("add1")
add = document.getElementById("add");
add.addEventListener("click", function () {
    nameF = document.getElementById("nameF").value
    describe = document.getElementById("describe").value
    url = document.getElementById("url").value
    let newButton = document.createElement("div")
    newButton.classList.add("m-2")
    newButton.classList.add("p-1")
    newButton.innerHTML = ` <img onclick="onClick('${nameF}')"
                            src="${url}"
                            alt="logo">
                            <h3>${nameF}</h3>
                            <p>&nbsp&nbsp3090 THB</p>
                            <p>${describe}</p>`
    output.appendChild(newButton)
});
