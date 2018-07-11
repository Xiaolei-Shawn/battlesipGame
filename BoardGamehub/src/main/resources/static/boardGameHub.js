  const gameHub = document.getElementById("gameHub");
  async function executeIt() {
    const mapFunc = async (game) => {
      

      const levelItemElems = document.createElement('ul');

      const gameItemElem = document.createElement('li');
      const nameNode = document.createTextNode(game);
      gameItemElem.appendChild(nameNode);

      const lowLevelItemElem = document.createElement('li');
      const lowLevel = document.createTextNode("Low");
      const urlNodeLowLevel = document.createElement('a');
      urlNodeLowLevel.setAttribute("href", "/" + game.toLowerCase() + "/low");
      urlNodeLowLevel.appendChild(lowLevel);
      lowLevelItemElem.appendChild(urlNodeLowLevel);
      levelItemElems.appendChild(lowLevelItemElem);

      const mediumLevelItemElem = document.createElement('li');
      const mediumLevel = document.createTextNode("Medium");
      const urlNodeMediumLevel = document.createElement('a');
      urlNodeMediumLevel.setAttribute("href", "/" + game.toLowerCase() + "/medium");
      urlNodeMediumLevel.appendChild(mediumLevel);
      mediumLevelItemElem.appendChild(urlNodeMediumLevel);
      levelItemElems.appendChild(mediumLevelItemElem);

      const highLevelItemElem = document.createElement('li');
      const highLevel = document.createTextNode("High");
      const urlNodeHighLevel = document.createElement('a');
      urlNodeHighLevel.setAttribute("href", "/" + game.toLowerCase() + "/high");
      urlNodeHighLevel.appendChild(highLevel);
      highLevelItemElem.appendChild(urlNodeHighLevel);
      levelItemElems.appendChild(highLevelItemElem);

      gameItemElem.appendChild(levelItemElems);
      gameHub.appendChild(gameItemElem);
    }
    $.get('/', (games) => games.map(mapFunc));
  }
  executeIt();