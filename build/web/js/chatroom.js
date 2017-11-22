
$(function() {
    
    $.post(
            "Consultas",
            {consulta: "usuarios"},
            function(respuestaDelServidor) {
                usuarios = respuestaDelServidor.usuarios;
                window.console.log(usuarios);
                
                for(i=0; i<usuarios.length; i++) {
                    agregarContacto(i,usuarios[i].NickName);
                }
                
            });
});



var listaContactos = document.getElementById("lista-contactos");

var agregarContacto = function(id, nickname) {
    html = '<li data-userid="'+id+'" class="active bounceInDown">'+
            '<a href="#" class="clearfix">'+
            '<img src="https://bootdey.com/img/Content/user_1.jpg" alt="" class="rounded-circle">'+
            '<div class="friend-name">'+
            '<strong>'+nickname+'</strong>'+
            '</div>'+
            '</a>'+
            '</li>';
    $(listaContactos).append(html);
};

