import React, { useState } from "react";
import axios from "axios";

const Delete = () => {
  const [id, setId] = useState("");

  const handleChange = (e) => {
    setId(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.delete(`http://localhost:8080/deletePassenger/${id}`)
      .then(res => {
        console.log(res);
      })
      .catch(err => {
        console.log(err);
      });
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="id">ID:</label>
        <input type="text" id="id" name="id" onChange={handleChange} />
      </div>
      <button type="submit">Delete</button>
    </form>
  );
};

export default Delete;
