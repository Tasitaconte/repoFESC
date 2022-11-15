-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2022 a las 18:34:36
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vaar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datosprueba`
--

CREATE TABLE `datosprueba` (
  `id_Dprueba` int(11) NOT NULL,
  `id_test` int(11) NOT NULL,
  `id_programa` int(11) NOT NULL,
  `registro` varchar(120) NOT NULL,
  `periodo` varchar(120) NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `identificacion` varchar(120) NOT NULL,
  `comunicacion_escrita` smallint(6) NOT NULL,
  `razonamiento_cuantitativo` smallint(6) NOT NULL,
  `lectura_critica` smallint(6) NOT NULL,
  `competencias_ciudadanas` smallint(6) NOT NULL,
  `ingles` smallint(6) NOT NULL,
  `nivel` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programa`
--

CREATE TABLE `programa` (
  `id_programa` int(11) NOT NULL,
  `name_programa` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `programa`
--

INSERT INTO `programa` (`id_programa`, `name_programa`) VALUES
(1, 'SOFTWARE'),
(2, 'DISEÑO DE MODAS'),
(3, 'DISEÑO GRAFICO'),
(4, 'NEGOCIOS'),
(5, 'TURISMO'),
(6, 'ADM FINANCIERA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

CREATE TABLE `prueba` (
  `id_test` int(11) NOT NULL,
  `name_test` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`id_test`, `name_test`) VALUES
(1, 'prueba icfes'),
(2, 'prueba tyt'),
(3, 'Saber PRO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `name_user` varchar(32) NOT NULL,
  `surname_user` varchar(32) NOT NULL,
  `email_user` varchar(32) NOT NULL,
  `password_user` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id_user`, `name_user`, `surname_user`, `email_user`, `password_user`) VALUES
(1, 'Yuliana', 'Castellano', 'y@gmail.com', '113180fa10fcf7a118ecdbcd21c4cd24'),
(2, 'y', 'y', 'yu@gmail.com', '0810'),
(3, 'em@gmail.com', 'em@gmail.com', 'em@gmail.com', 'd2eb9a6589617581d74d0a43ec2f6750'),
(4, 'dsadsa', 'sdsads', '4DZnhXa/fU+Os/JVv8B2JQ==', '1234'),
(5, 'sadsds', 'adsdsadsa', 'dsadsa', 'Cmugsfubs0E='),
(6, 'dasdsa', 'dsasddsa', 'sdadsadsa', 'Cmugsfubs0E='),
(7, 'y@gmail.com', 'y@gmail.com', 'y@gmail.com', 'LTO3Qjhe5DYzmdxkD/ZBNA=='),
(8, 'sfsfd', 'fsdfasdfds', 'fdsafdsafd', 'ItvpDuwXOV66WPwXq0H9BA=='),
(9, 'sdfd', 'fdafdafd', 'y@gmail.com', 'Cmugsfubs0E=');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datosprueba`
--
ALTER TABLE `datosprueba`
  ADD PRIMARY KEY (`id_Dprueba`),
  ADD KEY `id_test` (`id_test`),
  ADD KEY `id_programa` (`id_programa`);

--
-- Indices de la tabla `programa`
--
ALTER TABLE `programa`
  ADD PRIMARY KEY (`id_programa`);

--
-- Indices de la tabla `prueba`
--
ALTER TABLE `prueba`
  ADD PRIMARY KEY (`id_test`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datosprueba`
--
ALTER TABLE `datosprueba`
  MODIFY `id_Dprueba` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `programa`
--
ALTER TABLE `programa`
  MODIFY `id_programa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `prueba`
--
ALTER TABLE `prueba`
  MODIFY `id_test` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `datosprueba`
--
ALTER TABLE `datosprueba`
  ADD CONSTRAINT `datosprueba_ibfk_1` FOREIGN KEY (`id_test`) REFERENCES `prueba` (`id_test`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `datosprueba_ibfk_2` FOREIGN KEY (`id_programa`) REFERENCES `programa` (`id_programa`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
