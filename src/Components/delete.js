import React, { Component } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import './navbar.css';
class Delete extends Component {
  constructor(props) {
    super(props);
    this.state = {
    id: ''
    };
  }

  handleIdChange = (event) => {
    this.setState({ id: event.target.value });
  };

  handleDelete = (event) => {
    event.preventDefault();
    axios.delete(`http://localhost:8091/deletebooking/${this.state.id}`);
  };

  render() {
    return (
      <body>
      <form onSubmit={this.handleDelete}>
      <br/><br/><br/><label>Id</label><br/><br/>
        <input
          type="number"
          value={this.state.id}
          onChange={this.handleIdChange}
        /><br/><br/>

       <Link to="/"><button >Back</button></Link>
      
      </form></body>
    );
  }
}

export default Delete;