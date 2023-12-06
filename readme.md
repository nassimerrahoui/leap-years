# Leap Years

Source : https://codingdojo.org/kata/LeapYears/

Ce Kata doit être réalisé en binôme en utilisant le développement piloté par les tests (Test Driven Development - TDD).

## User Story

En tant qu'utilisateur, je souhaite savoir si une année est bissextile, afin de pouvoir prévoir un jour supplémentaire le 29 février de cette année-là.

### Critères d'acceptation

1. Toutes les années divisibles par 400 **SONT** des années bissextiles (par exemple, 2000 était bien une année bissextile),
2. Toutes les années divisibles par 100 mais pas par 400 ne sont **PAS** des années bissextiles (ainsi, par exemple, 1700, 1800 et 1900 n'étaient **PAS** des années bissextiles, et 2100 ne sera **PAS** une année bissextile),
3. Toutes les années divisibles par 4 mais pas par 100 **SONT des années bissextiles** (par exemple, 2008, 2012, 2016),
4. Toutes les années non divisibles par 4 ne sont **PAS** des années bissextiles (par exemple 2017, 2018, 2019).

## Histoire

Avant 1582, le calendrier julien était largement utilisé et définissait les années bissextiles comme toutes les années divisibles par 4.
Cependant, à la fin du XVIe siècle, on s'est aperçu que l'année civile s'était écartée de l'année solaire d'environ 10 jours.
Le calendrier grégorien a été défini afin de réduire le nombre d'années bissextiles et d'aligner plus étroitement l'année civile sur l'année solaire.
Il a été adopté dans les pays pontificaux le 15 octobre 1582, sautant 10 jours de la date du calendrier julien. Les pays protestants ont adopté le calendrier grégorien après un certain temps.
Le calendrier grégorien est assez précis, mais il pourrait l'être davantage en ajoutant une règle supplémentaire qui éliminerait les années divisibles par 4 000 en tant qu'années bissextiles.
Mais je suppose que nous traverserons ce pont lorsque nous y parviendrons.
Envisagez d'ajouter cette règle dans un deuxième article pour prolonger l'exercice.