import Prompt from "../components/card";
import Sidebar from "../components/Sidebar";



export default function ResultPage() {
  return (
    <>
      
      <div className="container" style={{ backgroundRepeat: "repeat", backgroundSize: "20%" }}>

        <div className="row">
            <Sidebar/>
          <Prompt/>
          
          

        </div>
      </div>
    </>
  );
}
