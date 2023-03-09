import React, { useState } from "react";
import axios from "axios";

const Post = () => {
  const [formData, setFormData] = useState({
    id: "",
    name: "",
    age: "",
    mob: "",
    start: "",
    dest: "",
    train: "",
    
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.post("http://localhost:8080/addPassenger", formData)
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
      <div>
        <label htmlFor="name">Name:</label>
        <input type="text" id="name" name="name" onChange={handleChange} />
      </div>
      <div>
        <label htmlFor="age">Age:</label>
        <input type="text" id="age" name="age" onChange={handleChange} />
      </div>
      <div>
        <label htmlFor="mob">Mobile:</label>
        <input type="text" id="mob" name="mob" onChange={handleChange} />
      </div>
      <div>
        <label htmlFor="start">Start:</label>
        <input type="text" id="start" name="start" onChange={handleChange} />
      </div>
      <div>
        <label htmlFor="dest">Destination:</label>
        <input type="text" id="dest" name="dest" onChange={handleChange} />
      </div>
      <div>
        <label htmlFor="train">Train:</label>
        <input type="text" id="train" name="train" onChange={handleChange} />
      </div>
      <div>
        <label htmlFor="datee">Date:</label>
        <input type="text" id="datee" name="datee" onChange={handleChange} />
      </div>
      <button type="submit">Submit</button>
    </form>
  );
};

export default Post;
