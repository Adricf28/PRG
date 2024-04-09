fetch("./cv.json")
.then(response => response.json())
.then(data => showData(data))
.catch(error => console.log(error))

function showData(data) {
    let main = document.getElementById("main");

    //Informacion Personal
    let pInfo = data.informacionPersonal;
    let pInfoDiv = document.createElement("div");

    pInfoDiv.innerHTML += `
        <p>-- INFORMACION PERSONAL --</p>
        Nombre: ${pInfo.nombre}<br>
        Direccion: ${pInfo.direccion}<br>
        Ciudad: ${pInfo.ciudad}<br>
        Telefono: ${pInfo.telefono}<br>
        Correo: ${pInfo.correo}`;

    main.appendChild(pInfoDiv);

    //Educacion
    let edDiv = document.createElement("div");

    edDiv.innerHTML += "<p>-- EDUCACION --</p>"
    data.educacion.forEach(i => {
        edDiv.innerHTML += `
            Titulo: ${i.titulo}<br>
            Institucion: ${i.institucion}<br>
            Fecha de Inicio: ${i.fechaInicio}<br>
            Fecha de Finalizacion: ${i.fechaFin}<br><br>`;
    });

    main.appendChild(edDiv);

    //Experiencia Laboral
    let exLaboral = document.createElement("div");

    exLaboral.innerHTML += "<p>-- EXPERIENCIA LABORAL --</p>"
    data.experienciaLaboral.forEach(i => {
        exLaboral.innerHTML += `
            Puesto: ${i.puesto}<br>
            Empresa: ${i.empresa}<br>
            Fecha de inicio: ${i.fechaInicio}<br>
            Fecha de finalizacion: ${i.fechaFin}<br>
            Responsabilidades: ${i.responsabilidades}<br><br>`;
    });

    main.appendChild(exLaboral);

    //Habilidades
    let habDiv = document.createElement("div");
    let skills = document.createElement("ul");

    habDiv.innerHTML += "<p>-- HABILIDADES --</p>"
    data.habilidades.forEach(i => {
        let item = document.createElement("li");
        
        item.innerHTML += i;

        skills.appendChild(item);
    });

    habDiv.appendChild(skills);
    main.appendChild(habDiv);
}