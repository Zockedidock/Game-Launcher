#!/usr/bin/env python3
import tkinter as tk
from tkinter import Canvas, Text
import os

dirs: str = ["/mnt/h/Games", "/mnt/g/Games", "/mnt/f/Games"]
exceptions: "list[str]" = ["win", "-", "_", "pc", "a"]

root = tk.Tk()

Canvas(root, width=500, height=500, bg="white").pack()

def main() -> None:
    print(R.read_directories(dirs))
    div()

def div() -> None:
    tk.Frame(root, bg="white").place(x=0, y=0, relwidth=0.8, relheight=0.8)

class R:
    @staticmethod
    def read_directory(dir: str) -> 'list[str]':
        return os.listdir(dir)
    @staticmethod
    def read_directories(dirs: 'list[str]') -> "list[str]":
        result = []
        for dir in dirs:
            result += R.read_directory(dir)
        return result

if __name__ == "__main__":
    main()
    root.mainloop()

# Python, Java, Typescript, C#, C++
# git config --global user.email "you@example.com"
# git config --global user.name "Your Name"