#!/usr/bin/env node
const {Builder, By, Key, until, WebElement}  = require('selenium-webdriver');

(async function hello(){
    let driver = await new Builder().forBrowser('firefox').build();

    //vamos a la url
    await driver.get('https://es.stackoverflow.com/');

    //hacemos buscqueda
    await driver.findElement(By.className('s-input')).sendKeys("[selenium]\n",Key.RETURN);

    //var conjunto = await driver.findElement(By.id('question-summary'));
    
    let sum = await driver.wait(until.elementsLocated(By.className('question-summary')));

    

    for(let element of sum){
        let titleElement = await element.findElement(By.className("question-hyperlink"));
        let title = await titleElement.getText();
        let link = await titleElement.getAttribute("href");
        console.log(title + "------->" + link);
    }
    
})();