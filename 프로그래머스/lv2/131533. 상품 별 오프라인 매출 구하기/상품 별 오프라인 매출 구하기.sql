SELECT P.PRODUCT_CODE,
    SUM(P.PRICE*OS.SALES_AMOUNT) AS SALES
FROM OFFLINE_SALE OS 
INNER JOIN PRODUCT P
    ON P.PRODUCT_ID = OS.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SUM(P.PRICE*OS.SALES_AMOUNT) DESC,
    P.PRODUCT_CODE
    
-- select p.product_code,
--     sum(p.price * os.sales_amount) sales
-- from product p, offline_sale os
-- where p.product_id = os.product_id
-- group by p.product_code
-- order by sales desc, product_code