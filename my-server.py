from flask import Flask, request, jsonify

app = Flask(__name__)

valid_token = "f99aa8b8573062e9802f4fc0807ae1cb"

@app.route("/")
def hello():
    return "You called \n"

@app.route("/echo", methods=['POST'])
def echo():
    return "You said: " + request.form['text']

@app.route("/login", methods=['POST'])
def login():
    auth_data = request.form
    if auth_data['id'] == "phillip.bradford@uconn.edu" and auth_data['token'] == valid_token:
        return jsonify({"message": "Login successful"}), 200
    else:
        return jsonify({"message": "Invalid credentials"}), 401

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000)