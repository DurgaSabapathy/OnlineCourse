



create table department(id number(10) constraint pk_department_id primary key,department_id number(19) constraint unique_department_id unique,name varchar2(40) not null);

create table country (id number(19) constraint pk_country_id primary key, name varchar(50));

create table states(id number(19) constraint pk_state_id primary key, name varchar(50), country_id number(19) constraint fk_state_country_id references country(id));

create table cities(id number(19) constraint pk_cities_id primary key,name varchar(50), state_id number(19) constraint fk_cities_state_id references states(id));

 create table courses(id number(19) constraint pk_courses_id PRIMARY KEY, 
    course_id varchar2(20) not null unique,name varchar2(50) not null,
    fees number(8,2) Default 0,
    department_id number(19) not null constraint fk_courses_department_id references department(department_id),
    staff_id VARCHAR2(50) not null constraint fk_courses_staff_id references staffs(email));

create table course_duration(id varchar2(19) constraint pk_courses_duration_id PRIMARY KEY, 
course_id varchar2(20) not null unique,
name varchar2(50) not null,
start_date date not null,
end_date date not null,
status varchar2(15)not null ,
constraint check_courses_status check(status in ('open','closed')));

create table course_levels(id number(19) constraint pk_course_id PRIMARY KEY,
level_id number(19) unique not null,
name varchar(40) not null,
course_id varchar2(20) not null constraint fk_courses_level_id  references courses(course_id),
deadlinedate timestamp not null);
drop table course_materials;
create table course_materials(id number(19) constraint pk_course_materials_id PRIMARY KEY ,
material_id number(19) unique not null, topic_name varchar2(60) not null,
pdf_location  varchar2(200) not null,
level_id number(10) not null constraint fk_courses_materials_id references course_levels(id));




   
    CREATE TABLE student
   (
   id number(19) constraint pk_student_id primary key,
   "EMAIL" VARCHAR2(40 BYTE) unique, 
	"NAME" VARCHAR2(50 BYTE), 
	"DATE_OF_BIRTH" DATE, 
	"MOBILE_NUMBER" NUMBER(10), 
	"PASSWORD" VARCHAR2(40 BYTE), 
	"ADDRESS" VARCHAR2(100 BYTE),  
    gender varchar2(10) constraint chk_student_gender not null check(gender in('MALE','FEMALE','OTHERS')),
     country_id number(19) not null constraint fk_student_country_id references country(id),
     state_id number(19) not null constraint fk_student_state_id references states(id),
     city_id number(19) not null constraint fk_student_city_id references cities(id),
     pincode number(6)not null,
    "QUALIFICATION"  VARCHAR2(30 BYTE) not null, 
	"PROFESSION" VARCHAR2(30 BYTE) not null, 
	"DATE_REGISTERED" TIMESTAMP not null);
    
    
     CREATE TABLE "HR"."STAFFS" 
 
   ( id number(19) constraint pk_staffs_id primary key,
   "EMAIL" VARCHAR2(50 BYTE) unique not null, 
	"PASSWORD" VARCHAR2(50 BYTE) not null, 
	"NAME" VARCHAR2(50 BYTE) not null, 
	"DATE_OF_BIRTH" DATE not null, 
	"GENDER" VARCHAR2(10 BYTE) not null constraint check_staffs_gender check(gender in('MALE','FEMALE','OTHERS')),
	"MOBILE" NUMBER(10,0) NOT NULL , 
	"ADDRESS" VARCHAR2(100 BYTE) NOT NULL, 
    country_id number(19) not null constraint fk_staff_country_id references country(id),
     state_id number(19) not null constraint fk_staff_state_id references states(id),
     city_id number(19) not null constraint fk_staff_city_id references cities(id),
     pincode number(6)not null,
	"QUALIFICATION" VARCHAR2(50 BYTE) NOT NULL, 
	"DESIGNATION" VARCHAR2(100 BYTE)NOT NULL, 
	"WORKING_PLACE" VARCHAR2(100 BYTE) NOT NULL, 
"DATE_REGISTERED" TIMESTAMP not null,
	"STATUS_OF_STAFF" VARCHAR2(20 BYTE) DEFAULT 'Pending');
   
   create table staff_interests(id number(19) constraint pk_staff_interest_id  primary key, 
   email varchar2(50) unique not null,
   department_id number(19) not null constraint fk_staff_department_id references department(department_id));  
   
   
    CREATE TABLE course_enrollement
   (	"ID" NUMBER(19,0), 
	"STUDENT_ID" VARCHAR2(50 BYTE) NOT NULL ENABLE, 
	"COURSE_ID" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"STATUS" VARCHAR2(15 BYTE) DEFAULT 'pursuing', 
	 CONSTRAINT "CHECK_STUDENT_STATUS" CHECK (status IN('pursuing','completed')) ENABLE, 
	 CONSTRAINT "PK_COURSE_ENROLLEMENT_ID" PRIMARY KEY ("ID"));
    
    
   

CREATE SEQUENCE stud_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

CREATE SEQUENCE country_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
CREATE SEQUENCE state_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

CREATE SEQUENCE city_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
CREATE SEQUENCE department_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
CREATE SEQUENCE courses_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
CREATE SEQUENCE courseduration_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 
CREATE SEQUENCE level_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 
CREATE SEQUENCE material_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 
CREATE SEQUENCE staff_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 CREATE SEQUENCE courseenroll_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 
 
 
 