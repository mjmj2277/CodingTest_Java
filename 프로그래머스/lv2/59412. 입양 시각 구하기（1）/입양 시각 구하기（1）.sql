-- SELECT DATETIME AS HOUR, COUNT(*) 
-- FROM ANIMAL_OUTS
-- GROUP BY

select hour, count(hour) count
from (SELECT to_number(to_char(datetime, 'HH24')) as hour
        from ANIMAL_OUTS)
where hour>=9 and hour<20
group by hour
order by hour