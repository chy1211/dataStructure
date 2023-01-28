import pandas as pd

# 1.將資料載入Python，並使用Pandas讀取資料。
df = pd.read_csv(
    "C:/Users/henry/Documents/GitHub/PythonLearning/111_1/Final-ds/data.csv"
)

# 2.抽出資料中的時間欄位，並將其轉換成分鐘數

for i in range(len(df["refresh_time"])):
    if df["refresh_time"][i] == "昨日":
        df["refresh_time"][i] = 1440
    elif "天前" in df["refresh_time"][i]:
        df["refresh_time"][i] = int(df["refresh_time"][i].replace("天前", "")) * 1440
    elif "小時內" in df["refresh_time"][i]:
        df["refresh_time"][i] = int(df["refresh_time"][i].replace("小時內", "")) * 60
    elif "分鐘內" in df["refresh_time"][i]:
        df["refresh_time"][i] = int(df["refresh_time"][i].replace("分鐘內", ""))

# 3.運用quickSort依據refresh_time欄位的值由小到大排序


def quickSort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quickSort(left) + middle + quickSort(right)


df["refresh_time"] = quickSort(df["refresh_time"])

# 4.將資料輸出成csv檔
df.to_csv(
    "C:/Users/henry/Documents/GitHub/PythonLearning/111_1/Final-ds/refreshTime.csv",
    index=False,
    encoding="utf-8-sig",
)
