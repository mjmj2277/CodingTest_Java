SELECT
b.author_id, b.author_name, a.category,
sum(a.price * c.sales) as total_sales

from book a, author b, book_sales c

where to_char(c.sales_date,'yyyymm')  = '202201'
and a.author_id = b.author_id
and a.book_id = c.book_id
group by b.author_id, b.author_name, a.category
order by b.author_id, a.category desc