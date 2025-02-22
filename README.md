# Gachamon
A javascript game that uses Spring, an H2 embedded database and JDBC data as a backend.

## Gameplay

<p align = "center">
  <img src = "https://i.imgur.com/MpOvGYW.png">
</p>

Once the executable is running the game can be accessed at `http://localhost:8080/wild.html`. The player can choose to catch a pokemon or to keep searching for a new one. The goal is to catch all 151 pokemon.
The pokemon that have been caught so far can be seen when clicking on the "POKEMON" button.
<p align = "center">
  <img src = "https://i.imgur.com/Vp9bZMt.png">
</p>

## Additional
The information about the existing pokemon and about the pokemon caught is stored in the H2 database. The front end communicates with the back end using POST and GET requests.

The executable can be downloaded [Here](https://github.com/iacobDelia/gachamon/releases/tag/v1.0.0). Because of the difference between the ways Chromium based browsers interpret Flex the site only displays properly on Firefox.


All the image assets used belong to Gamefreak and Nintendo.

