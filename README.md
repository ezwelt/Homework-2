# Homework-2-UzK
# Homework 2 - Object-Oriented Programming (OOP)

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)

Lösungen zu drei Aufgaben der objektorientierten Programmierung in Java. Entwickelt im Kurs **Weiterführende Konzepte der Programmierung** (SS 2025) an der *Abteilung Informatik, Software & System Engineering*.

## 📋 Aufgabenübersicht

### 1. 📚 Textbook Info System
- **Klassenhierarchie**: `Publication` → `Book` → `Textbook` mit überschriebenen `getInfo()`-Methoden.
- **Ausgabeformat**: Kombiniert Titel, Jahr, Autor und Fachgebiet (z. B. `Data Structures, published in 2020, by Jane Doe Subject: Computer Science`).

### 2. 📊 LibrarySystem
- **Speicherdiagramm**: Visualisierung von Stack/Heap, Objektreferenzen, vTables und Attributindizes.
- **Methodenanalyse**: Erklärung der Konsolenausgaben und Übersetzung von Methodenaufrufen mit statischen Indizes.
- **Kompilierungsfehler**: Identifikation nicht kompilierbarer Aufrufe (z. B. `u2.work()`).

### 3. 📧 Mailbox
- **Klassen**: `Mail` (speichert E-Mail-Daten) und `Inbox` (verwaltet Mails).
- **Features**: 
  - Formatierte Ausgabe von E-Mails und Headern.
  - Zählung ungelesener Nachrichten (`countUnread()`).
  - Indexprüfung in `open(int index)` zur Vermeidung von `IndexOutOfBoundsException`.

## 🛠 Technische Details
- **Sprache**: Java 21
- **Struktur**:
  - `Exercise1/`: Lösung zur Textbook-Hierarchie.
  - `Exercise2/`: Codeanalyse und Speicherdiagramm.
  - `Exercise3/`: Mailbox-Implementierung mit Beispielnutzung.
- **Tools**: IntelliJ IDEA oder Eclipse empfohlen.

## 🚀 Ausführung
1. Repository klonen:  
   `git clone https://github.com/ezwelt/Homework-2.git`
2. Projekt in der IDE importieren.
3. Hauptklassen ausführen:
   - Exercise 2: `LibrarySystem` (Konsolenanalyse).
   - Exercise 3: `Inbox` (Mailbox-Demo).

## 👤 Betreuung
- **Tutorin der Gruppe**: Dilara Günay  
- **Unterstützende Tutoren**:  
  Niklas Bockholt, Chiara Hafner, Alicja Bezpalko, Jiyan Alis, Simon Wolf  
- **Dozenten**:  
  Adrian Bajraktari ([GitHub](https://github.com/AdrianBajraktari))  
  Dr. Mersedeh Sadeghi ([GitHub](https://github.com/mersedehSa))  

## 🏛 Institution
**Universität zu Köln**  
Department Mathematik/Informatik, Abteilung Informatik  
Software & System Engineering 

## 📄 Lizenz
MIT License. Details siehe [LICENSE](LICENSE).
