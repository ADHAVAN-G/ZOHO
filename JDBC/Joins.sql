use mydb;
create table if not exists orders(orderid int(5),customerId int(5),productName varchar(25));
create table customer(customerId int(5) primary key,customerName varchar(25),mobilenumber int(10));
desc customer;
insert into orders values(10309,20221,'laptop');
insert into orders values(10308,20222,'mouse');
insert into orders values(10307,20223,'keyboard');
insert into customer values(20222,'steve',987620981);
insert into customer values(20223,'willsmith',944429006);

select orders.orderid,customer.customername from orders inner join  customer on orders.customerid=customer.customerid;
select orders.orderid,customer.customername from orders left join  customer on orders.customerid=customer.customerid order by customer.customerid desc;
select orders.orderid,customer.customername from orders right join  customer on orders.customerid=customer.customerid;
