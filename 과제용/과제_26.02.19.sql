 
-- 24. (51건) 평균 월급보다 많이 받는 사원들의 사원번호, 이름, 성, 월급을 조회한다.
SELECT AVG(SALARY)
  FROM EMPLOYEES
;



SELECT FIRST_NAME
     , LAST_NAME 
     , SALARY 
  FROM EMPLOYEES
 WHERE SALARY > (SELECT AVG(SALARY)
                   FROM EMPLOYEES)
 
;

-- 25. (56건) 평균 월급보다 적게 받는 사원들의 사원번호, 월급, 부서번호를 조회한다.
SELECT FIRST_NAME
     , LAST_NAME 
     , SALARY 
  FROM EMPLOYEES
 WHERE SALARY < (SELECT AVG(SALARY)
                   FROM EMPLOYEES)
 
;


-- 26. (1건) 가장 많은 월급을 받는 사원의 사원번호, 이름, 월급을 조회한다.
SELECT MAX(SALARY)
  FROM EMPLOYEES
;


SELECT FIRST_NAME
     , LAST_NAME 
     , SALARY 
  FROM EMPLOYEES
 WHERE SALARY = (SELECT MAX(SALARY)
                   FROM EMPLOYEES)
 
;




-- 30. (2건) 가장 늦게 입사한 사원의 모든 정보를 조회한다.
SELECT MAX(HIRE_DATE)
  FROM EMPLOYEES
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE HIRE_DATE = (SELECT MAX(HIRE_DATE)
                      FROM EMPLOYEES)
;                      

-- 31. (1건) 가장 일찍 입사한 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE HIRE_DATE = (SELECT MIN(HIRE_DATE)
                      FROM EMPLOYEES)
;       


-- 32. (2건) 자신의 상사보다 더 많은 월급을 받는 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES EMP
 WHERE SALARY > (SELECT SALARY
  				   FROM EMPLOYEES MAN
 				  WHERE MAN.EMPLOYEE_ID = EMP.MANAGER_ID)
;

-- 33. (37건) 자신의 상사보다 더 일찍 입사한 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES EMP
 WHERE HIRE_DATE < (SELECT HIRE_DATE
  				      FROM EMPLOYEES MAN
 				     WHERE MAN.EMPLOYEE_ID = EMP.MANAGER_ID)
;


-- 36. (1건) 가장 많은 인센티브를 받는 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE COMMISSION_PCT = (SELECT MAX(COMMISSION_PCT)
    					   FROM EMPLOYEES)
;


-- 37. (6건) 가장 적은 인센티브를 받는 사원의 월급과 인센티브를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE COMMISSION_PCT = (SELECT MIN(COMMISSION_PCT)
    					   FROM EMPLOYEES)
;
-- 40. (65건) 사원이 속한 부서의 평균월급보다 적게 받는 사원의 모든 정보를 조회한다.

SELECT AVG(SALARY)
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 90
;
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES EMP
 WHERE SALARY < (SELECT AVG(SALARY)
 				   FROM EMPLOYEES DEP
 				  WHERE DEP.DEPARTMENT_ID = EMP.DEPARTMENT_ID)
;

-- 44. (1건) 50번 부서의 부서장의 이름, 성, 월급을 조회한다.

SELECT FIRST_NAME
     , LAST_NAME
     , SALARY
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = (SELECT MANAGER_ID
  					    FROM DEPARTMENTS
 					   WHERE DEPARTMENT_ID = 50)
;

-- 47. (16건) 사원이 없는 부서명을 조회한다.

SELECT DEPARTMENT_NAME
  FROM DEPARTMENTS
 WHERE DEPARTMENT_ID NOT IN (SELECT DISTINCT DEPARTMENT_ID
 						    	FROM EMPLOYEES
 						       WHERE DEPARTMENT_ID IS NOT NULL)
;

-- 48. (7건) 직무가 변경된 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
  FROM JOB_HISTORY
