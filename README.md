## JPA (Java Persistence API)

-bridge object oriented domain model to entity from database

-specification not implementation:

Hibernate, Ibatis, Toplink, orm lite.

------------------------------------------------------------------------------------------------------------------------------------

## JPA Arhitecutre
| name                   | calculation formula                                                                                                              |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| Entity                 | Entities are the persistence objects, stores as records in the database                                                          |
| Entity Manager         | It is an Interface, it manages the persistence operations on objects. It works like factory for Query instance.                  |
| Entity Transaction     | It has one-to-one relationship with EntityManager. For each EntityManager, operations are maintained by EntityTransaction class. |
| Entity Manager Factory | This is a factory class of EntityManager. It creates and manages multiple EntityManager instances.                               |
| Persistence            | This class contain static methods to obtain EntityManagerFactory instance.                                                       |
| Query                  | This interface is implemented by each JPA vendor to obtain relational objects that meet the criteria.                            |


------------------------------------------------------------------------------------------------------------------------------------

The relationship between EntityManagerFactory and EntityManager is one-to-many. It is a factory class to EntityManager instances.

The relationship between EntityManager and EntityTransaction is one-to-one. For each EntityManager operation, there is an EntityTransaction instance.

The relationship between EntityManager and Query is one-to-many. Many number of queries can execute using one EntityManager instance.

The relationship between EntityManager and Entity is one-to-many. One EntityManager instance can manage multiple Entities.

------------------------------------------------------------------------------------------------------------------------------------

## ORM mapping
| name          | 
|---------------|
| one to one    | 
| one to many   | 
| many to one   | 
| many to many  |

------------------------------------------------------------------------------------------------------------------------------------


## ORM atchitecture
| name                   | calculation formula                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
|------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Object                 | relation part java class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| Mapping                | mapping = jpi provider, mapping file, jpi loader, and object grid:  <br/>jpi provider related to the vendor product (HIBERNATE TOPLINK IBATIS)  <br/> mapping file (Persistence.xml) -> configuration between data in java class and data in a relation database <br/> jpa loader -> cache memory -> load the relation grid data<br/> object grid -> temporary location that can store the copy of the relation database (cache memory) queries against the database are first affected on the object grid only after it is commited it affect the main database |
| Relational             | contain the relational data which is connected to the business component      <br/> bs component commits data it is stored in the database physically until then the modified data is stored in the cache memory                                                                                                                                                                                                                                                                                                                                                 |

------------------------------------------------------------------------------------------------------------------------------------

JPQL object oriented persistence query language  