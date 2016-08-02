
// 1 Prompt the user to enter rock, paper, or scissors
// 2 Randomly get computer's selection
// 3 Display winner or tie

// paper beats rock, rock beats scissors, 
// scissors beats paper

do {
    var human = prompt("Enter 'r', 'p', or 's':", '');
} while (human !== 'r' && human !== 'p' && human !== 's');

var computer = ['r', 'p', 's'][Math.floor(Math.random() * 3)];


if (human === computer) {
    alert('tie: both players picked ' + computer);
}

if (human === 'r') {
    if (computer === 'p') {
        alert('Computer wins!');
    } else if (computer === 's') {
        alert('Human wins!');
    }
} else if (human === 'p') {
    if (computer === 'r') {
        alert('Human wins!');
    } else if (computer === 's') {
        alert('comptuer wins!')
    }
} else { // human === 's'
    if (computer === 'r') {
        alert('Computer wins!');
    } else if (computer === 'p') {
        alert('Human wins!');
    }
}