;


SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID IN (SELECT EMPLOYEE_ID
                        FROM JOB_HISTORY)
;                        


-- 49. (100건) 직무가 변경된적 없는 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID NOT IN (SELECT EMPLOYEE_ID
                             FROM JOB_HISTORY)
;    

-- 56. (5건) 월급이 7000 에서 12000 사이인 사원이 근무중인 도시를 조회한다.

SELECT DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE SALARY BETWEEN 7000 AND 12000 
;

SELECT LOCATION_ID
  FROM DEPARTMENTS
 WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID
                           FROM EMPLOYEES
                          WHERE SALARY BETWEEN 7000 AND 12000 )
;

SELECT CITY
  FROM LOCATIONS
 WHERE LOCATION_ID IN (SELECT LOCATION_ID
                         FROM DEPARTMENTS
                        WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID
                                                  FROM EMPLOYEES
                                                 WHERE SALARY BETWEEN 7000 AND 12000 ))
;                                                 

-- 57. (9건) 'Seattle' 에서 근무중인 사원의 직무명을 중복없이 조회한다.

SELECT LOCATION_ID
  FROM LOCATIONS
 WHERE CITY = 'Seattle'
;

SELECT DISTINCT DEPARTMENT_ID
  FROM DEPARTMENTS
 WHERE LOCATION_ID IN (SELECT DISTINCT LOCATION_ID
                         FROM LOCATIONS
                        WHERE CITY = 'Seattle')
;

SELECT DISTINCT JOB_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                           FROM DEPARTMENTS
                          WHERE LOCATION_ID IN (SELECT DISTINCT LOCATION_ID
                                                  FROM LOCATIONS
                                                 WHERE CITY = 'Seattle'))
;

SELECT DISTINCT JOB_TITLE
  FROM JOBS
 WHERE JOB_ID IN (SELECT DISTINCT JOB_ID
                    FROM EMPLOYEES
                   WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                                             FROM DEPARTMENTS
                                            WHERE LOCATION_ID IN (SELECT DISTINCT LOCATION_ID
                                                                    FROM LOCATIONS
                                                                   WHERE CITY = 'Seattle')))
;

-- 59. (1건) 이름이 'Renske' 인 사원의 월급과 같은 월급을 받는 사원의 모든 정보를 조회한다. 단, 'Renske' 사원은 조회에서 제외한다.

SELECT SALARY
  FROM EMPLOYEES
 WHERE FIRST_NAME = 'Renske'
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE SALARY IN (SELECT SALARY
                    FROM EMPLOYEES
                   WHERE FIRST_NAME = 'Renske')
   AND FIRST_NAME != 'Renske'
;                   


-- 60. (15건) 회사 전체의 평균 월급보다 많이 받는 사원들 중 이름에 'u' 가 포함된 사원과 동일한 부서에서 근무중인 사원들의 모든 정보를 조회한다.

SELECT AVG(SALARY)
  FROM EMPLOYEES 
;

SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE SALARY > (SELECT AVG(SALARY)
                   FROM EMPLOYEES )
   AND FIRST_NAME LIKE '%u%'
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                           FROM EMPLOYEES
                          WHERE SALARY > (SELECT AVG(SALARY)
                                            FROM EMPLOYEES )
                            AND FIRST_NAME LIKE '%u%')
;


-- 61. (21건) 부서가 없는 국가명을 조회한다.

SELECT LOCATION_ID
  FROM DEPARTMENTS
;

SELECT DISTINCT COUNTRY_ID
  FROM LOCATIONS
 WHERE LOCATION_ID NOT IN (SELECT LOCATION_ID
                             FROM DEPARTMENTS)
;                             

SELECT COUNTRY_NAME
  FROM COUNTRIES
 WHERE COUNTRY_ID IN (SELECT DISTINCT COUNTRY_ID
                        FROM LOCATIONS
                       WHERE LOCATION_ID NOT IN (SELECT LOCATION_ID
                                                   FROM DEPARTMENTS))
