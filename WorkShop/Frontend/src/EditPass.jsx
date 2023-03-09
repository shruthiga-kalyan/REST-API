import React,{Component} from "react";

class EditPass extends Component {
    state = {
      name: this.props.passenger.name,
      age: this.props.passenger.age,
      mob: this.props.passenger.mob,
      start: this.props.passenger.start,
      dest: this.props.passenger.dest,
      train: this.props.passenger.train,
    };
  
    handleChange = (event) => {
      this.setState({
        [event.target.name]: event.target.value,
      });
    };
  
    handleSubmit = (event) => {
      event.preventDefault();
      const updatedPassenger = {
        id: this.props.passenger.id,
        name: this.state.name,
        age: this.state.age,
        mob: this.state.mob,
        start: this.state.start,
        dest: this.state.dest,
        train: this.state.train,
      };
      this.props.onUpdate(updatedPassenger);
    };
  
    render() {
      return (
        <form onSubmit={this.handleSubmit}>
          <label>
            Name:
            <input
              type="text"
              name="name"
              value={this.state.name}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <label>
            Age:
            <input
              type="number"
              name="age"
              value={this.state.age}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <label>
            Mobile:
            <input
              type="text"
              name="mob"
              value={this.state.mob}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <label>
            Start:
            <input
              type="text"
              name="start"
              value={this.state.start}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <label>
            Destination:
            <input
              type="text"
              name="dest"
              value={this.state.dest}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <label>
            Train:
            <input
              type="text"
              name="train"
              value={this.state.train}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <button type="submit">Save</button>
          <button onClick={this.props.onCancel}>Cancel</button>
        </form>
      );
    }
  }
  