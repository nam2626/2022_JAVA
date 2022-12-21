select * from student;
select * from "DRUG_SELL";

select * from (select s.student_no, s.student_name, m.major_name, s.score from student s ,major m WHERE s.major_no = m.major_no) where major_name like '%공학%';