## Zadanie 1 - zgadywanie liczby

Twoim zadaniem jest zaimplementowanie metod klasy obsługującej grę w zgadywanie liczby:
- **getIntro()** - metoda jest używana do powitania użytkownika, dodaj tu słowa zachęcające użytkownika do zagrania w grę, możesz także dodać inne szczegóły lub zasady gry;
- **isRunning()** - metoda odpowiedzialna za kontrolowanie rozgrywki, jeśli użytkownik zgadnie odpowiednią liczbę, metoda powinna zwrócić wartość pozwalającą na zakończenie programu;
- **getInstruction()** - metoda wywoływana przed każdym zgadnięciem użytkownika, zawrzyj tu informację, w jakim przedziale użytkownik powinien zgadywać liczbę (np. 1-10);
- **guessNumber()** - metoda otrzymuje wartość, jaką wprowadził użytkownik, więc powinna sprawdzić czy użytkownik trafił, podał zbyt niską lub zbyt wysoką liczbę i zwrócić odpowiedni komunikat.

Klasy **GuessNumberApp** nie powinieneś zmieniać, jest ona napisana tak, aby zapewnić odpowiednie funkcjonowanie aplikacji (przy założeniu poprawnego wprowadzania danych, patrz -> <em>dla chętnych</em>).
Klasa **GuessNumberGame**, oprócz podanych metod, powinna zapewne zawierać jakieś zmienne do przechowywania stanu gry. Będą one szczególnie użyteczne w metodach **isRunning()** i **guessNumber()**.

**Powodzenia!**

### Dla chętnych
1. Klasa GuessNumberApp obsługuje podstawową funkcjonalność wczytywania danych od użytkownika. Co się jednak stanie, kiedy zamiast liczby wpiszesz np. "abc"? Spróbuj zaimplementować jakiś mechanizm, który obsłuży błędy we wprowadzonych przez użytkownika danych.
2. Gra okazuje się niezwykle wciągająca i chcemy przyciągnąć użytkownika na dłuższy czas. Spróbuj dodać do aplikacji możliwość modyfikacji rozgrywki, np. poprzez określenie zakresu zgadywanych liczb, ograniczoną ilość możliwych zgadnięć, itp.
