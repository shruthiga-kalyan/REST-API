import React,{Component} from "react";
import axios from "axios";
class Contents extends Component{
    constructor(props)
    {
        super(props);
        this.state={
        id:0,
        name:"",
        age:0,
        mob:0,
        start:'',
        dest:'',
        // datee:'',
        train:''
    };
    }
    handleIdChange = (event) =>{
        this.setState({ id : event.target.value});
    };
    handleNameChange = (event) =>{
        this.setState({ name : event.target.value});
    };
    handleAge = (event) =>{
        this.setState({ age : event.target.value});
    };
    handleMob = (event) =>{
        this.setState({ mob : event.target.value});
    };
    handleStart = (event) =>{
        this.setState({ start : event.target.value});
    };
    handleDest= (event) =>{
        this.setState({dest: event.target.value});
    };
    // handleDate = (event) =>{
    //     this.setState({ datee: event.target.value});
    // };

    handleTrain = (event) =>{
        this.setState({train: event.target.value});
    };

    handleSubmit = (event) => {
        event.preventDefault();
        const data ={
            id: this.state.id,
            name: this.state.name,
            age: this.state.age,
            mob: this.state.mob,
            start: this.state.start,
            dest: this.state.dest,
            train: this.state.train,
            datee: this.state.datee,
        };
        console.log(data);
        axios.post('http://localhost:8080/addPassenger',data)
    };

    render()
    {
        return(
            


            <form onSubmit={this.handleSubmit} className="Train" >

            <label className="login-label">Id</label>

                <input
                className="train"
                type="number"
                value={this.state.id}
                onChange={this.handleIdChange}
                />

            <br></br><br></br>
               <label className="login-label">Name</label>

               <input
               className="train"
               type="text"
               value={this.state.name}
               onChange={this.handleNameChange}
               />

               <br></br><br></br>

               <label className="login-label">Mobile</label>
               <input
               className="train"
               type="text"
               value={this.state.mobile}
               onChange={this.handleMob}
               />
                
                <br></br><br></br>

               <label className="login-label">Age</label>
               <input
               className="train"
               type="number"
               value={this.state.age}
               onChange={this.handleAge}
               />

<br></br><br></br>

               <label className="login-label">Start</label>
               <input
               className="train"
               type="text"
               value={this.state.start}
               onChange={this.handleStart}
               />

<br></br><br></br>

               <label className="login-label">Destination</label>
               <input
               className="train"
               type="text"
               value={this.state.dest}
               onChange={this.handleDest}
               />
{/* 
<br></br><br></br>

               <label className="login-label">Date</label>
               <input
               className="train"
               type="date"
               value={this.state.datee}
               onChange={this.handledatee}
               /> */}



<br></br><br></br>



               <label className="login-label">Train</label>
               <input
               className="train"
               type="text"
               value={this.state.train}
               onChange={this.handleTrain}
               />

<br></br><br></br>

               <button className="submitt" type="submit" id="asd">
                            Submit
               </button>
               <br></br><br></br>
               </form>
            
               );
               
    }
}
export default Contents;