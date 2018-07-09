DROP TABLE IF EXISTS `stu_choose_course`;
create table `stu_choose_course`(
`stu_id` char (20) NOT NULL,
`stu_name` char(20) NOT NULL ,
`course_id` char (20) NOT NULL ,
`course_name` char (20) NOT NULL,
`choose_date` char (20) NOT NULL ,
`id`  bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT
)
AUTO_INCREMENT=1
;

