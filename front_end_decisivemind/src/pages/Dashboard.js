import Sidebar from "../components/Sidebar";
import Form from "../components/form";


export default function DashboardPage() {
  return (
    <>
      
      <div className="container" style={{ backgroundRepeat: "repeat", backgroundSize: "20%" }}>

        <div className="row">
          <Sidebar/>
          <Form/>
          

        </div>
      </div>
    </>
  );
}
