create or replace procedure p_emp(v_num number,v_count out number)
is
begin
if v_num=1 then
select count(*) into v_count from empl where job= 'clerk';
dbms_output.put_line(v_count);
end if;
if v_num =0 then
select count(*) into v_count from empl where job <> 'clerk';
dbms_output.put_line(v_count);
end if;
end;
/
    
    
    set serveroutput on;
    declare
    v_a number;
    begin
    p_emp(1,v_a);
    end;
    /
  
  
  declare
    v_a number;
    begin
   p_emp(0,v_a);
    end;
    /
  
  
  select * from empl;