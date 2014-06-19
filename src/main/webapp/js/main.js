var closeElem = document.getElementsByClassName('close');

function hideElem() {
    var win = document.getElementsByClassName('window');
    var paranja = document.getElementsByClassName('paranja');
    fade(win[0]);
    fade(paranja[0])
};

function fade(element) {
    var op = 1;  // initial opacity
    var timer = setInterval(function () {
        if (op <= 0.1){
            clearInterval(timer);
            element.style.display = 'none';
        }
        element.style.opacity = op;
        element.style.filter = 'alpha(opacity=' + op * 100 + ")";
        op -= op * 0.1;
    }, 50);
}



function showWindow() {
    var win = document.getElementsByClassName('window');
    var paranja = document.getElementsByClassName('paranja');
    paranja[0].style.display = 'block';
    paranja[0].style.opacity = .5;
    win[0].style.display = 'block';
    win[0].style.opacity = 1;
}