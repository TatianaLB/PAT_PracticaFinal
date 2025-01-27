async function signUp(){
    try {
        var username = await document.getElementById("usernameUsuario").value;
        var nombre = await document.getElementById("nombreUsuario").value;
        var apellido = await document.getElementById("apellidoUsuario").value;
        var email = await document.getElementById("emailUsuario").value;
        var edad = await document.getElementById("edadUsuario").value;
        var password = await document.getElementById("passwordUsuario").value;


        var data = {"username": username,
                    "nombre":nombre,
                    "apellido":apellido,
                    "email":email,
                    "edad":edad,
                    "password":password
                    };
        console.log(data);
        const address = 'api/v1/signup';
        fetch(address, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body:JSON.stringify(data)
            })
            .then(response => response.json())
            .then(data => {
                console.log(data);
                if(data.result == "OK") {
                    alert("Usuario Creado");
                    document.location.href="/api/v1/usuarios";
                } else {
                    alert(data.result);
                }
            });

    } catch (err) {
        console.error(err.message);
    }
    return false;

}

async function LogIn(){
    try {
        var usuario = await document.getElementById("usuarioLogin").value;
        var password = await document.getElementById("passwordLogin").value;



        var data = {"username": usuario,
                    "password":password
                    };
        console.log(data);
        const address = 'api/v1/login';
        fetch(address, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body:JSON.stringify(data)
            })
            .then(response => response.json())
            .then(data => {
                console.log(data);
                if(data.result == "OK") {
                    alert("Logged in");
                    document.location.href="/api/v1/usuario/"+usuario;
                } else {
                    alert(data.result);
                    document.location.href="signUp.html"
                }
            });

    } catch (err) {
        console.error(err.message);
    }
    return false;

}