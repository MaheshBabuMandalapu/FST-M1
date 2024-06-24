player1 = input("player 1 name : ")
player2 = input("player 2 name : ")
while True:
    player1_input=input(player1 + "Chooose rock,paper or scissors? ").lower()
    player2_input=input(player2 + "Chooose rock,paper or scissors? ").lower()

    if player1_input==player2_input:
        print("It is Tie")
    elif (player1_input == "rock" and player2_input == "scissors") or \
         (player1_input == "scissors" and player2_input == "paper") or \
         (player1_input == "paper" and player2_input == "rock"):
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
