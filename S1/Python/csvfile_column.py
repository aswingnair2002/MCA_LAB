import csv
def create_csv(filename,data):
	"""
	Create a csv file and write data to it.
	:param filename: Name of the CSV file
	:param data: List of lists representing rows of data
	"""
	with open(filename.'w',newline='') as csvfile:
		csv_writer = csv.writer(csvfile)
		csv_writer.writerows(data)
	print("Data has been written to {}".format(filename))

