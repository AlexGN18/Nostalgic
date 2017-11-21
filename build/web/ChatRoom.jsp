<%-- 
    Document   : ChatRoom
    Created on : 16/11/2017, 09:01:34 AM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Nombre de usuario</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/style.css">
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!--<script src="https://use.fontawesome.com/c4cf86dd47.js"></script>
        <link href="https://use.fontawesome.com/c4cf86dd47.css" media="all" rel="stylesheet">-->
    </head>
    <body style="background: #8E9394">
        <nav class="navbar navbar-dark bg-primary">
            <!-- Navbar content -->
        </nav>

        <div class="container bootstrap snippet">
            <div class="row">
                <div class="col-md-4 bg-white ">
                    <div class=" col" style="height: 1cm;">

                    </div>
                    `
                    <div class=" row border-bottom padding-sm" style="height: 40px;">
                        <div class="col ">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Buscar contacto..." aria-label="Buscar contacto...">
                                <span class="input-group-btn btn-group-sm">
                                    <button class="btn btn-secondary" type="button">Go!</button>
                                </span>
                            </div>
                        </div>
                    </div>

                    <!-- =============================================================== -->
                    <!-- member list -->
                    <ul class="friend-list">
                        <li class="active bounceInDown">
                            <a href="#" class="clearfix">
                                <img src="https://bootdey.com/img/Content/user_1.jpg" alt="" class="rounded-circle">
                                <div class="friend-name">
                                    <strong>John Doe</strong>
                                </div>
                                <div class="last-message text-muted">Hello, Are you there?</div>
                                <small class="time text-muted">Just now</small>
                                <small class="chat-alert label label-danger">1</small>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="clearfix">
                                <img src="https://bootdey.com/img/Content/user_2.jpg" alt="" class="rounded-circle">
                                <div class="friend-name">
                                    <strong>Jane Doe</strong>
                                </div>
                                <div class="last-message text-muted">Lorem ipsum dolor sit amet.</div>
                                <small class="time text-muted">5 mins ago</small>
                                <small class="chat-alert text-muted"><i class="fa fa-check"></i></small>
                            </a>
                        </li>
                    </ul>
                </div>

                <!--=========================================================-->
                <!-- selected chat -->
                <div class="col-md-8 bg-white ">
                    <div class="chat-message">
                        <ul class="chat">
                            <li class="left clearfix">
                                <span class="chat-img pull-left">
                                    <img src="https://bootdey.com/img/Content/user_3.jpg" alt="User Avatar">
                                </span>
                                <div class="chat-body clearfix">
                                    <div class="header">
                                        <strong class="primary-font">John Doe</strong>
                                        <small class="pull-right text-muted"><i class="fa fa-clock-o"></i> 12 mins ago</small>
                                    </div>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    </p>
                                </div>
                            </li>

                            <li class="right clearfix">
                                <span class="chat-img pull-right">
                                    <img src="https://bootdey.com/img/Content/user_1.jpg" alt="User Avatar">
                                </span>
                                <div class="chat-body clearfix">
                                    <div class="header">
                                        <strong class="primary-font">Sarah</strong>
                                        <small class="pull-right text-muted"><i class="fa fa-clock-o"></i> 13 mins ago</small>
                                    </div>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales at.
                                    </p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="chat-box bg-white">
                        <div class="input-group">
                            <input class="form-control border no-shadow no-rounded" placeholder="Type your message here">
                            <span class="input-group-btn">
                                <button class="btn btn-success no-rounded" type="button">Send</button>
                            </span>
                        </div><!-- /input-group -->
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
