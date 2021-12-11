const { app, BrowserWindow } = require("electron")
const path = require("path")

const createWindow = () => {
    const win = new BrowserWindow({
        width: 800,
        height: 600,
        titleBarStyle: "hidden",
        titleBarOverlay: true,
        webPreferences: {
            nodeIntegration: true,
            preload: path.join(__dirname, "/preload.js"),
        },
    })

    win.loadFile("src/index.html")
}

app.whenReady().then(() => {
    createWindow()

    app.on("activate", () => {
        if (BrowserWindow.getAllWindows().length === 0) createWindow()
    })
})

app.on("window-all-closed", () => {
    if (process.platform !== "darwin") app.quit()
})
