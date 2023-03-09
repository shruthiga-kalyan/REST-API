import axios from "axios";
import React,{Component} from "react";
import './Table1.css';

import EditPassengerModal from "./EditPassengerModal";
class Table1 extends Component{
    state = {
        data:[]
    }

    componentDidMount(){
        axios.get('http://localhost:8080/getPassenger')
        .then(response =>{
            this.setState({
                data:response.data
                
            });
            console.log(response)
        })
        .catch(error =>{
            console.log(error);
        });
    }

    deletePassenger = (id) => {
        axios
          .delete(`http://localhost:8080/deletePassenger/${id}`)
          .then((response) => {
            console.log(response);
            this.setState({
              data: this.state.data.filter((passenger) => passenger.id !== id),
            });
          })
          .catch((error) => {
            console.log(error);
          });
      };

      handleEditClick = (passengerId) => {
        const passengerToEdit = this.state.data.find(
          (passenger) => passenger.id === passengerId
        );
        this.setState({
          showEditModal: true,
          editPassenger: passengerToEdit,
        });
      };
      
      handleEditSave = (editedPassenger) => {
        axios
          .put(
            `http://localhost:8080/updatePassenger/${editedPassenger.id}`,
            editedPassenger
          )
          .then((response) => {
            console.log(response);
            const updatedData = this.state.data.map((passenger) =>
              passenger.id === editedPassenger.id ? editedPassenger : passenger
            );
            this.setState({
              data: updatedData,
              showEditModal: false,
              editPassenger: null,
            });
          })
          .catch((error) => {
            console.log(error);
          });
      };
      
      render() {
        return (
          <>
            {/* render modal or form for editing passenger information */}
            {this.state.showEditModal && (
              <EditPassengerModal
                passenger={this.state.editPassenger}
                onSave={this.handleEditSave}
                onClose={this.handleEditClose}
              />
            )}
      
            <table>
              {/* render passenger data in a table */}
              {this.state.data.map((passenger) => (
                <tr key={passenger.id}>
                  <td>{passenger.id}</td>
                  <td>{passenger.name}</td>
                  <td>{passenger.age}</td>
                  <td>{passenger.mob}</td>
                  <td>{passenger.start}</td>
                  <td>{passenger.dest}</td>
                  <td>{passenger.train}</td>
                  <td>
                    <button onClick={() => this.handleEditClick(passenger.id)}>
                      Edit
                    </button>
                            <button onClick={() => this.deletePassenger(passenger.id)}>
                              Delete
                            </button>
                  </td>
                </tr>
              ))}
            </table>
          </>
        );
      }}
      
                          

export default Table1;
