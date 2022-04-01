-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-04-2022 a las 11:31:59
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventariokonecta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `referencia` varchar(100) NOT NULL,
  `precio` int(11) NOT NULL,
  `peso` float NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `stock` int(11) NOT NULL,
  `fecha_de_creacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `referencia`, `precio`, `peso`, `categoria`, `stock`, `fecha_de_creacion`) VALUES
(7, 'Huevos', 'c', 1000, 2, 'Comida', 121, '2022-03-31 20:41:23.724'),
(8, 'Pan', 'c', 10000, 1, 'Comida', 396, '2022-04-01 03:34:47.191'),
(9, 'Arroz', 'c', 1000, 1, 'Comida', 366, '2022-03-31 20:43:48.047'),
(11, 'Mayonesa', 'c', 2000, 0.5, 'Salsas', 230, '2022-04-01 03:34:50.495'),
(12, 'BBQ', 'c', 2600, 1, 'Salsas', 600, '2022-04-01 01:25:44.212'),
(13, 'Detodito', 'c', 1000, 0.55, 'Comida', 200, '2022-04-01 01:52:05.827');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(10) NOT NULL,
  `id_producto` int(10) NOT NULL,
  `cantidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `id_producto`, `cantidad`) VALUES
(1, 1, 10),
(2, 2, 20),
(3, 3, 0),
(4, 2, 1),
(5, 2, 20),
(6, 2, 9),
(7, 6, 4),
(8, 7, 90),
(9, 9, 122),
(10, 7, 10),
(11, 7, 10),
(12, 8, 9),
(13, 8, 13),
(14, 8, 18),
(15, 7, 9),
(16, 7, 10),
(17, 8, 12),
(18, 8, 11),
(19, 9, 12),
(20, 9, 500),
(21, 8, 10),
(22, 10, 67),
(23, 10, -59),
(24, 10, -12),
(25, 10, 100),
(26, 10, 100),
(27, 10, -25),
(28, 10, 300),
(29, 10, 49),
(30, 10, 1),
(31, 8, 13),
(32, 8, 11),
(33, 8, 7);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
