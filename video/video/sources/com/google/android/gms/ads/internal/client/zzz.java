package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;

/* loaded from: classes2.dex */
public final class zzz {
    public final AdSize[] a;
    public final String b;

    public zzz(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.a);
        String string = obtainAttributes.getString(R.styleable.b);
        String string2 = obtainAttributes.getString(R.styleable.c);
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (!isEmpty && isEmpty2) {
            this.a = c(string);
        } else if (isEmpty && !isEmpty2) {
            this.a = c(string2);
        } else if (!isEmpty) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(R.styleable.d);
        this.b = string3;
        obtainAttributes.recycle();
        if (!TextUtils.isEmpty(string3)) {
            return;
        }
        throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
    }

    public static AdSize[] c(String str) {
        int parseInt;
        int parseInt2;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        parseInt = -1;
                    } else {
                        parseInt = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        parseInt2 = -2;
                    } else {
                        parseInt2 = Integer.parseInt(split2[1]);
                    }
                    adSizeArr[i] = new AdSize(parseInt, parseInt2);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.k;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.m;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.l;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i] = AdSize.n;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i] = AdSize.f176o;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.q;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i] = AdSize.p;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i] = AdSize.r;
            } else if ("ICON".equals(trim)) {
                adSizeArr[i] = AdSize.t;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.b;
    }

    public final AdSize[] b(boolean z) {
        if (!z && this.a.length != 1) {
            throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
        }
        return this.a;
    }
}
