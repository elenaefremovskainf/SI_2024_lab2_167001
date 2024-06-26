Втора лабораториска вежба по Софтверско инженерство
Ефремовска Елена , бр. на индекс 167001
-------------------------------------------------------------------
Влезен блок (Entry Block)
______________________________________
Блок за проверка на allItems
_________________________________________
Циклус (for циклус)
________________________________________
Блок за проверка на името на елементот
___________________________________________
Блок за проверка на баркодот на елементот
__________________________________________
Блок за пресметка на цената на елементот
___________________________________________
Блок за проверка на цената и попустот на елементот
__________________________________________________
Блок за проверка на баркодот на елементот (повторно)
_____________________________________________________
Блок за пресметка на вкупната цена
______________________________________
Блок за проверка на вкупната цена според плаќањето
___________________________________________________
Излезен блок (Exit Block)
_______________________________

Сега да ги пресметаме вредностите:

(E): Број на ребра = 13
(N): Број на јазли = 11
(P): Број на компоненти = 1 (графот е поврзан)

Пресметка:
V(G)=E−N+2P=13−11+2⋅1=4
____________________________________________________

Број на гранки (E):
Гранка 1: Проверка дали allItems е null.
Гранка 2: Проверка на името на артиклот.
Гранка 3: Проверка на баркодот на артиклот.
Гранка 4: Проверка на попустот на артиклот.
Гранка 5: Проверка на цената на артиклот.
Гранка 6: Проверка на сумата според плаќањето.
______________________________________________________
Број на јазли (N):
Јазол 1: Почеток на функцијата.
Јазол 2: Проверка на allItems.
Јазол 3: Циклус за секој артикл.
Јазол 4: Проверка на името на артиклот.
Јазол 5: Проверка на баркодот на артиклот.
Јазол 6: Проверка на попустот на артиклот.
Јазол 7: Проверка на цената на артиклот.
Јазол 8: Проверка на сумата според плаќањето.
Јазол 9: Крај на функцијата.
____________________________________________________
Број на услови:
Вкупно 6 услови во функцијата.
Број на блокови за повторување ®:
Еден блок за повторување за циклусот на сите артикли.
___________________________________________________________
Број на ребра (B):
(B = E + 1 = 6 + 1 = 7)
Според ова, графот на контрола има 7 ребра, 9 јазли, 6 услови и 1 блок за повторување. 
_________________________________________________________________________________________________

Control Flow Graph
------------------------------------------
![cfg](https://github.com/elenaefremovskainf/SI_2024_lab2_167001/assets/166954400/dee234f4-4f9f-4f28-a7c8-07cb93e0bcf6)

---------------------------------------------------------------------------------------------------------------


Цикломатска комплексност
------------------------------------------------------------------------
Цикломатската комплексност на функцијата се пресметува според формулата:

[ M = E - N + 2P ]

Каде:

(M) е цикломатската комплексност.
(E) е бројот на граници (префрли на контрола) во графот на контрола.
(N) е бројот на јазли (секвенцијални групи на наредби кои содржат само еден префрл на контрола).
(P) е бројот на поврзани компоненти (раздвоени групи на јазли и граници).
Цикломатската комплексност на овој код е 5
______________________________________________________________________________________________________________________________________
Тест случаи според критериумот Every Branch
--------------------------------------------------
___________________________________________________________________________________________________________________________________
Тест случај за Гранка 1 (allItems == null):
Влез: allItems = null, payment = 200
Очекуван излез: Излага RuntimeException со порака “allItems list can’t be null!”
_________________________________________________________________________________________________________________________________
Тест случај за Гранка 2 (Име на артиклот):
Влез: allItems = [Item(name=null, barcode="12345", price=200, discount=0.1)], payment = 300
Очекуван излез: Името на артиклот се поставува на “unknown”.
_____________________________________________________________________________________________________________________________
Тест случај за Гранка 3 (Баркод на артиклот):
Влез: allItems = [Item(name="Item1", barcode=null, price=200, discount=0.1)], payment = 300
Очекуван излез: Излага RuntimeException со порака “No barcode!”
__________________________________________________________________________________________________________________________________
Тест случај за Гранка 4 (Попуст на артиклот):
Влез: allItems = [Item(name="Item2", barcode="98765", price=250, discount=0)], payment = 300
Очекуван излез: Сумата се зголемува за цената на артиклот (без попуст).
____________________________________________________________________________________________________________________________________
Тест случај за Гранка 5 (Цена на артиклот):
Влез: allItems = [Item(name="Item3", barcode="54321", price=400, discount=0.2)], payment = 500
Очекуван излез: Сумата се зголемува за цената на артиклот со применет попуст.
____________________________________________________________________________________________________
Тест случај за Гранка 6 (Сума според плаќањето):
Влез: allItems = [Item(name="Item4", barcode="01234", price=350, discount=0.15)], payment = 400
Очекуван излез: Сумата се намалува за 30 поради специфичниот баркод.
_________________________________________________________________________________________________________________________________________
Тест случаи според критериумот Multiple Condition
-------------------------------------------------------
______________________________________________________________________________________________________________

Тест случај за Комбинација 1 (Сите услови се исполнети):
Влез: item.getPrice() = 400, item.getDiscount() = 0.2, item.getBarcode() = "012345"
Очекуван излез: Сумата се намалува за 30 поради специфичниот баркод.
_________________________________________________________________________________________________
Тест случај за Комбинација 2 (Првите два услови се исполнети, но не и третиот):
Влез: item.getPrice() = 400, item.getDiscount() = 0.2, item.getBarcode() = "123456"
Очекуван излез: Сумата се зголемува за цената на артиклот со применет попуст.
______________________________________________________________________________________________________________
Тест случај за Комбинација 3 (Првиот и третиот услов се исполнети, но не и вториот):
Влез: item.getPrice() = 400, item.getDiscount() = 0, item.getBarcode() = "012345"
Очекуван излез: Сумата се намалува за 30 поради специфичниот баркод.
_______________________________________________________________________________________________________
Тест случај за Комбинација 4 (Вториот и третиот услов се исполнети, но не и првиот):
Влез: item.getPrice() = 200, item.getDiscount() = 0.1, item.getBarcode() = "012345"
Очекуван излез: Сумата се зголемува за цената на артиклот без попуст.
___________________________________________________________________________________________
Комбинација 5 (Ниту еден од условите не е исполнет):
Влез: item.getPrice() = 200, item.getDiscount() = 0, item.getBarcode() = "123456"
Објаснување: Во овој случај, ниту еден од условите не е исполнет. Цената на артиклот е помала или еднаква на 300, попустот е 0, 
а баркодот не започнува со ‘0’. Сумата се зголемува за цената на артиклот без попуст.


_______________________________________________________________________________________________________________________________

