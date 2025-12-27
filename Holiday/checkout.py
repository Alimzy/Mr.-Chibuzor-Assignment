
cashierName = input("Who is the cashier for this invoice? ")

customerName = input("What is the customer's Name? ")


itemNames = []
numberOfItems = []
amountPerUnits = []
totals = []

count = 0


while True:
    name = input("What did the user buy? ")
    itemNames.append(name)
    numberOfItem = int(input("How many pieces? "))
    numberOfItems.append(numberOfItem)
    amountPerUnit = int(input("How much per unit? "))
    amountPerUnits.append(amountPerUnit)
    
    totals.append(amountPerUnit * numberOfItem)



    add = input("Add more item? (YES/NO)" ).upper()

    count+=1
    if add == "NO":
        break
    


inputDiscount = int(input("How much discount will he/she get? "))

subTotal = 0



print();

print(f"""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MACAULAY, SABO YABA, LAGOS
TEL: 08056906817 
DATE: 18-Dec-22 8:48:11pm
cashier: {cashierName}
Customer Name: {customerName}
"""
)
print("================================================================================")

print(f" {'ITEM':<20} {'QTY':>10} {'PRICE':>10} {'TOTAL(NGN)':>10}")

#//System.out.printf("%20s%10s%10s%15s\n",itemName, numberOfItem, amountPerUnit,total);

for counter in range(len(itemNames)):
    print(f"{itemNames[counter]: <20} {numberOfItems[counter]: >10} {amountPerUnits[counter]:>10} {totals[counter]:>10}");

    subTotal += totals[counter];


discount = (inputDiscount / 100) * subTotal;

vat = (17.50 / 100) * subTotal;

totalBill = (subTotal + vat) - discount;


print("--------------------------------------------------------------------------------");
print(f"{'Sub Total: ': <30} {subTotal : >10}" );
print(f"{'Discout: ': <30} {discount: >10}");
print(f"{'VAT @17.50%:': <30} {vat:>10}");

print("================================================================================");

print(f"{'Bill Total':<30} {totalBill:>15}" );
print("================================================================================");
print("THIS IS NOT A RECEIPT KINDLY PAY ", totalBill);
print("================================================================================");


amountPaid = int(input("How much did the customer give to you? "))

balance = amountPaid - totalBill;

print();

print(f"""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MA
DATE: 18-Dec-22 8:48:11pm
cashier: {cashierName}
Customer Name: {customerName}
"""
)

print("================================================================================")

print(f" {'ITEM':<20} {'QTY':<10} {'PRICE':<10} {'TOTAL(NGN)':<10}")

for counter in range(len(itemNames)):
    print(f"{itemNames[counter]: <20} {numberOfItems[counter]: >10} {amountPerUnits[counter]:>10} {totals[counter]:>10}");


print("--------------------------------------------------------------------------------")
print(f"{'Sub Total: ': >30} {subTotal : >10}" );
print(f"{'Discout: ': >30} {discount: >10}");
print(f"{'VAT @17.50%:': >30} {vat:>10}");

print("================================================================================")

print(f"{'Bill Total:':>30}{totalBill:>10}" )
print(f"{'Amount Paid:':>30}{amountPaid: >10}")

print(f"{'Balance: ':>30} {balance:>10}" )



print("================================================================================")
print(f"{'THANK YOU FOR YOUR PATRONAGE': >30}")
print("================================================================================")



