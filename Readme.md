**Schinkenbrot** ist ein Projekt des **Info-LKs** der _Internatsschule Schloss Hansenberg_ und soll mit Hilfe von aktivem, praxisorientierten Unterricht mit dem Schwerpunkt Software Development die Unterrichtsinhalte unterstützen und vorgeben. Außerdem ist nicht die Geschwindigkeit der Entwicklung Hauptaugenmerk, sondern der Lerneffekt und der tiefe Einblick in das Software Development.

Das Projekt soll für die Platform **Android** _(AOSP and Deployer ROMs)_ entwickelt werden, wobei hauptsächlich **Android 5+** _(Lollipop)_ anvisiert wird, wobei auch die Möglichkeit der Verwendung unter **Android 4.4** _(KitKat)_ und **Android 6** _(Marshmallow)_ optimiert werden soll, wobei dies von niedrigerer Priorität ist. Als Programmierumgebung wird **Android Studio** zusammen mit dem _Android-SDK_ verwendet. Außerdem wird für die Realisierung einer _Datenbank_ eine **MySQL-Datenbank** genommen.

Das Spiel gehört den Genres _"Escape Room"_, _"Schnitzeljagd"_ und _"Geocaching"_ an. Unter-Genre ist vor allem das sogenannte **"Crossed-Reality"**. Eine Entwicklung für weitere Plattformen ist erst einmal nicht vorgesehen.

---

Das Projekt ist in vier Teilprojekte gegliedert, was man auch an den vier verschiedenen **Branches** des Repositorys sehen kann:

- Das erste Teilprojekt befasst sich mit dem Spiel selbst. Dabei soll hauptsächlich ein Escape-Room Spiel realisiert werden, das Aufgaben stellt, und für den Fortschritt im Spiel eine Lösung erfordert, die die unmittelbare Realität implementiert. Einige Anregungen für die Lösung der Aufgabe sind z.B. _QR-Codes, NFC-Chips, etc._, wobei auch die pben genannten Genres wie _"Schnitzeljagd"_ zustande kommen.
- Das zweite Teilprojekt beinhaltet den Editor. Dies soll einen Editor darstellen, der ein individuelles Design ermöglicht und fordert. Mit diesem Modul ist es dem Anwender möglich Level mit Aufgaben und entsprechenden Lösungen zu stellen, wobei auch die Arte der Lösung (wie oben schon vorgeschlagen) ausgewählt werden kann.
- Das dritte Teilprojekt ist die Schnittstelle zwischen den zwei oben genannten Teilen. Dies beinhaltet Punkte wie _Datenbanken_, sowie Deployment Optionen wie _Google Play_.
- Das letzte Teilprojekt ist im Branch _Preparation_ enthalten. Es stellt die Vorbereitung einer Spielesession dar. Dies könnte z.B. etwas sein wie **QR-Codes** ausdrucken, Zettel mit **Codes** verteilen, **NFC-Tags** beschreiben, etc. sein.

##### _Weiter wird hier nicht auf die einzelnen Teilprojekte eingegangen. Für detailliertere Optionen wird empfohlen sich den entsprechenden Wiki-Artikel anzusehen._ #####
---
Dem aufmerksamen Beobachter wird aufgefallen sein, dass es noch einen fünften Zweig gibt, nämlich _Education_. Dieser Teil beinhaltet die Vorbereitung und Nachbereitung der Unterrichtsinhalte.