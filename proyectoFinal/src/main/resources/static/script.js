//async function ListarPlaylists(){
//
////Le pasamos el parametro por el body del request o mediante un parametro del query?
//    try {
//        var inputValue = document.getElementById("playlist").value;
//        var address = '/api/v1/playlistPorNombre/'+inputValue;
//        fetch(address, {
//            method: 'GET',
//            headers: {
//                'Content-Type': 'application/json'
//            },
//            })
//            .then(response => response.json())
//            .then(data => {
//                //HttpStatus status = data.getStatusCode();
//                //POR QUE NO ME DEVUELVE NADA... NO ME COGE EL STATUS CODE.
//                if(!!data) {
//                    alert("Your playlists have been loaded.");
//                } else {
//                    alert("You don't have any playlists.");
//
//                }
//                location.href = "api/v1/playListPorNombre/"+inputValue;
//                return data;
//
//            });
//
//    } catch (err) {
//        console.error(err.message);
//    }
//    return false;
//
//}

function PlaylistPorId(){
    var inputValue = document.getElementById("playlistId").value;
    var address = '/api/v1/playlist/'+inputValue;
    console.log(address);
    window.location.href = address;
    return false;

}
function CancionPorId(){
    var inputValue = document.getElementById("cancionId").value;
    var address = '/api/v1/cancion/'+inputValue;
    console.log(address);
    window.location.href = address;
    return false;

}
function UsuarioPorId(){
    var inputValue = document.getElementById("usuarioUsername").value;
    var address = '/api/v1/usuario/'+inputValue;
    console.log(address);
    window.location.href = address;
    return false;

}


function BorraPlaylistPorId(){
    var inputValue = document.getElementById("playlistId").value;
    var address = '/api/v1/playlist/delete/'+inputValue;
    var currentAddress = window.location.href;
    window.location.href = address;
    window.location.href = currentAddress;
    alert("La playlist se ha borrado correctamente.");

    return false;

}
function BorraCancionPorId(){
    var inputValue = document.getElementById("cancionId").value;
    var address = '/api/v1/cancion/delete/'+inputValue;
    var currentAddress = window.location.href;
    window.location.href = address; //Consumimos el endpoint
    window.location.href = currentAddress; //Volvemos a la pagina instantaneamente
    alert("La cancion se ha borrado correctamente.");
    return false;

}
function BorraUsuarioPorId(){
    var inputValue = document.getElementById("usuarioUsername").value;
    var address = '/api/v1/usuario/delete/'+inputValue;
    var currentAddress = window.location.href;
    window.location.href = address;
    window.location.href = currentAddress;
    alert("El usuario se ha borrado correctamente.");

    return false;

}




//
//async function ListarCanciones(){
//
//    try {
//        var inputValue = document.getElementById("cancion").value;
//        var address = '/api/v1/cancionPorNombre';
//        fetch(address, {
//            method: 'GET',
//            headers: {
//                'Content-Type': 'application/json'
//            },
//            })
//            .then(response => response.json())
//            .then(data => {
//                HttpStatus status = data.getStatusCode();
//                return data;
//                //POR QUE NO ME DEVUELVE NADA... NO ME COGE EL STATUS CODE.
//                if(!!data) {
//                    alert("Your playlists have been loaded.");
//                } else {
//                    alert("You don't have any playlists.");
//
//                }
//            });
//
//    } catch (err) {
//        console.error(err.message);
//    }
//    return false;
//
//}
//
//
//async function ListarUsuarios(){
//
//    try {
//        var inputValue = document.getElementById("usuario").value;
//        var address = '/api/v1/usuarioPorNombre';
//        fetch(address, {
//            method: 'GET',
//            headers: {
//                'Content-Type': 'application/json'
//            },
//            })
//            .then(response => response.json())
//            .then(data => {
//                HttpStatus status = data.getStatusCode();
//                return data;
//                //POR QUE NO ME DEVUELVE NADA... NO ME COGE EL STATUS CODE.
//                if(!!data) {
//                    alert("Your playlists have been loaded.");
//                } else {
//                    alert("You don't have any playlists.");
//
//                }
//            });
//
//    } catch (err) {
//        console.error(err.message);
//    }
//    return false;
//
//}