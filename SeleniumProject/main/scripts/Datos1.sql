BEGIN

delete from pag_pauta_pago where pag_orden_pago_pkc in  (select distinct(pag_orden_pago_pk) from pag_orden_pago where ser_orden_servicio_fk in (select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199'));

delete from pag_orden_pago where ser_orden_servicio_fk in (select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');
delete from pau_calendario where pau_orden_pauta_fk in (select distinct(pau_orden_pauta_pk) from pau_orden_pauta where camp_campana_fk in (select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in (select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92'))));

delete from pau_orden_pauta where camp_campana_fk in (select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in (select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from pau_calendario where pau_orden_pauta_fk in (select distinct(pau_orden_pauta_pk) from pau_orden_pauta where camp_campana_fk in (select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in (select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91'))));

delete from pau_orden_pauta where camp_campana_fk in (select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in (select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from pau_calendario where pau_orden_pauta_fk in (select distinct(pau_orden_pauta_pk) from pau_orden_pauta where camp_campana_fk in (select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in (select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93'))));

delete from pau_orden_pauta where camp_campana_fk in (select distinct(campannia.camp_campana_pk)from camp_campana campannia where campannia.camp_campana_pk in (select distinct(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk in (select distinct(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from pau_bonificacion where ser_orden_servicio_fk in (select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398200');

delete from pau_bonificacion where ser_orden_servicio_fk in (select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');

delete from ser_orden_servicio_razon_soc raz where raz.ser_orden_servicio_pkc in (select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398200');

delete from ser_orden_servicio where numero_orden = '398200';


--Primero se deben eliminar las pautas y pagos asociados a 398199 para estas pruebas
delete from ser_orden_servicio_razon_soc raz where raz.ser_orden_servicio_pkc in  (select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');

delete from ser_orden_servicio where numero_orden = '398199';

END;
/

DECLARE 

v_campanniaPk camp_campana.camp_campana_pk%TYPE;
 
BEGIN
	
  v_campanniaPk := 0;

--La 91 es el input de la prueba de pauta  
  
delete from org_firmante where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91');


delete from camp_indicador_asociado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_meta_cuantitativa where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_objetivo_estrategico where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_presupuesto where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_riesgo_asociado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_factor_critico where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_accion_deseada where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_necesidad_resolver where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_observacion_estado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_observaciones where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from camp_region_campana where camp_campana_pkc = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

delete from med_plan_medios where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91')));

select max(campannia.camp_campana_pk) into v_campanniaPk from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91'));

delete from ini_iniciativa_campana where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91');

delete from camp_campana where camp_campana_pk = v_campanniaPk;

delete from ini_control where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91');

delete from ini_presupuesto where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91');

delete from ini_iniciativa where ini_iniciativa_pk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M91');



--La 92 sirve para el caso de la iniciativa


delete from org_firmante where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from camp_indicador_asociado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_meta_cuantitativa where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_objetivo_estrategico where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_presupuesto where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_riesgo_asociado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_factor_critico where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_accion_deseada where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_necesidad_resolver where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_observacion_estado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_observaciones where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from camp_region_campana where camp_campana_pkc = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

delete from med_plan_medios where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92')));

select max(campannia.camp_campana_pk) into v_campanniaPk from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92'));

delete from ini_iniciativa_campana where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from camp_campana where camp_campana_pk = v_campanniaPk;

delete from ini_control where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from ini_presupuesto where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

delete from ini_iniciativa where ini_iniciativa_pk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M92');

--La 93 sirve para el caso de la pauta

delete from org_firmante where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');


delete from camp_indicador_asociado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_meta_cuantitativa where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_objetivo_estrategico where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_presupuesto where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_riesgo_asociado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_factor_critico where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_accion_deseada where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_necesidad_resolver where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_observacion_estado where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_observaciones where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from camp_region_campana where camp_campana_pkc = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

delete from med_plan_medios where camp_campana_fk = (select max(campannia.camp_campana_pk) from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93')));

select max(campannia.camp_campana_pk) into v_campanniaPk from camp_campana campannia where campannia.camp_campana_pk = (select max(incamp.camp_campana_fk) from ini_iniciativa_campana incamp where incamp.ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93'));

delete from ini_iniciativa_campana where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');

delete from camp_campana where camp_campana_pk = v_campanniaPk;

delete from ini_control where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');

delete from ini_presupuesto where ini_iniciativa_fk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');

delete from ini_iniciativa where ini_iniciativa_pk = (select max(ini.ini_iniciativa_pk) from ini_iniciativa ini where ini.nombre_iniciativa = 'IniSel2014M93');


END;

/
