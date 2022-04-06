async function ListarPlaylists(){

    try {
        var inputValue = document.getElementById("nombre").value;
        const address = '/api/v1/playlists';
        fetch(address, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
            })
            .then(response => response.json())
            .then(data => {
                HttpStatus status = data.getStatusCode();
                //POR QUE NO ME DEVUELVE NADA... NO ME COGE EL STATUS CODE.
                if(status == HttpStatus.OK) {
                    alert("Your playlists have been loaded.");
                } else {
                    alert("You don't have any playlists.");

                }
            });

    } catch (err) {
        console.error(err.message);
    }
    return false;

}