SELECT * FROM `Student` WHERE sex='男' AND email IS NOT NULL;
SELECT StudentNo, StudentResult FROM Result ORDER BY StudentResult DESC LIMIT 3;
SELECT MAX(StudentResult) FROM Result;
SELECT MIN(StudentResult) FROM Result;

SELECT * FROM Subject WHERE SubjectName LIKE '%数据库%';
SELECT * FROM Student WHERE uname LIKE '姜%';
SELECT uname, telephone, address FROM Student WHERE address LIKE '山东%';
SELECT * FROM Result WHERE StudentResult<=90 AND StudentResult >=80;
SELECT COUNT(*) AS 人数 FROM Result WHERE SubjectId=1;
SELECT SUM(StudentResult) AS 总分, AVG(StudentResult) AS 平均分 FROM Result WHERE SubjectId=1;
