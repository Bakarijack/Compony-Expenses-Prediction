-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 19, 2022 at 02:21 PM
-- Server version: 8.0.26
-- PHP Version: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prediction`
--

-- --------------------------------------------------------

--
-- Table structure for table `yearlyPrediction`
--

CREATE TABLE `yearlyPrediction` (
  `year` int DEFAULT '0',
  `number_of_employees` int DEFAULT '0',
  `total_salary` double DEFAULT '0',
  `total_expenditure` double DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `yearlyPrediction`
--

INSERT INTO `yearlyPrediction` (`year`, `number_of_employees`, `total_salary`, `total_expenditure`) VALUES
(1, 24, 4800, 9800),
(2, 28, 5600, 15600),
(3, 32, 8000, 23000),
(4, 36, 9000, 29000),
(5, 40, 10000, 35000),
(6, 44, 13200, 43200),
(7, 48, 14400, 49400),
(8, 52, 15600, 55600),
(9, 56, 19600, 64600),
(10, 60, 21000, 71000),
(11, 64, 22400, 77400),
(12, 68, 27200, 87200),
(13, 72, 28800, 93800),
(14, 76, 30400, 100400),
(15, 80, 36000, 111000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
