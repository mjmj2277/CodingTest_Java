select b.HOUR,count(a.HOUR) cnt
from (select to_char(datetime,'HH24') HOUR from animal_outs) a 
   , (select level-1 HOUR from dual connect by level <= 24) b
where b.HOUR=a.HOUR(+)
group by b.HOUR
order by b.HOUR