from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net")
    print("The title is "+driver.title)
    driver.find_element(By.ID,"about-link").click()
    print("The new page title is "+driver.title)
    driver.quit()

