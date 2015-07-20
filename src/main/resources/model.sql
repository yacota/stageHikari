-- DROP TABLE IF EXISTS DTY_CATEGORY;
DROP TABLE IF EXISTS DTY_CATEGORY;

CREATE TABLE DTY_CATEGORY (
  CAT_ID int(11) NOT NULL AUTO_INCREMENT,
  CAT_PARENT_ID int(11) DEFAULT NULL,
  CAT_WEIGHT int(11) DEFAULT NULL,
  CAT_ORDER_TYPE int(11) DEFAULT NULL,
  CAT_NODE_TYPE int(11) DEFAULT NULL,
  CAT_NODE_STATE int(11) DEFAULT NULL,
  CAT_IDNAME varchar(20) NOT NULL,
  PRIMARY KEY (CAT_ID),
  UNIQUE KEY IDX_DTY_CATEGORY_IDNAME (CAT_IDNAME)
);

--
-- Dumping data for table DTY_CATEGORY
--
INSERT INTO DTY_CATEGORY VALUES (1,NULL,0,0,1,-1,'ROOT');
INSERT INTO DTY_CATEGORY VALUES (2,480,0,0,1,-1,'STATISTICS');
INSERT INTO DTY_CATEGORY VALUES (3,2,0,0,1,0,'CONC_RANKG');