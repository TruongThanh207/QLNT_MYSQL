-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 25, 2020 lúc 12:17 PM
-- Phiên bản máy phục vụ: 10.4.8-MariaDB
-- Phiên bản PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlnt_java`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bills`
--

CREATE TABLE `bills` (
  `ID_BILL` int(11) NOT NULL,
  `PHONG` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGUOIDAIDIEN` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DATE_BEGIN` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DATE_END` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MONTH` int(11) DEFAULT NULL,
  `YEAR` int(11) DEFAULT NULL,
  `TOTAL_CSD` int(11) DEFAULT NULL,
  `TOTAL_CSN` int(11) DEFAULT NULL,
  `MONEY` float DEFAULT NULL,
  `ID_USER` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bills`
--

INSERT INTO `bills` (`ID_BILL`, `PHONG`, `NGUOIDAIDIEN`, `DATE_BEGIN`, `DATE_END`, `MONTH`, `YEAR`, `TOTAL_CSD`, `TOTAL_CSN`, `MONEY`, `ID_USER`) VALUES
(45, 'A1', 'Nguyễn Văn Khánh', '2020-05-05', '2020-06-01', 6, 2020, 0, 0, 1080000, 1),
(46, 'A1', 'Nguyễn Văn Khánh', '2020-06-01', '2020-06-23', 6, 2020, 0, 10, 990000, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `guests`
--

CREATE TABLE `guests` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SEX` int(11) DEFAULT NULL,
  `CMND` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `NGAY_DK` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ID_PHONG` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `guests`
--

INSERT INTO `guests` (`ID`, `NAME`, `SDT`, `SEX`, `CMND`, `NGAY_DK`, `ID_PHONG`) VALUES
(1, 'Nguyễn Văn Khánh', '981727126', 1, '197625172', '2020-05-05', 1),
(2, 'Hoàng Đức', '981273612', 1, '197826351', '2020-05-05', 1),
(5, 'Phạm Hoài', '982736123', 0, '212738273', '2020-05-05', 2),
(6, 'Hoàng Trinh', '972837123', 0, '187827182', '2020-05-05', 3),
(17, 'Thanh', '098128812', 1, '123124131', '2020-05-05', 2),
(23, 'Truong Le', '0987856232', 1, '234787814', '2020-05-01', 4),
(24, 'Nguyen Linh', '0909728742', 0, '12090827', '2020-06-01', 11);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rooms`
--

CREATE TABLE `rooms` (
  `ID` int(11) NOT NULL,
  `TENPHONG` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GIAPHONG` int(11) DEFAULT NULL,
  `CHISODIEN_OLD` int(11) DEFAULT NULL,
  `CHISODIEN_NEW` int(11) DEFAULT NULL,
  `CHISONUOC_OLD` int(11) DEFAULT NULL,
  `CHISONUOC_NEW` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `rooms`
--

INSERT INTO `rooms` (`ID`, `TENPHONG`, `GIAPHONG`, `CHISODIEN_OLD`, `CHISODIEN_NEW`, `CHISONUOC_OLD`, `CHISONUOC_NEW`) VALUES
(1, 'A1', 1200000, 20, NULL, 30, NULL),
(2, 'A2', 1500000, 40, NULL, 50, NULL),
(3, 'A3', 1500000, 70, NULL, 70, NULL),
(4, 'A4', 1500000, 20, NULL, 30, NULL),
(11, 'A5', 1500000, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fullname` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `permissive` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `fullname`, `permissive`) VALUES
(1, 'admin', 'admin', 'Truong Van Thanh', 1),
(2, 'staff', 'staff', 'Hoang Linh', 0),
(4, 'xzv', 'xzv', 'Thanh Truong', 0),
(10, '12345', '12345', 'Thanh', 0),
(11, 'asd', 'asd', 'Thanh Quyền', 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`ID_BILL`),
  ADD KEY `ID_USER` (`ID_USER`);

--
-- Chỉ mục cho bảng `guests`
--
ALTER TABLE `guests`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PHONG` (`ID_PHONG`);

--
-- Chỉ mục cho bảng `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bills`
--
ALTER TABLE `bills`
  MODIFY `ID_BILL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT cho bảng `guests`
--
ALTER TABLE `guests`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT cho bảng `rooms`
--
ALTER TABLE `rooms`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `bills`
--
ALTER TABLE `bills`
  ADD CONSTRAINT `bills_ibfk_1` FOREIGN KEY (`ID_USER`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `guests`
--
ALTER TABLE `guests`
  ADD CONSTRAINT `guests_ibfk_1` FOREIGN KEY (`ID_PHONG`) REFERENCES `rooms` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
