SELECT A.PRODUCT_CODE,
    SUM(A.PRICE*B.SALES_AMOUNT) AS SALES
FROM OFFLINE_SALE B
INNER JOIN PRODUCT A
ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_CODE
ORDER BY SUM(A.PRICE*B.SALES_AMOUNT) DESC,
    A.PRODUCT_CODE ASC


-- SELECT P.PRODUCT_CODE, SUM(P.PRICE*OS.SALES_AMOUNT) AS SALES FROM OFFLINE_SALE OS 
--   INNER JOIN PRODUCT P ON P.PRODUCT_ID = OS.PRODUCT_ID
--     GROUP BY P.PRODUCT_CODE
--       ORDER BY SUM(P.PRICE*OS.SALES_AMOUNT) DESC, P.PRODUCT_CODE  
