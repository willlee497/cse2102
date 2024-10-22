1. Install Required Packages
   
Install Flask for the server:
pip3 install Flask

Install httpx for the client:
pip3 install httpx

2. Update Server URL in Client
In my-calls.py, update the url variable to match your server's public address. 
url = "https://<your-server-url>/"

3. Run the Server
In your codespace, run the server on port 5000 and make sure port visibility is public:
python3 my-server.py


4. Run the Client
On your local machine, run the client script:
python3 my-calls.py

5. Check Server Logs
View the server's logs to verify the requests and responses, ensuring everything works as expected.
