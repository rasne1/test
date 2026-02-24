-- 1. 100번 사원의 모든 부하직원을 계층조회한다. 

 SELECT EMPLOYEE_ID
      , FIRST_NAME
      , MANAGER_ID
   FROM EMPLOYEES
  START WITH EMPLOYEE_ID = 100
CONNECT BY PRIOR EMPLOYEE_ID = MANAGER_ID
;

                                                            
-- 2. 113번 사원의 모든 상사를 계층조회한다. 
 SELECT EMPLOYEE_ID
      , FIRST_NAME
      , MANAGER_ID
   FROM EMPLOYEES
  START WITH EMPLOYEE_ID = 113
CONNECT BY PRIOR MANAGER_ID = EMPLOYEE_ID
;     
                                                            
-- 3. IT 부서장의 모든 부하직원을 계층조회한다.

 SELECT EMPLOYEE_ID
      , FIRST_NAME
      , MANAGER_ID
   FROM EMPLOYEES
  START WITH EMPLOYEE_ID IN ( SELECT MANAGER_ID
                                FROM DEPARTMENTS
                               WHERE DEPARTMENT_NAME = 'IT') 
CONNECT BY PRIOR EMPLOYEE_ID = MANAGER_ID
;


                                                            
-- 4. 부서장들의 부하직원을 계층조회한다. 

 SELECT E.EMPLOYEE_ID
      , E.FIRST_NAME
      , E.MANAGER_ID
   FROM EMPLOYEES E
   
  START WITH E.EMPLOYEE_ID IN (SELECT MANAGER_ID
                                 FROM DEPARTMENTS
                                WHERE MANAGER_ID IS NOT NULL )
CONNECT BY PRIOR E.EMPLOYEE_ID = E.MANAGER_ID
  ORDER BY EMPLOYEE_ID ASC
; 

                                                            
-- 5. 부서명이 가장 긴 부서에서 근무중인 사원의 모든 정보를 조회한다.

SELECT E.EMPLOYEE_ID
     , E.FIRST_NAME
     , E.LAST_NAME
     , E.EMAIL
     , E.PHONE_NUMBER
     , E.HIRE_DATE
     , E.JOB_ID
     , E.SALARY
     , E.COMMISSION_PCT
     , E.MANAGER_ID
     , E.DEPARTMENT_ID
  FROM EMPLOYEES E
 WHERE E.DEPARTMENT_ID IN (SELECT D.DEPARTMENT_ID
                             FROM DEPARTMENTS D
                            WHERE LENGTH(DEPARTMENT_NAME) = (SELECT MAX(LENGTH(D.DEPARTMENT_NAME))
                                                                FROM DEPARTMENTS D)) 
                          
;


SELECT D.DEPARTMENT_ID
     , LENGTH(D.DEPARTMENT_NAME) AS LEN_DE
  FROM DEPARTMENTS D
 ORDER BY LEN_DE DESC

;


 
                                                            
-- 6. 2002년부터 2006년까지 입사한 사원은 몇 명인지 연도별로 조회한다. 

SELECT TO_CHAR(HIRE_DATE,'YYYY') AS HIRE_YEAR 
     , COUNT(EMPLOYEE_ID) AS COE
  FROM EMPLOYEES
 GROUP BY TO_CHAR(HIRE_DATE,'YYYY')
 ORDER BY HIRE_YEAR ASC
; 
SELECT HIRE_YEAR
     , COE
  FROM (SELECT TO_CHAR(HIRE_DATE,'YYYY') AS HIRE_YEAR 
             , COUNT(EMPLOYEE_ID) AS COE
          FROM EMPLOYEES
         GROUP BY TO_CHAR(HIRE_DATE,'YYYY')
         ORDER BY HIRE_YEAR ASC)
 WHERE ROWNUM <= 6
;
 
SELECT HIRE_YEAR
     , COE
  FROM (SELECT HIRE_YEAR
             , COE
             , ROWNUM AS R_RUM
          FROM (SELECT TO_CHAR(HIRE_DATE,'YYYY') AS HIRE_YEAR 
                     , COUNT(EMPLOYEE_ID) AS COE
                  FROM EMPLOYEES
                 GROUP BY TO_CHAR(HIRE_DATE,'YYYY')
                 ORDER BY HIRE_YEAR ASC)
         WHERE ROWNUM <= 6)
 WHERE R_RUM >= 2
;

                                                            
-- 7. 입사일이 가장 빠른 사원 5명의 이름과 입사일을 조회한다. 
SELECT FIRST_NAME
     , HIRE_DATE
  FROM EMPLOYEES
 ORDER BY HIRE_DATE ASC
;
SELECT FIRST_NAME
     , HIRE_DATE
  FROM (SELECT FIRST_NAME
             , HIRE_DATE
          FROM EMPLOYEES
         ORDER BY HIRE_DATE ASC)
 WHERE ROWNUM <= 5
   

;

                                                            
-- 8. 커미션을 받는 사원들의 이름과 커미션을 조회한다. 단, 커미션이 가장 높은 사원 3명은 제외한다.
SELECT FIRST_NAME
     , COMMISSION_PCT
  FROM (SELECT FIRST_NAME
             , COMMISSION_PCT
             , ROWNUM AS R_NUM
          FROM (SELECT FIRST_NAME
                     , COMMISSION_PCT
                  FROM EMPLOYEES
                 WHERE COMMISSION_PCT IS NOT NULL
                 ORDER BY COMMISSION_PCT DESC))
 WHERE R_NUM >= 4
;

SELECT FIRST_NAME
     , COMMISSION_PCT
  FROM (SELECT FIRST_NAME
             , COMMISSION_PCT
             , ROWNUM AS R_NUM
          FROM EMPLOYEES
         WHERE COMMISSION_PCT IS NOT NULL
         ORDER BY COMMISSION_PCT DESC)       
;


SELECT FIRST_NAME
     , COMMISSION_PCT 
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL
 ORDER BY COMMISSION_PCT DESC


;

