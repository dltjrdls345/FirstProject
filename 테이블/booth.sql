--------------------------------------------------------
--  ������ ������ - ������-7��-29-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BOOTH
--------------------------------------------------------

  CREATE TABLE "HR"."BOOTH" 
   (	"�ν�ID" VARCHAR2(20 BYTE), 
	"�ν�����" VARCHAR2(20 BYTE), 
	"�뿩��" NUMBER(10,0), 
	"�뿩���۱Ⱓ" VARCHAR2(20 BYTE), 
	"�뿩����Ⱓ" VARCHAR2(20 BYTE), 
	"�ν�ũ��" VARCHAR2(20 BYTE), 
	"�ν�����" VARCHAR2(20 BYTE) DEFAULT '���', 
	"����ID" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index BOOTH_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."BOOTH_PK" ON "HR"."BOOTH" ("�ν�ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table BOOTH
--------------------------------------------------------

  ALTER TABLE "HR"."BOOTH" ADD CONSTRAINT "BOOTH_PK" PRIMARY KEY ("�ν�ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "HR"."BOOTH" MODIFY ("����ID" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�ν�����" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�ν�ũ��" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�뿩����Ⱓ" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�뿩���۱Ⱓ" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�뿩��" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�ν�����" NOT NULL ENABLE);
  ALTER TABLE "HR"."BOOTH" MODIFY ("�ν�ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table BOOTH
--------------------------------------------------------

  ALTER TABLE "HR"."BOOTH" ADD CONSTRAINT "BOOTH_FK1" FOREIGN KEY ("����ID")
	  REFERENCES "HR"."FESTIVAL" ("����ID") ENABLE;
