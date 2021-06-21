package com.etc.gondikeyboard.keyboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodSubtype;

import androidx.core.content.res.ResourcesCompat;

/**
 * Created by Rajesh Kumar Dhuria on 6/21/2021.
 * BrightWay Developer Team
 * hinditutor@gmail.com
 * Copyright (c) BWIIT
 */
public class GondiKeyboardView extends KeyboardView {
    private Context mContext;
    private static final String TAG = GondiKeyboardView.class.getSimpleName();
    private int offsetx = 0;
    public static final int KEYCODE_OPTIONS = -100;
    // TODO: Move this into android.inputmethodservice.Keyboard
    public static final int KEYCODE_LANGUAGE_SWITCH = -101;
    private int offsety = 0;
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public GondiKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public GondiKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setBackground(Drawable background) {
        super.setBackground(background);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected boolean onLongPress(Keyboard.Key popupKey) {
        if (popupKey.codes[0] == Keyboard.KEYCODE_CANCEL) {
            getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
            return true;
        } else {
            return super.onLongPress(popupKey);
        }
    }

    public void setSubtypeOnSpaceKey(final InputMethodSubtype subtype) {
        final LatinKeyboard keyboard = (LatinKeyboard) getKeyboard();
        keyboard.setSpaceIcon(ResourcesCompat.getDrawable(getResources(), subtype.getIconResId(), null));
        invalidateAllKeys();
    }
}
