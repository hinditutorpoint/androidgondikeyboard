package com.etc.gondikeyboard.interfaces;

import android.graphics.drawable.Drawable;

/**
 * Created by Rajesh Kumar Dhuria on 6/21/2021.
 * BrightWay Developer Team
 * hinditutor@gmail.com
 * Copyright (c) BWIIT
 */
public interface InputMethodSettingsInterface {
    /**
     * Sets the title for the input method settings category with a resource ID.
     * @param resId The resource ID of the title.
     */
    void setInputMethodSettingsCategoryTitle(int resId);

    /**
     * Sets the title for the input method settings category with a CharSequence.
     * @param title The title for this preference.
     */
    void setInputMethodSettingsCategoryTitle(CharSequence title);

    /**
     * Sets the title for the input method enabler preference for launching subtype enabler with a
     * resource ID.
     * @param resId The resource ID of the title.
     */
    void setSubtypeEnablerTitle(int resId);

    /**
     * Sets the title for the input method enabler preference for launching subtype enabler with a
     * CharSequence.
     * @param title The title for this preference.
     */
    void setSubtypeEnablerTitle(CharSequence title);

    /**
     * Sets the icon for the preference for launching subtype enabler with a resource ID.
     * @param resId The resource id of an optional icon for the preference.
     */
    void setSubtypeEnablerIcon(int resId);

    /**
     * Sets the icon for the Preference for launching subtype enabler with a Drawable.
     * @param drawable The drawable of an optional icon for the preference.
     */
    void setSubtypeEnablerIcon(Drawable drawable);
}
