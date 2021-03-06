USE [master]
GO
/****** Object:  Database [SBCountyFilm]    Script Date: 11/30/2015 6:41:17 PM ******/
CREATE DATABASE [SBCountyFilm]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SBCountyFilm', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\SBCountyFilm.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'SBCountyFilm_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\SBCountyFilm_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [SBCountyFilm] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SBCountyFilm].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SBCountyFilm] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SBCountyFilm] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SBCountyFilm] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SBCountyFilm] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SBCountyFilm] SET ARITHABORT OFF 
GO
ALTER DATABASE [SBCountyFilm] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SBCountyFilm] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SBCountyFilm] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SBCountyFilm] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SBCountyFilm] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SBCountyFilm] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SBCountyFilm] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SBCountyFilm] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SBCountyFilm] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SBCountyFilm] SET  DISABLE_BROKER 
GO
ALTER DATABASE [SBCountyFilm] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SBCountyFilm] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SBCountyFilm] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SBCountyFilm] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SBCountyFilm] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SBCountyFilm] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SBCountyFilm] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SBCountyFilm] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [SBCountyFilm] SET  MULTI_USER 
GO
ALTER DATABASE [SBCountyFilm] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SBCountyFilm] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SBCountyFilm] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SBCountyFilm] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [SBCountyFilm]
GO
/****** Object:  Table [dbo].[City]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[City](
	[CityId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](150) NOT NULL,
	[DistrictIdA] [int] NOT NULL,
	[DistrictIdB] [int] NULL,
 CONSTRAINT [PK_City] PRIMARY KEY CLUSTERED 
(
	[CityId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Company]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Company](
	[CompanyId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](150) NOT NULL,
	[Phone] [varchar](15) NOT NULL,
	[Fax] [varchar](15) NULL,
	[Address] [varchar](300) NOT NULL,
 CONSTRAINT [PK_Company] PRIMARY KEY CLUSTERED 
(
	[CompanyId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[CompanyPermit]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CompanyPermit](
	[CompanyPermitId] [int] IDENTITY(1,1) NOT NULL,
	[PermitId] [int] NOT NULL,
	[CompanyId] [int] NOT NULL,
 CONSTRAINT [PK_CompanyPermit] PRIMARY KEY CLUSTERED 
(
	[CompanyPermitId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Contact]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Contact](
	[ContactId] [int] IDENTITY(1,1) NOT NULL,
	[PersonId] [int] NOT NULL,
	[Notes] [varchar](max) NULL,
	[CellNumber] [varchar](15) NULL,
	[FaxNumber] [varchar](15) NULL,
 CONSTRAINT [PK_Contact] PRIMARY KEY CLUSTERED 
(
	[ContactId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Coordinate]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Coordinate](
	[CoordinateId] [int] IDENTITY(1,1) NOT NULL,
	[Latitude] [varchar](30) NOT NULL,
	[Longitude] [varchar](30) NOT NULL,
 CONSTRAINT [PK_Coordinate] PRIMARY KEY CLUSTERED 
(
	[CoordinateId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Date]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Date](
	[DateId] [int] IDENTITY(1,1) NOT NULL,
	[Day] [int] NOT NULL,
	[Month] [int] NOT NULL,
	[Year] [int] NOT NULL,
 CONSTRAINT [PK_Date] PRIMARY KEY CLUSTERED 
(
	[DateId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[District]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[District](
	[DistrictId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](150) NOT NULL,
 CONSTRAINT [PK_District] PRIMARY KEY CLUSTERED 
(
	[DistrictId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Employee](
	[EmployeeId] [int] IDENTITY(1,1) NOT NULL,
	[CompanyId] [int] NOT NULL,
	[Title] [varchar](50) NULL,
	[PersonId] [int] NOT NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[EmployeeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ImpactArea]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ImpactArea](
	[ImpactAreaId] [int] IDENTITY(1,1) NOT NULL,
	[DistrictId] [int] NOT NULL,
	[CityId] [int] NOT NULL,
	[LocationId] [int] NOT NULL,
 CONSTRAINT [PK_ImpactArea] PRIMARY KEY CLUSTERED 
(
	[ImpactAreaId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Location]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Location](
	[LocationId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](300) NOT NULL,
	[Address] [varchar](max) NULL,
	[Zip] [int] NULL,
	[Website] [varchar](max) NULL,
	[ContactId] [int] NOT NULL,
	[CoordinateId] [int] NULL,
	[APN] [varchar](50) NULL,
	[LastUpdated] [date] NULL,
	[District] [bit] NOT NULL,
	[CityId] [int] NULL,
	[TownCommunityId] [int] NULL,
 CONSTRAINT [PK_Location] PRIMARY KEY CLUSTERED 
(
	[LocationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Permit]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Permit](
	[PermitId] [int] IDENTITY(1,1) NOT NULL,
	[PermitNumber] [varchar](50) NULL,
	[ProductionId] [int] NOT NULL,
	[LocationId] [int] NOT NULL,
	[IssueDate] [date] NOT NULL,
	[EffectiveDateStart] [date] NOT NULL,
	[EffectiveDateEnd] [date] NOT NULL,
	[IssuingAgency] [varchar](300) NOT NULL,
	[ApprovedBy] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Permit] PRIMARY KEY CLUSTERED 
(
	[PermitId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Person]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Person](
	[PersonId] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [varchar](150) NOT NULL,
	[LastName] [varchar](150) NOT NULL,
	[PhoneNumber] [varchar](15) NULL,
 CONSTRAINT [PK_Person] PRIMARY KEY CLUSTERED 
(
	[PersonId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Production]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Production](
	[ProductionId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[ProductionType] [varchar](50) NOT NULL,
	[TotalPersonnel] [int] NOT NULL,
	[TotalVehiclesEquipment] [int] NOT NULL,
	[Generators] [int] NOT NULL,
	[Cars] [int] NOT NULL,
	[Trucks] [int] NOT NULL,
	[RVs] [int] NOT NULL,
	[Other] [int] NOT NULL,
 CONSTRAINT [PK_Production] PRIMARY KEY CLUSTERED 
(
	[ProductionId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ProductionDates]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ProductionDates](
	[ProductionDatesId] [int] IDENTITY(1,1) NOT NULL,
	[ProductionId] [int] NOT NULL,
	[StartDateMonth] [int] NOT NULL,
	[StartDateDay] [int] NOT NULL,
	[StartDateYear] [varchar](50) NOT NULL,
	[EndDateMonth] [int] NOT NULL,
	[EndDateDay] [int] NOT NULL,
	[EndDateYear] [varchar](50) NOT NULL,
 CONSTRAINT [PK_ProductionDates] PRIMARY KEY CLUSTERED 
(
	[ProductionDatesId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TownCommunity]    Script Date: 11/30/2015 6:41:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TownCommunity](
	[TownCommunityId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](150) NOT NULL,
	[DistrictIdA] [int] NOT NULL,
	[DistrictIdB] [int] NULL,
 CONSTRAINT [PK_TownCommunity] PRIMARY KEY CLUSTERED 
(
	[TownCommunityId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[City]  WITH CHECK ADD  CONSTRAINT [FK_City_District] FOREIGN KEY([DistrictIdA])
REFERENCES [dbo].[District] ([DistrictId])
GO
ALTER TABLE [dbo].[City] CHECK CONSTRAINT [FK_City_District]
GO
ALTER TABLE [dbo].[City]  WITH CHECK ADD  CONSTRAINT [FK_City_District1] FOREIGN KEY([DistrictIdB])
REFERENCES [dbo].[District] ([DistrictId])
GO
ALTER TABLE [dbo].[City] CHECK CONSTRAINT [FK_City_District1]
GO
ALTER TABLE [dbo].[CompanyPermit]  WITH CHECK ADD  CONSTRAINT [FK_CompanyPermit_Company] FOREIGN KEY([CompanyId])
REFERENCES [dbo].[Company] ([CompanyId])
GO
ALTER TABLE [dbo].[CompanyPermit] CHECK CONSTRAINT [FK_CompanyPermit_Company]
GO
ALTER TABLE [dbo].[CompanyPermit]  WITH CHECK ADD  CONSTRAINT [FK_CompanyPermit_Permit] FOREIGN KEY([PermitId])
REFERENCES [dbo].[Permit] ([PermitId])
GO
ALTER TABLE [dbo].[CompanyPermit] CHECK CONSTRAINT [FK_CompanyPermit_Permit]
GO
ALTER TABLE [dbo].[Contact]  WITH CHECK ADD  CONSTRAINT [FK_Contact_Person] FOREIGN KEY([PersonId])
REFERENCES [dbo].[Person] ([PersonId])
GO
ALTER TABLE [dbo].[Contact] CHECK CONSTRAINT [FK_Contact_Person]
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD  CONSTRAINT [FK_Employee_Company] FOREIGN KEY([CompanyId])
REFERENCES [dbo].[Company] ([CompanyId])
GO
ALTER TABLE [dbo].[Employee] CHECK CONSTRAINT [FK_Employee_Company]
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD  CONSTRAINT [FK_Employee_Person] FOREIGN KEY([PersonId])
REFERENCES [dbo].[Person] ([PersonId])
GO
ALTER TABLE [dbo].[Employee] CHECK CONSTRAINT [FK_Employee_Person]
GO
ALTER TABLE [dbo].[ImpactArea]  WITH CHECK ADD  CONSTRAINT [FK_ImpactArea_City] FOREIGN KEY([CityId])
REFERENCES [dbo].[City] ([CityId])
GO
ALTER TABLE [dbo].[ImpactArea] CHECK CONSTRAINT [FK_ImpactArea_City]
GO
ALTER TABLE [dbo].[ImpactArea]  WITH CHECK ADD  CONSTRAINT [FK_ImpactArea_District] FOREIGN KEY([DistrictId])
REFERENCES [dbo].[District] ([DistrictId])
GO
ALTER TABLE [dbo].[ImpactArea] CHECK CONSTRAINT [FK_ImpactArea_District]
GO
ALTER TABLE [dbo].[ImpactArea]  WITH CHECK ADD  CONSTRAINT [FK_ImpactArea_Location] FOREIGN KEY([LocationId])
REFERENCES [dbo].[Location] ([LocationId])
GO
ALTER TABLE [dbo].[ImpactArea] CHECK CONSTRAINT [FK_ImpactArea_Location]
GO
ALTER TABLE [dbo].[Location]  WITH CHECK ADD  CONSTRAINT [FK_Location_City] FOREIGN KEY([CityId])
REFERENCES [dbo].[City] ([CityId])
GO
ALTER TABLE [dbo].[Location] CHECK CONSTRAINT [FK_Location_City]
GO
ALTER TABLE [dbo].[Location]  WITH CHECK ADD  CONSTRAINT [FK_Location_Contact] FOREIGN KEY([ContactId])
REFERENCES [dbo].[Contact] ([ContactId])
GO
ALTER TABLE [dbo].[Location] CHECK CONSTRAINT [FK_Location_Contact]
GO
ALTER TABLE [dbo].[Location]  WITH CHECK ADD  CONSTRAINT [FK_Location_Coordinate] FOREIGN KEY([CoordinateId])
REFERENCES [dbo].[Coordinate] ([CoordinateId])
GO
ALTER TABLE [dbo].[Location] CHECK CONSTRAINT [FK_Location_Coordinate]
GO
ALTER TABLE [dbo].[Location]  WITH CHECK ADD  CONSTRAINT [FK_Location_TownCommunity] FOREIGN KEY([TownCommunityId])
REFERENCES [dbo].[TownCommunity] ([TownCommunityId])
GO
ALTER TABLE [dbo].[Location] CHECK CONSTRAINT [FK_Location_TownCommunity]
GO
ALTER TABLE [dbo].[Permit]  WITH CHECK ADD  CONSTRAINT [FK_Permit_Location] FOREIGN KEY([LocationId])
REFERENCES [dbo].[Location] ([LocationId])
GO
ALTER TABLE [dbo].[Permit] CHECK CONSTRAINT [FK_Permit_Location]
GO
ALTER TABLE [dbo].[Permit]  WITH CHECK ADD  CONSTRAINT [FK_Permit_Production] FOREIGN KEY([ProductionId])
REFERENCES [dbo].[Production] ([ProductionId])
GO
ALTER TABLE [dbo].[Permit] CHECK CONSTRAINT [FK_Permit_Production]
GO
ALTER TABLE [dbo].[ProductionDates]  WITH CHECK ADD  CONSTRAINT [FK_ProductionDates_Production] FOREIGN KEY([ProductionId])
REFERENCES [dbo].[Production] ([ProductionId])
GO
ALTER TABLE [dbo].[ProductionDates] CHECK CONSTRAINT [FK_ProductionDates_Production]
GO
ALTER TABLE [dbo].[TownCommunity]  WITH CHECK ADD  CONSTRAINT [FK_TownCommunity_District] FOREIGN KEY([DistrictIdA])
REFERENCES [dbo].[District] ([DistrictId])
GO
ALTER TABLE [dbo].[TownCommunity] CHECK CONSTRAINT [FK_TownCommunity_District]
GO
ALTER TABLE [dbo].[TownCommunity]  WITH CHECK ADD  CONSTRAINT [FK_TownCommunity_District1] FOREIGN KEY([DistrictIdB])
REFERENCES [dbo].[District] ([DistrictId])
GO
ALTER TABLE [dbo].[TownCommunity] CHECK CONSTRAINT [FK_TownCommunity_District1]
GO
USE [master]
GO
ALTER DATABASE [SBCountyFilm] SET  READ_WRITE 
GO
