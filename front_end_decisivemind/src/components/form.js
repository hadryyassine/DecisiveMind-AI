import { PhotoIcon, UserCircleIcon } from '@heroicons/react/24/solid';
import Form from './form';

export default function FormComponenet() {
  return (
    <form className="Form">
      <div className="space-y-12">
        <div className="border-b border-gray-900/10 pb-12">
          <h2 className="text-2xl font-bold leading-7 text-blue-600">Hello, Tell us about your conflict</h2>

          <div className="mt-10 grid grid-cols-1 gap-x-6 gap-y-8 sm:grid-cols-6">
            <div className="sm:col-span-3">
              <label htmlFor="item1" className="block text-sm font-medium leading-6 text-gray-900">
                Your Domain *
              </label>
              <div className="mt-2">
                <select
                  id="item1"
                  name="item1"
                  autoComplete="item1-name"
                  className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:max-w-xs sm:text-sm sm:leading-6"
                >
                  <option>Marketing</option>
                  <option>Law</option>
                  <option>Software Development</option>
                </select>
              </div>
            </div>
            <div className="sm:col-span-3">
              <label htmlFor="item2" className="block text-sm font-medium leading-6 text-gray-900">
                If Other, type here your domain
              </label>
              <div className="mt-2">
                <input
                  type="text"
                  name="item2"
                  id="item2"
                  autoComplete="given-name"
                  className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                />
              </div>
            </div>

            <div className="sm:col-span-3">
              <label htmlFor="item3" className="block text-sm font-medium leading-6 text-gray-900">
                How many sides are involved in this conflict?
              </label>
              <div className="mt-2">
                <input
                  type="text"
                  name="item3"
                  id="item3"
                  
                  className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                />
              </div>
            </div>

            <div className="sm:col-span-3">
              <label htmlFor="item4" className="block text-sm font-medium leading-6 text-gray-900">
                Type of the conflict
              </label>
              <div className="mt-2">
                <input
                  type="text"
                  name="item4"
                  id="item4"
                  
                  className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                />
              </div>
            </div>

            <div className="sm:col-span-6">
              <label htmlFor="item5" className="block text-sm font-medium leading-6 text-gray-900">
                Give us more details about the conflict
              </label>
              <div className="mt-2">
                <textarea
                type="text"
                  id="item5"
                  name="item5"
                  rows="4"
                  className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                ></textarea>
              </div>
            </div>
          </div>
        </div>

        <div className="mt-6 flex items-center justify-end gap-x-6">
          <button type="button" className="text-sm font-semibold leading-6 text-gray-900">
            Cancel
          </button>
          <button
            type="submit"
className="rounded-md bg-blue-600 px-3 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
          >
            Submit
          </button>
        </div>
      </div>
    </form>
  );
}
