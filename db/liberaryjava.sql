-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2022 at 08:49 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `liberaryjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `BookID` varchar(10) NOT NULL,
  `BookName` varchar(30) NOT NULL,
  `Author` varchar(20) NOT NULL,
  `Stream` varchar(20) NOT NULL,
  `Class` varchar(20) NOT NULL,
  `Available` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`BookID`, `BookName`, `Author`, `Stream`, `Class`, `Available`) VALUES
('BN/01', 'Web Service', 'Jhone Din', 'Software', 'G4-SEng', 'NO'),
('BN/02', 'Server Adminstration', 'Yeshi', 'Software', 'G4-SEng', 'NO'),
('BN/03', 'C++ Programming', 'Jhon', 'Software', 'G4-SEng', 'NO'),
('BN/04', 'Advanced Programming', 'Joseph Reedy', 'Software', 'G2-SEng', 'NO'),
('BN/05', 'Web Service II', 'Jhon', 'Software', 'G4-SEng', 'NO'),
('BN/07', 'AI', 'Fikir', 'Software', 'G4-SEng', 'YES'),
('BN/09', 'Event DrivenProgramming', 'Dessie', 'IT', 'G3-IT', 'NO'),
('bn/1000', 'webservice', 'dawit', 'Software', 'G4-SEng', 'YES'),
('BN/1232', 'Webservice3', 'Thomas', 'CS', 'G4', 'null'),
('BN/200', 'Android', 'Yeshi', 'Software', 'G4-SEng', 'YES'),
('BN/500', 'Python', 'abebe', 'Software', 'G4-SEng', 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `StudentId` varchar(15) NOT NULL,
  `StudentName` varchar(20) NOT NULL,
  `BookId` varchar(25) NOT NULL,
  `BookName` varchar(20) NOT NULL,
  `Address` varchar(25) NOT NULL,
  `IssueDate` varchar(20) NOT NULL,
  `Stream` varchar(20) NOT NULL,
  `Class` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`StudentId`, `StudentName`, `BookId`, `BookName`, `Address`, `IssueDate`, `Stream`, `Class`) VALUES
('555/11', 'Adane', 'BN/01', 'Web Service', 'Arbaminch', '20-06-2022', 'Software', 'G4-SEng'),
('612/11', 'Dessie', 'BN/02', 'Server Adminstration', 'Arbaminch', '20-06-2022', 'Software', 'G4-SEng'),
('1803/11', 'Tomi', 'BN/04', 'Advanced Programming', 'AddisAbaba', '20-06-2022', 'CS', 'G4-CS'),
('1803/11', 'Tomi', 'BN/03', 'C++ Programming', 'AddisAbaba', '20-06-2022', 'CS', 'G4-CS');

-- --------------------------------------------------------

--
-- Table structure for table `returndetail`
--

CREATE TABLE `returndetail` (
  `StudentId` varchar(11) NOT NULL,
  `StudentName` varchar(20) NOT NULL,
  `BookId` varchar(15) NOT NULL,
  `BookName` varchar(30) NOT NULL,
  `IssuedOn` varchar(15) NOT NULL,
  `ReturnDate` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `returndetail`
--

INSERT INTO `returndetail` (`StudentId`, `StudentName`, `BookId`, `BookName`, `IssuedOn`, `ReturnDate`) VALUES
('444/11', 'Ayele', 'BN/01', 'Web Service', '20-06-2022', '20-06-2022'),
('555/11', 'Adane', 'BN/04', 'Advanced Programming', '20-06-2022', '20-06-2022'),
('567/11', 'dawit', 'BN/0001', 'Web Design', '14-06-2022', '14-06-2022'),
('612/11', 'Dessie', 'BN/02', 'Server Adminstration', '20-06-2022', '20-06-2022'),
('687/11', 'Abebe', 'BN/01', 'Web Service', '15-06-2022', '19-06-2022');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `StudentId` varchar(10) NOT NULL,
  `StudentName` varchar(20) NOT NULL,
  `SStream` varchar(25) NOT NULL,
  `SClass` varchar(20) NOT NULL,
  `Address` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StudentId`, `StudentName`, `SStream`, `SClass`, `Address`) VALUES
('1803/11', 'Tomi', 'CS', 'G4-CS', 'AddisAbaba'),
('2345/11', 'Deva', 'Other', 'Architecture', 'Arbaminch'),
('444/11', 'Ayele', 'Software', 'G4-SEng', 'arbaminch'),
('555/11', 'Adane', 'Software', 'G4-SEng', 'Arbaminch'),
('567/11', 'Dawit', 'Software', 'G4-SEng', 'Arbaminch'),
('612/11', 'Dessie', 'Software', 'G4-SEng', 'Arbaminch'),
('687/11', 'Abebe', 'CS', 'G4-CS', 'Arbaminch'),
('888/11', 'jiregna', 'Software', 'G4-SEng', 'arbaminch');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`BookID`);

--
-- Indexes for table `returndetail`
--
ALTER TABLE `returndetail`
  ADD PRIMARY KEY (`StudentId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`StudentId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