;  


-- 62. (36건) 'Europe' 에서 근무중인 사원들의 모든 정보를 조회한다.

SELECT REGION_ID 
  FROM REGIONS
 WHERE REGION_NAME = 'Europe'
; 

SELECT COUNTRY_ID
  FROM COUNTRIES
 WHERE REGION_ID IN (SELECT REGION_ID 
                       FROM REGIONS
                      WHERE REGION_NAME = 'Europe')
;

SELECT DISTINCT LOCATION_ID
  FROM LOCATIONS
 WHERE COUNTRY_ID IN (SELECT DISTINCT COUNTRY_ID
                        FROM COUNTRIES
                       WHERE REGION_ID IN (SELECT DISTINCT REGION_ID 
                                             FROM REGIONS
                                            WHERE REGION_NAME = 'Europe'))
;                                            

SELECT DEPARTMENT_ID
  FROM DEPARTMENTS
 WHERE LOCATION_ID IN (SELECT DISTINCT LOCATION_ID
                         FROM LOCATIONS
                        WHERE COUNTRY_ID IN (SELECT DISTINCT COUNTRY_ID
                                               FROM COUNTRIES
                                              WHERE REGION_ID IN (SELECT DISTINCT REGION_ID 
                                                                    FROM REGIONS
                                                                   WHERE REGION_NAME = 'Europe')))
;                                                                   

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID
                           FROM DEPARTMENTS
                          WHERE LOCATION_ID IN (SELECT DISTINCT LOCATION_ID
                                                  FROM LOCATIONS
                                                 WHERE COUNTRY_ID IN (SELECT DISTINCT COUNTRY_ID
                                                                        FROM COUNTRIES
                                                                       WHERE REGION_ID IN (SELECT DISTINCT REGION_ID 
                                                                                             FROM REGIONS
                                                                                            WHERE REGION_NAME = 'Europe'))))
;
  


-- 78. (0건) 직무별 최대월급보다 더 많은 월급을 받는 사원의 모든 정보를 조회한다.

SELECT JOB_TITLE
     , MAX_SALARY
  FROM JOBS
;

SELECT SALARY
  FROM EMPLOYEES e 
 WHERE SALARY > (SELECT MAX_SALARY
                   FROM JOBS j 
                  WHERE J.JOB_ID = E.JOB_ID)
;


-- 112. (7건) 109번 사원의 입사일로 부터 1년 동안 입사한 사원의 모든 정보를 조회한다.
SELECT HIRE_DATE
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 109
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN (SELECT HIRE_DATE
                            FROM EMPLOYEES
                           WHERE EMPLOYEE_ID = 109)
                     AND (SELECT ADD_MONTHS(HIRE_DATE,12)
                            FROM EMPLOYEES
                           WHERE EMPLOYEE_ID = 109)
;

-- 113. (8건) 가장 먼저 입사한 사원의 입사일로부터 2년 동안 입사한 사원의 모든 정보를 조회한다.

SELECT MIN(HIRE_DATE)  
  FROM EMPLOYEES 
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN (SELECT MIN(HIRE_DATE)  
                            FROM EMPLOYEES)
                     AND (SELECT ADD_MONTHS(MIN(HIRE_DATE),24)
                            FROM EMPLOYEES)
;

-- 114. (22건) 가장 늦게 입사한 사원의 입사일 보다 1년 앞서 입사한 사원의 모든 정보를 조회한다.
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN (SELECT ADD_MONTHS(MAX(HIRE_DATE),-12)
                            FROM EMPLOYEES)
                     AND (SELECT MAX(HIRE_DATE)  
                            FROM EMPLOYEES)
;
 

---- 추가 문제

-- 1. (12건) 부서아이디별 사원의 평균연봉을 조회한다.
SELECT DEPARTMENT_ID
     , AVG(SALARY)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID
