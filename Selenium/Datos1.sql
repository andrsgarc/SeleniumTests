Delete from pag_pauta_pago where pag_orden_pago_pkc in  (Select distinct(pag_orden_pago_pk) from pag_orden_pago where ser_orden_servicio_fk in (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199'));

Delete from pag_orden_pago where ser_orden_servicio_fk in (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');

delete from pau_calendario where pau_orden_pauta_fk in (select distinct(pau_orden_pauta_pk) from pau_orden_pauta where camp_campana_fk in (Select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (Select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in 
(Select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92'))));

delete from pau_orden_pauta where camp_campana_fk in (Select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (Select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in 
(Select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from pau_calendario where pau_orden_pauta_fk in (select distinct(pau_orden_pauta_pk) from pau_orden_pauta where camp_campana_fk in (Select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (Select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in 
(Select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91'))));

delete from pau_orden_pauta where camp_campana_fk in (Select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (Select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in 
(Select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from pau_calendario where pau_orden_pauta_fk in (select distinct(pau_orden_pauta_pk) from pau_orden_pauta where camp_campana_fk in (Select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (Select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in 
(Select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93'))));

delete from pau_orden_pauta where camp_campana_fk in (Select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (Select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in 
(Select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));


delete from pau_bonificacion where ser_orden_servicio_fk in (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398200');

delete from pau_bonificacion where ser_orden_servicio_fk in (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');

delete from ser_orden_servicio_razon_soc raz where raz.ser_orden_servicio_pkc in 
 (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398200');

delete from ser_orden_servicio where numero_orden = '398200';


--Primero se deben eliminar las pautas y pagos asociados a 398199 para estas pruebas
delete from ser_orden_servicio_razon_soc raz where raz.ser_orden_servicio_pkc in 
 (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');

delete from ser_orden_servicio where numero_orden = '398199';



DECLARE 

  v_campanniaPk         camp_campana.camp_campana_pk%TYPE;
  
BEGIN
  v_campanniaPk := 0;


--La 91 es el input de la prueba de pauta  
  
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

delete from org_firmante where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');


--La 92 sirve para el caso de la iniciativa

delete from camp_indicador_asociado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_meta_cuantitativa where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_objetivo_estrategico where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_presupuesto where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_riesgo_asociado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_factor_critico where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_accion_deseada where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_necesidad_resolver where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_observacion_estado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_observaciones where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_region_campana where camp_campana_pkc = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from med_plan_medios where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

Select max(campannia.camp_campana_pk) into v_campanniaPk from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92'));

delete from ini_iniciativa_campana where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from camp_campana where camp_campana_pk = v_campanniaPk;

delete from ini_control where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from ini_presupuesto where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from ini_iniciativa where ini_iniciativa_pk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

--La 92 sirve para el caso de la iniciativa

delete from camp_indicador_asociado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_meta_cuantitativa where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_objetivo_estrategico where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_presupuesto where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_riesgo_asociado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_factor_critico where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_accion_deseada where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_necesidad_resolver where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_observacion_estado where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_observaciones where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_region_campana where camp_campana_pkc = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from med_plan_medios where camp_campana_fk = (Select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

Select max(campannia.camp_campana_pk) into v_campanniaPk from camp_campana campannia where campannia.camp_campana_pk = (Select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = 
(Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93'));

delete from ini_iniciativa_campana where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');

delete from camp_campana where camp_campana_pk = v_campanniaPk;

delete from ini_control where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');

delete from ini_presupuesto where ini_iniciativa_fk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');

delete from ini_iniciativa where ini_iniciativa_pk = (Select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');


END;

