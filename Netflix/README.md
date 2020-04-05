Proiectul simuleaza "background"-ul aplicatiei Netflix.

Definirea claselor:
1. Package: Membership
-CreditCard: contine informatii privind cardul de credit
-Plans: contine informatii privind tipul de abonament: - Basic (1 utilizator, 1 monitor, 8.9 $, SD)
                                                       - Standard (2 utilizatori, 2 monitoare, 12.99$, HD)
                                                       - Premium (4 utilizatori, 4 monitoare, 15.99$, HD/4K UltraHD)
- Client: - contine informatii necesare crearii unui cont
          - contine un obicet de tiup CardCredit
          - contine un obicet de tiup Plans

2.Package: Shows
- Commands: contine 3 variabile cu privire la momentul din film asupra caruia putem efectua modificari => skip, resume, back, pause, refresh
- Episodes: contine informatii generale despre un episod + suprascrierea fucntiilor din Commands
- Films: contine informatii generale despre film + suprascriere de functii din Commands
- MiniSeries: contine informatii generale despre serie + un ArrayList de episoade
- Seasons: contine informatii generale despre sezon + un ArrayList cu episoade
- Series: contine informatii generale despre serial + un ArrayList cu sezoane
- MyList - contine 3 ArrayList-uri: Films, MiniSeries, Series

3. Package: viewMode
- DesktopApplication: contine informatii privind detaliile necesare unei aplicatii instalate pe un calcuator/laptop + un element de tip MyList + un ArrayList de clienti
- MobileApplication: contine informatii privind detaliile necesare unei aplicatii instalate pe un mobil + un element de tip MyList + un ArrayList de clienti (+o tentativa de a afisa o notificare periodic: planuiesc sa afiseze un tip de show)
- Web: contine informatii privind detaliile necesare unei aplicatii web + un element de tip MyList + un ArrayList de clienti

-Netflix: contine cate un obicet din fiecare mod de vizualizare a aplicatiei, in constructor citesc din fisiere text date cu privire la tot ceea ce stocheaza fiecare tip de data
-Main: - am incercatsa citesc cate un onicet din tipurile de vizualizare, imi da eroare - mai lucrez la asta
       - initializez un obiect de tip Films si creez un meniu pentru acesta, putand alege una din operatiile din clasa Commands + afisarea obiectului
       

