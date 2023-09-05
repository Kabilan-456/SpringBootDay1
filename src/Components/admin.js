import {Component, React} from "react";
import axios from 'axios';
import "./navbar.css";
import Update from "./update";
import { Link } from "react-router-dom";
export default class Admin extends Component{
    state = {
        data: [],
        update: false,
        id:''
        }
       
        
        componentDidMount() {
        axios.get("http://localhost:8091/getbooking")
          .then(response => {
            this.setState({ data: response.data });
          })
          .catch(error => {
            console.log(error);
          });
      }
      
     

      handleDelete = (event) => {
        event.preventDefault();
        axios.delete(`http://localhost:8091/deletebooking/${this.state.id}`);
        alert("Deleted Successfully");
      };

        render() {   
          return (
            <div>
            <br></br><br></br><br></br><br></br><br></br>
            <table border={1}>
            <thead>
              <tr>
                <th id="hh">Id</th>
                <th id="hh">Customer Name</th>
                <th id="hh">City</th>
                <th id="hh">Hotel</th>
                <th id="hh">No of rooms</th>
                <th id="hh">Room type</th>
                <th id="hh">Day In</th>
                <th id="hh">Day out</th>
                <th id="hh">Phone number</th>
                <th id="hh">Mail</th>
              </tr>
            </thead>
            <tbody>
              {this.state.data.map(user => (
                <tr key={user.id}>
                  <td id="hh">{user.id}</td>
                  <td id="hh">{user.custname}</td>
                  <td id="hh">{user.city}</td>
                  <td id="hh">{user.hotel}</td>
                  <td id="hh">{user.noofrooms}</td>
                  <td id="hh">{user.roomtype}</td>
                  <td id="hh">{user.dayin}</td>
                  <td id="hh">{user.dayout}</td>
                  <td id="hh">{user.phno}</td>
                  <td id="hh">{user.mailid}</td>
                </tr>
              ))}
            </tbody>
          </table>
          <br></br><br></br><br></br>
          <input type="number" value={this.state.id} onChange={(e)=>{this.setState({id:e.target.value})}} id="title"/><br></br><br></br>
          <button onClick={this.handleDelete} id="hb">Delete</button><br></br><br></br>
          <Link to="/Update"><button id="hb">Update</button></Link>
          </div>

          );
        }
}