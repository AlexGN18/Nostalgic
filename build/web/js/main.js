function sendDataToBack() {
    var usuario = document.getElementById("usuario").value;
    var nick = document.getElementById("nick").value;
    var telefono = document.getElementById("telefono").value;
    var correo = document.getElementById("correo").value;
    var password = document.getElementById("password").value;


    $.post("Registro", {
        usuario: usuario,
        nick: nick,
        telefono: telefono,
        correo: correo,
        password: password


    },
            function (data) {
                if (data) {
                    window.console.log("Login exitoso.");
                    window.location = "ChatRoom.jsp";
                }

            });

}
function sendDataToBackLogin() {
    var correoL = document.getElementById("correoL").value;
    var passwordL = document.getElementById("passwordL").value;

    $.post("Login", {
        correoL: correoL,
        passworL: passwordL
    }, function (respuesta) {
        if (respuesta) {
            window.console.log("Login exitoso.");
            window.location = "ChatRoom.jsp";
            
            
            
        }
    });
}



