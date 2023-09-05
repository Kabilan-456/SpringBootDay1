import { React } from 'react';
import './navbar.css';
import Admin from './admin';
import {User} from './user';
import  Hotel from './hotel';
import Delete from './delete';
import Update from './update';
import {BrowserRouter, Route, Routes, Link} from 'react-router-dom';

function Nav() {
  
    return (
      <div className="nav">
      <BrowserRouter>
      <Link to="/"><button id="hb">Home</button></Link> &nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/User"><button id="hb">User</button></Link>&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/Hotel"><button id="hb">Hotel</button></Link>&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/Admin"><button id="hb">Admin</button></Link><br></br>
      <Routes>
         <Route exact path='/User' element={<User/>}></Route>
         <Route exact path='/Admin' element={<Admin/>}></Route>
         <Route exact path='/Hotel' element={<Hotel/>}></Route>
         <Route exact path='/Update' element={<Update/>}></Route>
         <Route exact path='/Delete' element={<Delete/>}></Route>
      </Routes>
    </BrowserRouter>
    <div id="setup"></div>
      </div>
    )
  
  }
  
  export default Nav;