class BankAccount:
	def __init__(self, account_number, account_holder_name, account_type, balance=0.0):
		self.account_number = account_number
		self.account_holder_name = account_holder_name
		self.account_type = account_type
		self.balance = balance
