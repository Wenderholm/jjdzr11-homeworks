## Zadanie 3 - skrzynka z narzędziami

W tym zadaniu mamy obłsugę prostej skrzynki z narzędziami, która przechowuje narzędzia o podanej wielkości.
Twoim zadaniem jest zaimplementować niektóre metody tak, aby zapewnić prawidłowe funkcjonowanie aplikacji.

**Tool**
- czegoś tu brakuje, żeby wczytywanie JSONa działało prawidłowo.

**ToolkitApp**
- popraw wczytywanie opcji od użytkownika, aby reagować odpowiednio na niepoprawnie wprowadzoną opcje (lub zaimplementuj to inaczej),
- dodaj możliwość wyszukiwania narzędzi po nazwie (wczytaj wartość od użytkownika i znajdź narzędzia, które zawierają dany ciąg znaków w nazwie lub wyświetl adekwatny komunikat, jeśli żadne nie ma),
- zaimplementuj dodawanie nowych narzędzi do skrzynki (nie zapomnij o sprawdzaniu poprawności wprowadzanych danych i o wyświetlaniu komunikatu, jeśli nie udało się zapisać narzędzia).

**ToolkitController**
- zaimplementuj sprawdzenie, czy skrzynka jest pusta,
- dodaj wczytywanie danych z pliku JSON, który znajduje się w **resources/toolkit.json**,
- analogicznie dodaj zapisywanie zaktualizowanej listy w tym samym pliku i zwróć true, jeśli udało się zapisać lub false, jeśli się nie udało.

##### Organizacja repozytorium do wykonania ćwiczenia:
- zaktualizuj swojego aktualnego brancha nowymi commitami z brancha **main** - nie zapomnij tym razem o tym ;)
- stwórz nowego brancha o tej samej nazwie co istniejący z dopiskiem **-zad3**
- po zakończonym zadaniu utwórz pull request z brancha z zadaniem trzecim, do Twojego głównego brancha
- po stworzeniu PRa, oznacz mnie jako reviewera i daj znać na Slacku ;)

**Powodzenia!**

### Dla chętnych
1. Rozszerz klasę **Tool** o listę czynności, które można wykonać danym narzędziem. Dla nowo dodanego narzędzia, powinienem móc dodać dowolną ilości czynności, jakie mogę nim wykonać. Nie zapomnij dodać ich do już istniejących narzędzi w pliku JSON i napisz, w jaki sposób to zrobiłaś/eś ;)
2. Dodaj możliwość zliczania narzędzi, np. chciałbym wiedzieć ile mam młotków w skrzynce. Może uda Ci się zaimplementować to uwzględniając nie tylko nazwę, ale i też rozmiar ;)
