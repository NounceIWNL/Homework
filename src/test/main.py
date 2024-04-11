class Base:
    def __init__(self, category: str, name: str, price: float):
        self.category = category
        self.name = name
        self.price = price

    def get_price(self, *args, **kwargs) -> float:
        return self.price

    def __str__(self
        return f"Class({self.category=}, {self.name=}, {self.price=})"


class Product(Base):
    pass


class Surcharge(Base):
    def __init__(self, coefficient: float, *args, **kwargs):
        self.coefficient = coefficient
        super().__init__(*args, **kwargs)

    def get_price(self, product: Product) -> float:
        return product.get_price() * self.coefficient


class Discount(Base):
    def __init__(self, coefficient: float, *args, **kwargs):
        self.coefficient = coefficient
        super().__init__(*args, **kwargs)

    def get_price(self, product: Product) -> float:
        return product.get_price() * self.coefficient


products_list<Product> = []
surcharges_list = []
discounts_list = []


with open("ProductList.txt", "r", encoding='utf-8') as file:
    for line in file.readlines():
        if len(line) == 0:
            continue

        if line == "\n":
            continue

        splitted = line.split(":")
        category = splitted[0]
        name = splitted[1].split("-")[0]
        price = float(splitted[1].split("-")[1])

        obj = Product(
            category=category.strip(),
            name=name.strip(),
            price=price
        )
        products_list.append(obj)


for updated_product in products_list:
    print(updated_product)

print("--------------")
with open("Surcharge.txt", "r", encoding='utf-8') as file:
    for line in file.readlines():
        if len(line) == 0:
            continue

        if line == "\n":
            continue

        splitted = line.split(":")
        category = splitted[0]
        name = splitted[1].split("-")[0]
        price = splitted[1].split("-")[1]

        if "%" in price:
            coefficient = price.split("%")[0]
            coefficient = float(coefficient) / 100 + 1
        else:
            coefficient = 1.10

        obj = Surcharge(
            category=category.strip(),
            name=name.strip(),
            price=price,
            coefficient=coefficient
        )
        surcharges_list.append(obj)


with open("Discount.txt", "r", encoding='utf-8') as file:
    for line in file.readlines():
        if len(line) == 0:
            continue

        if line == "\n":
            continue

        splitted = line.split(":")
        category = splitted[0]
        name = splitted[1].split("-")[0]
        price = splitted[1].split("-")[1]

        if "%" in price:
            coefficient = price.split("%")[0]
            coefficient = 1 - float(coefficient) / 100
        else:
            coefficient = 1

        obj = Discount(
            category=category,
            name=name,
            price=price,
            coefficient=coefficient
        )
        discounts_list.append(obj)


surcharged_products_list = []

for product in products_list:
    filtered_objects = list(filter(
        lambda surcharge: surcharge.category == product.category and surcharge.name == product.name,
        surcharges_list
    ))

    if len(filtered_objects) > 0:
        matched_surchage = filtered_objects[0]
    else:
        continue

    product.price = matched_surchage.get_price(product)
    surcharged_products_list.append(product)

for updated_product in surcharged_products_list:
    print(updated_product)