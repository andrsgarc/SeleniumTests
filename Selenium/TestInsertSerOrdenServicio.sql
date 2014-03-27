delete from ser_orden_servicio_razon_soc raz where raz.ser_orden_servicio_pkc = 
 (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398200');

delete from ser_orden_servicio where numero_orden = '398200' and entity_status = 0;


--Primero se deben eliminar las pautas y pagos asociados a 398199 para estas pruebas
delete from ser_orden_servicio_razon_soc raz where raz.ser_orden_servicio_pkc = 
 (Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199');

delete from ser_orden_servicio where numero_orden = '398199' and entity_status = 0;

Insert into SER_ORDEN_SERVICIO (SER_ORDEN_SERVICIO_PK,ENTITY_STATUS,ENTITY_VERSION,BONIFICACION,COMPROMISO_PRESUPUESTARIO,CONTRATACION,DESCUENTO_SER,DETALLE_OFERTA,FECHA_ORDEN_SER,MODO_ENTREGA,MONTO_GASTADO,MONTO_RESERVADO,MONTO_SALDO,MONTO_TOTAL,NUMERO_ORDEN,ORDEN_GENERICA,PUNTO_REORDEN,ORG_MONEDA_FK,ORG_PROCESO_FK,ORG_SECTOR_FK,ORG_DIRECCION_FK,ORG_USUARIO_CREACION_FK,NEG_TIPO_CONTRATO_FK,ESTADO_ORDEN,CERRADA,NEG_NEGOCIO_FK) values (SEQ_SER_ORDEN_SERVICIO.NEXTVAL,'0','0','0','2109-8477-5999','45936801','0',null,to_date('27/03/14','DD/MM/RR'),null,'0','0','1000000','1000000','398199','0','0','1','51353','50050','52152','5','1','0','0','5');
Insert into SER_ORDEN_SERVICIO_RAZON_SOC (ENTITY_STATUS,ENTITY_VERSION,GENERICO_UTILIZADO,FECHA_UTILIZADO,FECHA_REVALIDACION,SER_ORDEN_SERVICIO_PKC,MED_RAZON_SOCIAL_PKC) values ('0','0','0',null,null,(Select distinct(ser.ser_orden_servicio_pk) FROM ser_orden_servicio ser WHERE ser.numero_orden = '398199'),'52000');

