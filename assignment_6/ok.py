import statistics


input_data = [
    (1.027752e-03, 1.029726e-03),
    (2.028514e-03, 2.032411e-03),
    (3.003599e-03, 3.009369e-03),
    (3.954082e-03, 3.961678e-03)
]

results = []

for y1, y2 in input_data:
    x1, x2 = 4.8, 5.0
    
    m = (y2 - y1) / (x2 - x1)

    b = m * (0 - x1) + y1

    x = (0 - b) / m

    Va = abs(x)
    results.append(Va)

    print(str(Va))
    
print("\nAverage: " + str(statistics.mean(results)))