;


-- 2. (19건) 직무아이디별 사원의 최고연봉을 조회한다.
SELECT MAX_SALARY
  FROM JOBS 
;

-- 3. (72건) 인센티브를 안받는 사원의 모든 정보를 조회한다.

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NULL
;

-- 4. (2건) 인센티브를 받는 사원의 부서아이디를 중복없이 조회한다.
SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL
;


-- 5. (2건) 인센티브를 받는 사원의 직무아이디를 중복없이 조회한다.
SELECT DISTINCT JOB_ID
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL
;


-- 6. (7건) 사원이 있는 부서의 지역아이디를 조회한다.
SELECT DEPARTMENT_ID
  FROM EMPLOYEES
;

SELECT DISTINCT LOCATION_ID
  FROM DEPARTMENTS
 WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID
                           FROM EMPLOYEES)
;
                                              


-- 7. (21건) Seattle에 존재하는 부서번호를 조회한다.

SELECT LOCATION_ID
  FROM LOCATIONS
 WHERE CITY = 'Seattle'
;

SELECT DISTINCT DEPARTMENT_ID
  FROM DEPARTMENTS
 WHERE LOCATION_ID IN (SELECT DISTINCT LOCATION_ID
                         FROM LOCATIONS
                        WHERE CITY = 'Seattle')
;                        

-- 8. (16건) 사원이 한명도 없는 도시를 조회한다.

SELECT LOCATION_ID
  FROM DEPARTMENTS
;

SELECT CITY
  FROM LOCATIONS
 WHERE LOCATION_ID NOT IN (SELECT LOCATION_ID
                             FROM DEPARTMENTS)
;                             
 

-- 9. (7건) 사원이 한명이라도 있는 도시를 조회한다.

SELECT CITY
  FROM LOCATIONS
 WHERE LOCATION_ID  IN (SELECT LOCATION_ID
                          FROM DEPARTMENTS)
;    

-- 10. (107건) 모든 사원의 정보를 연봉으로 오름차순 정렬하여 조회한다.
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 ORDER BY SALARY ASC


-- 11. (107건) 모든 사원의 사원번호, 이름, 성, 연봉, 인센티브를 포함한 연봉 정보를 조회한다.
 SELECT EMPLOYEE_ID
      , FIRST_NAME
      , LAST_NAME
      , SALARY
      , COMMISSION_PCT
   FROM EMPLOYEES
;

-- 12. (6건) 2003년에 입사한 사원은 몇 명인지 조회한다.

SELECT COUNT(HIRE_DATE)
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN TO_DATE('2003-01-01','YYYY-MM-DD')
                     AND TO_DATE('2003-12-31','YYYY-MM-DD')
; 

-- 13. (1건) 113번 사원의 상사의 모든 정보를 조회한다.
SELECT MANAGER_ID
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 113
;

SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID IN (SELECT MANAGER_ID
                         FROM EMPLOYEES
                        WHERE EMPLOYEE_ID = 113)
;                       


-- 14. (11건) 모든 부서의 부서장의 모든 사원 정보를 조회한다.
SELECT MANAGER_ID
  FROM DEPARTMENTS
;
SELECT EMPLOYEE_ID
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID IN (SELECT MANAGER_ID
                        FROM DEPARTMENTS)
;                        


-- 15. (23건) 사원의 이름이 7자리인 사원의 모든 정보를 조회한다.
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE '_______'
 ;

-- 16. (25건) 사원의 이메일이 6자리인 사원의 모든 정보를 조회한다.
SELECT EMPLOYEE_ID
     , FIRST_NAME
     , LAST_NAME
     , EMAIL
     , PHONE_NUMBER
     , HIRE_DATE
     , JOB_ID
     , SALARY
     , COMMISSION_PCT
     , MANAGER_ID
     , DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE EMAIL LIKE '______'
 ;




