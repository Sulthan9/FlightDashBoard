import Login from "./Login";
import { BrowserRouter, Route, Routes } from "react-router-dom";


function App() {
  return (
    <div className="App">
     <BrowserRouter>
      <Routes> 
        <Route path="/" exact element={<Login />}> </Route>    
      </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
