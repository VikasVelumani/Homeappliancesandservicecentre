import React,{useState} from 'react'
import "./UserCard.css";
import *as Falcons from "react-icons/fa";
import img from "./Images/appliances.png.jpg"
import { IconButton } from '@mui/material';
import {Link} from 'react-router-dom';
import "./back.css";

export default function UserCard() {
    const [detail,setDetail] = useState(false);
    
  return (
    <div>
        <header className='head'>Welcome to Appliances Service Center</header>
    <div className='main center'>
        <div className='box center'>
            <img src={img} alt='Weeee'/>
            <div>
                <p className='appname center'>Servicecenter</p>
                <p className='status center'>© 2023</p>
            </div>
            <div className='arrow center' onClick={() => setDetail(true)}>
                <Falcons.FaArrowRight className='fas'/>
            </div>
            <div className={detail ? 'left_container active' :'left_container off'}>
                <p><Falcons.FaSearch/> Search</p>
                <div className='searchs'>
                     
                        <div>
                            <button className='butt'><Link to='/add' className='butt-link'>Add</Link></button>
                        </div>
                        <div>
                            <button className='butt'><Link to='/update' className='butt-link'>Update</Link></button>
                        </div>
                        <div>
                            <button className='butt'><Link to='/delete' className='butt-link'>Delete</Link></button>
                        </div>
                        <div>
                            <IconButton className='butt'>
                                <Link to='/show' className='butt butt-link'>
                                    <Falcons.FaEye/>
                                </Link>
                            </IconButton>
                        </div>
                       
                </div>
                <div className='icons'>
                    <IconButton className='fab' href="https://github.com/VikasVelumani">
                        <Falcons.FaGithub/>
                    </IconButton>
                    <IconButton className='fab' href="https://www.linkedin.com/in/vikas-v-25945a251">
                        <Falcons.FaLinkedin/>
                    </IconButton>
                    <IconButton className='fab' href="https://www.instagram.com/iam__brucewayne__/">
                        <Falcons.FaInstagram />
                    </IconButton>
                </div>
                <div>
                    <div className='cancel center'  onClick={() => setDetail(false)}>
                        <Falcons.FaTimes className='faS'/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
)
}