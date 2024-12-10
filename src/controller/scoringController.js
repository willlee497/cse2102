export function incrementScore(state, setState) {
    setState({
        ...state,
        score: state.score + 1,
        count: state.count + 1
    });
    alert("You are correct!");
}

export function dontIncrementScore(state, setState) {
    setState({
        ...state,
        count: state.count + 1
    });
    alert("Sorry - not correct");
}

export function handleSubmit(state, myState) {
    myState.my_score = state.score;
    myState.my_count = state.count;

    // Save to localStorage
    localStorage.setItem('score', state.score);
    localStorage.setItem('count', state.count);

    console.log("handleSubmit updated values:", {
        my_score: myState.my_score,
        my_count: myState.my_count,
    }); // Debug log
    alert("Total score: " + state.score + "/" + state.count);
}