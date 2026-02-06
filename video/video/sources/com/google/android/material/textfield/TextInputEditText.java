package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import o.C6566gU0;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9530sc;
import o.D71;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.OL1;

/* loaded from: classes3.dex */
public class TextInputEditText extends C9530sc {
    public final Rect e1;
    public boolean f1;

    public TextInputEditText(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC11300zs1
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @InterfaceC11300zs1
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @InterfaceC5670cr1
    public final String f(@InterfaceC5670cr1 TextInputLayout textInputLayout) {
        String str;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean isEmpty = TextUtils.isEmpty(text);
        String str2 = "";
        if (TextUtils.isEmpty(hint)) {
            str = "";
        } else {
            str = hint.toString();
        }
        if (!isEmpty) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) text);
            if (!TextUtils.isEmpty(str)) {
                str2 = C6566gU0.h + str;
            }
            sb.append(str2);
            return sb.toString();
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            return str;
        }
    }

    public boolean g() {
        return this.f1;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@InterfaceC11300zs1 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (h(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.e1);
            rect.bottom = this.e1.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@InterfaceC11300zs1 Rect rect, @InterfaceC11300zs1 Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (h(textInputLayout)) {
            boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @InterfaceC11300zs1
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.e0()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    public final boolean h(@InterfaceC11300zs1 TextInputLayout textInputLayout) {
        if (textInputLayout != null && this.f1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.e0() && super.getHint() == null && D71.d()) {
            setHint("");
        }
    }

    @Override // o.C9530sc, android.widget.TextView, android.view.View
    @InterfaceC11300zs1
    public InputConnection onCreateInputConnection(@InterfaceC5670cr1 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@InterfaceC11300zs1 Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (h(textInputLayout) && rect != null) {
            this.e1.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.e1);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f1 = z;
    }

    public TextInputEditText(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.t1);
    }

    public TextInputEditText(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, 0), attributeSet, i);
        this.e1 = new Rect();
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.fd, i, C7025iN1.n.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(k.getBoolean(C7025iN1.o.gd, false));
        k.recycle();
    }
}
