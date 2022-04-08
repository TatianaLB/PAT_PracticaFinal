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

function playlistPorId(){
    var inputValue = document.getElementById("playlist").value;
    var address = '/api/v1/playlistPorNombre/'+inputValue;
    console.log(address);
    window.location.href = address;
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