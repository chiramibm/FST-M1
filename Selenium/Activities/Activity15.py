from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
     wait= WebDriverWait(driver,3)
     driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
     print("The title is :"+driver.getTitle())
     driver.findElement(By.XPATH,"//input[starts-with(@class,\"username\")]").send_keys("admin")
     driver.findElement(By.XPATH, " //input[starts-with(@class,\"password\"]").send_keys("password")
     driver.findElement(By.XPATH,"//input[starts-with(@class,\"password\"]/following::button[1]").click()
     wait.until_ExpectedConditions(By.cssSelector("#action-confirmation"))
     print("The login message is :"+driver.findElement(By.CSS_SELECTOR,"#action-confirmation").text())
     driver.quit()
     