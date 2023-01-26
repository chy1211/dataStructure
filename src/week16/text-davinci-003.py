import openai

openai.api_key = "api_key"
response = openai.Completion.create(
    model="text-davinci-003",
    prompt="\nHuman: DFS是甚麼?請使用繁體中文回答\nAI:",
    temperature=0.9,
    max_tokens=1000,
    top_p=1,
    frequency_penalty=0.0,
    presence_penalty=0.6,
    stop=[" Human:", " AI:"],
)
print(response["choices"][0]["text"])
