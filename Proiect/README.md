Proiectul simuleaza "background"-ul aplicatiei Netflix.

Definirea claselor:

Package: Membership -CreditCard: contine informatii privind cardul de credit -Plans: contine informatii privind tipul de abonament: - Basic (1 utilizator, 1 monitor, 8.9 $, SD) - Standard (2 utilizatori, 2 monitoare, 12.99$, HD) - Premium (4 utilizatori, 4 monitoare, 15.99$, HD/4K UltraHD)
Client: - contine informatii necesare crearii unui cont - contine un obicet de tiup CardCredit - contine un obicet de tiup Plans
2.Package: Shows

Commands: contine 3 variabile cu privire la momentul din film asupra caruia putem efectua modificari => skip, resume, back, pause, refresh
Episodes: contine informatii generale despre un episod + suprascrierea fucntiilor din Commands
Films: contine informatii generale despre film + suprascriere de functii din Commands
MiniSeries: contine informatii generale despre serie + un ArrayList de episoade
Seasons: contine informatii generale despre sezon + un ArrayList cu episoade
Series: contine informatii generale despre serial + un ArrayList cu sezoane
MyList - contine 3 ArrayList-uri: Films, MiniSeries, Series
Package: viewMode
DesktopApplication: contine informatii privind detaliile necesare unei aplicatii instalate pe un calcuator/laptop + un element de tip MyList + un ArrayList de clienti
MobileApplication: contine informatii privind detaliile necesare unei aplicatii instalate pe un mobil + un element de tip MyList + un ArrayList de clienti (+o tentativa de a afisa o notificare periodic: planuiesc sa afiseze un tip de show)
Web: contine informatii privind detaliile necesare unei aplicatii web + un element de tip MyList + un ArrayList de clienti

Informatiile sunt citite din fisiere de tipul CSV aflate in "src\\readwrite\\resource"
Clasele necesare citirii se afla in "src\\readwrite\\read".
Scrierea in fisierul "Audit" se face in "src\\readwrite\\write".

In main ddefinesc pentru fiecare tip de obicet (Films, Series, Miniseries) cate un ArrayList, in care stochez ulerior informatiile din fisierele CSV. Totodata in main creez si myList-ul format din datele citite.

