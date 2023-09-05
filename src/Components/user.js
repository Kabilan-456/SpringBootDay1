import React, { useState } from "react";
import { Link } from 'react-router-dom';
import "./navbar.css";
export const User = (props) => {
    const [username, setusername] = useState('');
    const [password, setpassword] = useState('');

    const handleLogin = (e) => {
        e.preventDefault();
    
        if (!username || !password) {
          alert('Please enter both email and password.');
          return;
        }

        const isLoginSuccessful = true;
    
        if (isLoginSuccessful) {
          alert('Login successful!');
          setusername('');
          setpassword('');
        } else {
          alert('Login failed. Please check your credentials.');
        }
        
      }; 

    return (
        <div>
            <h2 id="hh">LOGIN</h2><br></br><br></br>
            <form onSubmit={handleLogin}>
                <label htmlFor="text" id="hh">User Name</label><br></br><br></br>
                <input value={username} onChange={(e) => setusername(e.target.value)} id="title" type="text" /><br></br><br></br>
                <label htmlFor="password" id="hh">Password</label><br></br><br></br>
                <input value={password} onChange={(e) => setpassword(e.target.value)} id="title" type="password"/><br></br><br></br>
                <button onClick={handleLogin} id="hb"><Link  to="/Hotel">Login</Link></button>
            </form>
            
        </div>
    )
}