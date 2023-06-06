import {
  Card,
  CardBody,
  CardFooter,
  Typography,
  Button,
} from "@material-tailwind/react";
import { RocketLaunchIcon } from "@heroicons/react/24/solid";
import { ArrowLongRightIcon } from "@heroicons/react/24/outline";

export default function Example() {
  return (

    <Card className="mt-6 w-11/12 h-96">
      <div className=" flex justify-center items-center h-screen w-full ">
        <h2 className="text-3xl font-bold text-blue-600">Here’s our suggestion</h2>
      </div>
      <CardBody>

        <Typography variant="h5" color="blue-gray" className="mb-2">

          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec mattis fringilla luctus. Aliquam rhoncus elementum vehicula.
          Nunc in mi ut dolor commodo semper. Vestibulum consectetur ex et ex commodo, sit amet dignissim arcu aliquet. Donec
          convallis in est sit amet condimentum.
        </Typography>
      </CardBody>

    </Card>
  );
}