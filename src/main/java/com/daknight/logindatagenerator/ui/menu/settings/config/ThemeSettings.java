package com.daknight.logindatagenerator.ui.menu.settings.config;

import javafx.scene.paint.Color;

public class ThemeSettings {
    private String theme;

    public ThemeSettings(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Color changeBackground() {
        if (this.theme.equals("Dark")) {
            return Color.web("#212121");
        }
        else if (this.theme.equals("Light")) {
            return Color.web("#fff");
        }
        return null;
    }

    public String changeMenu() {
        if (this.theme.equals("Dark")) {
            return "data:text/css," +
                    ".menu-bar .label { -fx-text-fill: white; -fx-font-weight: bold; }" +
                    ".menu-bar { -fx-background-color: #1a1a1a; }" +
                    ".context-menu { -fx-background-color: #1a1a1a; }" +
                    ".menu-item .label { -fx-text-fill: white; }";
        } else if (this.theme.equals("Light")) {
            return "data:text/css," +
                    ".menu-bar .label { -fx-text-fill: black; -fx-font-weight: bold; }" +
                    ".menu-bar { -fx-background-color: white; }" +
                    ".context-menu { -fx-background-color: white; }" +
                    ".menu-item .label { -fx-text-fill: black; }";
        }
        return null;
    }

    public String changeLabel() {
        if (this.theme.equals("Dark")) {
            return "-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: white";
        } else if (this.theme.equals("Light")) {
            return "-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: black";
        }
        return null;
    }

    // Listview changes
    // List view mouse changes
    public Color listViewBackgroundEntered() {
        if (this.theme.equals("Dark")) {
            return Color.web("#333333");
        } else if (this.theme.equals("Light")) {
            return Color.web("#CCCCCC");
        }
        return null;
    }

    public Color listViewTextFillEntered() {
        if (this.theme.equals("Dark")) {
            return Color.LIGHTGRAY;
        } else if (this.theme.equals("Light")) {
            return Color.web("#2C2C2C");
        }
        return null;
    }

    public Color listViewBackgroundExited() {
        if (this.theme.equals("Dark")) {
            return Color.web("#1a1a1a");
        } else if (this.theme.equals("Light")) {
            return Color.web("#fff");
        }
        return null;
    }

    public Color listViewTextFillExited() {
        if (this.theme.equals("Dark")) {
            return Color.WHITE;
        } else if (this.theme.equals("Light")) {
            return Color.BLACK;
        }
        return null;
    }

    // Listview update items
    public Color listViewUpdateItemTextFill() {
        if (this.theme.equals("Dark")) {
            return Color.BLACK;
        } else if (this.theme.equals("Light")) {
            return Color.WHITE;
        }
        return null;
    }

    public Color listViewIsSelectedBackground() {
        if (this.theme.equals("Dark")) {
            return Color.WHITE;
        } else if (this.theme.equals("Light")) {
            return Color.BLACK;
        }
        return null;
    }

    public Color listViewIsSelectedTextFill() {
        if (this.theme.equals("Dark")) {
            return Color.BLACK;
        } else if (this.theme.equals("Light")) {
            return Color.WHITE;
        }
        return null;
    }

    public Color listViewIsNotSelectedBackground() {
        if (this.theme.equals("Dark")) {
            return Color.web("#1a1a1a");
        } else if (this.theme.equals("Light")) {
            return Color.web("#fff");
        }
        return null;
    }

    public Color listViewIsNotSelectedTextFill() {
        if (this.theme.equals("Dark")) {
            return Color.WHITE;
        } else if (this.theme.equals("Light")) {
            return Color.BLACK;
        }
        return null;
    }

}
