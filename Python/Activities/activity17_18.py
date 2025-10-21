# Import pandas
import pandas as pd
#writing data to CSV (Activity 17)
# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

df=pd.DataFrame(data)
df.to_csv("Sample.csv",index=False)

#Reading data from CSV (Activity 18)
input_data=pd.read_csv('Sample.csv')
#Print the values only in the Usernames column
print("********User Name Column*********")
print(input_data["Usernames"])
#Print the username and password of the second row
print("********Second row data *********")
print(input_data["Usernames"][1],input_data["Passwords"][1])
#Sort the Usernames column data in ascending order and print data
print("********Sorted Username column in ascending*********")
print(input_data.sort_values(by="Usernames"))

#Sort the Passwords column in descending order and print data
print("********Sorted Username column in descending *********")
print(input_data.sort_values(by="Passwords",ascending=False))


