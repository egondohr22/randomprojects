from matplotlib.font_manager import FontProperties
import matplotlib.pyplot as plt

x_val = []
y_val = []

for i in range(1, 20):
    x_val.append(i)
    y_val.append(i*i)

plt.style.use('seaborn')
fig, ax = plt.subplots()
ax.scatter(x_val, y_val)

ax.set_title("Square Numbers", fontsize=24)
ax.set_xlabel("Value", fontsize=14)
ax.set_ylabel("Square of Value", fontsize=14)

ax.tick_params(axis='both', which='major', labelsize=14)
plt.show()