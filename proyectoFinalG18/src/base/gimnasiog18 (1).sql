-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-06-2024 a las 23:07:03
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gimnasiog18`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

CREATE TABLE `asistencia` (
  `IdAsistencia` int(11) NOT NULL,
  `IdSocio` int(11) NOT NULL,
  `IdClase` int(11) NOT NULL,
  `FechaAsistencia` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asistencia`
--

INSERT INTO `asistencia` (`IdAsistencia`, `IdSocio`, `IdClase`, `FechaAsistencia`) VALUES
(7, 2, 8, '2024-06-10'),
(8, 1, 9, '2024-06-07'),
(10, 4, 7, '2024-06-11');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE `clase` (
  `IdClase` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `IdEntrenador` int(11) NOT NULL,
  `horario` time NOT NULL,
  `capacidad` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clase`
--

INSERT INTO `clase` (`IdClase`, `nombre`, `IdEntrenador`, `horario`, `capacidad`, `estado`) VALUES
(1, 'Boxeo Profesional', 5, '17:00:00', 12, 0),
(6, 'Fullbody', 3, '16:00:00', 15, 1),
(7, 'Spinning', 4, '18:00:00', 13, 1),
(8, 'Crossfit', 2, '19:00:00', 14, 1),
(9, 'Calistenia', 1, '20:00:00', 11, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `IdEntrenador` int(11) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `especialidad` varchar(70) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`IdEntrenador`, `dni`, `nombre`, `apellido`, `especialidad`, `estado`) VALUES
(1, '45001002', 'Tomas Emiliano', 'Carrillo', 'Calistenia', 1),
(2, '32001002', 'Jose Enrique', 'Zuñiga', 'Crossfit', 1),
(3, '37412834', 'Luis Gabriel', 'Segura', 'fullbody', 1),
(4, '39001002', 'Candela Guadalupe', 'Godoy', 'Spinning', 1),
(5, '35001002', 'Juan Jose', 'Perez', 'Boxeo', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `membresia`
--

CREATE TABLE `membresia` (
  `IdMembresia` int(11) NOT NULL,
  `IdSocio` int(11) NOT NULL,
  `cantidadPases` int(11) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `costo` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `membresia`
--

INSERT INTO `membresia` (`IdMembresia`, `IdSocio`, `cantidadPases`, `FechaInicio`, `FechaFin`, `costo`, `estado`) VALUES
(1, 1, 30, '2024-06-03', '2024-07-03', 17000, 1),
(4, 2, 30, '2024-06-01', '2024-07-02', 16000, 0),
(5, 2, 30, '2024-06-01', '2024-07-02', 16000, 1),
(6, 4, 13, '2024-06-05', '2024-07-06', 13500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE `socio` (
  `IdSocio` int(11) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `edad` int(11) NOT NULL,
  `correo` varchar(70) NOT NULL,
  `telefono` int(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`IdSocio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado`) VALUES
(1, '39001002', 'Enrique pascual', 'Tozo', 22, 'enrique@hotmail.com', 261333111, 1),
(2, '38001002', 'Pablo Lorenzo', 'Poder', 25, 'pablo@gmail.com', 261221222, 1),
(3, '40001002', 'Fabiana ', 'Ramis', 19, 'fabi@hotmail.com', 261441442, 0),
(4, '37548964', 'Marcela', 'Gomez', 27, 'marce@hotmail.com', 266487545, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`IdAsistencia`),
  ADD KEY `IdClase` (`IdClase`),
  ADD KEY `IdSocio` (`IdSocio`);

--
-- Indices de la tabla `clase`
--
ALTER TABLE `clase`
  ADD PRIMARY KEY (`IdClase`),
  ADD KEY `clase_ibfk_1` (`IdEntrenador`);

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`IdEntrenador`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `membresia`
--
ALTER TABLE `membresia`
  ADD PRIMARY KEY (`IdMembresia`),
  ADD KEY `IdSocio` (`IdSocio`);

--
-- Indices de la tabla `socio`
--
ALTER TABLE `socio`
  ADD PRIMARY KEY (`IdSocio`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  MODIFY `IdAsistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `clase`
--
ALTER TABLE `clase`
  MODIFY `IdClase` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  MODIFY `IdEntrenador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `membresia`
--
ALTER TABLE `membresia`
  MODIFY `IdMembresia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `socio`
--
ALTER TABLE `socio`
  MODIFY `IdSocio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD CONSTRAINT `asistencia_ibfk_1` FOREIGN KEY (`IdClase`) REFERENCES `clase` (`IdClase`),
  ADD CONSTRAINT `asistencia_ibfk_2` FOREIGN KEY (`IdSocio`) REFERENCES `socio` (`IdSocio`);

--
-- Filtros para la tabla `clase`
--
ALTER TABLE `clase`
  ADD CONSTRAINT `clase_ibfk_1` FOREIGN KEY (`IdEntrenador`) REFERENCES `entrenador` (`IdEntrenador`);

--
-- Filtros para la tabla `membresia`
--
ALTER TABLE `membresia`
  ADD CONSTRAINT `membresia_ibfk_1` FOREIGN KEY (`IdSocio`) REFERENCES `socio` (`IdSocio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
