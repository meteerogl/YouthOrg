--------
INSERT INTO `countries` (`country_id`,`country_name`) VALUES ('1','TURKIYE');
INSERT INTO `countries` (`country_id`,`country_name`) VALUES ('2','ESTONIA');
--------
INSERT INTO `provinces` (`province_id`,`province_name`,`country_country_id`) VALUES ('1','ADANA','1');
INSERT INTO `provinces` (`province_id`,`province_name`,`country_country_id`) VALUES ('2','ANKARA','1');
--------
INSERT INTO `universities` (`uni_id`, `uni_name`,`uni_country_country_id`,`uni_province_province_id`) VALUES ('1', 'YILDIRIM BEYAZIT UNIVERSITESI','1','2');
INSERT INTO `universities` (`uni_id`, `uni_name`,`uni_country_country_id`,`uni_province_province_id`) VALUES ('2', 'ODTU','1','2');
--------
INSERT INTO `organizations` (`org_id`,`org_name`,`org_detail`) VALUES ('1','BCYCLE LOVERS','BCYCLE IS LIFE');
INSERT INTO `organizations` (`org_id`,`org_name`,`org_detail`) VALUES ('2','BOOK LOVERS','BOOK IS PART OF LIFE');
--------
INSERT INTO `role` (`role_id`,`role`) VALUES ('1','ADMIN');
INSERT INTO `role` (`role_id`,`role`) VALUES ('2','ORGADMIN');
INSERT INTO `role` (`role_id`,`role`) VALUES ('3','UNIREP');
INSERT INTO `role` (`role_id`,`role`) VALUES ('4','USER');

