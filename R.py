import os

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