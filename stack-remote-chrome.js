#!/usr/bin/env node

const { Builder, By, Key, until, Capabilities, Browser} = require("selenium-webdriver");
const chrome = require("selenium-webdriver/chrome");


(async function hello(){
    let capabilities = new Capabilities().setBrowserName("operablink");

    let opts = new chrome.Options();
    opts.setAcceptInsecureCerts(true);
    driver = await new Builder()
        .usingServer("http://localhost:4444/wd/hub")
        .withCapabilities(capabilities)
        .build();


    try {
        await driver.get('http://www.google.com');
    } finally {
        await driver.quit();
    }

})();
