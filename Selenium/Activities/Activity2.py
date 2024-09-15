from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/login-form")
    print("The title is :"+driver.title)
    driver.find_element(By.ID,"username").send_keys("admin")
    driver.find_element(By.NAME,"Password").send_keys("password")
    driver.find_element(By.XPATH,"//button[@type='submit']").click()
    driver.quit()
	    