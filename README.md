# -Employee-management

사원관리프로그램

```
CREATE TABLE MEMBER_COM
(
    SEQ          NUMBER          NOT NULL, --사원번호
    ID           VARCHAR2(50)    NOT NULL, --사원아이디
    NAME         VARCHAR2(20)    NOT NULL, --사원이름
    PHONE        VARCHAR2(30)    NULL, --사원전화번호
    JOINDATE     DATE            NULL, --입사 날짜
    JOB  VARCHAR2(20)    NOT NULL, --직무
    DEP VARCHAR2(20)    NOT NULL, --부서
    CONSTRAINT MEMBER_COM_PK PRIMARY KEY (ID)
)

CREATE SEQUENCE SEQ_MEMBER_COM
START WITH 1
INCREMENT BY 1
```
