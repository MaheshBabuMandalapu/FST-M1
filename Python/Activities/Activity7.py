user_list = input("Enter a list of numbers separated by space: ")
numbers = [int(num) for num in user_list.split()]
sum = sum(numbers)
print("The sum of the elements in the list is:", sum)
#except ValueError:
#1print("Invalid input. Please enter a list of numbers separated by space.")
