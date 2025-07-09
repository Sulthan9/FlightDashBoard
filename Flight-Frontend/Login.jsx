import { useState } from "react";
import { Link, useNavigate } from 'react-router-dom';
import axios from 'axios';


function Login(){
const [username ,setUsername] =useState(" ");
const[password, setPassword]=useState(" ");
const navigate = useNavigate();
 
   const login = (e) =>{
      e.preventDefault();
      axios.get(`http://localhost:9090/user/login/${username}`).then((res)=>{
          if(res.data.password===password){
            navigate("/Dashboard");
          }
          else{
            alert("Invalid credentials");
          }
      })
      .catch((error) => {
        console.error("Login failed:", error);
        alert("User not found or server error");
      });
   };
   return(
    <div>
        <div>
            <div>
                <form onSubmit={login}>
                    <h2> Welcome  Login </h2>
                    <div>
                      <label htmlFor="uname">Username</label> <br></br>
                    <input type="text"  placeholder="Enter your username" value={username} onChange={(e)=>setUsername(e.target.value)} required /> <br></br>
                    <label htmlFor="pwd">Password</label><br></br>
                    <input type="password" placeholder="Enter Password" value={password}onChange={(e)=>setPassword(e.target.value)} required /><br></br>
                    <input type="submit"/><br></br>
                    </div>

                </form>
            </div>
        </div>
    </div>

   );

}
export default Login;