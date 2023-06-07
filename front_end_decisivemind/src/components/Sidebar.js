import React from "react";
import logo from "./logo.png";
import { Card, Typography, List, ListItem, ListItemPrefix, ListItemSuffix, Chip, Accordion, AccordionHeader, AccordionBody } from "@material-tailwind/react";
import { PresentationChartBarIcon, ShoppingBagIcon, UserCircleIcon, CogIcon, InboxIcon, LogoutIcon } from "@heroicons/react/outline";
import { ChevronRightIcon, ChevronDownIcon } from "@heroicons/react/outline";

export default function Sidebar() {
  const [open, setOpen] = React.useState(0);
  const [selectedPage, setSelectedPage] = React.useState("");

  const handleOpen = (value, pageName) => {
    setOpen(open === value ? 0 : value);
    handlePageSelect(pageName);
  };

  const handlePageSelect = (pageName) => {
    setSelectedPage(pageName);
  };

  return (
    <Card className="fixed top-4 left-4 h-[calc(100vh-2rem)] w-full max-w-[20rem] p-4 shadow-xl shadow-blue-gray-900/5">
      <div className="mb-2 p-4">
        <img src={logo} alt="DecisiveMind Logo" className="logo" />
        <Typography color="black" variant="h5" style={{ fontWeight: "bold" }}>
          DecisiveMind IA
        </Typography>
      </div>
      <div className="flex flex-col justify-between h-[calc(100%-6rem)]">
        <div>
          <List>
            <Accordion
              open={open === 1}
              icon={
                <ChevronDownIcon
                  strokeWidth={2.5}
                  className={`mx-auto h-4 w-4 transition-transform ${open === 1 ? "rotate-180" : ""}`}
                />
              }
            >
              <ListItem className={`p-0 mb-5 ${selectedPage === "Home" ? "active" : ""}`}>
                <a href="#" onClick={() => handlePageSelect("Home")}>
                  <Typography color="blue-gray" className="mr-auto font-normal">
                    Home
                  </Typography>
                </a>
              </ListItem>
            </Accordion>
            <Accordion
              open={open === 2}
              icon={
                <ChevronDownIcon
                  strokeWidth={2.5}
                  className={`mx-auto h-4 w-4 transition-transform ${open === 2 ? "rotate-180" : ""}`}
                />
              }
            >
              <ListItem className={`p-0 mb-5 ${selectedPage === "Conflict Resolution" ? "active" : ""}`}>
                <a href="#" onClick={() => handlePageSelect("Conflict Resolution")}>
                  <Typography color="blue-gray" className="mr-auto font-normal">
                    Conflict Resolution
                  </Typography>
                </a>
              </ListItem>
            </Accordion>
            <Accordion
              open={open === 3}
              icon={
                <ChevronDownIcon
                  strokeWidth={2.5}
                  className={`mx-auto h-4 w-4 transition-transform ${open === 3 ? "rotate-180" : ""}`}
                />
              }
            >
              <ListItem className={`p-0 mb-5 ${selectedPage === "Give us your feedback" ? "active" : ""}`}>
                <a href="#" onClick={() => handlePageSelect("Give us your feedback")}>
                  <Typography color="blue-gray" className="mr-auto font-normal">
                    Give us your feedback
                  </Typography>
                </a>
              </ListItem>
            </Accordion>
            <hr className="my-2 border-blue-gray-50" />
          </List>
        </div>
        <div >
          <List>
            <ListItem>
              <ListItemPrefix>
                <InboxIcon className="h-5 w-5 mb-5" />
              </ListItemPrefix>
              <a href="#">
                <Typography  className=" mb-5"  color="blue-gray">Contact Us</Typography>
              </a>
              <ListItemSuffix></ListItemSuffix>
            </ListItem>
            
            <ListItem>
              <ListItemPrefix>
                <CogIcon className="h-5 w-5 mb-5" />
              </ListItemPrefix>
              <a href="#">
                <Typography className=" mb-5" color="blue-gray">Settings</Typography>
              </a>
            </ListItem>
            <ListItem>
              <ListItemPrefix>
                <LogoutIcon className="h-5 w-5 mb-5" />
              </ListItemPrefix>
              <a href="#">
                <Typography className=" mb-5" color="blue-gray">Log Out</Typography>
              </a>
            </ListItem>
          </List>
        </div>
      </div>
    </Card>
  );
}
