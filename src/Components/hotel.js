import axios from 'axios';
import React, { Component } from 'react'

export default class Hotel extends Component {

    constructor(props) {
        super(props);
        this.state = {
          id: '',       
          custname: '',
          city: '',
          hotel: '',
          noofrooms: '',
          roomtype: '',
          dayin: '',
          dayout:'',
          phno:'',
          mailid:''
        };
      }
      

      


    handleSubmit= (e)=>{
        e.preventDefault();
        
        const formData={
            id:this.state.id,
            custname :  this.state.custname ,
            city: this.state.city,
            hotel:   this.state.hotel,
            noofrooms:    this.state.noofrooms,
            roomtype:this.state.roomtype,
            dayin:     this.state.dayin,
          dayout:      this.state.dayout,
          phno:         this.state.phno,
          mailid:       this.state.mailid

        };
        
      axios.post("http://localhost:8091/addbooking",formData)
      .then(response => {
        console.log(response.data);
      })
      .catch(error => {
        console.error(error);
      })
      alert("Sucessfully Added")
  };

  render() {
    return (
      <div>
        <br/>
        <form onSubmit={this.handleSubmit} className="sign-form">
        <label id="hh">ID</label><br></br><br></br>
        <input type="number" value={this.state.id} onChange={(e)=>{this.setState({id:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Customer name</label><br></br><br></br>
        <input type="text" value={this.state.custname} onChange={(e)=>{this.setState({custname:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">City</label><br></br><br></br>
        <input type="text" value={this.state.city} onChange={(e)=>{this.setState({city:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Hotel Name</label><br></br><br></br>
        <input type="text" value={this.state.hotel} onChange={(e)=>{this.setState({hotel:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">No of Rooms</label><br></br><br></br>
        <input type="number" value={this.state.noofrooms} onChange={(e)=>{this.setState({noofrooms:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Room type</label><br></br><br></br>
        <input type="text" value={this.state.roomtype} onChange={(e)=>{this.setState({roomtype:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Day In</label><br></br><br></br>
        <input type="date" value={this.state.dayin} onChange={(e)=>{this.setState({dayin:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Day Out</label><br></br><br></br>
        <input type="date" value={this.state.dayout} onChange={(e)=>{this.setState({dayout:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Phone number</label><br></br><br></br>
        <input type="number" value={this.state.phno} onChange={(e)=>{this.setState({phno:e.target.value})}} id="title"/>
        <br/><br/>

        <label id="hh">Mail Id</label><br></br><br></br>
        <input type="email" value={this.state.mailid} onChange={(e)=>{this.setState({mailid:e.target.value})}} id="title"/>
        <br/><br/>

        <br/><br/>
        <button type="submit" id="hb">Submit</button>
        </form>
        
      </div>
    )
  }
}