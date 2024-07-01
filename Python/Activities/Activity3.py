player1=input("enter the 1st player input").lower()
player2=input("enter the 2nd player input").lower()

if player1==player2:
        print("Match is tie")
elif player1=="rock":
    if player2=="scissors":
        print("Player1 wins")
    else:
        print("Player2 wins") 
elif player1=="scissors":
        if player2=="paper":
            print("Player1 wins")
        else:
            print("Player2 wins")
elif player1=="paper":
    if player2=="rock":
        print("Player1 wins")
    else:
        print("Player2 wins")
else:
     print("invalid input")