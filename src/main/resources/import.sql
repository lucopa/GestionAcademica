

INSERT INTO `usuario` (`id`, `apellido`, `email`, `nombre`, `password`, `username`, `enabled`) VALUES (1,	'Cobler',	'luiscobler@gmail.com',	'Luis',	'$2a$10$PMDCjYqXJxGsVlnve1t9Jug2DkDDckvUDl8.vF4Dc6yg0FMjovsXO',	'luis', 1);
INSERT INTO `usuario` (`id`, `apellido`, `email`, `nombre`, `password`, `username`, `enabled`) VALUES (2,	'Parra',	'nievesparra@gmail.com',	'Nieves',	'$2a$10$PMDCjYqXJxGsVlnve1t9Jug2DkDDckvUDl8.vF4Dc6yg0FMjovsXO',	'nieves' , 1);
INSERT INTO `usuario` (`id`, `apellido`, `email`, `nombre`, `password`, `username`, `enabled`) VALUES (3,	'Delgado',	'mariadelgado@gmail.com',	'Maria',	'$2a$10$PMDCjYqXJxGsVlnve1t9Jug2DkDDckvUDl8.vF4Dc6yg0FMjovsXO',	'maria' , 1);


-- puedes acceder con el usuario luis y la contraseña Secreto_123 (es gestor)
-- el segundo usuario es nieves y contraseña Secreto_123 (alumna)
-- el tercer usuario es maria y contraseña Secreto_123 (profesora)



INSERT INTO `rol` (`id`, `nombre`) VALUES (1,	'gestor');
INSERT INTO `rol` (`id`, `nombre`) VALUES  (2,	'alumno');
INSERT INTO `rol` (`id`, `nombre`) VALUES  (3,	'profesor');

INSERT INTO `telefono` (`id`, `numero`, `codigo_pais`, `usuario_id`) VALUES (1, 654781239,	34, 1);
INSERT INTO `telefono` (`id`, `numero`, `codigo_pais`, `usuario_id`) VALUES (3, 698745254,	34, 2);

INSERT INTO `usuario_roles` (`usuario_id`, `roles_id`) VALUES (1,	1);
INSERT INTO `usuario_roles` (`usuario_id`, `roles_id`) VALUES (2,	2);
INSERT INTO `usuario_roles` (`usuario_id`, `roles_id`) VALUES (3,	3);


INSERT INTO `asignatura` (`id`, `ciclo`, `curso`, `nombre`) VALUES (1, 'DAM', '2', 'Acceso a Datos');
INSERT INTO `asignatura` (`id`, `ciclo`, `curso`, `nombre`) VALUES (2, 'DAM', '1', 'Entornos de desarrollo');
INSERT INTO `asignatura` (`id`, `ciclo`, `curso`, `nombre`) VALUES (3, 'DAM', '2', 'Desarrollo de Interfaces');
INSERT INTO `asignatura` (`id`, `ciclo`, `curso`, `nombre`) VALUES (4, 'DAM', '2', 'Sistemas de Gestion Empresarial');



INSERT INTO `usuario_asignaturas` (`asignaturas_id`, `usuario_id`) VALUES (1,	2);
INSERT INTO `usuario_asignaturas` (`asignaturas_id`, `usuario_id`) VALUES (2,	2);
INSERT INTO `usuario_asignaturas` (`asignaturas_id`, `usuario_id`) VALUES (2,	3);


INSERT INTO `asignatura_usuarios` (`asignatura_id`, `usuarios_id`) VALUES (1,	2);
INSERT INTO `asignatura_usuarios` (`asignatura_id`, `usuarios_id`) VALUES (2,	3);
INSERT INTO `asignatura_usuarios` (`asignatura_id`, `usuarios_id`) VALUES (2,	2);



