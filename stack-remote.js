#!/usr/bin/env node
const {Builder, By, Key, until, WebElement,Capabilities}  = require('selenium-webdriver');
var capabilities = Capabilities.firefox();
(async function hello(){
    driver = await new Builder().
	usingServer("http://localhost:4444").withCapabilities(capabilities).build();

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
