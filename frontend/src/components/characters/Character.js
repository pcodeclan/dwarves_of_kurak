import React, {Fragment} from 'react';



const Character = ({character}) => {

  if(!character){
    return "no gas..."
  }
  return (
    <Fragment>
      <h2>Name:{character.name}</h2>
      <p>BackStory:{character.backStory}</p>
      <p>Race:{character.race}</p>
      <p>Coins:{character.coinPurse}</p>
      <p>HP:{character.hitPoints}</p>
      <p>Intelligence:{character.intelligence}</p>
      <p>Strength:{character.strength}</p>
      <p>MP:{character.manaPoints}</p>
    </Fragment>
  )

}

export default Character;
