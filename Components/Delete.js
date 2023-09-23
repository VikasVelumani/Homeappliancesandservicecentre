import React, { useState } from 'react';
import axios from 'axios';
import './Delete.css';
import * as Falcons from "react-icons/fa";
import { IconButton } from '@mui/material';
import { Link } from 'react-router-dom';

export default function Delete() {
  const [bookingid, setBookingId] = useState('');
  const [isSubmitted, setIsSubmitted] = useState(false);

  const handleButtonClick = () => {
    setIsSubmitted(!isSubmitted);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.delete(`http://localhost:8080/delete1/${bookingid}`)
      .then((response) => {
        // Handle success response if needed
        console.log('Delete request was successful', response);
      })
      .catch((error) => {
        // Handle error response if needed
        console.error('Error occurred:', error);
      });
  };

  return (
    <div className="App">
      <header className="App-header">
        <div>
          <IconButton className='but'>
            <Link to='/' className='butt butt-link'>
              <Falcons.FaHome />
            </Link>
          </IconButton>

          <IconButton className='but'>
            <Link to='/show' className='butt butt-link'>
              <Falcons.FaEye />
            </Link>
          </IconButton>
        </div>
        <div className="logInform">
          <form onSubmit={handleSubmit}>
            <p>Delete any Appliance id!</p>

            <input
              type="number"
              placeholder="Enter your Appliance id"
              value={bookingid}
              onChange={(e) => setBookingId(e.target.value)}
            />

            <div className="btncontainer">
              <button id="btn4" type="submit" onClick={handleButtonClick}>Delete</button>
              {isSubmitted && <p id="btn4-text" className="popup-message">Your id is Deleted Successfully!</p>}
            </div>
          </form>
        </div>
      </header>
    </div>
  )
}
