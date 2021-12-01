#!/usr/bin/env python
import tkinter as tk
from tkinter import Canvas, Text
import os

linux_dirs = ["/mnt/h/Games", "/mnt/g/Games", "/mnt/f/Games"]
dirs_: str = ["H:/Games", "G:/Games", "F:/Games"]
exceptions: "list[str]" = ["win", "-", "_", "pc", "a"]

root = tk.Tk()

canvas = Canvas(root, width=500, height=500, bg="#263D42")
canvas.pack()

def main() -> None:
    #print(R.read_dirextories(dirs))
    div()
    games = R.get_Games(linux_dirs)
    for game in games:
        for exe in game[1]:
            print(R.get_Game_Name(exe))

def div() -> None:
    tk.Frame(canvas, bg="white").place(relwidth=0.1, relheight=0.1, relx=0.1, rely=0.1)

class R:
    @staticmethod
    def read_directory(dir: str) -> 'list[str]': #
        return os.listdir(dir)

    @staticmethod
    def read_directories(dirs: 'list[str]') -> "list[str]": #
        result = []
        for dir in dirs:
            result += [dir + "/" + file for file in R.read_directory(dir)]
        return result
    
    @staticmethod        
    def get_Games(dirs: list) -> list:
        # result = array of (directory, [exe files])
        result = []
        for dir in R.read_directories(dirs):
            try:
                result.append((dir, [file for file in R.read_directory(dir) if file.endswith(".exe")]))
            except: pass
        return result
    @staticmethod
    def get_Game_Name(exe: str) -> str:
        return exe[:exe.find(".")]


if __name__ == "__main__":
    main()
    root.mainloop()

# Python, Java, Typescript, C#, C++
# git config --global user.email "you@example.com"
# git config --global user.name "Your Name"