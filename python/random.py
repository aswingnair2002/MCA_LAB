import random
random_integer = random.randint(1, 100)
print("Random Integer:", random_integer)
random_float = random.random()
print("Random Float between 0 and 1:",random_float)
my_list = [1,2,3,4,5]
random.shuffle(my_list)
print("Shuffled List:",my_list)

#Random Integer: 53
#Random Float between 0 and 1: 0.7147832762294846
#Shuffled List: [2, 4, 1, 3, 5]
