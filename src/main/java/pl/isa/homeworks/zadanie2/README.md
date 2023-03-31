## Zadanie 2 - dzieła kultury

Przed Tobą aplikacja zawierająca listę dzieł kulturowych, lecz nie ma ona jeszcze żadnych danych. Twoim zadaniem jest stworzenie klas reprezentujących typ dzieła kulturowego oraz dodanie dzieł do listy tak, aby mogły zostać wypisane przez aplikację.

1. Stwórz co najmniej 2 klasy reprezentujące jakiś typ dzieła kulturowego (np. Painting, Music, Movie, itp.) dziedziczące po klasie **CulturalPiece**.
2. Dla każdej klasy stwórz konstruktor, który będzie pozwalał na stworzenie dzieła podając jego tytuł i autora. Zwróć uwagę na konstruktor znajdujący się w klasie **CulturalPiece**.
3. W co najmniej 1 klasie nadpisz metodę **getCreatedBy()** tak, aby odpowiadała czynności, dzięki której powstało dane działo (np. Painting -> Painted by, Movie -> Composed by, itp.).
4. Zaimplementuj metodę **getExperiences()**, aby zwracała wartości odpowiadające temu, w jaki sposób można doświadczyć tego dzieła (np. Movie -> watching, listening, itp.).
5. Do listy **culturalPieces** dodaj co najmniej 5 dzieł 2 różnych typów tak, aby zostały poprawnie wypisane przez pętle w funkcji main.

##### Organizacja repozytorium do wykonania ćwiczenia:
- zaktualizuj swojego aktualnego brancha nowymi commitami z brancha **main**
- stwórz nowego brancha o tej samej nazwie co istniejący z dopiskiem **-zad2**
- po zakończonym zadaniu utwórz pull request z brancha z zadaniem drugim, do Twojego wcześniejszego brancha
- po stworzeniu PRa, oznacz mnie jako reviewera i daj znać na Slacku ;)

**Powodzenia!**

### Dla chętnych
Daj użytkownikowi możliwość wprowadzania nowych dzieł kulturowych. Użytkownik powinien mieć wybór typu dzieła na podstawie wszytkich klas, które utworzyłeś.
Możesz pokusić się o stworzenie prostego menu, które ma co najmniej 2 opcje: wyświetlenie listy wszystkich dzieł i dodanie nowego dzieła.
