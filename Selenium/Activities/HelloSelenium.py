from selenium import webdriver
with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/")
    print(driver.title)
    driver.quit()