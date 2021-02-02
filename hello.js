#!/usr/bin/env node
const {Builder, By, Key, until}  = require('selenium-webdriver');

(async function hello(){
    let driver = await new Builder().forBrowser('firefox').build();

    //vamos a la url
    await driver.get('https://www.google.com/');

    //nos movemos al frame 0
    await driver.switchTo().frame(0);
    //clickamos en el boton
    await driver.wait(until.elementLocated(By.id('introAgreeButton'))).click();
    //regresamos al frame principal
    await driver.switchTo().defaultContent();
    //hacemos buscqueda
    await driver.findElement(By.name('q')).sendKeys("cheese!\n",Key.RETURN);
    
})();

