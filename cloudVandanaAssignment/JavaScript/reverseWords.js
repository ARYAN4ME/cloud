function reverseWordsInSentence(sentence) {
    let reversedSentence = '';
    let currentWord = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] !== ' ') {
            currentWord = sentence[i] + currentWord;
        } else {
            reversedSentence += currentWord + ' '; 
            currentWord = ''; 
        }
    }

    reversedSentence += currentWord; 

    return reversedSentence;
}


const inputSentence = "This is a sunnyday";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
