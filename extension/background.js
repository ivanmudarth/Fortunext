
/* A function creator for callbacks */
function findCoffeeInTheDOM(domContent) {
    if (typeof domContent != 'undefined') {
        var re = /stocks/;
        var myArray = domContent.match(re);

        if (myArray && myArray.length > 0) {
            alert('finance term found. Please visit: https://www.fortunext.com/terms/s/stock.asp');
        }
        else {
            alert('finance term "stock" found. Please visit: https://www.fortunext.com/terms/s/stock.asp');
        }
    }
}

/* When the browser-action button is clicked, send a message to content.js requesting DOM */
chrome.browserAction.onClicked.addListener(function(tab) {
    chrome.tabs.sendMessage(
        tab.id,
        { from: 'background', subject: 'return_dom' },
        findCoffeeInTheDOM);
});
