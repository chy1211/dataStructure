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

# 3.依據refresh_time欄位的值由小到大排序

df = df.sort_values(by="refresh_time")

# 4.將資料輸出成csv檔
df.to_csv(
    "C:/Users/henry/Documents/GitHub/PythonLearning/111_1/Final-ds/refreshTime.csv",
    index=False,
    encoding="utf-8-sig",
)

