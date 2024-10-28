/*
 * Copyright (c) Kuba Szczodrzyński 2020-1-6.
 */

package pl.szczodrzynski.edziennik.ui.widgets;

public class WidgetConfig {
    public int profileId = -1;
    public boolean bigStyle = false;
    public boolean darkTheme = false;
    public float opacity = 1.0f;

    public WidgetConfig(int profileId) {
        this.profileId = profileId;
    }

    public WidgetConfig(int profileId, boolean bigStyle, boolean darkTheme, float opacity) {
        this.profileId = profileId;
        this.bigStyle = bigStyle;
        this.darkTheme = darkTheme;
        this.opacity = opacity;
    }
}
