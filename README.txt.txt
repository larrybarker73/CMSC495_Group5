CMSC 495

Group 5 Project Repository
I can updates RNBURKE

Larry --Testing if I can update

I will post this in its own document but here are the query statements that work.  I just added more records
to the database with these statements.  If you intend to leave it blank, you must still use the first line and 
on the second line place a blank space   ''   where that field would go.  

insert into movie (title, type, rating, length, year_released, director)
values ('Life of Pi', 'Adventrue','PG','127 min', '2012', "not sure");

insert into dvd_video (movie_id, serial_no, late_fee)
values ('1', '1D1 ', '2.5');


insert into customer (last_name, first_name, street_address, city, state, zip_code, phone, hold_on_account)
values ('Jones', 'James','123 J Street','Fallbrook','CA','92028','123456789','1');

The hold on account is either a 1 or a 0 for true or false.  It doesn't matter, just needs to be consistant.

insert into rental (cust_id, date_out, movie_id, late_fees_paid)
values ('1', date '2013-09-01','1','5.25');
