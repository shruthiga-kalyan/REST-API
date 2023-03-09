import React, { useState } from "react";
import axios from "axios";

const EditPassengerModal = ({ passenger, onClose, onSave }) => {
  const [name, setName] = useState(passenger.name);
  const [age, setAge] = useState(passenger.age);
  const [mob, setMob] = useState(passenger.mob);
  const [start, setStart] = useState(passenger.start);
  const [dest, setDest] = useState(passenger.dest);
  const [train, setTrain] = useState(passenger.train);

  const handleSave = () => {
    const editedPassenger = {
      ...passenger,
      name,
      age,
      mob,
      start,
      dest,
      train,
    };

    axios
      .put(`http://localhost:8080/updatePassenger/${passenger.id}`, editedPassenger)
      .then((response) => {
        onSave(editedPassenger);
        onClose();
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <div className="modal">
      <div className="modal-content">
        <h2>Edit Passenger Information</h2>
        <form>
          <div>
            <label htmlFor="name">Name:</label>
            <input type="text" id="name" value={name} onChange={(e) => setName(e.target.value)} />
          </div>
          <div>
            <label htmlFor="age">Age:</label>
            <input type="text" id="age" value={age} onChange={(e) => setAge(e.target.value)} />
          </div>
          <div>
            <label htmlFor="mob">Mobile:</label>
            <input type="text" id="mob" value={mob} onChange={(e) => setMob(e.target.value)} />
          </div>
          <div>
            <label htmlFor="start">Start:</label>
            <input type="text" id="start" value={start} onChange={(e) => setStart(e.target.value)} />
          </div>
          <div>
            <label htmlFor="dest">Destination:</label>
            <input type="text" id="dest" value={dest} onChange={(e) => setDest(e.target.value)} />
          </div>
          <div>
            <label htmlFor="train">Train:</label>
            <input type="text" id="train" value={train} onChange={(e) => setTrain(e.target.value)} />
          </div>
        </form>
        <div className="modal-actions">
          <button onClick={handleSave}>Save</button>
          <button onClick={onClose}>Cancel</button>
        </div>
      </div>
    </div>
  );
};

export default EditPassengerModal;
