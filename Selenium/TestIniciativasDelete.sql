DECLARE 

  v_campanniaPk         camp_campana.camp_campana_pk%TYPE;
  
BEGIN
  v_campanniaPk := 0;

delete from org_firmante where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90');


delete from camp_indicador_asociado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_meta_cuantitativa where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_objetivo_estrategico where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_presupuesto where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_riesgo_asociado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_factor_critico where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_accion_deseada where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_necesidad_resolver where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_observacion_estado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_observaciones where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from camp_region_campana where camp_campana_pkc = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

delete from med_plan_medios where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90')));

Select max(campannia.camp_campana_pk) into v_campanniaPk from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90'));

delete from ini_iniciativa_campana where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90');

delete from camp_campana where camp_campana_pk = v_campanniaPk;

delete from ini_control where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90');

delete from ini_presupuesto where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90');

delete from ini_iniciativa where ini_iniciativa_pk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M90');

END;
