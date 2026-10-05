# Write your MySQL query statement below
select DISTINCT author_id as id from views where author_id in(viewer_id) order by author_id asc;
