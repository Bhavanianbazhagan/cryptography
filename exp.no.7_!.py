cipher_text = "53‡‡†305))6*;4826)4‡.)4‡);806*;48†8¶60))85;;]8*;:‡8†83 (88)5†;46(;88*96*?;8)‡(;485);5†2:‡(;4956*2(5—4)8¶8*;4069285);)6†8)4‡‡;1(‡9;48081;8:8‡1;48†85;4)485†528806*81 (‡9;48;(88;4(‡?34;48)4‡;161;:188;‡?;"
plain_text = ""


mapping = {
    '‡': 'a',
    '†': 'e',
    '¶': 'i',
    '*': 'o',
    '(': 'u',
    ')': 'y',
    ';': ' ',
    '—': '-',
    ']': ',',
    ':': '.',
    '4': 't',
    '5': 'h',
    '8': 's',
    '3': 'r',
    '6': 'n',
    '0': 'g',
    '2': 'm',
    '9': 'd',
    '1': 'l',
    '(': 'u',
    '?': 'p',
    '[': 'b',
    '(': 'u',
    '}': 'v',
    '7': 'c',
}

for c in cipher_text:
    if c in mapping:
        plain_text += mapping[c]
    else:
        plain_text += c

print(plain_text)
