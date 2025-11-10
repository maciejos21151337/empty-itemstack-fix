# Empty ItemStack Fix

Krótko:
- Ten mod zapobiega crashowi przy zapisie świata spowodowanemu kodowaniem pustych ItemStacków.
- Działa z Fabric 1.21.1 i JDK 17.

Jak zbudować (gotowe na GitHub Actions):
1. Wgraj pliki do repo (już to robisz).
2. Wejdź w zakładkę **Actions** i poczekaj na uruchomienie workflow "Build EmptyItemStack Fix" (powinien uruchomić się automatycznie po push).
3. Po zakończeniu workflow pobierz artefakt `empty-itemstack-fix` — w środku będzie JAR (build/libs/*.jar).
4. Skopiuj JAR do folderu `mods` używanego przez Twój profil Fabric i uruchom grę.

Uwaga:
- To szybki hotfix. Jeśli któryś mod zapisuje nieprawidłowe dane, lepiej naprawić tamten mod, ale ten mod powinien zapobiec crashowi podczas zapisu świata.
