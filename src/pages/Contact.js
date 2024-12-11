import React from 'react';
import { Link } from 'react-router-dom';

class Contact extends React.Component {
    greeting(name) {
        alert("Greeting " + name);
    };

    render() {
        return(
            <div className="container text-center">
                <h1 className="title">Contact the Ref</h1>
                <div className="bg-gray-800 p-8 rounded-lg shadow-lg mb-8">
                    <p className="text-xl mb-4">Have questions about the quiz or boxing? Reach out to us!</p>
                    <button 
                        onClick={() => this.greeting('Boxing Fan')} 
                        className="btn btn-primary mb-4"
                    >
                        Say hello
                    </button>
                    <p className="text-lg">Email: contact@boxingquiz.com</p>
                    <p className="text-lg">Phone: (123) 456-7890</p>
                </div>
                <Link to="/" className="btn btn-secondary">Back to Home</Link>
            </div>
        );
    }
}

export default Contact;

