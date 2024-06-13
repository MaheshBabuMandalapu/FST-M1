player1 = input("player 1 name : ")
player2 = input("player 2 name : ")
while True:
    player1_input=input(player1 + "Chooose rock,paper or scissors? ").lower()
    player2_input=input(player2 + "Chooose rock,paper or scissors? ").lower()

    if player1_input==player2_input:
        print("It is Tie")
    elif (player1 == "rock" and player2 == "scissors") or \
         (player1 == "scissors" and player2 == "paper") or \
         (player1 == "paper" and player2 == "rock"):
        print("Player 1 wins!")
    else:
        print("player 2 wins")    

    play_again = input("Do you want to play again? (Yes/No): ").lower()
    if(play_again=="yes"):
        pass
    elif(play_again=="no"):
        raise SystemExit
    else:
        print("invalid option selected. So quiting the game")
        raise SystemExit