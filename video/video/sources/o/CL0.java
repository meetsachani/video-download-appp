package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class CL0 {
    public static void a(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = D60.r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static int[] c(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public static void d(@InterfaceC5670cr1 TextInputLayout textInputLayout, @InterfaceC5670cr1 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = D60.r(drawable).mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void f(@InterfaceC5670cr1 CheckableImageButton checkableImageButton, @InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasOnClickListeners || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void g(@InterfaceC5670cr1 CheckableImageButton checkableImageButton, @PK1 int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void h(@InterfaceC5670cr1 CheckableImageButton checkableImageButton, @InterfaceC11300zs1 View.OnClickListener onClickListener, @InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    public static void i(@InterfaceC5670cr1 CheckableImageButton checkableImageButton, @InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    public static void j(@InterfaceC5670cr1 CheckableImageButton checkableImageButton, @InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    public static void e(@InterfaceC5670cr1 CheckableImageButton checkableImageButton) {
    }
}
