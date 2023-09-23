import React, { useState } from 'react';
import axios from 'axios';
import './Add.css';
import * as Falcons from "react-icons/fa";
import { IconButton } from '@mui/material';
import { Link } from 'react-router-dom';

function Add() {
  const [bookingname, setBookingname] = useState('');
  const [bookingid, setBookingid] = useState('');
  const [modname, setmodname] = useState('');
  const [prodname, setprodname] = useState('');
  const [desp, setDesp] = useState('');
  const [custnumber, setCustnumber] = useState('');
  const [isSubmitted, setIsSubmitted] = useState(false);

  const handleButtonClick = () => {
    setIsSubmitted(!isSubmitted);
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    axios.post('http://localhost:8080/post1', [{
      bookingid: bookingid,
      bookingname: bookingname,
      custnumber: custnumber,
      modname: modname,
      prodname: prodname,
      desp: desp
    }])
      .then((response) => {
        // Handle success response
        console.log('Request was successful', response);
      })
      .catch((error) => {
        // Handle error response
        console.error('Error occurred:', error);
      });
  }

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
        <div className="logIn-form">
          <form onSubmit={handleSubmit}>
            <p>Enter the Appliance id</p>
            <input
              type='number'
              placeholder='Appliance ID'
              value={bookingid}
              onChange={(e) => setBookingid(e.target.value)}
            />
            <p>Enter the Customer Name</p>
            <input
              type='text'
              placeholder='Customer Name'
              value={bookingname}
              onChange={(e) => setBookingname(e.target.value)}
            />
            <p>Enter the Product Name</p>
            <input
              type='text'
              placeholder='Product Name'
              value={prodname}
              onChange={(e) => setprodname(e.target.value)}
            />
            <p>Enter the Model Name</p>
            <input
              type='text'
              placeholder='Model Name'
              value={modname}
              onChange={(e) => setmodname(e.target.value)}
            />
            <p>Enter the Mobile No</p>
            <input
              type='text'
              placeholder='Mobile No'
              value={custnumber}
              onChange={(e) => setCustnumber(e.target.value)}
            />
            <p>Enter the Problem Description</p>
            <input
              type='text'
              placeholder='Problem Description'
              value={desp}
              onChange={(e) => setDesp(e.target.value)}
            />
            <div className="btn-container">
              <button id="btn4" type="submit" onClick={handleButtonClick}>Submit</button>
              {isSubmitted && <p id="btn4-text" className="popup-message">Added Successfully!</p>}
            </div>
          </form>
        </div>
      </header>
    </div>
  );
}

export default Add;
