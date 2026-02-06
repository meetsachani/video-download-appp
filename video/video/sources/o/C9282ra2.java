package o;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;

/* renamed from: o.ra2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9282ra2 {
    public static final SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, int i, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder b(SpannableStringBuilder spannableStringBuilder, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannedString c(HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ha0.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder d(SpannableStringBuilder spannableStringBuilder, int i, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder, Object obj, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder f(SpannableStringBuilder spannableStringBuilder, Object[] objArr, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder g(SpannableStringBuilder spannableStringBuilder, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder h(SpannableStringBuilder spannableStringBuilder, float f, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder i(SpannableStringBuilder spannableStringBuilder, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder j(SpannableStringBuilder spannableStringBuilder, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder k(SpannableStringBuilder spannableStringBuilder, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder l(SpannableStringBuilder spannableStringBuilder, HA0<? super SpannableStringBuilder, C7458kA2> ha0) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        ha0.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
