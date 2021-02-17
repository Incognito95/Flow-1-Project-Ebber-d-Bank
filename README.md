# Flow 1 Project: Ebberød Bank

Vi er nu kommet igennem de første 2 ugers undervisning på 2. semester, og skal for alvor til at bruge det vi har lært og genopfrisket. Dvs,

- Git og Github
- Objektorienteret Programmering
- Unit-Test
- Databaser
- Krav og User stories
- Samarbejde i gruppe

### **Her er det praktiske:**

Aflevering: torsdag den 18. februar kl. 15:00.

Hvor: På Moodle (her)

Følgende skal afleveres pr. gruppe:

1. Et link til Github, hvor jeres kode ligger
2. Et pdf-dokument med følgende indhold:
    1. Et use-case diagram
    2. En liste med jeres user stories og acceptkriterier
    3. En kort status over hvor langt I nået (hvilke user stories har I implementeret)
    4. Et EER-diagram over jeres database
    5. En kort reflektion over hvordan det er gået med projektet. Kunne I finde ud af at bruge Git? Kunne I finde ud af arbejde sammen. Hvad der noget I evt. vil gøre anderledes næste gang?

### **Her er opgaveteksten:**

**Funktionelle krav:**

Ebberød Bank ønsker at få udviklet en prototype til deres bank. Det skal være et simpelt Proof Of Concept, hvor man kan eksperimentere med en række funktionaliteter. Først og fremmest skal der være nogle kunder og hver kunde skal have en enkelt konto tilknyttet. Man skal kunne indsætte beløb på sin konto, hæve beløb og der må ikke kunne overtrækkes. Man skal også kunne lave en kontoudskrift med alle transaktioner på sin konto.

De ansatte i banken skal også kunne overføre beløb fra en konto til en anden. Igen må man ikke overtrække.

Her er et udkast til en domænemodel, som vi fandt på en krøllet serviet efter det første kundemøde:

![https://i.imgur.com/IeeBdNB.jpg](https://i.imgur.com/IeeBdNB.jpg)

I første omgang behøver man ikke at kunne logge på systemet, men på 
længere sigt skal man som kunde kunne logge på og se sin egen konto og 
kontoudskrift, og de ansatte i banken skal kunne se alles konti og 
overføre beløb mellem kundernes konti.

Hvis I selv kan finde på flere smarte funktionaliteter, så fyld bare på. F.eks:

- Vis en liste med alle kunder - fx sorteret efter navn
- Vis en liste med alle konti - fx sorteret efter beløbets størrelse
- Giv alle konti en bonus på 5%
- Find den transaktion med den største bevægelse

**Ikke-funktionelle krav:**

1. Det det bare er en Proof of Concept applikation, er det okay at alle pengebeløb representeres ved heltal.
2. Brugergrænsefladen skal bare kunne køre i terminalen.
3. Data skal persisteres i en MySql database
4. Programmet skal udvikles i Java og laves som et Maven projekt
5. I flow 2 arbejdede vi med en bank-applikation. I er velkomne til at
bruge koden som udgangspunkt, men er også velkomne til at begynde
forfra, hvis I vælger at bygge systemet på en anden måde.
6. I skal styre projektet via Projekt og Issues i Github. [Se evt. tutorial her.](https://cphbusiness.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=e887d535-f9e4-43e1-b8ba-acd000c11d34)

### Afleveringsstatus

Denne opgave accepterer afleveringer fra **torsdag, 17. februar 2021, 12:00**
