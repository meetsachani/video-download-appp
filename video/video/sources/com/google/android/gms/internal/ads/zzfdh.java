package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzfdh {
    @InterfaceC11300zs1
    public final Pattern a;

    @InterfaceC5056aJ2
    public zzfdh() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.a = pattern;
    }

    @InterfaceC11300zs1
    public final String a(@InterfaceC11300zs1 String str) {
        Pattern pattern = this.a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }
        return null;
    }
}
